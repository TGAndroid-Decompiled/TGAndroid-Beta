package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.WeakHashMap;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline1;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.GroupCreateSectionCell;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EmojiView$$ExternalSyntheticLambda24;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.FragmentSearchField;
import org.telegram.ui.Components.FragmentSpansContainer;
import org.telegram.ui.Components.GroupCreateSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PermanentLinkBottomSheet;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.inset.WindowAnimatedInsetsProvider;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class GroupCreateActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target, View.OnClickListener, WindowAnimatedInsetsProvider.Listener {
    private static final int ANIMATOR_ID_CALL_BUTTONS_VISIBLE = 4;
    private static final int ANIMATOR_ID_SELECTED_CONTAINER_HEIGHT = 3;
    private static final int done_button = 1;
    private final int ADDITIONAL_LIST_HEIGHT_DP;
    private View actionBarBackgroundView;
    private GroupCreateAdapter adapter;
    private final boolean addToGroup;
    private ArrayList<GroupCreateSpan> allSpans;
    private final boolean allowMiniApps;
    private final boolean allowPremium;
    private final BoolAnimator animatorCallButtonsVisible;
    private final FactorAnimator animatorSelectorContainerHeight;
    private FrameLayout buttonsContainer;
    private final long channelId;
    private final int chatAddType;
    private final long chatId;
    private final int chatType;
    private GroupCreateSpan currentDeletingSpan;
    private String customTitle;
    private GroupCreateActivityDelegate delegate;
    private ContactsAddActivityDelegate delegate2;
    private boolean doneButtonVisible;
    private StickerEmptyView emptyView;
    private FragmentFloatingButton floatingButton;
    private final boolean forImport;
    private HeaderShadowView headerShadowView;
    private IBlur3Capture iBlur3Capture;
    private boolean iBlur3Invalidated;
    private final RectF iBlur3PositionActionBar;
    private final RectF iBlur3PositionBottomBar;
    private final ArrayList<RectF> iBlur3Positions;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    private LongSparseArray ignoreUsers;
    private int imeInsetAnimatedHeight;
    private TLRPC.ChatFull info;
    private final HashSet<Long> initialIds;
    private boolean initialMiniApps;
    private boolean initialPremium;
    private final boolean isAlwaysShare;
    private final boolean isCall;
    private final boolean isNeverShare;
    private LinearLayoutManager layoutManager;
    private RecyclerListView listView;
    private final int maxCount;
    int maxSize;
    private int navigationBarHeight;
    private final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    private FragmentSearchField searchField;
    private boolean searchWas;
    private boolean searching;
    private LongSparseArray selectedContacts;
    private GroupCreateSpan selectedMiniApps;
    private GroupCreateSpan selectedPremium;
    private PermanentLinkBottomSheet sharedLinkBottomSheet;
    private int shiftDp;
    private boolean showDiscardConfirm;
    private FragmentSpansContainer spansContainer;
    private final Rect tmpClipRect;
    private ArrayList<Long> toSelectIds;
    private boolean toSelectMiniApps;
    private boolean toSelectPremium;

    public static class Comparator implements java.util.Comparator<TLObject> {
        public static String getName(TLObject tLObject) {
            if (!(tLObject instanceof TLRPC.User)) {
                return tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : "";
            }
            TLRPC.User user = (TLRPC.User) tLObject;
            return ContactsController.formatName(user.first_name, user.last_name);
        }

        @Override
        public int compare(TLObject tLObject, TLObject tLObject2) {
            return getName(tLObject).compareTo(getName(tLObject2));
        }
    }

    public interface GroupCreateActivityDelegate {
        void didSelectUsers(boolean z, boolean z2, ArrayList<Long> arrayList);
    }

    public class GroupCreateAdapter extends RecyclerListView.FastScrollAdapter {
        private final Context context;
        private int createCallLinkRow;
        private int currentItemsCount;
        private int firstSectionRow;
        private int inviteViaLink;
        private int miniAppsRow;
        private int noContactsStubRow;
        private int premiumRow;
        private final SearchAdapterHelper searchAdapterHelper;
        private Runnable searchRunnable;
        private boolean searching;
        private int userTypesHeaderRow;
        private int usersStartRow;
        private ArrayList<Object> searchResult = new ArrayList<>();
        private ArrayList<CharSequence> searchResultNames = new ArrayList<>();
        private final ArrayList<TLObject> contacts = new ArrayList<>();

        public GroupCreateAdapter(Context context) {
            TLRPC.Chat chat;
            TLRPC.User user;
            this.context = context;
            HashSet hashSet = new HashSet();
            ArrayList<TLRPC.TL_contact> arrayList = GroupCreateActivity.this.getContactsController().contacts;
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.User user2 = GroupCreateActivity.this.getMessagesController().getUser(Long.valueOf(arrayList.get(i).user_id));
                if (user2 != null && !user2.self && !user2.deleted) {
                    this.contacts.add(user2);
                    hashSet.add(Long.valueOf(user2.id));
                }
            }
            if (GroupCreateActivity.this.isNeverShare || GroupCreateActivity.this.isAlwaysShare || GroupCreateActivity.this.isCall) {
                ArrayList<TLRPC.Dialog> allDialogs = GroupCreateActivity.this.getMessagesController().getAllDialogs();
                if (GroupCreateActivity.this.isCall) {
                    int size = allDialogs.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        TLRPC.Dialog dialog = allDialogs.get(i2);
                        if (DialogObject.isUserDialog(dialog.id) && !hashSet.contains(Long.valueOf(dialog.id)) && (user = GroupCreateActivity.this.getMessagesController().getUser(Long.valueOf(dialog.id))) != null && !UserObject.isDeleted(user) && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isService(dialog.id) && !MessagesController.isSupportUser(user)) {
                            this.contacts.add(user);
                            hashSet.add(Long.valueOf(user.id));
                        }
                    }
                } else {
                    int size2 = allDialogs.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        TLRPC.Dialog dialog2 = allDialogs.get(i3);
                        if (DialogObject.isChatDialog(dialog2.id) && (chat = GroupCreateActivity.this.getMessagesController().getChat(Long.valueOf(-dialog2.id))) != null && chat.migrated_to == null && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                            this.contacts.add(chat);
                        }
                    }
                }
                Collections.sort(this.contacts, new Comparator());
                TLObject tLObject = null;
                int i4 = 0;
                while (i4 < this.contacts.size()) {
                    TLObject tLObject2 = this.contacts.get(i4);
                    if (tLObject == null || !firstLetter(Comparator.getName(tLObject)).equals(firstLetter(Comparator.getName(tLObject2)))) {
                        this.contacts.add(i4, new Letter(firstLetter(Comparator.getName(tLObject2))));
                    }
                    i4++;
                    tLObject = tLObject2;
                }
            }
            SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(false);
            this.searchAdapterHelper = searchAdapterHelper;
            searchAdapterHelper.setDelegate(new BoostsActivity$$ExternalSyntheticLambda4(this, 24));
        }

        private String firstLetter(String str) {
            return TextUtils.isEmpty(str) ? "" : str.substring(0, 1);
        }

        public void lambda$new$0(int i) {
            GroupCreateActivity.this.showItemsAnimated(this.currentItemsCount);
            if (this.searchRunnable == null && !this.searchAdapterHelper.isSearchInProgress() && getItemCount() == 0) {
                GroupCreateActivity.this.emptyView.showProgress(false, true);
            }
            notifyDataSetChanged();
        }

        public void lambda$onBindViewHolder$1(View view) {
            GroupCreateActivity.this.selectedPremium = null;
            GroupCreateActivity.this.selectedContacts.clear();
            GroupCreateActivity.this.spansContainer.removeAllSpans(true);
            GroupCreateActivity.this.checkVisibleRows();
            GroupCreateActivity.this.updateEditTextHint();
        }

        public void lambda$searchDialogs$2(String str) {
            String lowerCase;
            String publicUsername;
            Object obj;
            String lowerCase2 = str.trim().toLowerCase();
            if (lowerCase2.isEmpty()) {
                updateSearchResults(new ArrayList<>(), new ArrayList<>());
                return;
            }
            String translitString = LocaleController.getInstance().getTranslitString(lowerCase2);
            if (lowerCase2.equals(translitString) || translitString.isEmpty()) {
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
            for (int i2 = 0; i2 < this.contacts.size(); i2++) {
                TLObject tLObject = this.contacts.get(i2);
                boolean z = tLObject instanceof TLRPC.User;
                if (z) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    lowerCase = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                    publicUsername = UserObject.getPublicUsername(user);
                } else {
                    if (!(tLObject instanceof TLRPC.Chat)) {
                        break;
                    }
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    lowerCase = chat.title;
                    publicUsername = ChatObject.getPublicUsername(chat);
                }
                String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString2)) {
                    translitString2 = null;
                }
                int i3 = 0;
                char c = 0;
                while (true) {
                    if (i3 >= i) {
                        break;
                        break;
                    }
                    String str2 = strArr[i3];
                    if (lowerCase.startsWith(str2) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str2, lowerCase) || (translitString2 != null && (translitString2.startsWith(str2) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str2, translitString2)))) {
                        c = 1;
                    } else if (publicUsername != null && publicUsername.startsWith(str2)) {
                        c = 2;
                    }
                    if (c != 0) {
                        if (c == 1) {
                            if (z) {
                                TLRPC.User user2 = (TLRPC.User) tLObject;
                                arrayList2.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str2));
                            } else if (tLObject instanceof TLRPC.Chat) {
                                obj = null;
                                arrayList2.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, null, str2));
                            }
                            obj = null;
                        } else {
                            obj = null;
                            arrayList2.add(AndroidUtilities.generateSearchName(zzii.m("@", publicUsername), null, "@" + str2));
                        }
                        arrayList.add(tLObject);
                        break;
                    }
                    i3++;
                }
            }
            updateSearchResults(arrayList, arrayList2);
        }

        public void lambda$searchDialogs$3(String str) {
            this.searchAdapterHelper.queryServerSearch(str, true, GroupCreateActivity.this.isAlwaysShare || GroupCreateActivity.this.isNeverShare, true, false, false, 0L, false, 0, 0);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            GroupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda2 groupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda2 = new GroupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda2(this, str, 2);
            this.searchRunnable = groupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda2;
            dispatchQueue.postRunnable(groupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda2);
        }

        public void lambda$searchDialogs$4(String str) {
            AndroidUtilities.runOnUIThread(new GroupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda2(this, str, 1));
        }

        public void lambda$updateSearchResults$5(ArrayList arrayList, ArrayList arrayList2) {
            if (this.searching) {
                this.searchRunnable = null;
                this.searchResult = arrayList;
                this.searchResultNames = arrayList2;
                this.searchAdapterHelper.mergeResults(arrayList);
                GroupCreateActivity.this.showItemsAnimated(this.currentItemsCount);
                notifyDataSetChanged();
                if (this.searching && !this.searchAdapterHelper.isSearchInProgress() && getItemCount() == 0) {
                    GroupCreateActivity.this.emptyView.showProgress(false, true);
                }
            }
        }

        private void updateSearchResults(ArrayList<Object> arrayList, ArrayList<CharSequence> arrayList2) {
            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda30(this, arrayList, arrayList2, 21));
        }

        @Override
        public int getItemCount() {
            int i;
            this.noContactsStubRow = -1;
            this.userTypesHeaderRow = -1;
            this.createCallLinkRow = -1;
            this.firstSectionRow = -1;
            this.premiumRow = -1;
            this.miniAppsRow = -1;
            if (this.searching) {
                int size = this.searchResult.size();
                int size2 = this.searchAdapterHelper.getLocalServerSearch().size();
                int size3 = this.searchAdapterHelper.getGlobalSearch().size();
                int i2 = size + size2;
                if (size3 != 0) {
                    i2 += size3 + 1;
                }
                this.currentItemsCount = i2;
                return i2;
            }
            if (GroupCreateActivity.this.isCall) {
                this.createCallLinkRow = 0;
                i = 1;
            } else {
                i = 0;
            }
            if (GroupCreateActivity.this.allowPremium) {
                int i3 = i + 1;
                this.firstSectionRow = i;
                this.userTypesHeaderRow = i;
                i += 2;
                this.premiumRow = i3;
            } else if (GroupCreateActivity.this.allowMiniApps) {
                int i4 = i + 1;
                this.firstSectionRow = i;
                this.userTypesHeaderRow = i;
                i += 2;
                this.miniAppsRow = i4;
            } else {
                this.firstSectionRow = i;
            }
            this.usersStartRow = i;
            int size4 = this.contacts.size() + i;
            if (GroupCreateActivity.this.addToGroup) {
                if (GroupCreateActivity.this.chatId != 0) {
                    this.inviteViaLink = ChatObject.canUserDoAdminAction(GroupCreateActivity.this.getMessagesController().getChat(Long.valueOf(GroupCreateActivity.this.chatId)), 3) ? 1 : 0;
                } else if (GroupCreateActivity.this.channelId != 0) {
                    TLRPC.Chat chat = GroupCreateActivity.this.getMessagesController().getChat(Long.valueOf(GroupCreateActivity.this.channelId));
                    this.inviteViaLink = (!ChatObject.canUserDoAdminAction(chat, 3) || ChatObject.isPublic(chat)) ? 0 : 2;
                } else {
                    this.inviteViaLink = 0;
                }
                if (this.inviteViaLink != 0) {
                    this.usersStartRow++;
                    size4++;
                }
            }
            if (size4 == 0) {
                this.noContactsStubRow = 0;
                size4++;
            }
            this.currentItemsCount = size4;
            return size4;
        }

        @Override
        public int getItemViewType(int i) {
            if (this.searching) {
                return i == this.searchAdapterHelper.getLocalServerSearch().size() + this.searchResult.size() ? 0 : 1;
            }
            if (i == this.createCallLinkRow) {
                return 2;
            }
            if (i == this.userTypesHeaderRow) {
                return 0;
            }
            if (i != this.premiumRow && i != this.miniAppsRow) {
                if (this.inviteViaLink != 0 && i == 0) {
                    return 2;
                }
                if (this.noContactsStubRow == i) {
                    return 3;
                }
                int i2 = i - this.usersStartRow;
                if (i2 >= 0 && i2 < this.contacts.size() && (this.contacts.get(i - this.usersStartRow) instanceof Letter)) {
                    return 0;
                }
            }
            return 1;
        }

        @Override
        public String getLetter(int i) {
            String str;
            String str2;
            if (this.searching || i < this.usersStartRow) {
                return null;
            }
            int size = this.contacts.size();
            int i2 = this.usersStartRow;
            if (i >= size + i2) {
                return null;
            }
            TLObject tLObject = this.contacts.get(i - i2);
            if (tLObject instanceof Letter) {
                return ((Letter) tLObject).letter;
            }
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                str = user.first_name;
                str2 = user.last_name;
            } else {
                str = ((TLRPC.Chat) tLObject).title;
                str2 = "";
            }
            if (LocaleController.nameDisplayOrder == 1) {
                if (!TextUtils.isEmpty(str)) {
                    return str.substring(0, 1).toUpperCase();
                }
                if (!TextUtils.isEmpty(str2)) {
                    return str2.substring(0, 1).toUpperCase();
                }
            } else {
                if (!TextUtils.isEmpty(str2)) {
                    return str2.substring(0, 1).toUpperCase();
                }
                if (!TextUtils.isEmpty(str)) {
                    return str.substring(0, 1).toUpperCase();
                }
            }
            return "";
        }

        @Override
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = (int) (getItemCount() * f);
            iArr[1] = 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 0) {
                return false;
            }
            if (GroupCreateActivity.this.ignoreUsers != null) {
                View view = viewHolder.itemView;
                if (view instanceof GroupCreateUserCell) {
                    Object object = ((GroupCreateUserCell) view).getObject();
                    return !(object instanceof TLRPC.User) || GroupCreateActivity.this.ignoreUsers.indexOfKey(((TLRPC.User) object).id) < 0;
                }
            }
            return true;
        }

        @Override
        public void notifyDataSetChanged() {
            super.notifyDataSetChanged();
            GroupCreateActivity.this.updateEditTextHint();
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLObject tLObject;
            CharSequence charSequence;
            long j;
            boolean z;
            String publicUsername;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                GraySectionCell graySectionCell = (GraySectionCell) viewHolder.itemView;
                if (this.searching) {
                    graySectionCell.setText(LocaleController.getString(R.string.GlobalSearch));
                } else if (i == this.userTypesHeaderRow) {
                    graySectionCell.setText(LocaleController.getString(R.string.PrivacyUserTypes));
                } else {
                    int i2 = i - this.usersStartRow;
                    if (i2 >= 0 && i2 < this.contacts.size()) {
                        TLObject tLObject2 = this.contacts.get(i - this.usersStartRow);
                        if (tLObject2 instanceof Letter) {
                            graySectionCell.setText(((Letter) tLObject2).letter.toUpperCase());
                        }
                    }
                }
                if (i == this.firstSectionRow) {
                    graySectionCell.setRightText((GroupCreateActivity.this.selectedPremium == null && GroupCreateActivity.this.selectedContacts.isEmpty()) ? "" : LocaleController.getString(R.string.DeselectAll), new OAuthSheet$$ExternalSyntheticLambda11(this, 17));
                    return;
                }
                return;
            }
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    return;
                }
                TextCell textCell = (TextCell) viewHolder.itemView;
                if (i == this.createCallLinkRow) {
                    textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.GroupCallCreateLink), R.drawable.menu_link_create2, false);
                    textCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                    return;
                } else if (this.inviteViaLink == 2) {
                    textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.ChannelInviteViaLink), R.drawable.msg_link2, false);
                    textCell.setColors(Theme.key_windowBackgroundWhiteGrayIcon, Theme.key_windowBackgroundWhiteBlackText);
                    return;
                } else {
                    textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.InviteToGroupByLink), R.drawable.msg_link2, false);
                    textCell.setColors(Theme.key_windowBackgroundWhiteGrayIcon, Theme.key_windowBackgroundWhiteBlackText);
                    return;
                }
            }
            GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) viewHolder.itemView;
            CharSequence charSequence2 = null;
            if (this.searching) {
                int size = this.searchResult.size();
                int size2 = this.searchAdapterHelper.getGlobalSearch().size();
                int size3 = this.searchAdapterHelper.getLocalServerSearch().size();
                if (i >= 0 && i < size) {
                    tLObject = (TLObject) this.searchResult.get(i);
                } else if (i < size || i >= size3 + size) {
                    tLObject = (i <= size + size3 || i > (size2 + size) + size3) ? null : this.searchAdapterHelper.getGlobalSearch().get(((i - size) - size3) - 1);
                } else {
                    tLObject = this.searchAdapterHelper.getLocalServerSearch().get(i - size);
                }
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.User) {
                        publicUsername = ((TLRPC.User) tLObject).username;
                    } else if (!(tLObject instanceof TLRPC.Chat)) {
                        return;
                    } else {
                        publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) tLObject);
                    }
                    if (i < size) {
                        charSequence = this.searchResultNames.get(i);
                        if (charSequence == null || TextUtils.isEmpty(publicUsername)) {
                            charSequence2 = charSequence;
                            charSequence = null;
                        } else {
                            if (!charSequence.toString().startsWith("@" + publicUsername)) {
                                charSequence2 = charSequence;
                                charSequence = null;
                            }
                        }
                    } else if (i > size && !TextUtils.isEmpty(publicUsername)) {
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
                groupCreateUserCell.setObject(tLObject, charSequence2, charSequence);
                if (tLObject instanceof TLRPC.User) {
                    j = ((TLRPC.User) tLObject).id;
                } else if (tLObject instanceof TLRPC.Chat) {
                    j = -((TLRPC.Chat) tLObject).id;
                } else {
                    j = 0;
                }
                if (j != 0) {
                    if (GroupCreateActivity.this.ignoreUsers == null && GroupCreateActivity.this.ignoreUsers.indexOfKey(j) >= 0) {
                        groupCreateUserCell.setChecked(true, false);
                        groupCreateUserCell.setCheckBoxEnabled(false);
                        return;
                    }
                    if (GroupCreateActivity.this.selectedContacts.indexOfKey(j) >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    groupCreateUserCell.setChecked(z, false);
                    groupCreateUserCell.setCheckBoxEnabled(true);
                }
            }
            if (i == this.premiumRow) {
                groupCreateUserCell.currentPremium = true;
                groupCreateUserCell.currentObject = "premium";
                groupCreateUserCell.avatarImageView.setImageDrawable(new CombinedDrawable(new TextCell.AnonymousClass2(new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient2, Theme.key_premiumGradient1, -1, -1, null), 3), groupCreateUserCell.getContext().getResources().getDrawable(R.drawable.msg_settings_premium), 0, 0));
                groupCreateUserCell.nameTextView.setText(LocaleController.getString(R.string.PrivacyPremium));
                SimpleTextView simpleTextView = groupCreateUserCell.statusTextView;
                int i3 = Theme.key_windowBackgroundWhiteGrayText;
                simpleTextView.setTag(Integer.valueOf(i3));
                if (groupCreateUserCell.forceDarkTheme) {
                    i3 = Theme.key_voipgroup_lastSeenText;
                }
                simpleTextView.setTextColor(Theme.getColor(i3, groupCreateUserCell.resourcesProvider));
                simpleTextView.setEmojiColor(simpleTextView.getTextColor());
                simpleTextView.setText(LocaleController.getString(R.string.PrivacyPremiumText));
                groupCreateUserCell.setChecked(GroupCreateActivity.this.selectedPremium != null, false);
                return;
            }
            if (i == this.miniAppsRow) {
                groupCreateUserCell.currentMiniapps = true;
                groupCreateUserCell.currentObject = "miniapps";
                BackupImageView backupImageView = groupCreateUserCell.avatarImageView;
                groupCreateUserCell.getContext();
                AvatarDrawable avatarDrawable = new AvatarDrawable();
                avatarDrawable.setAvatarType(8);
                avatarDrawable.setScaleSize(1.1f);
                avatarDrawable.setColor(Theme.getColor(null, Theme.key_avatar_backgroundBlue, false), Theme.getColor(null, Theme.key_avatar_background2Blue, false));
                backupImageView.setImageDrawable(avatarDrawable);
                groupCreateUserCell.nameTextView.setText(LocaleController.getString(R.string.PrivacyMiniapps));
                SimpleTextView simpleTextView2 = groupCreateUserCell.statusTextView;
                int i4 = Theme.key_windowBackgroundWhiteGrayText;
                simpleTextView2.setTag(Integer.valueOf(i4));
                if (groupCreateUserCell.forceDarkTheme) {
                    i4 = Theme.key_voipgroup_lastSeenText;
                }
                simpleTextView2.setTextColor(Theme.getColor(i4, groupCreateUserCell.resourcesProvider));
                simpleTextView2.setEmojiColor(simpleTextView2.getTextColor());
                simpleTextView2.setText(LocaleController.getString(R.string.PrivacyMiniappsText));
                groupCreateUserCell.setChecked(GroupCreateActivity.this.selectedMiniApps != null, false);
                return;
            }
            tLObject = this.contacts.get(i - this.usersStartRow);
            charSequence = null;
            groupCreateUserCell.setObject(tLObject, charSequence2, charSequence);
            if (tLObject instanceof TLRPC.User) {
                j = ((TLRPC.User) tLObject).id;
            } else if (tLObject instanceof TLRPC.Chat) {
                j = -((TLRPC.Chat) tLObject).id;
            } else {
                j = 0;
            }
            if (j != 0) {
                if (GroupCreateActivity.this.ignoreUsers == null) {
                }
                if (GroupCreateActivity.this.selectedContacts.indexOfKey(j) >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                groupCreateUserCell.setChecked(z, false);
                groupCreateUserCell.setCheckBoxEnabled(true);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View graySectionCell;
            View groupCreateUserCell;
            View view = null;
            if (i != 0) {
                if (i == 1) {
                    groupCreateUserCell = new GroupCreateUserCell(1, 0, this.context, null, false, false);
                } else if (i != 3) {
                    groupCreateUserCell = new TextCell(this.context);
                } else {
                    StickerEmptyView stickerEmptyView = new StickerEmptyView(this.context, view, 0) {
                        @Override
                        public void onAttachedToWindow() {
                            super.onAttachedToWindow();
                            this.stickerView.getImageReceiver().startAnimation();
                        }
                    };
                    stickerEmptyView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                    stickerEmptyView.subtitle.setVisibility(8);
                    stickerEmptyView.title.setText(LocaleController.getString(R.string.NoContacts));
                    stickerEmptyView.setAnimateLayoutChange(true);
                    graySectionCell = stickerEmptyView;
                }
                return new RecyclerListView.Holder(groupCreateUserCell);
            }
            graySectionCell = new GraySectionCell(this.context, 16, null);
            groupCreateUserCell = graySectionCell;
            return new RecyclerListView.Holder(groupCreateUserCell);
        }

        @Override
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof GroupCreateUserCell) {
                ((GroupCreateUserCell) view).avatarImageView.getImageReceiver().cancelLoadImage();
            }
        }

        public void searchDialogs(String str) {
            if (this.searchRunnable != null) {
                Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                this.searchRunnable = null;
            }
            this.searchResult.clear();
            this.searchResultNames.clear();
            this.searchAdapterHelper.mergeResults(null);
            this.searchAdapterHelper.queryServerSearch(null, true, GroupCreateActivity.this.isAlwaysShare || GroupCreateActivity.this.isNeverShare, false, false, false, 0L, false, 0, 0);
            notifyDataSetChanged();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            GroupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda2 groupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda2 = new GroupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda2(this, str, 0);
            this.searchRunnable = groupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda2;
            dispatchQueue.postRunnable(groupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda2, 300L);
        }

        public void setSearching(boolean z) {
            if (this.searching == z) {
                return;
            }
            this.searching = z;
            notifyDataSetChanged();
        }
    }

    public static class Letter extends TLRPC.TL_contact {
        public final String letter;

        public Letter(String str) {
            this.letter = str;
        }
    }

    public GroupCreateActivity(Bundle bundle) {
        super(bundle);
        int i = Build.VERSION.SDK_INT;
        this.ADDITIONAL_LIST_HEIGHT_DP = i >= 31 ? 48 : 0;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorSelectorContainerHeight = new FactorAnimator(3, this, cubicBezierInterpolator, 350L);
        this.animatorCallButtonsVisible = new BoolAnimator(4, this, cubicBezierInterpolator, 350L, false);
        this.selectedContacts = new LongSparseArray();
        this.allSpans = new ArrayList<>();
        this.initialIds = new HashSet<>();
        this.shiftDp = -4;
        this.tmpClipRect = new Rect();
        ArrayList<RectF> arrayList = new ArrayList<>(2);
        this.iBlur3Positions = arrayList;
        RectF rectF = new RectF();
        this.iBlur3PositionActionBar = rectF;
        RectF rectF2 = new RectF();
        this.iBlur3PositionBottomBar = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        int i2 = bundle.getInt("chatType", 0);
        this.chatType = i2;
        this.forImport = bundle.getBoolean("forImport", false);
        boolean z = bundle.getBoolean("isAlwaysShare", false);
        this.isAlwaysShare = z;
        boolean z2 = bundle.getBoolean("isNeverShare", false);
        this.isNeverShare = z2;
        boolean z3 = bundle.getBoolean("isCall", false);
        this.isCall = z3;
        boolean z4 = bundle.getBoolean("addToGroup", false);
        this.addToGroup = z4;
        this.chatAddType = bundle.getInt("chatAddType", 0);
        this.allowPremium = bundle.getBoolean("allowPremium", false);
        this.allowMiniApps = bundle.getBoolean("allowMiniapps", false);
        this.chatId = bundle.getLong("chatId");
        this.channelId = bundle.getLong("channelId");
        if (z || z2 || z4) {
            this.maxCount = 0;
        } else if (z3) {
            this.maxCount = getMessagesController().conferenceCallSizeLimit - 1;
        } else {
            this.maxCount = i2 == 0 ? getMessagesController().maxMegagroupCount : getMessagesController().maxBroadcastCount;
        }
        if (i >= 31) {
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor(false);
            this.iBlur3SourceGlassFrosted = new BlurredBackgroundSourceRenderNode(null);
        } else {
            this.scrollableViewNoiseSuppressor = null;
            this.iBlur3SourceGlassFrosted = null;
        }
    }

    public void blur3_InvalidateBlur() {
        if (Build.VERSION.SDK_INT < 31 || this.scrollableViewNoiseSuppressor == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(48.0f);
        this.iBlur3PositionActionBar.set(0.0f, 0.0f, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(48.0f) + this.maxSize);
        float f = -iDp;
        this.iBlur3PositionActionBar.inset(0.0f, f);
        if (this.buttonsContainer != null) {
            this.iBlur3PositionBottomBar.set(0.0f, this.fragmentView.getMeasuredHeight() - this.buttonsContainer.getMeasuredHeight(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
            this.iBlur3PositionBottomBar.inset(0.0f, f);
        }
        this.scrollableViewNoiseSuppressor.setupRenderNodes((this.buttonsContainer == null || this.animatorCallButtonsVisible.floatValue <= 0.0f) ? 1 : 2, this.iBlur3Positions);
        this.scrollableViewNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    public boolean checkDiscard(boolean z) {
        boolean z2;
        if (this.showDiscardConfirm) {
            HashSet<Long> hashSet = new HashSet();
            for (int i = 0; i < this.selectedContacts.size(); i++) {
                hashSet.add(Long.valueOf(this.selectedContacts.keyAt(i)));
            }
            if (this.initialPremium == (this.selectedPremium == null)) {
                z2 = true;
            } else if (this.initialMiniApps == (this.selectedMiniApps == null) || hashSet.size() != this.initialIds.size()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                for (Long l : hashSet) {
                    l.getClass();
                    if (!this.initialIds.contains(l)) {
                        z2 = true;
                        break;
                    }
                }
            }
            if (z2) {
                if (z) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                    builder.setTitle(LocaleController.getString(R.string.UserRestrictionsApplyChanges));
                    builder.setMessage(LocaleController.getString(R.string.PrivacySettingsChangedAlert));
                    builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new GroupCreateActivity$$ExternalSyntheticLambda0(this, 1));
                    builder.setNegativeButton(LocaleController.getString(R.string.PassportDiscard), new GroupCreateActivity$$ExternalSyntheticLambda0(this, 2));
                    showDialog(builder.create());
                }
                return false;
            }
        }
        return true;
    }

    public void checkUi_bottomButtons() {
        FrameLayout frameLayout = this.buttonsContainer;
        if (frameLayout == null) {
            return;
        }
        float f = this.animatorCallButtonsVisible.floatValue;
        frameLayout.setTranslationY((1.0f - f) * AndroidUtilities.dp(12.0f));
        this.buttonsContainer.setAlpha(f);
        this.buttonsContainer.setVisibility(f > 0.0f ? 0 : 8);
    }

    public void checkUi_floatingButton() {
        FragmentFloatingButton fragmentFloatingButton = this.floatingButton;
        if (fragmentFloatingButton != null) {
            fragmentFloatingButton.setTranslationY(-Math.max(this.navigationBarHeight, this.imeInsetAnimatedHeight));
        }
    }

    public void checkUi_headerShadowY() {
        this.headerShadowView.setTranslationY(AndroidUtilities.dp(48.0f) + this.animatorSelectorContainerHeight.factor);
    }

    public void checkUi_listClip() {
        if (this.listView.hasActiveEdgeEffects()) {
            this.listView.setClipBounds(null);
            return;
        }
        this.tmpClipRect.set(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.ADDITIONAL_LIST_HEIGHT_DP + 48) + ((int) this.animatorSelectorContainerHeight.factor), this.listView.getMeasuredWidth(), RichMessageLayout$$ExternalSyntheticOutline1.m(this.ADDITIONAL_LIST_HEIGHT_DP, this.listView.getMeasuredHeight(), (int) ((AndroidUtilities.dp(76.0f) + this.navigationBarHeight) * this.animatorCallButtonsVisible.floatValue)));
        this.listView.setClipBounds(this.tmpClipRect);
    }

    public void checkUi_listViewPadding() {
        this.listView.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.ADDITIONAL_LIST_HEIGHT_DP + 48) + ((int) this.animatorSelectorContainerHeight.factor), 0, AndroidUtilities.dp(this.ADDITIONAL_LIST_HEIGHT_DP) + this.navigationBarHeight + (this.isCall ? AndroidUtilities.dp(76.0f) : 0));
        this.emptyView.setPadding(0, 0, 0, this.navigationBarHeight);
    }

    public void checkUi_searchFieldY() {
        this.searchField.setTranslationY(this.animatorSelectorContainerHeight.factor);
    }

    public void checkVisibleRows() {
        long j;
        int childCount = this.listView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.listView.getChildAt(i);
            if (childAt instanceof GroupCreateUserCell) {
                GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) childAt;
                Object object = groupCreateUserCell.getObject();
                if (object instanceof TLRPC.User) {
                    j = ((TLRPC.User) object).id;
                } else if (object instanceof TLRPC.Chat) {
                    j = -((TLRPC.Chat) object).id;
                } else {
                    boolean z = object instanceof String;
                    if (z && "premium".equalsIgnoreCase((String) object)) {
                        groupCreateUserCell.setChecked(this.selectedPremium != null, true);
                        groupCreateUserCell.setCheckBoxEnabled(true);
                    } else if (z && "miniapps".equalsIgnoreCase((String) object)) {
                        groupCreateUserCell.setChecked(this.selectedMiniApps != null, true);
                        groupCreateUserCell.setCheckBoxEnabled(true);
                    } else {
                        j = 0;
                    }
                }
                if (j != 0) {
                    LongSparseArray longSparseArray = this.ignoreUsers;
                    if (longSparseArray == null || longSparseArray.indexOfKey(j) < 0) {
                        groupCreateUserCell.setChecked(this.selectedContacts.indexOfKey(j) >= 0, true);
                        groupCreateUserCell.setCheckBoxEnabled(true);
                    } else {
                        groupCreateUserCell.setChecked(true, false);
                        groupCreateUserCell.setCheckBoxEnabled(false);
                    }
                }
            } else if ((childAt instanceof GraySectionCell) && this.listView.getChildAdapterPosition(childAt) == this.adapter.firstSectionRow) {
                ((GraySectionCell) childAt).setRightText((this.selectedPremium == null && this.selectedContacts.isEmpty()) ? "" : LocaleController.getString(R.string.DeselectAll), new GroupCreateActivity$$ExternalSyntheticLambda1(this, 1));
            }
        }
    }

    public void closeSearch() {
        this.searching = false;
        this.searchWas = false;
        this.adapter.setSearching(false);
        this.adapter.searchDialogs(null);
        this.listView.setFastScrollVisible(true);
        this.listView.setVerticalScrollBarEnabled(false);
        showItemsAnimated(0);
    }

    public void drawBlurRect(Canvas canvas, RectF rectF, Paint paint) {
        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT < 29 || !SharedConfig.chatBlurEnabled() || (blurredBackgroundSourceRenderNode = this.iBlur3SourceGlassFrosted) == null) {
            return;
        }
        blurredBackgroundSourceRenderNode.draw(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom);
        int alpha = paint.getAlpha();
        paint.setAlpha(178);
        canvas.drawRect(rectF, paint);
        paint.setAlpha(alpha);
    }

    private HashSet<Long> getSelectedUsers() {
        HashSet<Long> hashSet = new HashSet<>();
        for (int i = 0; i < this.selectedContacts.size(); i++) {
            hashSet.add(Long.valueOf(this.selectedContacts.keyAt(i)));
        }
        return hashSet;
    }

    public void lambda$checkDiscard$13(AlertDialog alertDialog, int i) {
        onDonePressed(true);
    }

    public void lambda$checkDiscard$14(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$checkVisibleRows$12(View view) {
        this.selectedPremium = null;
        this.selectedContacts.clear();
        this.spansContainer.removeAllSpans(true);
        checkVisibleRows();
        updateEditTextHint();
        updateHint();
    }

    public void lambda$createView$0(int i) {
        this.animatorSelectorContainerHeight.animateTo(Math.min(i, this.maxSize));
    }

    public void lambda$createView$1(View view) {
        this.searchField.editText.clearFocus();
        this.searchField.editText.requestFocus();
        AndroidUtilities.showKeyboard(this.searchField.editText);
    }

    public boolean lambda$createView$2(TextView textView, int i, KeyEvent keyEvent) {
        return i == 6 && onDonePressed(true);
    }

    public void lambda$createView$3(TLRPC.User user, AlertDialog alertDialog, int i) {
        this.delegate2.needAddBot(user);
        if (this.searchField.editText.length() > 0) {
            this.searchField.editText.setText((CharSequence) null);
        }
    }

    public void lambda$createView$4(Context context, View view, int i) {
        long j;
        if (i == this.adapter.createCallLinkRow) {
            CallLogActivity.createCallLink(context, this.currentAccount, this.resourceProvider, new GroupCreateActivity$$ExternalSyntheticLambda7(this, 1));
            return;
        }
        if (i == 0 && this.adapter.inviteViaLink != 0 && !this.adapter.searching) {
            PermanentLinkBottomSheet permanentLinkBottomSheet = new PermanentLinkBottomSheet(context, false, this, this.info, this.chatId, this.channelId != 0);
            this.sharedLinkBottomSheet = permanentLinkBottomSheet;
            showDialog(permanentLinkBottomSheet);
            return;
        }
        if (view instanceof GroupCreateUserCell) {
            GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) view;
            if (groupCreateUserCell.currentPremium) {
                GroupCreateSpan groupCreateSpan = this.selectedPremium;
                if (groupCreateSpan == null) {
                    GroupCreateSpan groupCreateSpan2 = new GroupCreateSpan(this.searchField.editText.getContext(), "premium");
                    this.selectedPremium = groupCreateSpan2;
                    this.spansContainer.addSpan(groupCreateSpan2);
                    this.selectedPremium.setOnClickListener(this);
                } else {
                    this.spansContainer.removeSpan(groupCreateSpan);
                    this.selectedPremium = null;
                }
                checkVisibleRows();
                return;
            }
            if (groupCreateUserCell.currentMiniapps) {
                GroupCreateSpan groupCreateSpan3 = this.selectedMiniApps;
                if (groupCreateSpan3 == null) {
                    GroupCreateSpan groupCreateSpan4 = new GroupCreateSpan(this.searchField.editText.getContext(), "miniapps");
                    this.selectedMiniApps = groupCreateSpan4;
                    this.spansContainer.addSpan(groupCreateSpan4);
                    this.selectedMiniApps.setOnClickListener(this);
                } else {
                    this.spansContainer.removeSpan(groupCreateSpan3);
                    this.selectedMiniApps = null;
                }
                checkVisibleRows();
                return;
            }
            Object object = groupCreateUserCell.getObject();
            boolean z = object instanceof TLRPC.User;
            if (z) {
                j = ((TLRPC.User) object).id;
            } else if (!(object instanceof TLRPC.Chat)) {
                return;
            } else {
                j = -((TLRPC.Chat) object).id;
            }
            LongSparseArray longSparseArray = this.ignoreUsers;
            if (longSparseArray == null || longSparseArray.indexOfKey(j) < 0) {
                if (groupCreateUserCell.premiumBlocked) {
                    showPremiumBlockedToast(groupCreateUserCell, j);
                    return;
                }
                GroupCreateSpan groupCreateSpan5 = (GroupCreateSpan) this.selectedContacts.get(j);
                if (groupCreateSpan5 != null) {
                    this.spansContainer.removeSpan(groupCreateSpan5);
                } else {
                    if (this.maxCount != 0 && this.selectedContacts.size() == this.maxCount) {
                        return;
                    }
                    if (this.chatType == 0 && this.selectedContacts.size() == getMessagesController().maxGroupCount) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                        builder.setTitle(LocaleController.getString(R.string.AppName));
                        builder.setMessage(LocaleController.getString(R.string.SoftUserLimitAlert));
                        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                        showDialog(builder.create());
                        return;
                    }
                    if (z) {
                        TLRPC.User user = (TLRPC.User) object;
                        if (this.addToGroup && user.bot) {
                            long j2 = this.channelId;
                            if (j2 == 0 && user.bot_nochats) {
                                try {
                                    BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.BotCantJoinGroups)).show();
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                            if (j2 != 0) {
                                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.channelId));
                                AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity(), 0, null);
                                if (ChatObject.canAddAdmins(chat)) {
                                    builder2.setTitle(LocaleController.getString(R.string.AddBotAdminAlert));
                                    builder2.setMessage(LocaleController.getString(R.string.AddBotAsAdmin));
                                    builder2.setPositiveButton(LocaleController.getString(R.string.AddAsAdmin), new DialogsActivity$$ExternalSyntheticLambda6(12, this, user));
                                    builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                } else {
                                    builder2.setMessage(LocaleController.getString(R.string.CantAddBotAsAdmin));
                                    builder2.setPositiveButton(LocaleController.getString(R.string.OK), null);
                                }
                                showDialog(builder2.create());
                                return;
                            }
                        }
                        getMessagesController().putUser(user, !this.searching);
                    } else if (object instanceof TLRPC.Chat) {
                        getMessagesController().putChat((TLRPC.Chat) object, !this.searching);
                    }
                    GroupCreateSpan groupCreateSpan6 = new GroupCreateSpan(this.searchField.editText.getContext(), object);
                    this.spansContainer.addSpan(groupCreateSpan6);
                    groupCreateSpan6.setOnClickListener(this);
                }
                updateHint();
                if (this.searching || this.searchWas) {
                    AndroidUtilities.showKeyboard(this.searchField.editText);
                } else {
                    checkVisibleRows();
                }
                if (this.searchField.editText.length() > 0) {
                    this.searchField.editText.setText((CharSequence) null);
                }
            }
        }
    }

    public void lambda$createView$5(View view) {
        onDonePressed(true);
    }

    public void lambda$createView$6(View view) {
        onCallUsersSelected(getSelectedUsers(), false);
    }

    public void lambda$createView$7(View view) {
        onCallUsersSelected(getSelectedUsers(), false);
    }

    public void lambda$createView$8() {
        checkUi_listClip();
        blur3_InvalidateBlur();
    }

    public void lambda$createView$9() {
        this.listView.postOnAnimation(new GroupCreateActivity$$ExternalSyntheticLambda7(this, 3));
    }

    public void lambda$getThemeDescriptions$17() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.listView.getChildAt(i);
                if (childAt instanceof GroupCreateUserCell) {
                    ((GroupCreateUserCell) childAt).update(0);
                }
            }
        }
        FragmentSearchField fragmentSearchField = this.searchField;
        if (fragmentSearchField != null) {
            fragmentSearchField.updateColors();
        }
        FragmentFloatingButton fragmentFloatingButton = this.floatingButton;
        if (fragmentFloatingButton != null) {
            fragmentFloatingButton.updateColors();
        }
    }

    public static void lambda$onDonePressed$15(CheckBoxCell[] checkBoxCellArr, View view) {
        CheckBoxCell checkBoxCell = checkBoxCellArr[0];
        checkBoxCell.setChecked(!checkBoxCell.isChecked(), true);
    }

    public void lambda$onDonePressed$16(CheckBoxCell[] checkBoxCellArr, AlertDialog alertDialog, int i) {
        int i2 = 0;
        CheckBoxCell checkBoxCell = checkBoxCellArr[0];
        if (checkBoxCell != null && checkBoxCell.isChecked()) {
            i2 = 100;
        }
        onAddToGroupDone(i2);
    }

    public void lambda$showItemsAnimated$11(int i) {
        AnimatorSet animatorSet = new AnimatorSet();
        int childCount = this.listView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.listView.getChildAt(i2);
            if (this.listView.getChildAdapterPosition(childAt) >= i) {
                childAt.setAlpha(0.0f);
                int iMin = (int) ((Math.min(this.listView.getMeasuredHeight(), Math.max(0, childAt.getTop())) / this.listView.getMeasuredHeight()) * 100.0f);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                objectAnimatorOfFloat.setStartDelay(iMin);
                objectAnimatorOfFloat.setDuration(200L);
                animatorSet.playTogether(objectAnimatorOfFloat);
            }
        }
        animatorSet.start();
    }

    public void lambda$showPremiumBlockedToast$10() {
        presentFragment(new PremiumPreviewFragment("noncontacts"));
    }

    private void onAddToGroupDone(int i) {
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < this.selectedContacts.size(); i2++) {
            arrayList.add(getMessagesController().getUser(Long.valueOf(this.selectedContacts.keyAt(i2))));
        }
        ContactsAddActivityDelegate contactsAddActivityDelegate = this.delegate2;
        if (contactsAddActivityDelegate != null) {
            contactsAddActivityDelegate.didSelectUsers(arrayList, i);
        }
        finishFragment();
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false).bottom;
        this.navigationBarHeight = i;
        FrameLayout frameLayout = this.buttonsContainer;
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, i);
        }
        checkUi_listViewPadding();
        checkUi_floatingButton();
        return WindowInsetsCompat.CONSUMED;
    }

    public boolean onDonePressed(boolean z) {
        int i = 2;
        if (!this.selectedContacts.isEmpty() || this.chatType == 2 || !this.addToGroup) {
            if (!z || !this.addToGroup) {
                if (this.chatType == 2) {
                    ArrayList<TLRPC.InputUser> arrayList = new ArrayList<>();
                    for (int i2 = 0; i2 < this.selectedContacts.size(); i2++) {
                        TLRPC.InputUser inputUser = getMessagesController().getInputUser(getMessagesController().getUser(Long.valueOf(this.selectedContacts.keyAt(i2))));
                        if (inputUser != null) {
                            arrayList.add(inputUser);
                        }
                    }
                    getMessagesController().addUsersToChannel(this.chatId, arrayList, null);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", this.chatId);
                    bundle.putBoolean("just_created_chat", true);
                    presentFragment(new ChatActivity(bundle), true);
                    return true;
                }
                if (this.doneButtonVisible) {
                    if (this.addToGroup) {
                        onAddToGroupDone(0);
                        return true;
                    }
                    ArrayList<Long> arrayList2 = new ArrayList<>();
                    for (int i3 = 0; i3 < this.selectedContacts.size(); i3++) {
                        arrayList2.add(Long.valueOf(this.selectedContacts.keyAt(i3)));
                    }
                    if (this.isAlwaysShare || this.isNeverShare) {
                        GroupCreateActivityDelegate groupCreateActivityDelegate = this.delegate;
                        if (groupCreateActivityDelegate != null) {
                            groupCreateActivityDelegate.didSelectUsers(this.selectedPremium != null, this.selectedMiniApps != null, arrayList2);
                        }
                        finishFragment();
                        return true;
                    }
                    Bundle bundle2 = new Bundle();
                    int size = arrayList2.size();
                    long[] jArr = new long[size];
                    for (int i4 = 0; i4 < size; i4++) {
                        jArr[i4] = arrayList2.get(i4).longValue();
                    }
                    bundle2.putLongArray("result", jArr);
                    bundle2.putInt("chatType", this.chatType);
                    bundle2.putBoolean("forImport", this.forImport);
                    presentFragment(new GroupCreateFinalActivity(bundle2));
                    return true;
                }
            } else if (getParentActivity() != null) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                builder.setTitle(LocaleController.formatPluralString("AddManyMembersAlertTitle", this.selectedContacts.size(), new Object[0]));
                StringBuilder sb = new StringBuilder();
                for (int i5 = 0; i5 < this.selectedContacts.size(); i5++) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.selectedContacts.keyAt(i5)));
                    if (user != null) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append("**");
                        sb.append(ContactsController.formatName(user.first_name, user.last_name));
                        sb.append("**");
                    }
                }
                MessagesController messagesController = getMessagesController();
                long j = this.chatId;
                if (j == 0) {
                    j = this.channelId;
                }
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j));
                if (this.selectedContacts.size() > 5) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", this.selectedContacts.size(), chat != null ? chat.title : "")));
                    String str = String.format("%d", Integer.valueOf(this.selectedContacts.size()));
                    int iIndexOf = TextUtils.indexOf(spannableStringBuilder, str);
                    if (iIndexOf >= 0) {
                        spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), iIndexOf, str.length() + iIndexOf, 33);
                    }
                    builder.setMessage(spannableStringBuilder);
                } else {
                    builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AddMembersAlertNamesText, sb, chat != null ? chat.title : "")));
                }
                CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[1];
                if (!ChatObject.isChannel(chat)) {
                    LinearLayout linearLayout = new LinearLayout(getParentActivity());
                    linearLayout.setOrientation(1);
                    CheckBoxCell checkBoxCell = new CheckBoxCell(getParentActivity(), 1, 17, false, this.resourceProvider);
                    checkBoxCellArr[0] = checkBoxCell;
                    checkBoxCell.setBackground(Theme.getSelectorDrawable(false));
                    checkBoxCellArr[0].setMultiline(true);
                    if (this.selectedContacts.size() == 1) {
                        checkBoxCellArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AddOneMemberForwardMessages, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.selectedContacts.keyAt(0)))))), "", true, false, false);
                    } else {
                        checkBoxCellArr[0].setText(LocaleController.getString(R.string.AddMembersForwardMessages), "", true, false, false);
                    }
                    checkBoxCellArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                    linearLayout.addView(checkBoxCellArr[0], LayoutHelper.createLinear(-1, -2));
                    checkBoxCellArr[0].setOnClickListener(new ChatActivity$$ExternalSyntheticLambda204(checkBoxCellArr, i));
                    builder.setView(linearLayout);
                }
                builder.setPositiveButton(LocaleController.getString(R.string.Add), new DialogsActivity$$ExternalSyntheticLambda6(13, this, checkBoxCellArr));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                showDialog(builder.create());
                return true;
            }
        }
        return false;
    }

    public void showItemsAnimated(int i) {
        if (this.isPaused) {
            return;
        }
        AndroidUtilities.doOnPreDraw(this.listView, new OAuthSheet$$ExternalSyntheticLambda6(this, i, 17));
    }

    private void showPremiumBlockedToast(View view, long j) {
        int i = -this.shiftDp;
        this.shiftDp = i;
        AndroidUtilities.shakeViewSpring(view, i);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        String userName = j >= 0 ? UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j))) : "";
        (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() ? BulletinFactory.of(this).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : BulletinFactory.of(this).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new GroupCreateActivity$$ExternalSyntheticLambda7(this, 2))).show();
    }

    public void updateButtonsVisibility() {
        if (this.buttonsContainer == null) {
            return;
        }
        this.animatorCallButtonsVisible.setValue(!this.selectedContacts.isEmpty(), true);
    }

    public void updateEditTextHint() {
        GroupCreateAdapter groupCreateAdapter;
        EditTextBoldCursor editTextBoldCursor = this.searchField.editText;
        if (editTextBoldCursor == null) {
            return;
        }
        if (this.chatType == 2) {
            editTextBoldCursor.setHint(LocaleController.getString(R.string.AddMutual));
            return;
        }
        if (this.addToGroup || ((groupCreateAdapter = this.adapter) != null && groupCreateAdapter.noContactsStubRow == 0)) {
            this.searchField.editText.setHint(LocaleController.getString(R.string.SearchForPeople));
            return;
        }
        if (this.isAlwaysShare || this.isNeverShare) {
            this.searchField.editText.setHint(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        } else if (this.isCall) {
            this.searchField.editText.setHint(LocaleController.getString(R.string.NewCallSearch));
        } else {
            this.searchField.editText.setHint(LocaleController.getString(R.string.SendMessageTo));
        }
    }

    public void updateHint() {
        if (!this.isAlwaysShare && !this.isNeverShare && !this.addToGroup) {
            if (this.chatType == 2) {
                this.actionBar.setSubtitle(LocaleController.formatPluralString("Members", this.selectedContacts.size(), new Object[0]));
            } else if (this.selectedContacts.isEmpty()) {
                this.actionBar.setSubtitle(LocaleController.formatString(R.string.MembersCountZero, LocaleController.formatPluralString("Members", this.maxCount + (this.isCall ? 1 : 0), new Object[0])));
            } else {
                this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", this.selectedContacts.size()), Integer.valueOf(this.selectedContacts.size()), Integer.valueOf(this.maxCount)));
            }
        }
        if (this.chatType == 2 || !this.addToGroup) {
            return;
        }
        if (this.doneButtonVisible && this.allSpans.isEmpty()) {
            this.floatingButton.setButtonVisible(false, true);
            this.doneButtonVisible = false;
        } else {
            if (this.doneButtonVisible || this.allSpans.isEmpty()) {
                return;
            }
            this.floatingButton.setButtonVisible(true, true);
            this.doneButtonVisible = true;
        }
    }

    @Override
    public boolean canBeginSlide() {
        return checkDiscard(true);
    }

    @Override
    public ActionBar createActionBar(Context context) {
        ActionBar actionBarCreateActionBar = super.createActionBar(context);
        actionBarCreateActionBar.setAddToContainer(false);
        return actionBarCreateActionBar;
    }

    @Override
    public View createView(Context context) {
        int i = 3;
        int i2 = 5;
        int i3 = 0;
        this.searching = false;
        this.searchWas = false;
        this.allSpans.clear();
        this.selectedContacts.clear();
        this.currentDeletingSpan = null;
        int i4 = 2;
        if (this.chatType == 2) {
            this.doneButtonVisible = true;
        } else {
            this.doneButtonVisible = !this.addToGroup;
        }
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (TextUtils.isEmpty(this.customTitle)) {
            int i5 = this.chatType;
            if (i5 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAddSubscribers));
            } else if (this.isCall) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NewCall));
            } else if (this.addToGroup) {
                if (this.channelId != 0) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAddSubscribers));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.GroupAddMembers));
                }
            } else if (this.isAlwaysShare) {
                int i6 = this.chatAddType;
                if (i6 == 2) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.FilterAlwaysShow));
                } else if (i6 == 1) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AlwaysAllow));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AlwaysShareWithTitle));
                }
            } else if (this.isNeverShare) {
                int i7 = this.chatAddType;
                if (i7 == 2) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
                } else if (i7 == 1) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.NeverAllow));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
                }
            } else {
                this.actionBar.setTitle(LocaleController.getString(i5 == 0 ? R.string.NewGroup : R.string.NewBroadcastList));
            }
        } else {
            this.actionBar.setTitle(this.customTitle);
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i8) {
                if (i8 == -1) {
                    if (GroupCreateActivity.this.checkDiscard(true)) {
                        GroupCreateActivity.this.finishFragment();
                    }
                } else if (i8 == 1) {
                    GroupCreateActivity.this.onDonePressed(true);
                }
            }
        });
        this.searchField = new FragmentSearchField(context, this.resourceProvider);
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            public void dispatchDraw(Canvas canvas) {
                if (Build.VERSION.SDK_INT >= 31 && GroupCreateActivity.this.scrollableViewNoiseSuppressor != null) {
                    GroupCreateActivity.this.blur3_InvalidateBlur();
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (GroupCreateActivity.this.iBlur3SourceGlassFrosted != null && !GroupCreateActivity.this.iBlur3SourceGlassFrosted.inRecording && (GroupCreateActivity.this.iBlur3SourceGlassFrosted.needUpdateDisplayList(measuredWidth, measuredHeight) || GroupCreateActivity.this.iBlur3Invalidated)) {
                        GroupCreateActivity.this.scrollableViewNoiseSuppressor.draw(GroupCreateActivity.this.iBlur3SourceGlassFrosted.beginRecording(measuredWidth, measuredHeight), -3);
                        GroupCreateActivity.this.iBlur3SourceGlassFrosted.endRecording();
                    }
                    GroupCreateActivity.this.iBlur3Invalidated = false;
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, GroupCreateActivity.this.getThemedColor(Theme.key_windowBackgroundWhite), GroupCreateActivity.this.navigationBarHeight);
            }

            @Override
            public void onLayout(boolean z, int i8, int i9, int i10, int i11) {
                super.onLayout(z, i8, i9, i10, i11);
                GroupCreateActivity.this.checkUi_bottomButtons();
                GroupCreateActivity.this.checkUi_floatingButton();
                GroupCreateActivity.this.checkUi_searchFieldY();
                GroupCreateActivity.this.checkUi_listClip();
                GroupCreateActivity.this.checkUi_headerShadowY();
            }

            @Override
            public void onMeasure(int i8, int i9) {
                int size = View.MeasureSpec.getSize(i8);
                int size2 = View.MeasureSpec.getSize(i9);
                if (AndroidUtilities.isTablet() || size2 > size) {
                    GroupCreateActivity.this.maxSize = AndroidUtilities.dp(144.0f);
                } else {
                    GroupCreateActivity.this.maxSize = AndroidUtilities.dp(56.0f);
                }
                measureChildWithMargins(((BaseFragment) GroupCreateActivity.this).actionBar, i8, 0, i9, 0);
                ((ViewGroup.MarginLayoutParams) GroupCreateActivity.this.emptyView.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + ((BaseFragment) GroupCreateActivity.this).actionBar.getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) GroupCreateActivity.this.headerShadowView.getLayoutParams()).topMargin = ((BaseFragment) GroupCreateActivity.this).actionBar.getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) GroupCreateActivity.this.searchField.getLayoutParams()).topMargin = ((BaseFragment) GroupCreateActivity.this).actionBar.getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) GroupCreateActivity.this.spansContainer.getLayoutParams()).topMargin = ((BaseFragment) GroupCreateActivity.this).actionBar.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams = GroupCreateActivity.this.spansContainer.getLayoutParams();
                GroupCreateActivity groupCreateActivity = GroupCreateActivity.this;
                layoutParams.height = groupCreateActivity.maxSize;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) groupCreateActivity.actionBarBackgroundView.getLayoutParams();
                int iDp = AndroidUtilities.dp(53.0f) + ((BaseFragment) GroupCreateActivity.this).actionBar.getMeasuredHeight();
                GroupCreateActivity groupCreateActivity2 = GroupCreateActivity.this;
                marginLayoutParams.height = iDp + groupCreateActivity2.maxSize;
                groupCreateActivity2.checkUi_listViewPadding();
                super.onMeasure(i8, i9);
            }
        };
        this.fragmentView = frameLayout;
        frameLayout.setFocusableInTouchMode(true);
        frameLayout.setDescendantFocusability(131072);
        FragmentSpansContainer fragmentSpansContainer = new FragmentSpansContainer(context, this.currentAccount) {
            @Override
            public void addSpan(GroupCreateSpan groupCreateSpan) {
                super.addSpan(groupCreateSpan);
                GroupCreateActivity.this.updateButtonsVisibility();
            }

            @Override
            public void removeAllSpans(boolean z) {
                super.removeAllSpans(z);
                GroupCreateActivity.this.updateButtonsVisibility();
            }

            @Override
            public void removeSpan(GroupCreateSpan groupCreateSpan) {
                if (groupCreateSpan == GroupCreateActivity.this.selectedPremium) {
                    GroupCreateActivity.this.selectedPremium = null;
                }
                if (groupCreateSpan == GroupCreateActivity.this.selectedMiniApps) {
                    GroupCreateActivity.this.selectedMiniApps = null;
                }
                super.removeSpan(groupCreateSpan);
                GroupCreateActivity.this.updateButtonsVisibility();
            }
        };
        this.spansContainer = fragmentSpansContainer;
        fragmentSpansContainer.setDelegate(new GroupCreateActivity$$ExternalSyntheticLambda0(this, i3));
        this.spansContainer.getSpansContainer().setOnClickListener(new GroupCreateActivity$$ExternalSyntheticLambda1(this, i3));
        FragmentSpansContainer fragmentSpansContainer2 = this.spansContainer;
        this.selectedContacts = fragmentSpansContainer2.selectedContacts;
        this.allSpans = fragmentSpansContainer2.allSpans;
        updateEditTextHint();
        this.searchField.editText.setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda350(this, i2));
        this.searchField.editText.setOnKeyListener(new View.OnKeyListener() {
            private boolean wasEmpty;

            @Override
            public boolean onKey(View view, int i8, KeyEvent keyEvent) {
                if (i8 == 67) {
                    if (keyEvent.getAction() == 0) {
                        this.wasEmpty = GroupCreateActivity.this.searchField.editText.length() == 0;
                    } else if (keyEvent.getAction() == 1 && this.wasEmpty && !GroupCreateActivity.this.allSpans.isEmpty()) {
                        GroupCreateActivity.this.spansContainer.removeSpan((GroupCreateSpan) GroupCreateActivity.this.allSpans.get(GroupCreateActivity.this.allSpans.size() - 1));
                        GroupCreateActivity.this.updateHint();
                        GroupCreateActivity.this.checkVisibleRows();
                        return true;
                    }
                }
                return false;
            }
        });
        this.searchField.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
                if (GroupCreateActivity.this.searchField.editText.length() == 0) {
                    GroupCreateActivity.this.closeSearch();
                    return;
                }
                if (!GroupCreateActivity.this.adapter.searching) {
                    GroupCreateActivity.this.searching = true;
                    GroupCreateActivity.this.searchWas = true;
                    GroupCreateActivity.this.adapter.setSearching(true);
                    GroupCreateActivity.this.listView.setFastScrollVisible(false);
                    GroupCreateActivity.this.listView.setVerticalScrollBarEnabled(true);
                }
                GroupCreateActivity.this.adapter.searchDialogs(GroupCreateActivity.this.searchField.editText.getText().toString());
                GroupCreateActivity.this.emptyView.showProgress(true, false);
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            }
        });
        ArrayList<Long> arrayList = this.toSelectIds;
        if (arrayList != null) {
            select(arrayList, this.toSelectPremium, this.toSelectMiniApps);
        }
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        flickerLoadingView.setViewType(6);
        flickerLoadingView.showDate(false);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(context, flickerLoadingView, 1);
        this.emptyView = stickerEmptyView;
        stickerEmptyView.addView(flickerLoadingView);
        this.emptyView.showProgress(true, false);
        this.emptyView.title.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.emptyView);
        this.layoutManager = new LinearLayoutManager(1, false);
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setFastScrollEnabled(0);
        this.listView.setEmptyView(this.emptyView);
        RecyclerListView recyclerListView2 = this.listView;
        GroupCreateAdapter groupCreateAdapter = new GroupCreateAdapter(context);
        this.adapter = groupCreateAdapter;
        recyclerListView2.setAdapter(groupCreateAdapter);
        this.listView.setLayoutManager(this.layoutManager);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setClipToPadding(false);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        RecyclerListView recyclerListView3 = this.listView;
        float f = -this.ADDITIONAL_LIST_HEIGHT_DP;
        frameLayout.addView(recyclerListView3, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, f, 0.0f, f));
        this.listView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda5(8, this, context));
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i8) {
                if (i8 == 1) {
                    GroupCreateActivity.this.searchField.editText.hideActionMode();
                    AndroidUtilities.hideKeyboard(GroupCreateActivity.this.searchField.editText);
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
                int iFindFirstVisibleItemPosition = GroupCreateActivity.this.layoutManager.findFirstVisibleItemPosition();
                View childAt = GroupCreateActivity.this.listView.getChildAt(0);
                GroupCreateActivity.this.headerShadowView.setShadowVisible(iFindFirstVisibleItemPosition != 0 || (childAt != null ? childAt.getTop() : 0) < GroupCreateActivity.this.listView.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT < 31 || GroupCreateActivity.this.scrollableViewNoiseSuppressor == null) {
                    return;
                }
                GroupCreateActivity.this.scrollableViewNoiseSuppressor.onScrolled(i8, i9);
                GroupCreateActivity.this.blur3_InvalidateBlur();
            }
        });
        this.listView.setAnimateEmptyView(true, 0);
        FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider);
        this.floatingButton = fragmentFloatingButton;
        if (this.isNeverShare || this.isAlwaysShare || this.addToGroup) {
            fragmentFloatingButton.imageView.setImageResource(R.drawable.floating_check);
        } else {
            BackDrawable backDrawable = new BackDrawable(false);
            backDrawable.arrowRotation = 180;
            backDrawable.invalidateSelf();
            this.floatingButton.imageView.setImageDrawable(backDrawable);
        }
        if (!this.isCall) {
            frameLayout.addView(this.floatingButton, FragmentFloatingButton.createDefaultLayoutParams());
        }
        this.floatingButton.setOnClickListener(new GroupCreateActivity$$ExternalSyntheticLambda1(this, i4));
        this.floatingButton.setButtonVisible(this.doneButtonVisible, false);
        this.floatingButton.setContentDescription(LocaleController.getString(R.string.Next));
        if (this.isCall) {
            this.buttonsContainer = new FrameLayout(context) {
                private final RectF rectTmp = new RectF();
                private final Paint paint = new Paint(1);

                @Override
                public void dispatchDraw(Canvas canvas) {
                    this.paint.setColor(GroupCreateActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    canvas.save();
                    canvas.translate(0.0f, -getTop());
                    this.rectTmp.set(0.0f, 0.0f, getWidth(), getHeight());
                    this.rectTmp.offset(0.0f, getTop());
                    GroupCreateActivity.this.drawBlurRect(canvas, this.rectTmp, this.paint);
                    canvas.restore();
                    super.dispatchDraw(canvas);
                }
            };
            View view = new View(context);
            view.setBackgroundColor(Theme.getColor(Theme.key_divider, this.resourceProvider));
            this.buttonsContainer.addView(view, LayoutHelper.createFrame(-1, 1.0f / AndroidUtilities.density, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            this.buttonsContainer.addView(linearLayout, LayoutHelper.createFrame(-1, -2, 87));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, this.resourceProvider);
            buttonWithCounterView.setRound();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.profile_phone), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
            buttonWithCounterView.setText(spannableStringBuilder, false);
            linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            buttonWithCounterView.setOnClickListener(new GroupCreateActivity$$ExternalSyntheticLambda1(this, i));
            ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, true, this.resourceProvider);
            buttonWithCounterView2.setRound();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new ColoredImageSpan(R.drawable.profile_video), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
            buttonWithCounterView2.setText(spannableStringBuilder2, false);
            linearLayout.addView(buttonWithCounterView2, LayoutHelper.createLinear(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            buttonWithCounterView2.setOnClickListener(new GroupCreateActivity$$ExternalSyntheticLambda1(this, 4));
            frameLayout.addView(this.buttonsContainer, LayoutHelper.createFrame(-1, -2, 87));
            checkUi_bottomButtons();
        }
        updateHint();
        View view2 = new View(context) {
            private final RectF rectTmp = new RectF();
            private final Paint paint = new Paint(1);

            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                int iDp = AndroidUtilities.dp(48.0f) + ((int) GroupCreateActivity.this.animatorSelectorContainerHeight.factor);
                this.paint.setColor(GroupCreateActivity.this.getThemedColor(Theme.key_actionBarDefault));
                this.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), ((BaseFragment) GroupCreateActivity.this).actionBar.getMeasuredHeight() + iDp);
                GroupCreateActivity.this.drawBlurRect(canvas, this.rectTmp, this.paint);
            }
        };
        this.actionBarBackgroundView = view2;
        frameLayout.addView(view2, LayoutHelper.createFrame(-1, 0, 48));
        frameLayout.addView(this.actionBar);
        frameLayout.addView(this.searchField, LayoutHelper.createFrame(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        frameLayout.addView(this.spansContainer);
        RecyclerListView recyclerListView4 = this.listView;
        Objects.requireNonNull(recyclerListView4);
        this.iBlur3Capture = new ViewGroupPartRenderer(recyclerListView4, frameLayout, new EmojiView$$ExternalSyntheticLambda24(recyclerListView4));
        this.listView.addEdgeEffectListener(new GroupCreateActivity$$ExternalSyntheticLambda7(this, i3));
        HeaderShadowView headerShadowView = new HeaderShadowView(context, this.parentLayout);
        this.headerShadowView = headerShadowView;
        headerShadowView.setShadowVisible(false, false);
        frameLayout.addView(this.headerShadowView, LayoutHelper.createFrame(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity != null) {
            launchActivity.getRootAnimatedInsetsListener().listeners.add(this);
        }
        View view3 = this.fragmentView;
        GroupCreateActivity$$ExternalSyntheticLambda0 groupCreateActivity$$ExternalSyntheticLambda0 = new GroupCreateActivity$$ExternalSyntheticLambda0(this, i);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(view3, groupCreateActivity$$ExternalSyntheticLambda0);
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.contactsDidLoad) {
            GroupCreateAdapter groupCreateAdapter = this.adapter;
            if (groupCreateAdapter != null) {
                groupCreateAdapter.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (i != NotificationCenter.updateInterfaces) {
            if (i == NotificationCenter.chatDidCreated) {
                removeSelfFromStack();
            }
        } else if (this.listView != null) {
            int iIntValue = ((Integer) objArr[0]).intValue();
            int childCount = this.listView.getChildCount();
            if ((MessagesController.UPDATE_MASK_AVATAR & iIntValue) == 0 && (MessagesController.UPDATE_MASK_NAME & iIntValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & iIntValue) == 0) {
                return;
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.listView.getChildAt(i3);
                if (childAt instanceof GroupCreateUserCell) {
                    ((GroupCreateUserCell) childAt).update(iIntValue);
                }
            }
        }
    }

    @Override
    public boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public View getAnimatedInsetsTargetView() {
        return this.fragmentView;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        IntroActivity$$ExternalSyntheticLambda0 introActivity$$ExternalSyntheticLambda0 = new IntroActivity$$ExternalSyntheticLambda0(this, 17);
        View view = this.fragmentView;
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(view, 1, null, null, null, null, i));
        ActionBar actionBar = this.actionBar;
        int i2 = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, 1, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.spansContainer, 32768, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 33554432, null, null, null, null, Theme.key_fastScrollActive));
        arrayList.add(new ThemeDescription(this.listView, 33554432, null, null, null, null, Theme.key_fastScrollInactive));
        arrayList.add(new ThemeDescription(this.listView, 33554432, null, null, null, null, Theme.key_fastScrollText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.emptyView, 4, null, null, null, null, Theme.key_emptyListPlaceholder));
        arrayList.add(new ThemeDescription(this.emptyView, 2048, null, null, null, null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{GroupCreateSectionCell.class}, null, null, null, Theme.key_graySection));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{GroupCreateSectionCell.class}, new String[]{"drawable"}, null, null, -1, null, Theme.key_groupcreate_sectionShadow));
        int i3 = Theme.key_groupcreate_sectionText;
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{GroupCreateSectionCell.class}, new String[]{"textView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{GroupCreateUserCell.class}, new String[]{"textView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{GroupCreateUserCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_checkbox));
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{GroupCreateUserCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_checkboxDisabled));
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{GroupCreateUserCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_checkboxCheck));
        arrayList.add(new ThemeDescription(this.listView, 262148, new Class[]{GroupCreateUserCell.class}, new String[]{"statusTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueText));
        int i4 = Theme.key_windowBackgroundWhiteGrayText;
        arrayList.add(new ThemeDescription(this.listView, 262148, new Class[]{GroupCreateUserCell.class}, new String[]{"statusTextView"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{GroupCreateUserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundCyan));
        int i5 = Theme.key_avatar_backgroundBlue;
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, i5));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.spansContainer.getSpansContainer(), 0, new Class[]{GroupCreateSpan.class}, null, null, null, Theme.key_groupcreate_spanBackground));
        arrayList.add(new ThemeDescription(this.spansContainer.getSpansContainer(), 0, new Class[]{GroupCreateSpan.class}, null, null, null, Theme.key_groupcreate_spanText));
        arrayList.add(new ThemeDescription(this.spansContainer.getSpansContainer(), 0, new Class[]{GroupCreateSpan.class}, null, null, null, Theme.key_groupcreate_spanDelete));
        arrayList.add(new ThemeDescription(this.spansContainer.getSpansContainer(), 0, new Class[]{GroupCreateSpan.class}, null, null, null, i5));
        arrayList.add(new ThemeDescription(this.emptyView.title, 4, null, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.emptyView.subtitle, 4, null, null, null, null, i4));
        PermanentLinkBottomSheet permanentLinkBottomSheet = this.sharedLinkBottomSheet;
        if (permanentLinkBottomSheet != null) {
            arrayList.addAll(permanentLinkBottomSheet.getThemeDescriptions());
        }
        return arrayList;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public void onAnimatedInsetsChanged(View view, WindowInsetsCompat windowInsetsCompat) {
        this.imeInsetAnimatedHeight = windowInsetsCompat.mImpl.getInsets(8).bottom;
        checkUi_floatingButton();
    }

    @Override
    public void onAnimatedInsetsFinished() {
    }

    @Override
    public void onAnimatedInsetsStarted() {
    }

    @Override
    public boolean onBackPressed(boolean z) {
        if (checkDiscard(z)) {
            return super.onBackPressed(z);
        }
        return false;
    }

    public void onCallUsersSelected(HashSet<Long> hashSet, boolean z) {
    }

    @Override
    public void onClick(View view) {
        GroupCreateSpan groupCreateSpan = (GroupCreateSpan) view;
        if (groupCreateSpan.isDeleting()) {
            this.currentDeletingSpan = null;
            this.spansContainer.removeSpan(groupCreateSpan);
            updateHint();
            checkVisibleRows();
            return;
        }
        GroupCreateSpan groupCreateSpan2 = this.currentDeletingSpan;
        if (groupCreateSpan2 != null) {
            groupCreateSpan2.cancelDeleteAnimation();
        }
        this.currentDeletingSpan = groupCreateSpan;
        groupCreateSpan.startDeleteAnimation();
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i != 3) {
            if (i == 4) {
                checkUi_bottomButtons();
                checkUi_listClip();
                return;
            }
            return;
        }
        int paddingTop = this.listView.getPaddingTop();
        checkUi_listViewPadding();
        checkUi_searchFieldY();
        checkUi_listClip();
        checkUi_headerShadowY();
        this.actionBarBackgroundView.invalidate();
        int paddingTop2 = this.listView.getPaddingTop();
        if (paddingTop2 == paddingTop || this.headerShadowView.isShadowVisible()) {
            return;
        }
        this.listView.scrollBy(0, paddingTop - paddingTop2);
    }

    @Override
    public boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.contactsDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.chatDidCreated);
        getUserConfig().loadGlobalTTl();
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.contactsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatDidCreated);
    }

    public void select(ArrayList<Long> arrayList, boolean z, boolean z2) {
        GroupCreateSpan groupCreateSpan;
        GroupCreateSpan groupCreateSpan2;
        this.initialIds.clear();
        this.initialIds.addAll(arrayList);
        this.initialPremium = z;
        this.initialMiniApps = z2;
        FragmentSpansContainer fragmentSpansContainer = this.spansContainer;
        if (fragmentSpansContainer == null) {
            this.toSelectIds = arrayList;
            this.toSelectPremium = z;
            this.toSelectMiniApps = z2;
            return;
        }
        if (z && this.selectedPremium == null) {
            GroupCreateSpan groupCreateSpan3 = new GroupCreateSpan(getContext(), "premium");
            this.selectedPremium = groupCreateSpan3;
            this.spansContainer.addSpan(groupCreateSpan3);
            this.selectedPremium.setOnClickListener(this);
        } else if (!z && (groupCreateSpan = this.selectedPremium) != null) {
            fragmentSpansContainer.removeSpan(groupCreateSpan);
            this.selectedPremium = null;
        }
        if (z2 && this.selectedMiniApps == null) {
            GroupCreateSpan groupCreateSpan4 = new GroupCreateSpan(getContext(), "miniApps");
            this.selectedMiniApps = groupCreateSpan4;
            this.spansContainer.addSpan(groupCreateSpan4);
            this.selectedMiniApps.setOnClickListener(this);
        } else if (!z2 && (groupCreateSpan2 = this.selectedMiniApps) != null) {
            this.spansContainer.removeSpan(groupCreateSpan2);
            this.selectedMiniApps = null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Long l = arrayList.get(i);
            i++;
            Long l2 = l;
            long jLongValue = l2.longValue();
            Object chat = jLongValue < 0 ? getMessagesController().getChat(Long.valueOf(-jLongValue)) : getMessagesController().getUser(l2);
            if (chat != null) {
                GroupCreateSpan groupCreateSpan5 = new GroupCreateSpan(getContext(), chat);
                this.spansContainer.addSpan(groupCreateSpan5);
                groupCreateSpan5.setOnClickListener(this);
            }
        }
        this.spansContainer.endAnimation();
        AndroidUtilities.updateVisibleRows(this.listView);
    }

    public void setDelegate(GroupCreateActivityDelegate groupCreateActivityDelegate) {
        this.delegate = groupCreateActivityDelegate;
    }

    public void setDelegate2(ContactsAddActivityDelegate contactsAddActivityDelegate) {
        this.delegate2 = contactsAddActivityDelegate;
    }

    public void setIgnoreUsers(LongSparseArray longSparseArray) {
        this.ignoreUsers = longSparseArray;
    }

    public void setInfo(TLRPC.ChatFull chatFull) {
        this.info = chatFull;
    }

    public void setShowDiscardConfirm(boolean z) {
        this.showDiscardConfirm = z;
    }

    public void setTitle(String str) {
        this.customTitle = str;
    }

    public interface ContactsAddActivityDelegate {
        void didSelectUsers(ArrayList<TLRPC.User> arrayList, int i);

        void needAddBot(TLRPC.User user);

        public abstract class CC {
            public static void $default$needAddBot(ContactsAddActivityDelegate contactsAddActivityDelegate, TLRPC.User user) {
            }
        }
    }
}
