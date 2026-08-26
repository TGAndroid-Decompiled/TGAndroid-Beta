package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline1;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.GroupCreateSectionCell;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.ManageChatTextCell;
import org.telegram.ui.ChannelBoostLayout$$ExternalSyntheticLambda2;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.GroupCreateActivity;
import org.telegram.ui.LaunchActivity;

public class InviteMembersBottomSheet extends UsersAlertBase implements NotificationCenter.NotificationCenterDelegate {
    private int additionalHeight;
    private long chatId;
    private ArrayList<TLObject> contacts;
    private int contactsEndRow;
    private int contactsStartRow;
    private int copyLinkRow;
    private AnimatorSet currentAnimation;
    private GroupCreateSpan currentDeletingSpan;
    private GroupCreateActivity.ContactsAddActivityDelegate delegate;
    private InviteMembersBottomSheetDelegate dialogsDelegate;
    private ArrayList<TLRPC.Dialog> dialogsServerOnly;
    private int emptyRow;
    boolean enterEventSent;
    private final FragmentFloatingButton floatingButton;
    private LongSparseArray ignoreUsers;
    TLRPC.TL_chatInviteExported invite;
    private int lastRow;
    boolean linkGenerating;
    private int maxSize;
    private int noContactsStubRow;
    private BaseFragment parentFragment;
    private int rowCount;
    private int scrollViewH;
    private SearchAdapter searchAdapter;
    private int searchAdditionalHeight;
    private LongSparseArray selectedContacts;
    private View.OnClickListener spanClickListener;
    private boolean spanEnter;
    private final SpansContainer spansContainer;
    private ValueAnimator spansEnterAnimator;
    private float spansEnterProgress;
    private final ScrollView spansScrollView;
    private float touchSlop;
    float y;

    public interface InviteMembersBottomSheetDelegate {
        void didSelectDialogs(ArrayList<Long> arrayList);
    }

    public class ItemAnimator extends DefaultItemAnimator {
        public ItemAnimator() {
            this.translationInterpolator = CubicBezierInterpolator.DEFAULT;
            setMoveDuration(150L);
            setAddDuration(150L);
            setRemoveDuration(150L);
            InviteMembersBottomSheet.this.setShowWithoutAnimation(false);
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private ListAdapter() {
        }

        @Override
        public int getItemCount() {
            return InviteMembersBottomSheet.this.rowCount;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == InviteMembersBottomSheet.this.copyLinkRow) {
                return 1;
            }
            if (i == InviteMembersBottomSheet.this.emptyRow) {
                return 2;
            }
            if (i >= InviteMembersBottomSheet.this.contactsStartRow && i < InviteMembersBottomSheet.this.contactsEndRow) {
                return 3;
            }
            if (i == InviteMembersBottomSheet.this.lastRow) {
                return 4;
            }
            return i == InviteMembersBottomSheet.this.noContactsStubRow ? 5 : 0;
        }

