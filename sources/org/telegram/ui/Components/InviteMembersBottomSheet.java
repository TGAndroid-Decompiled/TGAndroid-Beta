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
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
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
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.Cells.GroupCreateSectionCell;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.ManageChatTextCell;
import org.telegram.ui.ChannelBoostLayout$$ExternalSyntheticLambda0;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.EditWidgetActivity;
import org.telegram.ui.GroupCreateActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.QrActivity;
import org.telegram.ui.UsersSelectActivity;

public class InviteMembersBottomSheet extends UsersAlertBase implements NotificationCenter.NotificationCenterDelegate {
    public int additionalHeight;
    public final long chatId;
    public final ArrayList contacts;
    public int contactsEndRow;
    public int contactsStartRow;
    public int copyLinkRow;
    public AnimatorSet currentAnimation;
    public GroupCreateSpan currentDeletingSpan;
    public GroupCreateActivity.ContactsAddActivityDelegate delegate;
    public VideoEditTextureView$$ExternalSyntheticLambda1 dialogsDelegate;
    public ArrayList dialogsServerOnly;
    public boolean enterEventSent;
    public final FragmentFloatingButton floatingButton;
    public final LongSparseArray ignoreUsers;
    public TLRPC.TL_chatInviteExported invite;
    public int lastRow;
    public boolean linkGenerating;
    public int maxSize;
    public int noContactsStubRow;
    public final BaseFragment parentFragment;
    public int rowCount;
    public int scrollViewH;
    public final SearchAdapter searchAdapter;
    public int searchAdditionalHeight;
    public final LongSparseArray selectedContacts;
    public final ChatActivity.AnonymousClass109 spanClickListener;
    public boolean spanEnter;
    public final SpansContainer spansContainer;
    public ValueAnimator spansEnterAnimator;
    public float spansEnterProgress;
    public final LoginActivity.AnonymousClass3 spansScrollView;
    public final float touchSlop;
    public float y;

    public final class ItemAnimator extends DefaultItemAnimator {
    }

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public ListAdapter() {
        }

        @Override
        public final int getItemCount() {
            return InviteMembersBottomSheet.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            InviteMembersBottomSheet inviteMembersBottomSheet = InviteMembersBottomSheet.this;
            if (i == inviteMembersBottomSheet.copyLinkRow) {
                return 1;
            }
            if (i == 0) {
                return 2;
            }
            if (i >= inviteMembersBottomSheet.contactsStartRow && i < inviteMembersBottomSheet.contactsEndRow) {
                return 3;
            }
            if (i == inviteMembersBottomSheet.lastRow) {
                return 4;
            }
            return i == inviteMembersBottomSheet.noContactsStubRow ? 5 : 0;
        }