        public TLObject getObject(int i) {
            if (InviteMembersBottomSheet.this.dialogsDelegate == null) {
                return (TLObject) InviteMembersBottomSheet.this.contacts.get(i - InviteMembersBottomSheet.this.contactsStartRow);
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) InviteMembersBottomSheet.this.dialogsServerOnly.get(i - InviteMembersBottomSheet.this.contactsStartRow);
            return DialogObject.isUserDialog(dialog.id) ? MessagesController.getInstance(((BottomSheet) InviteMembersBottomSheet.this).currentAccount).getUser(Long.valueOf(dialog.id)) : MessagesController.getInstance(((BottomSheet) InviteMembersBottomSheet.this).currentAccount).getChat(Long.valueOf(-dialog.id));
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 3 || viewHolder.getItemViewType() == 1;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            long j;
            long j2;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 2) {
                viewHolder.itemView.requestLayout();
                return;
            }
            if (itemViewType != 3) {
                return;
            }
            GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) viewHolder.itemView;
            TLObject object = getObject(i);
            Object object2 = groupCreateUserCell.getObject();
            if (object2 instanceof TLRPC.User) {
                j = ((TLRPC.User) object2).id;
            } else {
                j = object2 instanceof TLRPC.Chat ? -((TLRPC.Chat) object2).id : 0L;
            }
            boolean z = i != InviteMembersBottomSheet.this.contactsEndRow;
            groupCreateUserCell.setObject(object, null, null);
            groupCreateUserCell.drawDivider = z;
            if (object instanceof TLRPC.User) {
                j2 = ((TLRPC.User) object).id;
            } else {
                j2 = object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
            }
            if (j2 != 0) {
                if (InviteMembersBottomSheet.this.ignoreUsers == null || InviteMembersBottomSheet.this.ignoreUsers.indexOfKey(j2) < 0) {
                    groupCreateUserCell.setChecked(InviteMembersBottomSheet.this.selectedContacts.indexOfKey(j2) >= 0, j == j2);
                    groupCreateUserCell.setCheckBoxEnabled(true);
                } else {
                    groupCreateUserCell.setChecked(true, false);
                    groupCreateUserCell.setCheckBoxEnabled(false);
                }
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View groupCreateUserCell;
            Context context = viewGroup.getContext();
            if (i != 2) {
                int i2 = 0;
                if (i == 3) {
                    groupCreateUserCell = new GroupCreateUserCell(1, 0, context, null, InviteMembersBottomSheet.this.dialogsDelegate != null, false);
                } else if (i == 4) {
                    groupCreateUserCell = new View(context);
                } else if (i != 5) {
                    ManageChatTextCell manageChatTextCell = new ManageChatTextCell(context);
                    manageChatTextCell.setText(LocaleController.getString(R.string.VoipGroupCopyInviteLink), null, R.drawable.msg_link, 7, true);
                    int i3 = Theme.key_dialogTextBlue2;
                    manageChatTextCell.setColors(i3, i3);
                    groupCreateUserCell = manageChatTextCell;
                } else {
                    StickerEmptyView stickerEmptyView = new StickerEmptyView(context, null, i2) {
                        @Override
                        public void onAttachedToWindow() {
                            super.onAttachedToWindow();
                            this.stickerView.getImageReceiver().startAnimation();
                        }
                    };
                    stickerEmptyView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                    stickerEmptyView.subtitle.setVisibility(8);
                    if (InviteMembersBottomSheet.this.dialogsDelegate != null) {
                        stickerEmptyView.title.setText(LocaleController.getString(R.string.FilterNoChats));
                    } else {
                        stickerEmptyView.title.setText(LocaleController.getString(R.string.NoContacts));
                    }
                    stickerEmptyView.setAnimateLayoutChange(true);
                    groupCreateUserCell = stickerEmptyView;
                }
            } else {
                groupCreateUserCell = new View(context) {
                    @Override
                    public void onMeasure(int i4, int i5) {
                        super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(InviteMembersBottomSheet.this.additionalHeight + AndroidUtilities.dp(48.0f), 1073741824));
                    }
                };
            }
            return new RecyclerListView.Holder(groupCreateUserCell);
        }
    }

    public class SearchAdapter extends RecyclerListView.SelectionAdapter {
        private int currentItemsCount;
        private final SearchAdapterHelper searchAdapterHelper;
        private ArrayList<Object> searchResult = new ArrayList<>();
        private ArrayList<CharSequence> searchResultNames = new ArrayList<>();
        private Runnable searchRunnable;

        public SearchAdapter() {
            SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(false);
            this.searchAdapterHelper = searchAdapterHelper;
            searchAdapterHelper.setDelegate(new EmojiView$$ExternalSyntheticLambda21(this, 12));
        }

        public void lambda$new$0(int i) {
            InviteMembersBottomSheet.this.showItemsAnimated(this.currentItemsCount - 1);
            if (this.searchRunnable == null && !this.searchAdapterHelper.isSearchInProgress() && getItemCount() <= 2) {
                InviteMembersBottomSheet.this.emptyView.showProgress(false, true);
            }
            notifyDataSetChanged();
        }

        public void lambda$searchDialogs$2(String str) {
            String lowerCase;
            String publicUsername;
            Object obj;
            String lowerCase2 = str.trim().toLowerCase();
            if (lowerCase2.length() == 0) {
                updateSearchResults(new ArrayList<>(), new ArrayList<>());
                return;
            }
            String translitString = LocaleController.getInstance().getTranslitString(lowerCase2);
            if (lowerCase2.equals(translitString) || translitString.length() == 0) {
                translitString = null;
            }
            int i = (translitString != null ? 1 : 0) + 1;
            String[] strArr = new String[i];
            strArr[0] = lowerCase2;
            if (translitString != null) {
                strArr[1] = translitString;
            }
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList<CharSequence> arrayList2 = new ArrayList<>();
            for (int i2 = 0; i2 < InviteMembersBottomSheet.this.contacts.size(); i2++) {
                TLObject tLObject = (TLObject) InviteMembersBottomSheet.this.contacts.get(i2);
                boolean z = tLObject instanceof TLRPC.User;
                if (z) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    lowerCase = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                    publicUsername = UserObject.getPublicUsername(user);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    lowerCase = chat.title;
                    publicUsername = ChatObject.getPublicUsername(chat);
                }
                String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString2)) {
                    translitString2 = null;
                }
                char c = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    String str2 = strArr[i3];
                    if (lowerCase.startsWith(str2) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str2, lowerCase) || (translitString2 != null && (translitString2.startsWith(str2) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str2, translitString2)))) {
                        c = 1;
                    } else if (publicUsername != null && publicUsername.startsWith(str2)) {
                        c = 2;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            obj = null;
                            arrayList2.add(AndroidUtilities.generateSearchName(zzii.m("@", publicUsername), null, "@" + str2));
                        } else if (z) {
                            TLRPC.User user2 = (TLRPC.User) tLObject;
                            arrayList2.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str2));
                            obj = null;
                        } else {
                            obj = null;
                            arrayList2.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, null, str2));
                        }
                        arrayList.add(tLObject);
                        break;
                    }
                }
            }
            updateSearchResults(arrayList, arrayList2);
        }

        public void lambda$searchDialogs$3(String str) {
            this.searchAdapterHelper.queryServerSearch(str, true, InviteMembersBottomSheet.this.dialogsDelegate != null, true, InviteMembersBottomSheet.this.dialogsDelegate != null, false, 0L, false, 0, 0);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            InviteMembersBottomSheet$SearchAdapter$$ExternalSyntheticLambda0 inviteMembersBottomSheet$SearchAdapter$$ExternalSyntheticLambda0 = new InviteMembersBottomSheet$SearchAdapter$$ExternalSyntheticLambda0(this, str, 1);
            this.searchRunnable = inviteMembersBottomSheet$SearchAdapter$$ExternalSyntheticLambda0;
            dispatchQueue.postRunnable(inviteMembersBottomSheet$SearchAdapter$$ExternalSyntheticLambda0);
        }

        public void lambda$searchDialogs$4(String str) {
            AndroidUtilities.runOnUIThread(new InviteMembersBottomSheet$SearchAdapter$$ExternalSyntheticLambda0(this, str, 0));
        }

        public void lambda$updateSearchResults$1(ArrayList arrayList, ArrayList arrayList2) {
            this.searchRunnable = null;
            this.searchResult = arrayList;
            this.searchResultNames = arrayList2;
            this.searchAdapterHelper.mergeResults(arrayList);
            InviteMembersBottomSheet.this.showItemsAnimated(this.currentItemsCount - 1);
            notifyDataSetChanged();
            if (this.searchAdapterHelper.isSearchInProgress() || getItemCount() > 2) {
                return;
            }
            InviteMembersBottomSheet.this.emptyView.showProgress(false, true);
        }

        private void updateSearchResults(ArrayList<Object> arrayList, ArrayList<CharSequence> arrayList2) {
            AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda1(this, arrayList, arrayList2, 6));
        }

        @Override
        public int getItemCount() {
            int size = this.searchResult.size();
            int size2 = this.searchAdapterHelper.getLocalServerSearch().size();
            int size3 = this.searchAdapterHelper.getGlobalSearch().size();
            int i = size + size2;
            if (size3 != 0) {
                i += size3 + 1;
            }
            int i2 = i + 2;
            this.currentItemsCount = i2;
            return i2;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == 0) {
                return 2;
            }
            if (i == this.currentItemsCount - 1) {
                return 4;
            }
            return i + (-1) == this.searchAdapterHelper.getLocalServerSearch().size() + this.searchResult.size() ? 0 : 1;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 1;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLObject tLObject;
            CharSequence charSequence;
            long j;
            long j2;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                ((GroupCreateSectionCell) viewHolder.itemView).setText(LocaleController.getString(R.string.GlobalSearch));
                return;
            }
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    return;
                }
                viewHolder.itemView.requestLayout();
                return;
            }
            GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) viewHolder.itemView;
            int size = this.searchResult.size();
            int size2 = this.searchAdapterHelper.getGlobalSearch().size();
            int size3 = this.searchAdapterHelper.getLocalServerSearch().size();
            int i2 = i - 1;
            CharSequence charSequence2 = null;
            if (i2 >= 0 && i2 < size) {
                tLObject = (TLObject) this.searchResult.get(i2);
            } else if (i2 < size || i2 >= size3 + size) {
                tLObject = (i2 <= size + size3 || i2 > (size2 + size) + size3) ? null : this.searchAdapterHelper.getGlobalSearch().get(((i2 - size) - size3) - 1);
            } else {
                tLObject = this.searchAdapterHelper.getLocalServerSearch().get(i2 - size);
            }
            if (tLObject == null) {
                charSequence = null;
            } else {
                String publicUsername = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).username : ChatObject.getPublicUsername((TLRPC.Chat) tLObject);
                if (i2 < size) {
                    charSequence = this.searchResultNames.get(i2);
                    if (charSequence == null || TextUtils.isEmpty(publicUsername)) {
                        charSequence2 = charSequence;
                        charSequence = null;
                    } else {
                        if (!charSequence.toString().startsWith("@" + publicUsername)) {
                            charSequence2 = charSequence;
                            charSequence = null;
                        }
                    }
                } else if (i2 <= size || TextUtils.isEmpty(publicUsername)) {
                    charSequence = null;
                } else {
                    String lastFoundUsername = this.searchAdapterHelper.getLastFoundUsername();
                    if (lastFoundUsername.startsWith("@")) {
                        lastFoundUsername = lastFoundUsername.substring(1);
                    }
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "@");
                        spannableStringBuilder.append((CharSequence) publicUsername);
                        int iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, lastFoundUsername);
                        if (iIndexOfIgnoreCase != -1) {
                            int length = lastFoundUsername.length();
                            if (iIndexOfIgnoreCase == 0) {
                                length++;
                            } else {
                                iIndexOfIgnoreCase++;
                            }
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false)), iIndexOfIgnoreCase, length + iIndexOfIgnoreCase, 33);
                        }
                        charSequence = spannableStringBuilder;
                    } catch (Exception unused) {
                        charSequence = publicUsername;
                    }
                }
            }
            Object object = groupCreateUserCell.getObject();
            if (object instanceof TLRPC.User) {
                j = ((TLRPC.User) object).id;
            } else {
                j = object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
            }
            groupCreateUserCell.setObject(tLObject, charSequence2, charSequence);
            if (tLObject instanceof TLRPC.User) {
                j2 = ((TLRPC.User) tLObject).id;
            } else {
                j2 = tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
            }
            if (j2 != 0) {
                if (InviteMembersBottomSheet.this.ignoreUsers == null || InviteMembersBottomSheet.this.ignoreUsers.indexOfKey(j2) < 0) {
                    groupCreateUserCell.setChecked(InviteMembersBottomSheet.this.selectedContacts.indexOfKey(j2) >= 0, j == j2);
                    groupCreateUserCell.setCheckBoxEnabled(true);
                } else {
                    groupCreateUserCell.setChecked(true, j == j2);
                    groupCreateUserCell.setCheckBoxEnabled(false);
                }
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View groupCreateUserCell;
            Context context = viewGroup.getContext();
            if (i == 1) {
                groupCreateUserCell = new GroupCreateUserCell(1, 0, context, null, false, false);
            } else if (i != 2) {
                groupCreateUserCell = i != 4 ? new GroupCreateSectionCell(context) : new View(context);
            } else {
                groupCreateUserCell = new View(context) {
                    @Override
                    public void onMeasure(int i2, int i3) {
                        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(InviteMembersBottomSheet.this.searchAdditionalHeight + InviteMembersBottomSheet.this.additionalHeight + AndroidUtilities.dp(48.0f), 1073741824));
                    }
                };
            }
            return new RecyclerListView.Holder(groupCreateUserCell);
        }

        public void searchDialogs(String str) {
            if (this.searchRunnable != null) {
                Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                this.searchRunnable = null;
            }
            this.searchResult.clear();
            this.searchResultNames.clear();
            this.searchAdapterHelper.mergeResults(null);
            this.searchAdapterHelper.queryServerSearch(null, true, false, false, false, false, 0L, false, 0, 0);
            notifyDataSetChanged();
            if (TextUtils.isEmpty(str)) {
                RecyclerView.Adapter adapter = InviteMembersBottomSheet.this.listView.getAdapter();
                InviteMembersBottomSheet inviteMembersBottomSheet = InviteMembersBottomSheet.this;
                RecyclerView.Adapter adapter2 = inviteMembersBottomSheet.listViewAdapter;
                if (adapter != adapter2) {
                    inviteMembersBottomSheet.listView.setAdapter(adapter2);
                    return;
                }
                return;
            }
            RecyclerView.Adapter adapter3 = InviteMembersBottomSheet.this.listView.getAdapter();
            InviteMembersBottomSheet inviteMembersBottomSheet2 = InviteMembersBottomSheet.this;
            RecyclerView.Adapter adapter4 = inviteMembersBottomSheet2.searchListViewAdapter;
            if (adapter3 != adapter4) {
                inviteMembersBottomSheet2.listView.setAdapter(adapter4);
            }
            InviteMembersBottomSheet.this.emptyView.showProgress(true, false);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            InviteMembersBottomSheet$SearchAdapter$$ExternalSyntheticLambda0 inviteMembersBottomSheet$SearchAdapter$$ExternalSyntheticLambda0 = new InviteMembersBottomSheet$SearchAdapter$$ExternalSyntheticLambda0(this, str, 2);
            this.searchRunnable = inviteMembersBottomSheet$SearchAdapter$$ExternalSyntheticLambda0;
            dispatchQueue.postRunnable(inviteMembersBottomSheet$SearchAdapter$$ExternalSyntheticLambda0, 300L);
        }
    }

    public class SpansContainer extends ViewGroup {
        boolean addAnimation;
        private int animationIndex;
        private boolean animationStarted;
        private ArrayList<Animator> animators;
        private View removingSpan;

        public SpansContainer(Context context) {
            super(context);
            this.animators = new ArrayList<>();
            this.animationIndex = -1;
        }

        public void lambda$onMeasure$0(ValueAnimator valueAnimator) {
            InviteMembersBottomSheet.this.scrollViewH = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ((BottomSheet) InviteMembersBottomSheet.this).containerView.invalidate();
        }

        public void lambda$onMeasure$1(int i) {
            InviteMembersBottomSheet.this.spansScrollView.smoothScrollTo(0, i - InviteMembersBottomSheet.this.maxSize);
        }

        public void lambda$onMeasure$2(int i) {
            InviteMembersBottomSheet.this.spansScrollView.smoothScrollTo(0, i - InviteMembersBottomSheet.this.maxSize);
        }

        public void addSpan(GroupCreateSpan groupCreateSpan, boolean z) {
            this.addAnimation = true;
            InviteMembersBottomSheet.this.selectedContacts.put(groupCreateSpan, groupCreateSpan.getUid());
            if (InviteMembersBottomSheet.this.currentAnimation != null) {
                InviteMembersBottomSheet.this.currentAnimation.setupEndValues();
                InviteMembersBottomSheet.this.currentAnimation.cancel();
            }
            this.animationStarted = false;
            if (z) {
                InviteMembersBottomSheet.this.currentAnimation = new AnimatorSet();
                InviteMembersBottomSheet.this.currentAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        InviteMembersBottomSheet.this.currentAnimation = null;
                        SpansContainer.this.animationStarted = false;
                    }
                });
                InviteMembersBottomSheet.this.currentAnimation.setDuration(150L);
                InviteMembersBottomSheet.this.currentAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.animators.clear();
                this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_X, 0.01f, 1.0f));
                this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_Y, 0.01f, 1.0f));
                this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.ALPHA, 0.0f, 1.0f));
            }
            addView(groupCreateSpan);
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
            final int i3 = 1;
            int childCount = getChildCount();
            int size = View.MeasureSpec.getSize(i);
            int iDp = size - AndroidUtilities.dp(26.0f);
            int iDp2 = AndroidUtilities.dp(10.0f);
            int iDp3 = AndroidUtilities.dp(10.0f);
            final int i4 = 0;
            int iM = 0;
            int iM2 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt instanceof GroupCreateSpan) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                    if (childAt != this.removingSpan && childAt.getMeasuredWidth() + iM > iDp) {
                        iDp2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(8.0f, childAt.getMeasuredHeight(), iDp2);
                        iM = 0;
                    }
                    if (childAt.getMeasuredWidth() + iM2 > iDp) {
                        iDp3 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(8.0f, childAt.getMeasuredHeight(), iDp3);
                        iM2 = 0;
                    }
                    int iDp4 = AndroidUtilities.dp(13.0f) + iM;
                    if (!this.animationStarted) {
                        View view = this.removingSpan;
                        if (childAt == view) {
                            childAt.setTranslationX(AndroidUtilities.dp(13.0f) + iM2);
                            childAt.setTranslationY(iDp3);
                        } else if (view != null) {
                            float f = iDp4;
                            if (childAt.getTranslationX() != f) {
                                this.animators.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, f));
                            }
                            float f2 = iDp2;
                            if (childAt.getTranslationY() != f2) {
                                this.animators.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, f2));
                            }
                        } else {
                            childAt.setTranslationX(iDp4);
                            childAt.setTranslationY(iDp2);
                        }
                    }
                    if (childAt != this.removingSpan) {
                        iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(9.0f, childAt.getMeasuredWidth(), iM);
                    }
                    iM2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(9.0f, childAt.getMeasuredWidth(), iM2);
                }
            }
            int iDp5 = AndroidUtilities.dp(42.0f) + iDp3;
            final int iDp6 = AndroidUtilities.dp(42.0f) + iDp2;
            int iMin = InviteMembersBottomSheet.this.dialogsDelegate != null ? InviteMembersBottomSheet.this.spanEnter ? Math.min(InviteMembersBottomSheet.this.maxSize, iDp6) : 0 : BotFullscreenButtons$$ExternalSyntheticOutline1.m(52.0f, Math.min(InviteMembersBottomSheet.this.maxSize, iDp6), 0);
            int i6 = InviteMembersBottomSheet.this.searchAdditionalHeight;
            InviteMembersBottomSheet inviteMembersBottomSheet = InviteMembersBottomSheet.this;
            inviteMembersBottomSheet.searchAdditionalHeight = (inviteMembersBottomSheet.dialogsDelegate != null || InviteMembersBottomSheet.this.selectedContacts.size() <= 0) ? 0 : AndroidUtilities.dp(56.0f);
            if (iMin != InviteMembersBottomSheet.this.additionalHeight || i6 != InviteMembersBottomSheet.this.searchAdditionalHeight) {
                InviteMembersBottomSheet.this.additionalHeight = iMin;
                if (InviteMembersBottomSheet.this.listView.getAdapter() != null && InviteMembersBottomSheet.this.listView.getAdapter().getItemCount() > 0 && (viewHolderFindViewHolderForAdapterPosition = InviteMembersBottomSheet.this.listView.findViewHolderForAdapterPosition(0)) != null) {
                    InviteMembersBottomSheet.this.listView.getAdapter().lambda$onBindViewHolder$31(0);
                    InviteMembersBottomSheet.this.layoutManager.scrollToPositionWithOffset(0, viewHolderFindViewHolderForAdapterPosition.itemView.getTop() - InviteMembersBottomSheet.this.listView.getPaddingTop());
                    if (InviteMembersBottomSheet.this.listView.getItemAnimator() != null) {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                InviteMembersBottomSheet.this.listView.updateSelector();
                            }
                        });
                        valueAnimatorOfFloat.setDuration(InviteMembersBottomSheet.this.listView.getItemAnimator().getChangeDuration()).start();
                    }
                }
            }
            int iMin2 = Math.min(InviteMembersBottomSheet.this.maxSize, iDp6);
            if (InviteMembersBottomSheet.this.scrollViewH != iMin2) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(InviteMembersBottomSheet.this.scrollViewH, iMin2);
                valueAnimatorOfInt.addUpdateListener(new ButtonBounce$$ExternalSyntheticLambda0(this, 8));
                this.animators.add(valueAnimatorOfInt);
            }
            if (this.addAnimation && iDp6 > InviteMembersBottomSheet.this.maxSize) {
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final InviteMembersBottomSheet.SpansContainer f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i4) {
                            case 0:
                                this.f$0.lambda$onMeasure$1(iDp6);
                                break;
                            default:
                                this.f$0.lambda$onMeasure$2(iDp6);
                                break;
                        }
                    }
                });
            } else if (!this.addAnimation && InviteMembersBottomSheet.this.spansScrollView.getMeasuredHeight() + InviteMembersBottomSheet.this.spansScrollView.getScrollY() > iDp6) {
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final InviteMembersBottomSheet.SpansContainer f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i3) {
                            case 0:
                                this.f$0.lambda$onMeasure$1(iDp6);
                                break;
                            default:
                                this.f$0.lambda$onMeasure$2(iDp6);
                                break;
                        }
                    }
                });
            }
            if (!this.animationStarted && InviteMembersBottomSheet.this.currentAnimation != null) {
                InviteMembersBottomSheet.this.currentAnimation.playTogether(this.animators);
                InviteMembersBottomSheet.this.currentAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        InviteMembersBottomSheet.this.currentAnimation = null;
                        SpansContainer.this.requestLayout();
                    }
                });
                InviteMembersBottomSheet.this.currentAnimation.start();
                this.animationStarted = true;
            }
            if (InviteMembersBottomSheet.this.currentAnimation == null) {
                InviteMembersBottomSheet.this.scrollViewH = iMin2;
                ((BottomSheet) InviteMembersBottomSheet.this).containerView.invalidate();
            }
            setMeasuredDimension(size, Math.max(iDp6, iDp5));
            InviteMembersBottomSheet.this.listView.setTranslationY(0.0f);
        }

        public void removeSpan(final GroupCreateSpan groupCreateSpan) {
            this.addAnimation = false;
            InviteMembersBottomSheet.this.selectedContacts.remove(groupCreateSpan.getUid());
            groupCreateSpan.setOnClickListener(null);
            if (InviteMembersBottomSheet.this.currentAnimation != null) {
                InviteMembersBottomSheet.this.currentAnimation.setupEndValues();
                InviteMembersBottomSheet.this.currentAnimation.cancel();
            }
            this.animationStarted = false;
            InviteMembersBottomSheet.this.currentAnimation = new AnimatorSet();
            InviteMembersBottomSheet.this.currentAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    SpansContainer.this.removeView(groupCreateSpan);
                    SpansContainer.this.removingSpan = null;
                    InviteMembersBottomSheet.this.currentAnimation = null;
                    SpansContainer.this.animationStarted = false;
                }
            });
            InviteMembersBottomSheet.this.currentAnimation.setDuration(150L);
            this.removingSpan = groupCreateSpan;
            this.animators.clear();
            this.animators.add(ObjectAnimator.ofFloat(this.removingSpan, (Property<View, Float>) View.SCALE_X, 1.0f, 0.01f));
            this.animators.add(ObjectAnimator.ofFloat(this.removingSpan, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.01f));
            this.animators.add(ObjectAnimator.ofFloat(this.removingSpan, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f));
            requestLayout();
        }
    }

    public InviteMembersBottomSheet(Context context, int i, LongSparseArray longSparseArray, long j, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        super(context, false, i, resourcesProvider);
        this.contacts = new ArrayList<>();
        this.selectedContacts = new LongSparseArray();
        this.spansEnterProgress = 0.0f;
        this.spanClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GroupCreateSpan groupCreateSpan = (GroupCreateSpan) view;
                if (!groupCreateSpan.isDeleting()) {
                    if (InviteMembersBottomSheet.this.currentDeletingSpan != null) {
                        InviteMembersBottomSheet.this.currentDeletingSpan.cancelDeleteAnimation();
                    }
                    InviteMembersBottomSheet.this.currentDeletingSpan = groupCreateSpan;
                    groupCreateSpan.startDeleteAnimation();
                    return;
                }
                InviteMembersBottomSheet.this.currentDeletingSpan = null;
                InviteMembersBottomSheet.this.selectedContacts.remove(groupCreateSpan.getUid());
                InviteMembersBottomSheet.this.spansContainer.removeSpan(groupCreateSpan);
                InviteMembersBottomSheet.this.spansCountChanged(true);
                AndroidUtilities.updateVisibleRows(InviteMembersBottomSheet.this.listView);
            }
        };
        this.ignoreUsers = longSparseArray;
        this.needSnapToTop = false;
        this.parentFragment = baseFragment;
        this.chatId = j;
        fixNavigationBar();
        this.searchView.searchEditText.setHint(LocaleController.getString(R.string.SearchForChats));
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        SearchAdapter searchAdapter = new SearchAdapter();
        this.searchAdapter = searchAdapter;
        this.searchListViewAdapter = searchAdapter;
        RecyclerListView recyclerListView = this.listView;
        ListAdapter listAdapter = new ListAdapter();
        this.listViewAdapter = listAdapter;
        recyclerListView.setAdapter(listAdapter);
        this.emptyView.showProgress(false, false);
        this.emptyView.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i).contacts;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i2).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.contacts.add(user);
            }
        }
        SpansContainer spansContainer = new SpansContainer(context);
        this.spansContainer = spansContainer;
        this.listView.setOnItemClickListener(new ChannelBoostLayout$$ExternalSyntheticLambda2(this, j, baseFragment, longSparseArray, context));
        this.listView.lambda$onCellEnter$52(new ItemAnimator());
        updateRows();
        ScrollView scrollView = new ScrollView(context) {
            @Override
            public void onMeasure(int i3, int i4) {
                int size = View.MeasureSpec.getSize(i3);
                int size2 = View.MeasureSpec.getSize(i4);
                if (AndroidUtilities.isTablet() || size2 > size) {
                    InviteMembersBottomSheet.this.maxSize = AndroidUtilities.dp(144.0f);
                } else {
                    InviteMembersBottomSheet.this.maxSize = AndroidUtilities.dp(56.0f);
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(InviteMembersBottomSheet.this.maxSize, Integer.MIN_VALUE));
            }
        };
        this.spansScrollView = scrollView;
        scrollView.setVisibility(8);
        scrollView.setClipChildren(false);
        scrollView.addView(spansContainer);
        this.containerView.addView(scrollView);
        FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, resourcesProvider);
        this.floatingButton = fragmentFloatingButton;
        fragmentFloatingButton.setImageResource(R.drawable.floating_check);
        fragmentFloatingButton.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda34(this, context, j, 2));
        fragmentFloatingButton.setButtonVisible(false, false);
        fragmentFloatingButton.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(fragmentFloatingButton, FragmentFloatingButton.createDefaultLayoutParams());
        ((ViewGroup.MarginLayoutParams) this.emptyView.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.emptyView.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.emptyView.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    private void generateLink() {
        if (this.linkGenerating) {
            return;
        }
        this.linkGenerating = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.chatId);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new UndoView$$ExternalSyntheticLambda0(this, 10));
    }

    public void lambda$generateLink$7(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            this.invite = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.chatId);
            if (chatFull != null) {
                chatFull.exported_invite = this.invite;
            }
            if (this.invite.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.invite.link));
            BulletinFactory.createCopyLinkBulletin(this.parentFragment).show();
            lambda$showGiftOfferSheet$15();
        }
        this.linkGenerating = false;
    }

    public void lambda$generateLink$8(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda1(this, tL_error, tLObject, 26));
    }

    public void lambda$new$0(long j, BaseFragment baseFragment, LongSparseArray longSparseArray, Context context, View view, int i) {
        String strM;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        long j2;
        RecyclerView.Adapter adapter = this.listView.getAdapter();
        SearchAdapter searchAdapter = this.searchAdapter;
        TLObject object = null;
        if (adapter == searchAdapter) {
            int size = searchAdapter.searchResult.size();
            int size2 = this.searchAdapter.searchAdapterHelper.getGlobalSearch().size();
            int size3 = this.searchAdapter.searchAdapterHelper.getLocalServerSearch().size();
            int i2 = i - 1;
            if (i2 >= 0 && i2 < size) {
                object = (TLObject) this.searchAdapter.searchResult.get(i2);
            } else if (i2 >= size && i2 < size3 + size) {
                object = this.searchAdapter.searchAdapterHelper.getLocalServerSearch().get(i2 - size);
            } else if (i2 > size + size3 && i2 <= size2 + size + size3) {
                object = this.searchAdapter.searchAdapterHelper.getGlobalSearch().get(((i2 - size) - size3) - 1);
            }
            if (this.dialogsDelegate != null) {
                this.searchView.closeSearch();
            }
        } else if (i == this.copyLinkRow) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j);
            if (chat != null) {
                String publicUsername = ChatObject.getPublicUsername(chat);
                if (!TextUtils.isEmpty(publicUsername)) {
                    strM = Fragment$$ExternalSyntheticOutline0.m(MessagesController.getInstance(this.currentAccount).linkPrefix, "/", publicUsername, new StringBuilder("https://"));
                } else if (chatFull != null || (tL_chatInviteExported = chatFull.exported_invite) == null) {
                    generateLink();
                    strM = null;
                } else {
                    strM = tL_chatInviteExported.link;
                }
            } else if (chatFull != null) {
                generateLink();
                strM = null;
            } else {
                generateLink();
                strM = null;
            }
            if (strM == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", strM));
            lambda$showGiftOfferSheet$15();
            BulletinFactory.createCopyLinkBulletin(baseFragment).show();
        } else if (i >= this.contactsStartRow && i < this.contactsEndRow) {
            object = ((ListAdapter) this.listViewAdapter).getObject(i);
        }
        if (object != null) {
            if (object instanceof TLRPC.User) {
                j2 = ((TLRPC.User) object).id;
            } else {
                j2 = object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
            }
            if (longSparseArray == null || longSparseArray.indexOfKey(j2) < 0) {
                if (j2 != 0) {
                    if (this.selectedContacts.indexOfKey(j2) >= 0) {
                        GroupCreateSpan groupCreateSpan = (GroupCreateSpan) this.selectedContacts.get(j2);
                        this.selectedContacts.remove(j2);
                        this.spansContainer.removeSpan(groupCreateSpan);
                    } else {
                        GroupCreateSpan groupCreateSpan2 = new GroupCreateSpan(context, object);
                        groupCreateSpan2.setOnClickListener(this.spanClickListener);
                        this.selectedContacts.put(groupCreateSpan2, j2);
                        this.spansContainer.addSpan(groupCreateSpan2, true);
                    }
                }
                spansCountChanged(true);
                AndroidUtilities.updateVisibleRows(this.listView);
            }
        }
    }

    public void lambda$new$1(AlertDialog alertDialog, int i) {
        onAddToGroupDone(0);
    }

    public void lambda$new$2(Context context, long j, View view) {
        Activity activityFindActivity;
        int i = 5;
        if ((this.dialogsDelegate == null && this.selectedContacts.isEmpty()) || (activityFindActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (this.dialogsDelegate != null) {
            ArrayList<Long> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < this.selectedContacts.size(); i2++) {
                arrayList.add(Long.valueOf(this.selectedContacts.keyAt(i2)));
            }
            this.dialogsDelegate.didSelectDialogs(arrayList);
            lambda$showGiftOfferSheet$15();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activityFindActivity, 0, null);
        builder.setTitle(LocaleController.formatPluralString("AddManyMembersAlertTitle", this.selectedContacts.size(), new Object[0]));
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < this.selectedContacts.size(); i3++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.selectedContacts.keyAt(i3)));
            if (user != null) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("**");
                sb.append(ContactsController.formatName(user.first_name, user.last_name));
                sb.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
        if (this.selectedContacts.size() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", this.selectedContacts.size(), chat.title)));
            String str = String.format("%d", Integer.valueOf(this.selectedContacts.size()));
            int iIndexOf = TextUtils.indexOf(spannableStringBuilder, str);
            if (iIndexOf >= 0) {
                spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), iIndexOf, str.length() + iIndexOf, 33);
            }
            builder.setMessage(spannableStringBuilder);
        } else {
            SendMessagesHelper$$ExternalSyntheticOutline0.m("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, new Object[]{sb, chat.title}, builder);
        }
        builder.setPositiveButton(LocaleController.getString(R.string.Add), new ColorPicker$$ExternalSyntheticLambda5(this, i));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.create();
        builder.show();
    }

    public void lambda$onSearchViewTouched$5(EditTextBoldCursor editTextBoldCursor) {
        setFocusable(true);
        editTextBoldCursor.requestFocus();
        AndroidUtilities.runOnUIThread(new TagEditCell$$ExternalSyntheticLambda3(4, editTextBoldCursor));
    }

    public void lambda$spansCountChanged$3(ValueAnimator valueAnimator) {
        this.spansEnterProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.containerView.invalidate();
    }

    private void onAddToGroupDone(int i) {
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < this.selectedContacts.size(); i2++) {
            arrayList.add(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.selectedContacts.keyAt(i2))));
        }
        GroupCreateActivity.ContactsAddActivityDelegate contactsAddActivityDelegate = this.delegate;
        if (contactsAddActivityDelegate != null) {
            contactsAddActivityDelegate.didSelectUsers(arrayList, i);
        }
        lambda$showGiftOfferSheet$15();
    }

    public void spansCountChanged(boolean z) {
        boolean z2 = true;
        final boolean z3 = this.selectedContacts.size() > 0;
        if (this.spanEnter != z3) {
            ValueAnimator valueAnimator = this.spansEnterAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.spansEnterAnimator.cancel();
            }
            this.spanEnter = z3;
            if (z3) {
                this.spansScrollView.setVisibility(0);
            }
            if (z) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.spansEnterProgress, z3 ? 1.0f : 0.0f);
                this.spansEnterAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda6(this, 12));
                this.spansEnterAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        InviteMembersBottomSheet.this.spansEnterProgress = z3 ? 1.0f : 0.0f;
                        ((BottomSheet) InviteMembersBottomSheet.this).containerView.invalidate();
                        if (z3) {
                            return;
                        }
                        InviteMembersBottomSheet.this.spansScrollView.setVisibility(8);
                    }
                });
                this.spansEnterAnimator.setDuration(150L);
                this.spansEnterAnimator.start();
            } else {
                this.spansEnterProgress = z3 ? 1.0f : 0.0f;
                this.containerView.invalidate();
                if (!z3) {
                    this.spansScrollView.setVisibility(8);
                }
            }
            FragmentFloatingButton fragmentFloatingButton = this.floatingButton;
            if (!this.spanEnter && this.dialogsDelegate == null) {
                z2 = false;
            }
            fragmentFloatingButton.setButtonVisible(z2, z);
        }
    }

    private void updateRows() {
        this.contactsStartRow = -1;
        this.contactsEndRow = -1;
        this.copyLinkRow = -1;
        this.noContactsStubRow = -1;
        this.rowCount = 1;
        this.emptyRow = 0;
        if (this.dialogsDelegate == null) {
            if (hasLink()) {
                int i = this.rowCount;
                this.rowCount = i + 1;
                this.copyLinkRow = i;
            }
            if (this.contacts.size() != 0) {
                int i2 = this.rowCount;
                this.contactsStartRow = i2;
                int size = this.contacts.size() + i2;
                this.rowCount = size;
                this.contactsEndRow = size;
            } else {
                int i3 = this.rowCount;
                this.rowCount = i3 + 1;
                this.noContactsStubRow = i3;
            }
        } else if (this.dialogsServerOnly.size() != 0) {
            int i4 = this.rowCount;
            this.contactsStartRow = i4;
            int size2 = this.dialogsServerOnly.size() + i4;
            this.rowCount = size2;
            this.contactsEndRow = size2;
        } else {
            int i5 = this.rowCount;
            this.rowCount = i5 + 1;
            this.noContactsStubRow = i5;
        }
        int i6 = this.rowCount;
        this.rowCount = i6 + 1;
        this.lastRow = i6;
    }

    public boolean canGenerateLink() {
        return true;
    }

    @Override
    public UsersAlertBase.ContainerView createContainerView(Context context) {
        return new UsersAlertBase.ContainerView(context) {
            float animateToEmptyViewOffset;
            float deltaOffset;
            float emptyViewOffset;
            Paint paint = new Paint();
            private VerticalPositionAutoAnimator verticalPositionAutoAnimator;

            @Override
            public void dispatchDraw(Canvas canvas) {
                InviteMembersBottomSheet inviteMembersBottomSheet = InviteMembersBottomSheet.this;
                InviteMembersBottomSheet.this.spansScrollView.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (inviteMembersBottomSheet.scrollOffsetY - ((BottomSheet) inviteMembersBottomSheet).backgroundPaddingTop));
                float f = InviteMembersBottomSheet.this.searchAdditionalHeight + InviteMembersBottomSheet.this.additionalHeight;
                if (InviteMembersBottomSheet.this.emptyView.getVisibility() != 0) {
                    this.emptyViewOffset = f;
                    this.animateToEmptyViewOffset = f;
                } else if (this.animateToEmptyViewOffset != f) {
                    this.animateToEmptyViewOffset = f;
                    this.deltaOffset = (f - this.emptyViewOffset) * 0.10666667f;
                }
                float f2 = this.emptyViewOffset;
                float f3 = this.animateToEmptyViewOffset;
                if (f2 != f3) {
                    float f4 = this.deltaOffset;
                    float f5 = f2 + f4;
                    this.emptyViewOffset = f5;
                    if (f4 > 0.0f && f5 > f3) {
                        this.emptyViewOffset = f3;
                    } else if (f4 >= 0.0f || f5 >= f3) {
                        invalidate();
                    } else {
                        this.emptyViewOffset = f3;
                    }
                }
                InviteMembersBottomSheet inviteMembersBottomSheet2 = InviteMembersBottomSheet.this;
                inviteMembersBottomSheet2.emptyView.setTranslationY(inviteMembersBottomSheet2.scrollOffsetY + this.emptyViewOffset);
                super.dispatchDraw(canvas);
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                if (view != InviteMembersBottomSheet.this.spansScrollView) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + InviteMembersBottomSheet.this.scrollViewH + 1.0f);
                canvas.drawColor(ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_windowBackgroundWhite, false), (int) (InviteMembersBottomSheet.this.spansEnterProgress * 255.0f)));
                this.paint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_divider, false), (int) (InviteMembersBottomSheet.this.spansEnterProgress * 255.0f)));
                canvas.drawRect(0.0f, view.getY() + InviteMembersBottomSheet.this.scrollViewH, getMeasuredWidth(), view.getY() + InviteMembersBottomSheet.this.scrollViewH + 1.0f, this.paint);
                boolean zDrawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild;
            }

            @Override
            public void onAttachedToWindow() {
                super.onAttachedToWindow();
                VerticalPositionAutoAnimator verticalPositionAutoAnimator = this.verticalPositionAutoAnimator;
                if (verticalPositionAutoAnimator != null) {
                    verticalPositionAutoAnimator.ignoreNextLayout();
                }
            }

            @Override
            public void onViewAdded(View view) {
                if (view == InviteMembersBottomSheet.this.floatingButton && this.verticalPositionAutoAnimator == null) {
                    this.verticalPositionAutoAnimator = VerticalPositionAutoAnimator.attach(view);
                }
            }
        };
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.dialogsNeedReload && this.dialogsDelegate != null && this.dialogsServerOnly.isEmpty()) {
            this.dialogsServerOnly = new ArrayList<>(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.listViewAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void lambda$showGiftOfferSheet$15() {
        super.lambda$showGiftOfferSheet$15();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        if (this.enterEventSent) {
            Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
            if (activityFindActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activityFindActivity;
                BaseFragment baseFragment = (BaseFragment) Theme.ResourcesProvider.CC.m((ActionBarLayout) launchActivity.getActionBarLayout(), 1, ((ActionBarLayout) launchActivity.getActionBarLayout()).getFragmentStack());
                if (baseFragment instanceof ChatActivity) {
                    ((ChatActivity) baseFragment).onEditTextDialogClose(true, true);
                }
            }
        }
    }

    public boolean hasLink() {
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chatId));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.chatId);
        if (chat != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) {
            return true;
        }
        if (chatFull == null || chatFull.exported_invite == null) {
            return canGenerateLink();
        }
        return true;
    }

    @Override
    public void onSearchViewTouched(MotionEvent motionEvent, EditTextBoldCursor editTextBoldCursor) {
        BaseFragment baseFragment;
        if (motionEvent.getAction() == 0) {
            this.y = this.scrollOffsetY;
            return;
        }
        if (motionEvent.getAction() != 1 || Math.abs(this.scrollOffsetY - this.y) >= this.touchSlop || this.enterEventSent) {
            return;
        }
        Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
        if (activityFindActivity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) activityFindActivity;
            baseFragment = (BaseFragment) Theme.ResourcesProvider.CC.m((ActionBarLayout) launchActivity.getActionBarLayout(), 1, ((ActionBarLayout) launchActivity.getActionBarLayout()).getFragmentStack());
        } else {
            baseFragment = null;
        }
        if (baseFragment instanceof ChatActivity) {
            boolean zNeedEnterText = ((ChatActivity) baseFragment).needEnterText();
            this.enterEventSent = true;
            AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda7(28, this, editTextBoldCursor), zNeedEnterText ? 200L : 0L);
        } else {
            this.enterEventSent = true;
            setFocusable(true);
            editTextBoldCursor.requestFocus();
            AndroidUtilities.runOnUIThread(new TagEditCell$$ExternalSyntheticLambda3(3, editTextBoldCursor));
        }
    }

    @Override
    public void search(String str) {
        this.searchAdapter.searchDialogs(str);
    }

    public void setDelegate(GroupCreateActivity.ContactsAddActivityDelegate contactsAddActivityDelegate) {
        this.delegate = contactsAddActivityDelegate;
    }

    @Override
    public void setLastVisible(boolean z) {
    }

    public void setSelectedContacts(ArrayList<Long> arrayList) {
        float fMax;
        int i;
        int iDp;
        int iDp2;
        int i2;
        int iM;
        int iDp3;
        int iM2;
        View childAt;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Long l = arrayList.get(i3);
            long jLongValue = l.longValue();
            GroupCreateSpan groupCreateSpan = new GroupCreateSpan(this.spansContainer.getContext(), DialogObject.isChatDialog(jLongValue) ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-jLongValue)) : MessagesController.getInstance(this.currentAccount).getUser(l));
            this.spansContainer.addSpan(groupCreateSpan, false);
            groupCreateSpan.setOnClickListener(this.spanClickListener);
        }
        spansCountChanged(false);
        int childCount = this.spansContainer.getChildCount();
        Point point = AndroidUtilities.displaySize;
        boolean z = point.x < point.y;
        if (AndroidUtilities.isTablet() || z) {
            this.maxSize = AndroidUtilities.dp(144.0f);
        } else {
            this.maxSize = AndroidUtilities.dp(56.0f);
        }
        if (!AndroidUtilities.isTablet()) {
            if (z) {
                i = AndroidUtilities.displaySize.x;
            } else {
                fMax = Math.max(AndroidUtilities.displaySize.x * 0.8f, Math.min(AndroidUtilities.dp(480.0f), AndroidUtilities.displaySize.x));
            }
            iDp = i - AndroidUtilities.dp(26.0f);
            iDp2 = AndroidUtilities.dp(10.0f);
            iM = 0;
            for (i2 = 0; i2 < childCount; i2++) {
                childAt = this.spansContainer.getChildAt(i2);
                if (!(childAt instanceof GroupCreateSpan)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                    if (childAt.getMeasuredWidth() + iM > iDp) {
                        iDp2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(8.0f, childAt.getMeasuredHeight(), iDp2);
                        iM = 0;
                    }
                    iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(9.0f, childAt.getMeasuredWidth(), iM);
                }
            }
            iDp3 = AndroidUtilities.dp(42.0f) + iDp2;
            if (this.dialogsDelegate != null) {
                iM2 = BotFullscreenButtons$$ExternalSyntheticOutline1.m(52.0f, Math.min(this.maxSize, iDp3), 0);
            } else if (this.spanEnter) {
                iM2 = Math.min(this.maxSize, iDp3);
            } else {
                iM2 = 0;
            }
            int i4 = this.searchAdditionalHeight;
            int iDp4 = this.selectedContacts.size() > 0 ? AndroidUtilities.dp(56.0f) : 0;
            this.searchAdditionalHeight = iDp4;
            if (iM2 == this.additionalHeight || i4 != iDp4) {
                this.additionalHeight = iM2;
            }
            return;
        }
        Point point2 = AndroidUtilities.displaySize;
        fMax = Math.min(point2.x, point2.y) * 0.8f;
        i = (int) fMax;
        iDp = i - AndroidUtilities.dp(26.0f);
        iDp2 = AndroidUtilities.dp(10.0f);
        iM = 0;
        while (i2 < childCount) {
            childAt = this.spansContainer.getChildAt(i2);
            if (!(childAt instanceof GroupCreateSpan)) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt.getMeasuredWidth() + iM > iDp) {
                    iDp2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(8.0f, childAt.getMeasuredHeight(), iDp2);
                    iM = 0;
                }
                iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(9.0f, childAt.getMeasuredWidth(), iM);
            }
        }
        iDp3 = AndroidUtilities.dp(42.0f) + iDp2;
        if (this.dialogsDelegate != null) {
            iM2 = BotFullscreenButtons$$ExternalSyntheticOutline1.m(52.0f, Math.min(this.maxSize, iDp3), 0);
        } else if (this.spanEnter) {
            iM2 = Math.min(this.maxSize, iDp3);
        } else {
            iM2 = 0;
        }
        int i5 = this.searchAdditionalHeight;
        if (this.selectedContacts.size() > 0) {
        }
        this.searchAdditionalHeight = iDp4;
        if (iM2 == this.additionalHeight) {
        }
        this.additionalHeight = iM2;
    }

    public void setDelegate(InviteMembersBottomSheetDelegate inviteMembersBottomSheetDelegate, ArrayList<Long> arrayList) {
        this.dialogsDelegate = inviteMembersBottomSheetDelegate;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.dialogsServerOnly = new ArrayList<>(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        updateRows();
    }
}