        public final TLObject getObject(int i) {
            InviteMembersBottomSheet inviteMembersBottomSheet = InviteMembersBottomSheet.this;
            if (inviteMembersBottomSheet.dialogsDelegate == null) {
                return (TLObject) inviteMembersBottomSheet.contacts.get(i - inviteMembersBottomSheet.contactsStartRow);
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) inviteMembersBottomSheet.dialogsServerOnly.get(i - inviteMembersBottomSheet.contactsStartRow);
            return DialogObject.isUserDialog(dialog.id) ? MessagesController.getInstance(((BottomSheet) inviteMembersBottomSheet).currentAccount).getUser(Long.valueOf(dialog.id)) : MessagesController.getInstance(((BottomSheet) inviteMembersBottomSheet).currentAccount).getChat(Long.valueOf(-dialog.id));
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            return i == 3 || i == 1;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            long j;
            long j2;
            int i2 = viewHolder.mItemViewType;
            View view = viewHolder.itemView;
            if (i2 == 2) {
                view.requestLayout();
                return;
            }
            if (i2 != 3) {
                return;
            }
            GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) view;
            TLObject object = getObject(i);
            Object object2 = groupCreateUserCell.getObject();
            if (object2 instanceof TLRPC.User) {
                j = ((TLRPC.User) object2).id;
            } else {
                j = object2 instanceof TLRPC.Chat ? -((TLRPC.Chat) object2).id : 0L;
            }
            InviteMembersBottomSheet inviteMembersBottomSheet = InviteMembersBottomSheet.this;
            boolean z = i != inviteMembersBottomSheet.contactsEndRow;
            groupCreateUserCell.setObject(object, null, null);
            groupCreateUserCell.drawDivider = z;
            if (object instanceof TLRPC.User) {
                j2 = ((TLRPC.User) object).id;
            } else {
                j2 = object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
            }
            if (j2 != 0) {
                LongSparseArray longSparseArray = inviteMembersBottomSheet.ignoreUsers;
                if (longSparseArray == null || longSparseArray.indexOfKey(j2) < 0) {
                    groupCreateUserCell.setChecked(inviteMembersBottomSheet.selectedContacts.indexOfKey(j2) >= 0, j == j2);
                    groupCreateUserCell.setCheckBoxEnabled(true);
                } else {
                    groupCreateUserCell.setChecked(true, false);
                    groupCreateUserCell.setCheckBoxEnabled(false);
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View anonymousClass2;
            View groupCreateUserCell;
            Context context = viewGroup.getContext();
            if (i != 2) {
                InviteMembersBottomSheet inviteMembersBottomSheet = InviteMembersBottomSheet.this;
                int i2 = 0;
                if (i == 3) {
                    groupCreateUserCell = new GroupCreateUserCell(1, 0, context, null, inviteMembersBottomSheet.dialogsDelegate != null, false);
                } else if (i == 4) {
                    anonymousClass2 = new View(context);
                } else if (i != 5) {
                    ManageChatTextCell manageChatTextCell = new ManageChatTextCell(context);
                    manageChatTextCell.setText(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                    int i3 = Theme.key_dialogTextBlue2;
                    manageChatTextCell.setColors(i3, i3);
                    anonymousClass2 = manageChatTextCell;
                } else {
                    GroupCreateActivity.GroupCreateAdapter.AnonymousClass1 anonymousClass1 = new GroupCreateActivity.GroupCreateAdapter.AnonymousClass1(i2, null, context, false ? 1 : 0, 1);
                    anonymousClass1.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                    anonymousClass1.subtitle.setVisibility(8);
                    VideoEditTextureView$$ExternalSyntheticLambda1 videoEditTextureView$$ExternalSyntheticLambda1 = inviteMembersBottomSheet.dialogsDelegate;
                    SpoilersTextView spoilersTextView = anonymousClass1.title;
                    if (videoEditTextureView$$ExternalSyntheticLambda1 != null) {
                        spoilersTextView.setText(LocaleController.getString(R.string.FilterNoChats));
                    } else {
                        spoilersTextView.setText(LocaleController.getString(R.string.NoContacts));
                    }
                    anonymousClass1.setAnimateLayoutChange(true);
                    groupCreateUserCell = anonymousClass1;
                }
                anonymousClass2 = groupCreateUserCell;
            } else {
                anonymousClass2 = new QrActivity.AnonymousClass2(this, context, 10);
            }
            return new RecyclerListView.Holder(anonymousClass2);
        }
    }

    public final class SearchAdapter extends RecyclerListView.SelectionAdapter {
        public int currentItemsCount;
        public final SearchAdapterHelper searchAdapterHelper;
        public ArrayList searchResult = new ArrayList();
        public ArrayList searchResultNames = new ArrayList();
        public Runnable searchRunnable;

        public SearchAdapter() {
            SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(false);
            this.searchAdapterHelper = searchAdapterHelper;
            searchAdapterHelper.delegate = new ProfileGooeyView$$ExternalSyntheticLambda0(this, 1);
        }

        @Override
        public final int getItemCount() {
            int size = this.searchResult.size();
            SearchAdapterHelper searchAdapterHelper = this.searchAdapterHelper;
            int size2 = searchAdapterHelper.localServerSearch.size();
            int size3 = searchAdapterHelper.globalSearch.size();
            int i = size + size2;
            if (size3 != 0) {
                i += size3 + 1;
            }
            int i2 = i + 2;
            this.currentItemsCount = i2;
            return i2;
        }

        @Override
        public final int getItemViewType(int i) {
            if (i == 0) {
                return 2;
            }
            if (i == this.currentItemsCount - 1) {
                return 4;
            }
            return i + (-1) == this.searchAdapterHelper.localServerSearch.size() + this.searchResult.size() ? 0 : 1;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType == 1;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLObject tLObject;
            CharSequence charSequence;
            long j;
            long j2;
            int i2 = viewHolder.mItemViewType;
            View view = viewHolder.itemView;
            if (i2 == 0) {
                ((GroupCreateSectionCell) view).setText(LocaleController.getString(R.string.GlobalSearch));
                return;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                view.requestLayout();
                return;
            }
            GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) view;
            int size = this.searchResult.size();
            SearchAdapterHelper searchAdapterHelper = this.searchAdapterHelper;
            int size2 = searchAdapterHelper.globalSearch.size();
            ArrayList arrayList = searchAdapterHelper.localServerSearch;
            int size3 = arrayList.size();
            int i3 = i - 1;
            CharSequence charSequence2 = null;
            if (i3 >= 0 && i3 < size) {
                tLObject = (TLObject) this.searchResult.get(i3);
            } else if (i3 < size || i3 >= size3 + size) {
                tLObject = (i3 <= size + size3 || i3 > (size2 + size) + size3) ? null : (TLObject) searchAdapterHelper.globalSearch.get(((i3 - size) - size3) - 1);
            } else {
                tLObject = (TLObject) arrayList.get(i3 - size);
            }
            if (tLObject == null) {
                charSequence = null;
            } else {
                String publicUsername = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).username : ChatObject.getPublicUsername((TLRPC.Chat) tLObject);
                if (i3 < size) {
                    charSequence = (CharSequence) this.searchResultNames.get(i3);
                    if (charSequence == null || TextUtils.isEmpty(publicUsername)) {
                        charSequence2 = charSequence;
                        charSequence = null;
                    } else {
                        if (!charSequence.toString().startsWith("@" + publicUsername)) {
                            charSequence2 = charSequence;
                            charSequence = null;
                        }
                    }
                } else if (i3 <= size || TextUtils.isEmpty(publicUsername)) {
                    charSequence = null;
                } else {
                    String strSubstring = searchAdapterHelper.lastFoundUsername;
                    if (strSubstring.startsWith("@")) {
                        strSubstring = strSubstring.substring(1);
                    }
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "@");
                        spannableStringBuilder.append((CharSequence) publicUsername);
                        int iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, strSubstring);
                        if (iIndexOfIgnoreCase != -1) {
                            int length = strSubstring.length();
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
                InviteMembersBottomSheet inviteMembersBottomSheet = InviteMembersBottomSheet.this;
                LongSparseArray longSparseArray = inviteMembersBottomSheet.ignoreUsers;
                if (longSparseArray == null || longSparseArray.indexOfKey(j2) < 0) {
                    groupCreateUserCell.setChecked(inviteMembersBottomSheet.selectedContacts.indexOfKey(j2) >= 0, j == j2);
                    groupCreateUserCell.setCheckBoxEnabled(true);
                } else {
                    groupCreateUserCell.setChecked(true, j == j2);
                    groupCreateUserCell.setCheckBoxEnabled(false);
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View groupCreateUserCell;
            Context context = viewGroup.getContext();
            if (i == 1) {
                groupCreateUserCell = new GroupCreateUserCell(1, 0, context, null, false, false);
            } else if (i != 2) {
                groupCreateUserCell = i != 4 ? new GroupCreateSectionCell(context) : new View(context);
            } else {
                groupCreateUserCell = new QrActivity.AnonymousClass2(this, context, 11);
            }
            return new RecyclerListView.Holder(groupCreateUserCell);
        }
    }

    public final class SpansContainer extends ViewGroup {
        public boolean addAnimation;
        public boolean animationStarted;
        public final ArrayList animators;
        public GroupCreateSpan removingSpan;

        public final class AnonymousClass2 extends AnimatorListenerAdapter {
            public final int $r8$classId;
            public final SpansContainer this$1;

            public AnonymousClass2(SpansContainer spansContainer, int i) {
                this.$r8$classId = i;
                this.this$1 = spansContainer;
            }

            @Override
            public final void onAnimationEnd(Animator animator) {
                switch (this.$r8$classId) {
                    case 0:
                        SpansContainer spansContainer = this.this$1;
                        InviteMembersBottomSheet.this.currentAnimation = null;
                        spansContainer.requestLayout();
                        break;
                    default:
                        SpansContainer spansContainer2 = this.this$1;
                        InviteMembersBottomSheet.this.currentAnimation = null;
                        spansContainer2.animationStarted = false;
                        break;
                }
            }
        }

        public SpansContainer(Context context) {
            super(context);
            this.animators = new ArrayList();
        }

        public final void addSpan(GroupCreateSpan groupCreateSpan, boolean z) {
            int i = 1;
            this.addAnimation = true;
            InviteMembersBottomSheet inviteMembersBottomSheet = InviteMembersBottomSheet.this;
            inviteMembersBottomSheet.selectedContacts.put(groupCreateSpan, groupCreateSpan.getUid());
            AnimatorSet animatorSet = inviteMembersBottomSheet.currentAnimation;
            if (animatorSet != null) {
                animatorSet.setupEndValues();
                inviteMembersBottomSheet.currentAnimation.cancel();
            }
            this.animationStarted = false;
            if (z) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                inviteMembersBottomSheet.currentAnimation = animatorSet2;
                animatorSet2.addListener(new AnonymousClass2(this, i));
                inviteMembersBottomSheet.currentAnimation.setDuration(150L);
                inviteMembersBottomSheet.currentAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
                ArrayList arrayList = this.animators;
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_X, 0.01f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_Y, 0.01f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.ALPHA, 0.0f, 1.0f));
            }
            addView(groupCreateSpan);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            ArrayList arrayList;
            int iM;
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
            AnimatorSet animatorSet;
            final int i3 = 1;
            int childCount = getChildCount();
            int size = View.MeasureSpec.getSize(i);
            int iDp = size - AndroidUtilities.dp(26.0f);
            int iDp2 = AndroidUtilities.dp(10.0f);
            int iDp3 = AndroidUtilities.dp(10.0f);
            final int i4 = 0;
            int i5 = 0;
            int iM2 = 0;
            int iM3 = 0;
            while (true) {
                arrayList = this.animators;
                if (i5 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i5);
                if (childAt instanceof GroupCreateSpan) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                    if (childAt != this.removingSpan && childAt.getMeasuredWidth() + iM2 > iDp) {
                        iDp2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt.getMeasuredHeight(), 8.0f, iDp2);
                        iM2 = 0;
                    }
                    if (childAt.getMeasuredWidth() + iM3 > iDp) {
                        iDp3 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt.getMeasuredHeight(), 8.0f, iDp3);
                        iM3 = 0;
                    }
                    int iDp4 = AndroidUtilities.dp(13.0f) + iM2;
                    if (!this.animationStarted) {
                        GroupCreateSpan groupCreateSpan = this.removingSpan;
                        if (childAt == groupCreateSpan) {
                            childAt.setTranslationX(AndroidUtilities.dp(13.0f) + iM3);
                            childAt.setTranslationY(iDp3);
                        } else if (groupCreateSpan != null) {
                            float f = iDp4;
                            if (childAt.getTranslationX() != f) {
                                arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, f));
                            }
                            float f2 = iDp2;
                            if (childAt.getTranslationY() != f2) {
                                arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, f2));
                            }
                        } else {
                            childAt.setTranslationX(iDp4);
                            childAt.setTranslationY(iDp2);
                        }
                    }
                    if (childAt != this.removingSpan) {
                        iM2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt.getMeasuredWidth(), 9.0f, iM2);
                    }
                    iM3 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt.getMeasuredWidth(), 9.0f, iM3);
                }
                i5++;
            }
            int iDp5 = AndroidUtilities.dp(42.0f) + iDp3;
            final int iDp6 = AndroidUtilities.dp(42.0f) + iDp2;
            InviteMembersBottomSheet inviteMembersBottomSheet = InviteMembersBottomSheet.this;
            if (inviteMembersBottomSheet.dialogsDelegate != null) {
                iM = inviteMembersBottomSheet.spanEnter ? Math.min(inviteMembersBottomSheet.maxSize, iDp6) : 0;
            } else {
                iM = BotFullscreenButtons$$ExternalSyntheticOutline1.m(Math.min(inviteMembersBottomSheet.maxSize, iDp6), 52.0f, 0);
            }
            int i6 = inviteMembersBottomSheet.searchAdditionalHeight;
            int iDp7 = (inviteMembersBottomSheet.dialogsDelegate != null || inviteMembersBottomSheet.selectedContacts.size() <= 0) ? 0 : AndroidUtilities.dp(56.0f);
            inviteMembersBottomSheet.searchAdditionalHeight = iDp7;
            int i7 = inviteMembersBottomSheet.additionalHeight;
            UsersAlertBase.AnonymousClass1 anonymousClass1 = inviteMembersBottomSheet.listView;
            if (iM != i7 || i6 != iDp7) {
                inviteMembersBottomSheet.additionalHeight = iM;
                if (anonymousClass1.getAdapter() != null && anonymousClass1.getAdapter().getItemCount() > 0 && (viewHolderFindViewHolderForAdapterPosition = anonymousClass1.findViewHolderForAdapterPosition(0)) != null) {
                    anonymousClass1.getAdapter().notifyItemChanged(0);
                    FillLastLinearLayoutManager fillLastLinearLayoutManager = inviteMembersBottomSheet.layoutManager;
                    fillLastLinearLayoutManager.scrollToPositionWithOffset(0, viewHolderFindViewHolderForAdapterPosition.itemView.getTop() - anonymousClass1.getPaddingTop(), fillLastLinearLayoutManager.mShouldReverseLayout);
                    if (anonymousClass1.getItemAnimator() != null) {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.addUpdateListener(new ChatActivity.AnonymousClass133(this, 7));
                        valueAnimatorOfFloat.setDuration(anonymousClass1.getItemAnimator().getChangeDuration()).start();
                    }
                }
            }
            int iMin = Math.min(inviteMembersBottomSheet.maxSize, iDp6);
            int i8 = inviteMembersBottomSheet.scrollViewH;
            if (i8 != iMin) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i8, iMin);
                valueAnimatorOfInt.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(this, 16));
                arrayList.add(valueAnimatorOfInt);
            }
            boolean z = this.addAnimation;
            if (z && iDp6 > inviteMembersBottomSheet.maxSize) {
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final InviteMembersBottomSheet.SpansContainer f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i4) {
                            case 0:
                                InviteMembersBottomSheet inviteMembersBottomSheet2 = InviteMembersBottomSheet.this;
                                inviteMembersBottomSheet2.spansScrollView.smoothScrollTo(0, iDp6 - inviteMembersBottomSheet2.maxSize);
                                break;
                            default:
                                InviteMembersBottomSheet inviteMembersBottomSheet3 = InviteMembersBottomSheet.this;
                                inviteMembersBottomSheet3.spansScrollView.smoothScrollTo(0, iDp6 - inviteMembersBottomSheet3.maxSize);
                                break;
                        }
                    }
                });
            } else if (!z) {
                LoginActivity.AnonymousClass3 anonymousClass3 = inviteMembersBottomSheet.spansScrollView;
                if (anonymousClass3.getMeasuredHeight() + anonymousClass3.getScrollY() > iDp6) {
                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                        public final InviteMembersBottomSheet.SpansContainer f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    InviteMembersBottomSheet inviteMembersBottomSheet2 = InviteMembersBottomSheet.this;
                                    inviteMembersBottomSheet2.spansScrollView.smoothScrollTo(0, iDp6 - inviteMembersBottomSheet2.maxSize);
                                    break;
                                default:
                                    InviteMembersBottomSheet inviteMembersBottomSheet3 = InviteMembersBottomSheet.this;
                                    inviteMembersBottomSheet3.spansScrollView.smoothScrollTo(0, iDp6 - inviteMembersBottomSheet3.maxSize);
                                    break;
                            }
                        }
                    });
                }
            }
            if (!this.animationStarted && (animatorSet = inviteMembersBottomSheet.currentAnimation) != null) {
                animatorSet.playTogether(arrayList);
                inviteMembersBottomSheet.currentAnimation.addListener(new AnonymousClass2(this, i4));
                inviteMembersBottomSheet.currentAnimation.start();
                this.animationStarted = true;
            }
            if (inviteMembersBottomSheet.currentAnimation == null) {
                inviteMembersBottomSheet.scrollViewH = iMin;
                ((BottomSheet) inviteMembersBottomSheet).containerView.invalidate();
            }
            setMeasuredDimension(size, Math.max(iDp6, iDp5));
            anonymousClass1.setTranslationY(0.0f);
        }

        public final void removeSpan(GroupCreateSpan groupCreateSpan) {
            boolean z = false;
            this.addAnimation = false;
            InviteMembersBottomSheet inviteMembersBottomSheet = InviteMembersBottomSheet.this;
            inviteMembersBottomSheet.selectedContacts.remove(groupCreateSpan.getUid());
            groupCreateSpan.setOnClickListener(null);
            AnimatorSet animatorSet = inviteMembersBottomSheet.currentAnimation;
            if (animatorSet != null) {
                animatorSet.setupEndValues();
                inviteMembersBottomSheet.currentAnimation.cancel();
            }
            this.animationStarted = false;
            AnimatorSet animatorSet2 = new AnimatorSet();
            inviteMembersBottomSheet.currentAnimation = animatorSet2;
            animatorSet2.addListener(new ChatActivity.AnonymousClass74(this, groupCreateSpan, z, 21));
            inviteMembersBottomSheet.currentAnimation.setDuration(150L);
            this.removingSpan = groupCreateSpan;
            ArrayList arrayList = this.animators;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(this.removingSpan, (Property<GroupCreateSpan, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(this.removingSpan, (Property<GroupCreateSpan, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(this.removingSpan, (Property<GroupCreateSpan, Float>) View.ALPHA, 1.0f, 0.0f));
            requestLayout();
        }
    }

    public InviteMembersBottomSheet(Context context, int i, LongSparseArray longSparseArray, long j, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        super(context, i, resourcesProvider);
        this.contacts = new ArrayList();
        this.selectedContacts = new LongSparseArray();
        this.spansEnterProgress = 0.0f;
        this.spanClickListener = new ChatActivity.AnonymousClass109(this, 6);
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
        UsersAlertBase.AnonymousClass1 anonymousClass1 = this.listView;
        ListAdapter listAdapter = new ListAdapter();
        this.listViewAdapter = listAdapter;
        anonymousClass1.setAdapter(listAdapter);
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
        this.listView.setOnItemClickListener(new ChannelBoostLayout$$ExternalSyntheticLambda0(this, j, baseFragment, longSparseArray, context));
        UsersAlertBase.AnonymousClass1 anonymousClass2 = this.listView;
        ItemAnimator itemAnimator = new ItemAnimator();
        itemAnimator.translationInterpolator = CubicBezierInterpolator.DEFAULT;
        itemAnimator.mMoveDuration = 150L;
        itemAnimator.mAddDuration = 150L;
        itemAnimator.mRemoveDuration = 150L;
        setShowWithoutAnimation(false);
        anonymousClass2.setItemAnimator(itemAnimator);
        updateRows$6();
        LoginActivity.AnonymousClass3 anonymousClass3 = new LoginActivity.AnonymousClass3(this, context, 2);
        this.spansScrollView = anonymousClass3;
        anonymousClass3.setVisibility(8);
        anonymousClass3.setClipChildren(false);
        anonymousClass3.addView(spansContainer);
        this.containerView.addView(anonymousClass3);
        FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, resourcesProvider, false);
        this.floatingButton = fragmentFloatingButton;
        fragmentFloatingButton.setImageResource(R.drawable.floating_check);
        fragmentFloatingButton.setOnClickListener(new ChatEditActivity$$ExternalSyntheticLambda1(this, context, j, 3));
        fragmentFloatingButton.animatorButtonVisible.setValue(false, false);
        fragmentFloatingButton.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(fragmentFloatingButton, FragmentFloatingButton.createDefaultLayoutParams());
        ((ViewGroup.MarginLayoutParams) this.emptyView.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.emptyView.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.emptyView.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    public boolean canGenerateLink() {
        return true;
    }

    @Override
    public final UsersAlertBase.ContainerView createContainerView(Context context) {
        return new UsersAlertBase.ContainerView(context) {
            public float animateToEmptyViewOffset;
            public float deltaOffset;
            public float emptyViewOffset;
            public final Paint paint = new Paint();
            public PhotoViewer.AnonymousClass14 verticalPositionAutoAnimator;

            @Override
            public final void dispatchDraw(Canvas canvas) {
                InviteMembersBottomSheet inviteMembersBottomSheet = InviteMembersBottomSheet.this;
                inviteMembersBottomSheet.spansScrollView.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (inviteMembersBottomSheet.scrollOffsetY - ((BottomSheet) inviteMembersBottomSheet).backgroundPaddingTop));
                float f = inviteMembersBottomSheet.additionalHeight + inviteMembersBottomSheet.searchAdditionalHeight;
                StickerEmptyView stickerEmptyView = inviteMembersBottomSheet.emptyView;
                if (stickerEmptyView.getVisibility() != 0) {
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
                stickerEmptyView.setTranslationY(inviteMembersBottomSheet.scrollOffsetY + this.emptyViewOffset);
                super.dispatchDraw(canvas);
            }

            @Override
            public final boolean drawChild(Canvas canvas, View view, long j) {
                InviteMembersBottomSheet inviteMembersBottomSheet = InviteMembersBottomSheet.this;
                if (view != inviteMembersBottomSheet.spansScrollView) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + inviteMembersBottomSheet.scrollViewH + 1.0f);
                canvas.drawColor(ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_windowBackgroundWhite, false), (int) (inviteMembersBottomSheet.spansEnterProgress * 255.0f)));
                Paint paint = this.paint;
                paint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_divider, false), (int) (inviteMembersBottomSheet.spansEnterProgress * 255.0f)));
                canvas.drawRect(0.0f, view.getY() + inviteMembersBottomSheet.scrollViewH, getMeasuredWidth(), view.getY() + inviteMembersBottomSheet.scrollViewH + 1.0f, paint);
                boolean zDrawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild;
            }

            @Override
            public final void onAttachedToWindow() {
                super.onAttachedToWindow();
                PhotoViewer.AnonymousClass14 anonymousClass14 = this.verticalPositionAutoAnimator;
                if (anonymousClass14 != null) {
                    ((VerticalPositionAutoAnimator$AnimatorLayoutChangeListener) anonymousClass14.blur).ignoreNextLayout = true;
                }
            }

            @Override
            public final void onViewAdded(View view) {
                if (view == InviteMembersBottomSheet.this.floatingButton && this.verticalPositionAutoAnimator == null) {
                    this.verticalPositionAutoAnimator = new PhotoViewer.AnonymousClass14(view);
                }
            }
        };
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.dialogsNeedReload && this.dialogsDelegate != null && this.dialogsServerOnly.isEmpty()) {
            this.dialogsServerOnly = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.listViewAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        super.lambda$showGiftOfferSheet$15();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.enterEventSent) {
            Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
            if (activityFindActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activityFindActivity;
                BaseFragment baseFragment = (BaseFragment) ArticleViewer.IBlock.CC.m((ActionBarLayout) launchActivity.getActionBarLayout(), 1, ((ActionBarLayout) launchActivity.getActionBarLayout()).getFragmentStack());
                if (baseFragment instanceof ChatActivity) {
                    ((ChatActivity) baseFragment).onEditTextDialogClose(true, true);
                }
            }
        }
    }

    public final void lambda$generateLink$7(TLObject tLObject, TLRPC.TL_error tL_error) {
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
            BulletinFactory.of(this.parentFragment).createCopyLinkBulletin(false).show();
            lambda$showGiftOfferSheet$15();
        }
        this.linkGenerating = false;
    }

    public final void lambda$new$0(long j, BaseFragment baseFragment, LongSparseArray longSparseArray, Context context, int i) {
        String strM;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        long j2;
        RecyclerView.Adapter adapter = this.listView.getAdapter();
        SearchAdapter searchAdapter = this.searchAdapter;
        TLObject object = null;
        if (adapter == searchAdapter) {
            int size = searchAdapter.searchResult.size();
            int size2 = this.searchAdapter.searchAdapterHelper.globalSearch.size();
            int size3 = this.searchAdapter.searchAdapterHelper.localServerSearch.size();
            int i2 = i - 1;
            if (i2 >= 0 && i2 < size) {
                object = (TLObject) this.searchAdapter.searchResult.get(i2);
            } else if (i2 >= size && i2 < size3 + size) {
                object = (TLObject) this.searchAdapter.searchAdapterHelper.localServerSearch.get(i2 - size);
            } else if (i2 > size + size3 && i2 <= size2 + size + size3) {
                object = (TLObject) this.searchAdapter.searchAdapterHelper.globalSearch.get(((i2 - size) - size3) - 1);
            }
            if (this.dialogsDelegate != null) {
                AndroidUtilities.hideKeyboard(this.searchView.searchEditText);
            }
        } else if (i == this.copyLinkRow) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j);
            if (chat != null) {
                String publicUsername = ChatObject.getPublicUsername(chat);
                if (!TextUtils.isEmpty(publicUsername)) {
                    strM = SurfaceContainer$$ExternalSyntheticOutline0.m(MessagesController.getInstance(this.currentAccount).linkPrefix, "/", publicUsername, new StringBuilder("https://"));
                } else if (chatFull != null || (tL_chatInviteExported = chatFull.exported_invite) == null) {
                    if (!this.linkGenerating) {
                        this.linkGenerating = true;
                        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
                        tL_messages_exportChatInvite.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.chatId);
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new CallLogActivity$$ExternalSyntheticLambda1(this, 23));
                    }
                    strM = null;
                } else {
                    strM = tL_chatInviteExported.link;
                }
            } else if (chatFull != null) {
                if (!this.linkGenerating) {
                    this.linkGenerating = true;
                    TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite2 = new TLRPC.TL_messages_exportChatInvite();
                    tL_messages_exportChatInvite2.legacy_revoke_permanent = true;
                    tL_messages_exportChatInvite2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.chatId);
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite2, new CallLogActivity$$ExternalSyntheticLambda1(this, 23));
                }
                strM = null;
            } else {
                if (!this.linkGenerating) {
                    this.linkGenerating = true;
                    TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite3 = new TLRPC.TL_messages_exportChatInvite();
                    tL_messages_exportChatInvite3.legacy_revoke_permanent = true;
                    tL_messages_exportChatInvite3.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.chatId);
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite3, new CallLogActivity$$ExternalSyntheticLambda1(this, 23));
                }
                strM = null;
            }
            if (strM == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", strM));
            lambda$showGiftOfferSheet$15();
            BulletinFactory.of(baseFragment).createCopyLinkBulletin(false).show();
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

    public final void lambda$new$1$20() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            LongSparseArray longSparseArray = this.selectedContacts;
            if (i >= longSparseArray.size()) {
                break;
            }
            arrayList.add(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(longSparseArray.keyAt(i))));
            i++;
        }
        GroupCreateActivity.ContactsAddActivityDelegate contactsAddActivityDelegate = this.delegate;
        if (contactsAddActivityDelegate != null) {
            contactsAddActivityDelegate.didSelectUsers(0, arrayList);
        }
        lambda$showGiftOfferSheet$15();
    }

    public final void lambda$new$2(Context context, long j) {
        Activity activityFindActivity;
        VideoEditTextureView$$ExternalSyntheticLambda1 videoEditTextureView$$ExternalSyntheticLambda1 = this.dialogsDelegate;
        LongSparseArray longSparseArray = this.selectedContacts;
        if ((videoEditTextureView$$ExternalSyntheticLambda1 == null && longSparseArray.isEmpty()) || (activityFindActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (this.dialogsDelegate != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < longSparseArray.size(); i++) {
                arrayList.add(Long.valueOf(longSparseArray.keyAt(i)));
            }
            EditWidgetActivity editWidgetActivity = (EditWidgetActivity) this.dialogsDelegate.f$0;
            ArrayList arrayList2 = editWidgetActivity.selectedDialogs;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            editWidgetActivity.updateRows$26();
            EditWidgetActivity.WidgetPreviewCell widgetPreviewCell = editWidgetActivity.widgetPreviewCell;
            if (widgetPreviewCell != null) {
                widgetPreviewCell.updateDialogs();
            }
            lambda$showGiftOfferSheet$15();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activityFindActivity, 0, null);
        String pluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", longSparseArray.size(), new Object[0]);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = pluralString;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(longSparseArray.keyAt(i2)));
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
        if (longSparseArray.size() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", longSparseArray.size(), chat.title)));
            String str = String.format("%d", Integer.valueOf(longSparseArray.size()));
            int iIndexOf = TextUtils.indexOf(spannableStringBuilder, str);
            if (iIndexOf >= 0) {
                spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), iIndexOf, str.length() + iIndexOf, 33);
            }
            alertDialog.message = spannableStringBuilder;
        } else {
            alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb, chat.title));
        }
        builder.setPositiveButton(LocaleController.getString(R.string.Add), new ColorPicker$$ExternalSyntheticLambda6(this, 29));
        ArticleViewer.IBlock.CC.m(R.string.Cancel, builder, (AlertDialog.OnButtonClickListener) null);
    }

    public final void lambda$spansCountChanged$3(ValueAnimator valueAnimator) {
        this.spansEnterProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.containerView.invalidate();
    }

    @Override
    public final void onSearchViewTouched(MotionEvent motionEvent, UsersSelectActivity.AnonymousClass4 anonymousClass4) {
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
            baseFragment = (BaseFragment) ArticleViewer.IBlock.CC.m((ActionBarLayout) launchActivity.getActionBarLayout(), 1, ((ActionBarLayout) launchActivity.getActionBarLayout()).getFragmentStack());
        } else {
            baseFragment = null;
        }
        if (baseFragment instanceof ChatActivity) {
            boolean zNeedEnterText = ((ChatActivity) baseFragment).needEnterText();
            this.enterEventSent = true;
            AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda2(5, this, anonymousClass4), zNeedEnterText ? 200L : 0L);
        } else {
            this.enterEventSent = true;
            setFocusable(true);
            anonymousClass4.requestFocus();
            AndroidUtilities.runOnUIThread(new InviteMembersBottomSheet$$ExternalSyntheticLambda1(anonymousClass4, 0));
        }
    }

    @Override
    public final void search(String str) {
        SearchAdapter searchAdapter = this.searchAdapter;
        if (searchAdapter.searchRunnable != null) {
            Utilities.searchQueue.cancelRunnable(searchAdapter.searchRunnable);
            searchAdapter.searchRunnable = null;
        }
        searchAdapter.searchResult.clear();
        searchAdapter.searchResultNames.clear();
        searchAdapter.searchAdapterHelper.mergeResults(null, null);
        searchAdapter.searchAdapterHelper.queryServerSearch(null, true, false, false, false, false, 0L, false, 0, 0, 0L, null);
        searchAdapter.mObservable.notifyChanged();
        if (TextUtils.isEmpty(str)) {
            RecyclerView.Adapter adapter = InviteMembersBottomSheet.this.listView.getAdapter();
            InviteMembersBottomSheet inviteMembersBottomSheet = InviteMembersBottomSheet.this;
            RecyclerListView.SelectionAdapter selectionAdapter = inviteMembersBottomSheet.listViewAdapter;
            if (adapter != selectionAdapter) {
                inviteMembersBottomSheet.listView.setAdapter(selectionAdapter);
                return;
            }
            return;
        }
        RecyclerView.Adapter adapter2 = InviteMembersBottomSheet.this.listView.getAdapter();
        InviteMembersBottomSheet inviteMembersBottomSheet2 = InviteMembersBottomSheet.this;
        RecyclerListView.SelectionAdapter selectionAdapter2 = inviteMembersBottomSheet2.searchListViewAdapter;
        if (adapter2 != selectionAdapter2) {
            inviteMembersBottomSheet2.listView.setAdapter(selectionAdapter2);
        }
        InviteMembersBottomSheet.this.emptyView.showProgress(true, false);
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        InviteMembersBottomSheet$SearchAdapter$$ExternalSyntheticLambda1 inviteMembersBottomSheet$SearchAdapter$$ExternalSyntheticLambda1 = new InviteMembersBottomSheet$SearchAdapter$$ExternalSyntheticLambda1(searchAdapter, str, 0);
        searchAdapter.searchRunnable = inviteMembersBottomSheet$SearchAdapter$$ExternalSyntheticLambda1;
        dispatchQueue.postRunnable(inviteMembersBottomSheet$SearchAdapter$$ExternalSyntheticLambda1, 300L);
    }

    public final void setDelegate(VideoEditTextureView$$ExternalSyntheticLambda1 videoEditTextureView$$ExternalSyntheticLambda1) {
        this.dialogsDelegate = videoEditTextureView$$ExternalSyntheticLambda1;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.dialogsServerOnly = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        updateRows$6();
    }

    public final void setSelectedContacts(ArrayList arrayList) {
        SpansContainer spansContainer;
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
        int i3 = 0;
        while (true) {
            spansContainer = this.spansContainer;
            if (i3 >= size) {
                break;
            }
            Long l = (Long) arrayList.get(i3);
            long jLongValue = l.longValue();
            GroupCreateSpan groupCreateSpan = new GroupCreateSpan(spansContainer.getContext(), DialogObject.isChatDialog(jLongValue) ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-jLongValue)) : MessagesController.getInstance(this.currentAccount).getUser(l));
            spansContainer.addSpan(groupCreateSpan, false);
            groupCreateSpan.setOnClickListener(this.spanClickListener);
            i3++;
        }
        spansCountChanged(false);
        int childCount = spansContainer.getChildCount();
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
                childAt = spansContainer.getChildAt(i2);
                if (!(childAt instanceof GroupCreateSpan)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                    if (childAt.getMeasuredWidth() + iM > iDp) {
                        iDp2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt.getMeasuredHeight(), 8.0f, iDp2);
                        iM = 0;
                    }
                    iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt.getMeasuredWidth(), 9.0f, iM);
                }
            }
            iDp3 = AndroidUtilities.dp(42.0f) + iDp2;
            if (this.dialogsDelegate != null) {
                iM2 = BotFullscreenButtons$$ExternalSyntheticOutline1.m(Math.min(this.maxSize, iDp3), 52.0f, 0);
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
            childAt = spansContainer.getChildAt(i2);
            if (!(childAt instanceof GroupCreateSpan)) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt.getMeasuredWidth() + iM > iDp) {
                    iDp2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt.getMeasuredHeight(), 8.0f, iDp2);
                    iM = 0;
                }
                iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt.getMeasuredWidth(), 9.0f, iM);
            }
        }
        iDp3 = AndroidUtilities.dp(42.0f) + iDp2;
        if (this.dialogsDelegate != null) {
            iM2 = BotFullscreenButtons$$ExternalSyntheticOutline1.m(Math.min(this.maxSize, iDp3), 52.0f, 0);
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

    public final void spansCountChanged(boolean z) {
        boolean z2 = true;
        boolean z3 = this.selectedContacts.size() > 0;
        if (this.spanEnter != z3) {
            ValueAnimator valueAnimator = this.spansEnterAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.spansEnterAnimator.cancel();
            }
            this.spanEnter = z3;
            LoginActivity.AnonymousClass3 anonymousClass3 = this.spansScrollView;
            if (z3) {
                anonymousClass3.setVisibility(0);
            }
            if (z) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.spansEnterProgress, z3 ? 1.0f : 0.0f);
                this.spansEnterAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(this, 15));
                this.spansEnterAnimator.addListener(new ChatActivity.AnonymousClass77(27, this, z3));
                this.spansEnterAnimator.setDuration(150L);
                this.spansEnterAnimator.start();
            } else {
                this.spansEnterProgress = z3 ? 1.0f : 0.0f;
                this.containerView.invalidate();
                if (!z3) {
                    anonymousClass3.setVisibility(8);
                }
            }
            if (!this.spanEnter && this.dialogsDelegate == null) {
                z2 = false;
            }
            this.floatingButton.animatorButtonVisible.setValue(z2, z);
        }
    }

    public final void updateRows$6() {
        this.contactsStartRow = -1;
        this.contactsEndRow = -1;
        this.copyLinkRow = -1;
        this.noContactsStubRow = -1;
        boolean zCanGenerateLink = true;
        this.rowCount = 1;
        if (this.dialogsDelegate == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j = this.chatId;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                zCanGenerateLink = canGenerateLink();
            }
            if (zCanGenerateLink) {
                int i = this.rowCount;
                this.rowCount = i + 1;
                this.copyLinkRow = i;
            }
            ArrayList arrayList = this.contacts;
            if (arrayList.size() != 0) {
                int i2 = this.rowCount;
                this.contactsStartRow = i2;
                int size = arrayList.size() + i2;
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
}
