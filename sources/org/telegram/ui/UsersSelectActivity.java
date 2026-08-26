package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.InviteUserCell;
import org.telegram.ui.Components.AnimatedAvatarContainer;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.FragmentSearchField;
import org.telegram.ui.Components.GroupCreateSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.OutlineEditText;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorSearchCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SearchField;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.iv.RichEditText;

public final class UsersSelectActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener {
    public GroupCreateAdapter adapter;
    public final ArrayList allSpans;
    public boolean allowSelf;
    public AnimatedAvatarContainer animatedAvatarContainer;
    public int containerHeight;
    public GroupCreateSpan currentDeletingSpan;
    public FilterUsersActivityDelegate delegate;
    public boolean doNotNewChats;
    public AnonymousClass4 editText;
    public AnonymousClass8 emptyView;
    public int fieldY;
    public int filterFlags;
    public FragmentFloatingButton floatingButton;
    public FrameLayout.LayoutParams floatingButtonLp;
    public boolean ignoreScrollEvent;
    public final ArrayList initialIds;
    public final boolean isInclude;
    public RecyclerListView listView;
    public boolean noChatTypes;
    public FlickerLoadingView progressView;
    public LoginActivity.AnonymousClass3 scrollView;
    public boolean searchWas;
    public boolean searching;
    public final LongSparseArray selectedContacts;
    public int selectedCount;
    public SpansContainer spansContainer;
    public int ttlPeriod;
    public int type;

    public final class AnonymousClass4 extends EditTextBoldCursor {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass4(Object obj, Context context, int i) {
            super(context);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 6:
                    ((SearchField) this.this$0).getClass();
                    break;
                case 7:
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    float rawX = motionEventObtain.getRawX();
                    float rawY = motionEventObtain.getRawY();
                    ThemeEditorView.EditorAlert.SearchField searchField = (ThemeEditorView.EditorAlert.SearchField) this.this$0;
                    motionEventObtain.setLocation(rawX, rawY - ((BottomSheet) ThemeEditorView.EditorAlert.this).containerView.getTranslationY());
                    ThemeEditorView.EditorAlert.this.listView.dispatchTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    break;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        public void onFocusChanged(boolean z, int i, Rect rect) {
            switch (this.$r8$classId) {
                case 4:
                    super.onFocusChanged(z, i, rect);
                    float f = (z || isFocused()) ? 1.0f : 0.0f;
                    ((OutlineEditText) this.this$0).animateSelection(f, f, true);
                    break;
                case 10:
                    super.onFocusChanged(z, i, rect);
                    if (!z) {
                        AndroidUtilities.hideKeyboard(((EmojiBottomSheet.SearchField) this.this$0).editText);
                    }
                    break;
                default:
                    super.onFocusChanged(z, i, rect);
                    break;
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            switch (this.$r8$classId) {
                case 2:
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) getText());
                    ChatEditTypeActivity chatEditTypeActivity = (ChatEditTypeActivity) this.this$0;
                    ChatEditTypeActivity.AnonymousClass6 anonymousClass6 = chatEditTypeActivity.checkTextView;
                    if (anonymousClass6 != null && anonymousClass6.getTextView() != null && !TextUtils.isEmpty(chatEditTypeActivity.checkTextView.getTextView().getText())) {
                        sb.append("\n");
                        sb.append(chatEditTypeActivity.checkTextView.getTextView().getText());
                    }
                    accessibilityNodeInfo.setText(sb);
                    break;
                default:
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    break;
            }
        }

        @Override
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            InviteUserCell inviteUserCell;
            ContactsController.Contact contact;
            switch (this.$r8$classId) {
                case 1:
                    if (i == 67) {
                        ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) this.this$0;
                        if (actionBarMenuItem.searchField.length() == 0 && ((actionBarMenuItem.searchFieldCaption.getVisibility() == 0 && actionBarMenuItem.searchFieldCaption.length() > 0) || actionBarMenuItem.hasRemovableFilters())) {
                            if (!actionBarMenuItem.hasRemovableFilters()) {
                                actionBarMenuItem.clearButton.callOnClick();
                                return true;
                            }
                            ArrayList arrayList = actionBarMenuItem.currentSearchFilters;
                            FiltersView.MediaFilterData mediaFilterData = (FiltersView.MediaFilterData) zziq.m(1, arrayList);
                            OKLCH oklch = actionBarMenuItem.listener;
                            if (oklch != null) {
                                oklch.onSearchFilterCleared(mediaFilterData);
                            }
                            if (!mediaFilterData.removable) {
                                return true;
                            }
                            arrayList.remove(mediaFilterData);
                            int i2 = actionBarMenuItem.selectedFilterIndex;
                            if (i2 < 0 || i2 > arrayList.size() - 1) {
                                actionBarMenuItem.selectedFilterIndex = arrayList.size() - 1;
                            }
                            actionBarMenuItem.onFiltersChanged();
                            actionBarMenuItem.searchField.hideActionMode();
                            return true;
                        }
                    }
                    return super.onKeyDown(i, keyEvent);
                case 3:
                    if (i == 67) {
                        FragmentSearchField fragmentSearchField = (FragmentSearchField) this.this$0;
                        if (fragmentSearchField.editText.length() == 0 && fragmentSearchField.hasRemovableFilters()) {
                            if (!fragmentSearchField.hasRemovableFilters()) {
                                return true;
                            }
                            FiltersView.MediaFilterData mediaFilterData2 = (FiltersView.MediaFilterData) zziq.m(1, fragmentSearchField.currentSearchFilters);
                            FragmentSearchField.SearchFiltersListener searchFiltersListener = fragmentSearchField.searchFiltersListener;
                            if (searchFiltersListener != null) {
                                ((DialogsActivity.AnonymousClass9) searchFiltersListener).onSearchFilterCleared(mediaFilterData2);
                            }
                            fragmentSearchField.removeSearchFilter(mediaFilterData2);
                            return true;
                        }
                    }
                    return super.onKeyDown(i, keyEvent);
                case 8:
                    if (i == 67) {
                        InviteContactsActivity.SearchField searchField = (InviteContactsActivity.SearchField) this.this$0;
                        if (searchField.editText.length() == 0 && !InviteContactsActivity.this.allSpans.isEmpty()) {
                            InviteContactsActivity.this.spansContainer.removeSpan((GroupCreateSpan) zziq.m(1, InviteContactsActivity.this.allSpans));
                            InviteContactsActivity inviteContactsActivity = InviteContactsActivity.this;
                            inviteContactsActivity.floatingButton.animatorButtonVisible.setValue(!inviteContactsActivity.allSpans.isEmpty(), true);
                            InviteContactsActivity inviteContactsActivity2 = InviteContactsActivity.this;
                            int childCount = inviteContactsActivity2.listView.getChildCount();
                            for (int i3 = 0; i3 < childCount; i3++) {
                                View childAt = inviteContactsActivity2.listView.getChildAt(i3);
                                if ((childAt instanceof InviteUserCell) && (contact = (inviteUserCell = (InviteUserCell) childAt).getContact()) != null) {
                                    boolean zContainsKey = inviteContactsActivity2.selectedContacts.containsKey(contact.key);
                                    CheckBox2 checkBox2 = inviteUserCell.checkBox;
                                    if (checkBox2 != null) {
                                        checkBox2.checkBoxBase.setChecked(-1, zContainsKey, true);
                                    }
                                }
                            }
                            return true;
                        }
                    }
                    return super.onKeyDown(i, keyEvent);
                default:
                    return super.onKeyDown(i, keyEvent);
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 1:
                    super.onMeasure(i, i2);
                    setMeasuredDimension(AndroidUtilities.dp(3.0f) + Math.max(View.MeasureSpec.getSize(i), getMeasuredWidth()), getMeasuredHeight());
                    break;
                case 2:
                default:
                    super.onMeasure(i, i2);
                    break;
                case 3:
                    super.onMeasure(i, i2);
                    setPivotX(getPaddingLeft());
                    setPivotY(getMeasuredHeight() / 2.0f);
                    break;
            }
        }

        @Override
        public boolean onTextContextMenuItem(int i) {
            switch (this.$r8$classId) {
                case 9:
                    if (i == 16908322 || i == 16908337) {
                        ((LoginActivity.LoginActivityPhraseView) this.this$0).pasted = true;
                        postDelayed(new IntroActivity$$ExternalSyntheticLambda6(this, 19), 1000L);
                    }
                    break;
            }
            return super.onTextContextMenuItem(i);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 0:
                    UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.this$0;
                    GroupCreateSpan groupCreateSpan = usersSelectActivity.currentDeletingSpan;
                    if (groupCreateSpan != null) {
                        groupCreateSpan.cancelDeleteAnimation();
                        usersSelectActivity.currentDeletingSpan = null;
                    }
                    if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                        clearFocus();
                        requestFocus();
                    }
                    return super.onTouchEvent(motionEvent);
                case 1:
                    boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
                    if (motionEvent.getAction() == 1 && !AndroidUtilities.showKeyboard(this)) {
                        clearFocus();
                        requestFocus();
                    }
                    return zOnTouchEvent;
                case 5:
                    SelectorSearchCell selectorSearchCell = (SelectorSearchCell) this.this$0;
                    GroupCreateSpan groupCreateSpan2 = selectorSearchCell.currentDeletingSpan;
                    if (groupCreateSpan2 != null) {
                        groupCreateSpan2.cancelDeleteAnimation();
                        selectorSearchCell.currentDeletingSpan = null;
                    }
                    if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                        selectorSearchCell.fullScroll(130);
                        clearFocus();
                        requestFocus();
                    }
                    return super.onTouchEvent(motionEvent);
                case 6:
                    if (!isEnabled()) {
                        return false;
                    }
                    if (motionEvent.getAction() == 1) {
                        ((SearchField) this.this$0).getClass();
                    }
                    return super.onTouchEvent(motionEvent);
                case 10:
                    EmojiBottomSheet.SearchField searchField = (EmojiBottomSheet.SearchField) this.this$0;
                    if (!searchField.editText.isEnabled()) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (motionEvent.getAction() == 0) {
                        searchField.editText.requestFocus();
                        AndroidUtilities.showKeyboard(searchField.editText);
                    }
                    return super.onTouchEvent(motionEvent);
                case 11:
                    StoryPrivacyBottomSheet.SearchUsersCell searchUsersCell = (StoryPrivacyBottomSheet.SearchUsersCell) this.this$0;
                    GroupCreateSpan groupCreateSpan3 = searchUsersCell.currentDeletingSpan;
                    if (groupCreateSpan3 != null) {
                        groupCreateSpan3.cancelDeleteAnimation();
                        searchUsersCell.currentDeletingSpan = null;
                    }
                    if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                        searchUsersCell.fullScroll(130);
                        clearFocus();
                        requestFocus();
                    }
                    return super.onTouchEvent(motionEvent);
                default:
                    return super.onTouchEvent(motionEvent);
            }
        }
    }

    public final class AnonymousClass8 extends StickerEmptyView {
        @Override
        public final void setVisibility(int i) {
            super.setVisibility(i);
            if (i != 0) {
                showProgress(false, false);
            }
        }
    }

    public interface FilterUsersActivityDelegate {
        void didSelectChats(int i, ArrayList arrayList);
    }

    public final class GroupCreateAdapter extends RecyclerListView.FastScrollAdapter {
        public final Context context;
        public final SearchAdapterHelper searchAdapterHelper;
        public Runnable searchRunnable;
        public boolean searching;
        public final int usersStartRow;
        public ArrayList searchResult = new ArrayList();
        public ArrayList searchResultNames = new ArrayList();
        public final ArrayList contacts = new ArrayList();

        public GroupCreateAdapter(Context context) {
            this.context = context;
            if (UsersSelectActivity.this.noChatTypes) {
                this.usersStartRow = 0;
            } else {
                int i = UsersSelectActivity.this.type;
                if (i == 2) {
                    this.usersStartRow = (!UsersSelectActivity.this.doNotNewChats ? 1 : 0) + 5;
                } else if (i != 0) {
                    this.usersStartRow = 0;
                } else if (UsersSelectActivity.this.isInclude) {
                    this.usersStartRow = 7;
                } else {
                    this.usersStartRow = 5;
                }
            }
            int i2 = UsersSelectActivity.this.type;
            boolean z = i2 != 2;
            boolean z2 = i2 != 2;
            ArrayList<TLRPC.Dialog> allDialogs = UsersSelectActivity.this.getMessagesController().getAllDialogs();
            int size = allDialogs.size();
            boolean z3 = false;
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.Dialog dialog = allDialogs.get(i3);
                if (!DialogObject.isEncryptedDialog(dialog.id)) {
                    if (DialogObject.isUserDialog(dialog.id)) {
                        TLRPC.User user = UsersSelectActivity.this.getMessagesController().getUser(Long.valueOf(dialog.id));
                        if (user != null && ((UsersSelectActivity.this.allowSelf || !UserObject.isUserSelf(user)) && (!user.bot || z))) {
                            this.contacts.add(user);
                            if (UserObject.isUserSelf(user)) {
                                z3 = true;
                            }
                        }
                    } else {
                        TLRPC.Chat chat = UsersSelectActivity.this.getMessagesController().getChat(Long.valueOf(-dialog.id));
                        if (z2 && chat != null) {
                            this.contacts.add(chat);
                        }
                    }
                }
            }
            if (!z3 && UsersSelectActivity.this.allowSelf) {
                this.contacts.add(0, UsersSelectActivity.this.getMessagesController().getUser(Long.valueOf(UsersSelectActivity.this.getUserConfig().clientUserId)));
            }
            SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(false);
            this.searchAdapterHelper = searchAdapterHelper;
            searchAdapterHelper.allowGlobalResults = false;
            searchAdapterHelper.delegate = new TodoItemMenu$$ExternalSyntheticLambda3(this, 5);
        }

        @Override
        public final int getItemCount() {
            int size;
            int size2;
            if (this.searching) {
                size = this.searchResult.size();
                SearchAdapterHelper searchAdapterHelper = this.searchAdapterHelper;
                size2 = searchAdapterHelper.globalSearch.size() + searchAdapterHelper.localServerSearch.size();
            } else {
                UsersSelectActivity usersSelectActivity = UsersSelectActivity.this;
                if (usersSelectActivity.noChatTypes) {
                    size = 0;
                } else {
                    int i = usersSelectActivity.type;
                    if (i == 2) {
                        size = (!usersSelectActivity.doNotNewChats ? 1 : 0) + 3;
                    } else if (i == 0) {
                        size = usersSelectActivity.isInclude ? 7 : 5;
                    } else {
                        size = 0;
                    }
                }
                size2 = this.contacts.size();
            }
            return size2 + size;
        }

        @Override
        public final int getItemViewType(int i) {
            int i2;
            if (!this.searching) {
                UsersSelectActivity usersSelectActivity = UsersSelectActivity.this;
                if (!usersSelectActivity.noChatTypes ? !((i2 = usersSelectActivity.type) != 2 ? i2 != 0 || (!usersSelectActivity.isInclude ? !(i == 0 || i == 4) : !(i == 0 || i == 6)) : i != 0 && i != (!usersSelectActivity.doNotNewChats ? 1 : 0) + 4) : i == 0) {
                    return 2;
                }
            }
            return 1;
        }

        @Override
        public final String getLetter(int i) {
            return null;
        }

        @Override
        public final void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = (int) (getItemCount() * f);
            iArr[1] = 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType == 1;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            Object obj;
            String string;
            CharSequence charSequence;
            ?? spannableStringBuilder;
            long j;
            int i2;
            long j2;
            int i3;
            SpannableStringBuilder spannableStringBuilder2;
            boolean z;
            boolean z2;
            boolean zCanUserDoAdminAction;
            Paint.FontMetricsInt fontMetricsInt;
            ArrayList<MessagesController.DialogFilter> arrayList;
            int size;
            int i4;
            MessagesController.DialogFilter dialogFilter;
            ?? r11;
            int i5;
            boolean z3;
            ?? r12;
            Object obj2;
            int i6 = viewHolder.mItemViewType;
            UsersSelectActivity usersSelectActivity = UsersSelectActivity.this;
            int i7 = 2;
            View view = viewHolder.itemView;
            if (i6 != 1) {
                if (i6 != 2) {
                    return;
                }
                GraySectionCell graySectionCell = (GraySectionCell) view;
                if (i != 0 || usersSelectActivity.noChatTypes) {
                    graySectionCell.setText(LocaleController.getString(R.string.FilterChats));
                    return;
                } else {
                    graySectionCell.setText(LocaleController.getString(R.string.FilterChatTypes));
                    return;
                }
            }
            ?? r1 = (GroupCreateUserCell) view;
            if (this.searching) {
                int size2 = this.searchResult.size();
                SearchAdapterHelper searchAdapterHelper = this.searchAdapterHelper;
                int size3 = searchAdapterHelper.globalSearch.size();
                ArrayList arrayList2 = searchAdapterHelper.localServerSearch;
                int size4 = arrayList2.size();
                if (i >= 0 && i < size2) {
                    obj = this.searchResult.get(i);
                } else if (i < size2 || i >= size4 + size2) {
                    obj = (i <= size2 + size4 || i >= (size3 + size2) + size4) ? null : searchAdapterHelper.globalSearch.get((i - size2) - size4);
                } else {
                    obj = arrayList2.get(i - size2);
                }
                if (obj != null) {
                    String publicUsername = obj instanceof TLRPC.User ? ((TLRPC.User) obj).username : ChatObject.getPublicUsername((TLRPC.Chat) obj);
                    if (i < size2) {
                        charSequence = (CharSequence) this.searchResultNames.get(i);
                        if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
                            if (charSequence.toString().startsWith("@" + publicUsername)) {
                                obj2 = charSequence;
                            }
                        }
                        spannableStringBuilder = 0;
                    } else if (i > size2 && !TextUtils.isEmpty(publicUsername)) {
                        String strSubstring = searchAdapterHelper.lastFoundUsername;
                        if (strSubstring.startsWith("@")) {
                            strSubstring = strSubstring.substring(1);
                        }
                        try {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                            spannableStringBuilder3.append((CharSequence) "@");
                            spannableStringBuilder3.append((CharSequence) publicUsername);
                            int iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, strSubstring);
                            if (iIndexOfIgnoreCase != -1) {
                                int length = strSubstring.length();
                                if (iIndexOfIgnoreCase == 0) {
                                    length++;
                                } else {
                                    iIndexOfIgnoreCase++;
                                }
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false)), iIndexOfIgnoreCase, length + iIndexOfIgnoreCase, 33);
                            }
                            obj2 = spannableStringBuilder3;
                        } catch (Exception unused) {
                            obj2 = publicUsername;
                        }
                    }
                    charSequence = null;
                    spannableStringBuilder = obj2;
                }
                if (obj instanceof TLRPC.User) {
                    j = ((TLRPC.User) obj).id;
                } else if (obj instanceof TLRPC.Chat) {
                    j = -((TLRPC.Chat) obj).id;
                } else {
                    j = 0;
                }
                i2 = usersSelectActivity.type;
                if (i2 != 2) {
                    j2 = 0;
                    z2 = false;
                    r12 = spannableStringBuilder;
                    zCanUserDoAdminAction = true;
                    r11 = r12;
                } else if (i2 == 0) {
                    if (this.searching) {
                        j2 = 0;
                    } else {
                        fontMetricsInt = r1.getStatusTextView().getPaint().getFontMetricsInt();
                        spannableStringBuilder = new SpannableStringBuilder();
                        arrayList = usersSelectActivity.getMessagesController().dialogFilters;
                        size = arrayList.size();
                        j2 = 0;
                        for (i4 = 0; i4 < size; i4++) {
                            dialogFilter = arrayList.get(i4);
                            if (!dialogFilter.includesDialog(usersSelectActivity.getAccountInstance(), j)) {
                                if (spannableStringBuilder.length() > 0) {
                                    spannableStringBuilder.append(", ");
                                }
                                spannableStringBuilder.append(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(dialogFilter.name), fontMetricsInt, false), dialogFilter.entities, fontMetricsInt));
                            }
                        }
                    }
                    z2 = false;
                    r12 = spannableStringBuilder;
                    zCanUserDoAdminAction = true;
                    r11 = r12;
                } else {
                    j2 = 0;
                    if (usersSelectActivity.getMessagesController().dialogs_dict.get(j) != null) {
                        i3 = ((TLRPC.Dialog) usersSelectActivity.getMessagesController().dialogs_dict.get(j)).ttl_period;
                    } else {
                        i3 = 0;
                    }
                    if (i3 > 0) {
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                        spannableStringBuilder4.append((CharSequence) "d");
                        spannableStringBuilder4.setSpan(new ColoredImageSpan(R.drawable.msg_mini_fireon), 0, 1, 0);
                        spannableStringBuilder4.append((CharSequence) LocaleController.formatString(R.string.AutoDeleteAfter, LocaleController.formatTTLString(i3)).toLowerCase());
                        spannableStringBuilder2 = spannableStringBuilder4;
                        z = true;
                    } else {
                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                        spannableStringBuilder5.append((CharSequence) "d");
                        spannableStringBuilder5.setSpan(new ColoredImageSpan(R.drawable.msg_mini_fireoff), 0, 1, 0);
                        spannableStringBuilder5.append((CharSequence) LocaleController.getString(R.string.AutoDeleteDisabled));
                        spannableStringBuilder2 = spannableStringBuilder5;
                        z = false;
                    }
                    if (obj instanceof TLRPC.Chat) {
                        boolean z4 = z;
                        zCanUserDoAdminAction = ChatObject.canUserDoAdminAction((TLRPC.Chat) obj, 13);
                        z2 = z4;
                    } else {
                        z2 = z;
                        r12 = spannableStringBuilder2;
                        zCanUserDoAdminAction = true;
                        r11 = r12;
                    }
                }
                if (zCanUserDoAdminAction) {
                    r11 = spannableStringBuilder2;
                    r1.setAlpha(1.0f);
                } else {
                    r11 = spannableStringBuilder2;
                    r1.setAlpha(0.5f);
                }
                r1.setObject(obj, charSequence, r11);
                SimpleTextView statusTextView = r1.getStatusTextView();
                if (z2) {
                    i5 = Theme.key_windowBackgroundWhiteBlueText;
                } else {
                    i5 = Theme.key_windowBackgroundWhiteGrayText;
                }
                statusTextView.setTextColor(Theme.getColor(null, i5, false));
                if (j != j2) {
                    if (usersSelectActivity.selectedContacts.indexOfKey(j) >= 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    r1.setChecked(z3, false);
                    r1.setCheckBoxEnabled(true);
                }
            }
            int i8 = this.usersStartRow;
            if (i < i8) {
                String str = "non_contacts";
                if (usersSelectActivity.type == 2) {
                    if (i == 1) {
                        string = LocaleController.getString(R.string.FilterExistingChats);
                        str = "existing_chats";
                        i7 = 1;
                    } else if (i == 2 && !usersSelectActivity.doNotNewChats) {
                        string = LocaleController.getString(R.string.FilterNewChats);
                        str = "new_chats";
                    } else if (i == (!usersSelectActivity.doNotNewChats ? 1 : 0) + 2) {
                        string = LocaleController.getString(R.string.FilterContacts);
                        str = "contacts";
                        i7 = 4;
                    } else {
                        string = LocaleController.getString(R.string.FilterNonContacts);
                        i7 = 8;
                    }
                } else if (usersSelectActivity.isInclude) {
                    if (i == 1) {
                        string = LocaleController.getString(R.string.FilterContacts);
                        i7 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                        str = "contacts";
                    } else if (i == 2) {
                        string = LocaleController.getString(R.string.FilterNonContacts);
                        i7 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                    } else if (i == 3) {
                        string = LocaleController.getString(R.string.FilterGroups);
                        i7 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                        str = "groups";
                    } else if (i == 4) {
                        string = LocaleController.getString(R.string.FilterChannels);
                        i7 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                        str = "channels";
                    } else {
                        string = LocaleController.getString(R.string.FilterBots);
                        i7 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                        str = "bots";
                    }
                } else if (i == 1) {
                    string = LocaleController.getString(R.string.FilterMuted);
                    i7 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                    str = "muted";
                } else if (i == 2) {
                    string = LocaleController.getString(R.string.FilterRead);
                    i7 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                    str = "read";
                } else {
                    string = LocaleController.getString(R.string.FilterArchived);
                    i7 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                    str = "archived";
                }
                r1.setObject(str, string, null);
                r1.setChecked((usersSelectActivity.filterFlags & i7) == i7, false);
                r1.setCheckBoxEnabled(true);
                return;
            }
            obj = this.contacts.get(i - i8);
            charSequence = null;
            spannableStringBuilder = 0;
            if (obj instanceof TLRPC.User) {
                j = ((TLRPC.User) obj).id;
            } else if (obj instanceof TLRPC.Chat) {
                j = -((TLRPC.Chat) obj).id;
            } else {
                j = 0;
            }
            i2 = usersSelectActivity.type;
            if (i2 != 2) {
                j2 = 0;
                z2 = false;
                r12 = spannableStringBuilder;
                zCanUserDoAdminAction = true;
                r11 = r12;
            } else if (i2 == 0) {
                if (this.searching) {
                    fontMetricsInt = r1.getStatusTextView().getPaint().getFontMetricsInt();
                    spannableStringBuilder = new SpannableStringBuilder();
                    arrayList = usersSelectActivity.getMessagesController().dialogFilters;
                    size = arrayList.size();
                    j2 = 0;
                    while (i4 < size) {
                        dialogFilter = arrayList.get(i4);
                        if (!dialogFilter.includesDialog(usersSelectActivity.getAccountInstance(), j)) {
                            if (spannableStringBuilder.length() > 0) {
                                spannableStringBuilder.append(", ");
                            }
                            spannableStringBuilder.append(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(dialogFilter.name), fontMetricsInt, false), dialogFilter.entities, fontMetricsInt));
                        }
                    }
                } else {
                    j2 = 0;
                }
                z2 = false;
                r12 = spannableStringBuilder;
                zCanUserDoAdminAction = true;
                r11 = r12;
            } else {
                j2 = 0;
                if (usersSelectActivity.getMessagesController().dialogs_dict.get(j) != null) {
                    i3 = ((TLRPC.Dialog) usersSelectActivity.getMessagesController().dialogs_dict.get(j)).ttl_period;
                } else {
                    i3 = 0;
                }
                if (i3 > 0) {
                    SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                    spannableStringBuilder6.append((CharSequence) "d");
                    spannableStringBuilder6.setSpan(new ColoredImageSpan(R.drawable.msg_mini_fireon), 0, 1, 0);
                    spannableStringBuilder6.append((CharSequence) LocaleController.formatString(R.string.AutoDeleteAfter, LocaleController.formatTTLString(i3)).toLowerCase());
                    spannableStringBuilder2 = spannableStringBuilder6;
                    z = true;
                } else {
                    SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                    spannableStringBuilder7.append((CharSequence) "d");
                    spannableStringBuilder7.setSpan(new ColoredImageSpan(R.drawable.msg_mini_fireoff), 0, 1, 0);
                    spannableStringBuilder7.append((CharSequence) LocaleController.getString(R.string.AutoDeleteDisabled));
                    spannableStringBuilder2 = spannableStringBuilder7;
                    z = false;
                }
                if (obj instanceof TLRPC.Chat) {
                    boolean z5 = z;
                    zCanUserDoAdminAction = ChatObject.canUserDoAdminAction((TLRPC.Chat) obj, 13);
                    z2 = z5;
                } else {
                    z2 = z;
                    r12 = spannableStringBuilder2;
                    zCanUserDoAdminAction = true;
                    r11 = r12;
                }
            }
            if (zCanUserDoAdminAction) {
                r11 = spannableStringBuilder2;
                r1.setAlpha(1.0f);
            } else {
                r11 = spannableStringBuilder2;
                r1.setAlpha(0.5f);
            }
            r1.setObject(obj, charSequence, r11);
            SimpleTextView statusTextView2 = r1.getStatusTextView();
            if (z2) {
                i5 = Theme.key_windowBackgroundWhiteBlueText;
            } else {
                i5 = Theme.key_windowBackgroundWhiteGrayText;
            }
            statusTextView2.setTextColor(Theme.getColor(null, i5, false));
            if (j != j2) {
                if (usersSelectActivity.selectedContacts.indexOfKey(j) >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r1.setChecked(z3, false);
                r1.setCheckBoxEnabled(true);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(i != 1 ? new GraySectionCell(this.context, 16, null) : new GroupCreateUserCell(1, 0, this.context, null, true, false));
        }

        @Override
        public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof GroupCreateUserCell) {
                ((GroupCreateUserCell) view).avatarImageView.getImageReceiver().cancelLoadImage();
            }
        }

        public final void searchDialogs(String str) {
            if (this.searchRunnable != null) {
                Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                this.searchRunnable = null;
            }
            int i = UsersSelectActivity.this.type;
            boolean z = i != 2;
            boolean z2 = i != 2;
            if (str != null) {
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                UsersSelectActivity$GroupCreateAdapter$$ExternalSyntheticLambda1 usersSelectActivity$GroupCreateAdapter$$ExternalSyntheticLambda1 = new UsersSelectActivity$GroupCreateAdapter$$ExternalSyntheticLambda1(this, str, z2, z, 0);
                this.searchRunnable = usersSelectActivity$GroupCreateAdapter$$ExternalSyntheticLambda1;
                dispatchQueue.postRunnable(usersSelectActivity$GroupCreateAdapter$$ExternalSyntheticLambda1, 300L);
                return;
            }
            this.searchResult.clear();
            this.searchResultNames.clear();
            this.searchAdapterHelper.mergeResults(null, null);
            this.searchAdapterHelper.queryServerSearch(null, true, false, false, false, false, 0L, false, 0, 0, 0L, null);
            this.mObservable.notifyChanged();
        }
    }

    public final class SpansContainer extends ViewGroup {
        public GroupCreateSpan addingSpan;
        public boolean animationStarted;
        public final ArrayList animators;
        public AnimatorSet currentAnimation;
        public GroupCreateSpan removingSpan;

        public SpansContainer(Context context) {
            super(context);
            this.animators = new ArrayList();
        }

        public final void addSpan(GroupCreateSpan groupCreateSpan, boolean z) {
            UsersSelectActivity usersSelectActivity = UsersSelectActivity.this;
            usersSelectActivity.allSpans.add(groupCreateSpan);
            long uid = groupCreateSpan.getUid();
            if (uid > -9223372036854775801L) {
                usersSelectActivity.selectedCount++;
            }
            usersSelectActivity.selectedContacts.put(groupCreateSpan, uid);
            AnonymousClass4 anonymousClass4 = usersSelectActivity.editText;
            anonymousClass4.setHintVisible(false, TextUtils.isEmpty(anonymousClass4.getText()));
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.currentAnimation.setupEndValues();
                this.currentAnimation.cancel();
            }
            this.animationStarted = false;
            if (z) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.currentAnimation = animatorSet2;
                animatorSet2.addListener(new WebviewActivity.AnonymousClass3.AnonymousClass1(this, 11));
                this.currentAnimation.setDuration(150L);
                this.addingSpan = groupCreateSpan;
                ArrayList arrayList = this.animators;
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(this.addingSpan, (Property<GroupCreateSpan, Float>) View.SCALE_X, 0.01f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.addingSpan, (Property<GroupCreateSpan, Float>) View.SCALE_Y, 0.01f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.addingSpan, (Property<GroupCreateSpan, Float>) View.ALPHA, 0.0f, 1.0f));
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
            Property property;
            Property property2;
            int iM$2;
            int i3;
            int childCount = getChildCount();
            int size = View.MeasureSpec.getSize(i);
            int iDp = size - AndroidUtilities.dp(26.0f);
            int iDp2 = AndroidUtilities.dp(10.0f);
            int iDp3 = AndroidUtilities.dp(10.0f);
            int i4 = 0;
            int iM = 0;
            int iM2 = 0;
            while (true) {
                arrayList = this.animators;
                property = View.TRANSLATION_Y;
                property2 = View.TRANSLATION_X;
                if (i4 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i4);
                if (childAt instanceof GroupCreateSpan) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                    if (childAt != this.removingSpan && childAt.getMeasuredWidth() + iM > iDp) {
                        iDp2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt.getMeasuredHeight(), 8.0f, iDp2);
                        iM = 0;
                    }
                    if (childAt.getMeasuredWidth() + iM2 > iDp) {
                        iDp3 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt.getMeasuredHeight(), 8.0f, iDp3);
                        iM2 = 0;
                    }
                    int iDp4 = AndroidUtilities.dp(13.0f) + iM;
                    if (!this.animationStarted) {
                        GroupCreateSpan groupCreateSpan = this.removingSpan;
                        if (childAt == groupCreateSpan) {
                            childAt.setTranslationX(AndroidUtilities.dp(13.0f) + iM2);
                            childAt.setTranslationY(iDp3);
                        } else if (groupCreateSpan != null) {
                            float f = iDp4;
                            if (childAt.getTranslationX() != f) {
                                i3 = 1;
                                arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property2, f));
                            } else {
                                i3 = 1;
                            }
                            float f2 = iDp2;
                            if (childAt.getTranslationY() != f2) {
                                float[] fArr = new float[i3];
                                fArr[0] = f2;
                                arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, fArr));
                            }
                        } else {
                            childAt.setTranslationX(iDp4);
                            childAt.setTranslationY(iDp2);
                        }
                    }
                    if (childAt != this.removingSpan) {
                        iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt.getMeasuredWidth(), 9.0f, iM);
                    }
                    iM2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt.getMeasuredWidth(), 9.0f, iM2);
                }
                i4++;
            }
            if (AndroidUtilities.isTablet()) {
                iM$2 = AndroidUtilities.dp(372.0f) / 3;
            } else {
                Point point = AndroidUtilities.displaySize;
                iM$2 = OKLCH.m$2(158.0f, Math.min(point.x, point.y), 3);
            }
            if (iDp - iM < iM$2) {
                iDp2 += AndroidUtilities.dp(40.0f);
                iM = 0;
            }
            if (iDp - iM2 < iM$2) {
                iDp3 += AndroidUtilities.dp(40.0f);
            }
            UsersSelectActivity usersSelectActivity = UsersSelectActivity.this;
            usersSelectActivity.editText.measure(View.MeasureSpec.makeMeasureSpec(iDp - iM, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
            if (!this.animationStarted) {
                int iDp5 = AndroidUtilities.dp(42.0f) + iDp3;
                int iDp6 = AndroidUtilities.dp(16.0f) + iM;
                usersSelectActivity.fieldY = iDp2;
                if (this.currentAnimation != null) {
                    int iDp7 = AndroidUtilities.dp(42.0f) + iDp2;
                    if (usersSelectActivity.containerHeight != iDp7) {
                        arrayList.add(ObjectAnimator.ofInt(usersSelectActivity, "containerHeight", iDp7));
                    }
                    float f3 = iDp6;
                    if (usersSelectActivity.editText.getTranslationX() != f3) {
                        arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.editText, (Property<AnonymousClass4, Float>) property2, f3));
                    }
                    float translationY = usersSelectActivity.editText.getTranslationY();
                    float f4 = usersSelectActivity.fieldY;
                    if (translationY != f4) {
                        arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.editText, (Property<AnonymousClass4, Float>) property, f4));
                    }
                    usersSelectActivity.editText.setAllowDrawCursor(false);
                    this.currentAnimation.playTogether(arrayList);
                    this.currentAnimation.start();
                    this.animationStarted = true;
                } else {
                    usersSelectActivity.containerHeight = iDp5;
                    usersSelectActivity.editText.setTranslationX(iDp6);
                    usersSelectActivity.editText.setTranslationY(usersSelectActivity.fieldY);
                }
            } else if (this.currentAnimation != null && !usersSelectActivity.ignoreScrollEvent && this.removingSpan == null) {
                AnonymousClass4 anonymousClass4 = usersSelectActivity.editText;
                anonymousClass4.bringPointIntoView(anonymousClass4.getSelectionStart());
            }
            setMeasuredDimension(size, usersSelectActivity.containerHeight);
        }

        public final void removeSpan(GroupCreateSpan groupCreateSpan) {
            UsersSelectActivity usersSelectActivity = UsersSelectActivity.this;
            usersSelectActivity.ignoreScrollEvent = true;
            long uid = groupCreateSpan.getUid();
            if (uid > -9223372036854775801L) {
                usersSelectActivity.selectedCount--;
            }
            usersSelectActivity.selectedContacts.remove(uid);
            usersSelectActivity.allSpans.remove(groupCreateSpan);
            groupCreateSpan.setOnClickListener(null);
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null) {
                animatorSet.setupEndValues();
                this.currentAnimation.cancel();
            }
            this.animationStarted = false;
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.currentAnimation = animatorSet2;
            animatorSet2.addListener(new QrActivity.AnonymousClass4(21, this, groupCreateSpan));
            this.currentAnimation.setDuration(150L);
            this.removingSpan = groupCreateSpan;
            ArrayList arrayList = this.animators;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(this.removingSpan, (Property<GroupCreateSpan, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(this.removingSpan, (Property<GroupCreateSpan, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(this.removingSpan, (Property<GroupCreateSpan, Float>) View.ALPHA, 1.0f, 0.0f));
            requestLayout();
        }
    }

    public UsersSelectActivity() {
        super(null);
        this.selectedContacts = new LongSparseArray();
        this.allSpans = new ArrayList();
        this.type = 1;
        this.allowSelf = false;
    }

    public final void checkVisibleRows$2() {
        long j;
        int childCount = this.listView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.listView.getChildAt(i);
            if (childAt instanceof GroupCreateUserCell) {
                GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) childAt;
                Object object = groupCreateUserCell.getObject();
                if (object instanceof String) {
                    switch ((String) object) {
                        case "contacts":
                            j = Long.MIN_VALUE;
                            break;
                        case "non_contacts":
                            j = -9223372036854775807L;
                            break;
                        case "groups":
                            j = -9223372036854775806L;
                            break;
                        case "channels":
                            j = -9223372036854775805L;
                            break;
                        case "bots":
                            j = -9223372036854775804L;
                            break;
                        case "muted":
                            j = -9223372036854775803L;
                            break;
                        case "read":
                            j = -9223372036854775802L;
                            break;
                        case "existing_chats":
                        case "new_chats":
                            j = -9223372036854775800L;
                            break;
                        case "archived":
                        default:
                            j = -9223372036854775801L;
                            break;
                    }
                } else if (object instanceof TLRPC.User) {
                    j = ((TLRPC.User) object).id;
                } else {
                    j = object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
                }
                if (j != 0) {
                    groupCreateUserCell.setChecked(this.selectedContacts.indexOfKey(j) >= 0, true);
                    groupCreateUserCell.setCheckBoxEnabled(true);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.searching = false;
        this.searchWas = false;
        this.allSpans.clear();
        this.selectedContacts.clear();
        this.currentDeletingSpan = null;
        if (this.type == 1) {
            AnimatedAvatarContainer animatedAvatarContainer = new AnimatedAvatarContainer(getParentActivity());
            this.animatedAvatarContainer = animatedAvatarContainer;
            ActionBar actionBar = this.actionBar;
            boolean z = LocaleController.isRTL;
            actionBar.addView(animatedAvatarContainer, LayoutHelper.createFrame(-1, -1.0f, 0, z ? 0.0f : 64.0f, 0.0f, z ? 64.0f : 0.0f, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i = this.type;
        boolean z2 = this.isInclude;
        if (i == 0 || i == 2) {
            if (z2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.FilterAlwaysShow));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
            }
        } else if (i == 1) {
            updateHint$2();
        }
        this.actionBar.setActionBarMenuOnItemClick(new UserInfoActivity.AnonymousClass4(this, 3));
        ActionIntroActivity.AnonymousClass2 anonymousClass2 = new ActionIntroActivity.AnonymousClass2(this, context, 5);
        this.fragmentView = anonymousClass2;
        LoginActivity.AnonymousClass3 anonymousClass3 = new LoginActivity.AnonymousClass3(this, context, 6);
        this.scrollView = anonymousClass3;
        anonymousClass3.setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.scrollView, Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        anonymousClass2.addView(this.scrollView);
        SpansContainer spansContainer = new SpansContainer(context);
        this.spansContainer = spansContainer;
        this.scrollView.addView(spansContainer, LayoutHelper.createFrame(-2.0f, -1));
        final int i2 = 0;
        this.spansContainer.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f$0;
                        usersSelectActivity.editText.clearFocus();
                        usersSelectActivity.editText.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.editText);
                        break;
                    default:
                        this.f$0.onDonePressed$1$1();
                        break;
                }
            }
        });
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(this, context, 0);
        this.editText = anonymousClass4;
        anonymousClass4.setTextSize(1, 16.0f);
        this.editText.setHintColor(Theme.getColor(null, Theme.key_groupcreate_hintText, false));
        this.editText.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        this.editText.setCursorColor(Theme.getColor(null, Theme.key_groupcreate_cursor, false));
        this.editText.setCursorWidth(1.5f);
        AnonymousClass4 anonymousClass5 = this.editText;
        anonymousClass5.setInputType(anonymousClass5.getInputType() | 176);
        this.editText.setSingleLine(true);
        this.editText.setBackgroundDrawable(null);
        this.editText.setVerticalScrollBarEnabled(false);
        this.editText.setHorizontalScrollBarEnabled(false);
        this.editText.setTextIsSelectable(false);
        this.editText.setPadding(0, 0, 0, 0);
        this.editText.setImeOptions(268435462);
        this.editText.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        this.spansContainer.addView(this.editText);
        this.editText.setHintText(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        this.editText.setCustomSelectionActionModeCallback(new RichEditText.AnonymousClass1(5));
        this.editText.setOnKeyListener(new GroupCreateActivity.AnonymousClass4(1, this));
        this.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                UsersSelectActivity usersSelectActivity = UsersSelectActivity.this;
                if (usersSelectActivity.editText.length() == 0) {
                    usersSelectActivity.searching = false;
                    usersSelectActivity.searchWas = false;
                    GroupCreateAdapter groupCreateAdapter = usersSelectActivity.adapter;
                    if (groupCreateAdapter.searching) {
                        groupCreateAdapter.searching = false;
                        groupCreateAdapter.mObservable.notifyChanged();
                    }
                    usersSelectActivity.adapter.searchDialogs(null);
                    usersSelectActivity.listView.setFastScrollVisible(true);
                    usersSelectActivity.listView.setVerticalScrollBarEnabled(false);
                    usersSelectActivity.emptyView.title.setText(LocaleController.getString(R.string.NoContacts));
                    return;
                }
                GroupCreateAdapter groupCreateAdapter2 = usersSelectActivity.adapter;
                boolean z3 = groupCreateAdapter2.searching;
                if (!z3) {
                    usersSelectActivity.searching = true;
                    usersSelectActivity.searchWas = true;
                    if (!z3) {
                        groupCreateAdapter2.searching = true;
                        groupCreateAdapter2.mObservable.notifyChanged();
                    }
                    usersSelectActivity.listView.setFastScrollVisible(false);
                    usersSelectActivity.listView.setVerticalScrollBarEnabled(true);
                    usersSelectActivity.emptyView.title.setText(LocaleController.getString(R.string.NoResult));
                }
                usersSelectActivity.emptyView.showProgress(true, true);
                usersSelectActivity.adapter.searchDialogs(usersSelectActivity.editText.getText().toString());
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }
        });
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
        this.progressView = flickerLoadingView;
        flickerLoadingView.setViewType(10);
        FlickerLoadingView flickerLoadingView2 = this.progressView;
        flickerLoadingView2.showDate = false;
        flickerLoadingView2.setItemsCount(3);
        FlickerLoadingView flickerLoadingView3 = this.progressView;
        int i3 = Theme.key_actionBarDefaultSubmenuBackground;
        int i4 = Theme.key_listSelector;
        flickerLoadingView3.colorKey1 = i3;
        flickerLoadingView3.colorKey2 = i4;
        flickerLoadingView3.colorKey3 = i4;
        flickerLoadingView3.invalidate();
        anonymousClass2.addView(this.progressView);
        AnonymousClass8 anonymousClass8 = new AnonymousClass8(1, null, context, this.progressView);
        this.emptyView = anonymousClass8;
        anonymousClass8.showProgress(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        this.emptyView.title.setText(LocaleController.getString(R.string.NoContacts));
        anonymousClass2.addView(this.emptyView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setFastScrollEnabled(0);
        this.listView.setEmptyView(this.emptyView);
        RecyclerListView recyclerListView2 = this.listView;
        GroupCreateAdapter groupCreateAdapter = new GroupCreateAdapter(context);
        this.adapter = groupCreateAdapter;
        recyclerListView2.setAdapter(groupCreateAdapter);
        this.listView.setLayoutManager(linearLayoutManager);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        this.listView.addItemDecoration(new FiltersView.AnonymousClass2(10));
        anonymousClass2.addView(this.listView);
        this.listView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda0(23, this, context));
        this.listView.setOnScrollListener(new SettingsActivity.AnonymousClass5(this, 19));
        this.floatingButtonLp = FragmentFloatingButton.createDefaultLayoutParams();
        FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider, false);
        this.floatingButton = fragmentFloatingButton;
        fragmentFloatingButton.setImageResource(R.drawable.floating_check);
        anonymousClass2.addView(this.floatingButton, this.floatingButtonLp);
        final int i5 = 1;
        this.floatingButton.setOnClickListener(new View.OnClickListener(this) {
            public final UsersSelectActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.f$0;
                        usersSelectActivity.editText.clearFocus();
                        usersSelectActivity.editText.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.editText);
                        break;
                    default:
                        this.f$0.onDonePressed$1$1();
                        break;
                }
            }
        });
        this.floatingButton.setContentDescription(LocaleController.getString(R.string.Next));
        int i6 = z2 ? 5 : 3;
        for (int i7 = 1; i7 <= i6; i7++) {
            String str = "non_contacts";
            int i8 = 4;
            if (this.type == 2) {
                if (i7 == 1) {
                    str = "existing_chats";
                    i8 = 1;
                } else if (i7 == 2 && !this.doNotNewChats) {
                    str = "new_chats";
                    i8 = 2;
                } else if (i7 == (!this.doNotNewChats ? 1 : 0) + 2) {
                    str = "contacts";
                } else {
                    i8 = 8;
                }
            } else if (z2) {
                if (i7 == 1) {
                    i8 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                    str = "contacts";
                } else if (i7 == 2) {
                    i8 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                } else if (i7 == 3) {
                    i8 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                    str = "groups";
                } else if (i7 == 4) {
                    i8 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                    str = "channels";
                } else {
                    i8 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                    str = "bots";
                }
            } else if (i7 == 1) {
                i8 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                str = "muted";
            } else if (i7 == 2) {
                i8 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                str = "read";
            } else {
                i8 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                str = "archived";
            }
            if ((this.filterFlags & i8) != 0) {
                GroupCreateSpan groupCreateSpan = new GroupCreateSpan(this.editText.getContext(), str);
                this.spansContainer.addSpan(groupCreateSpan, false);
                groupCreateSpan.setOnClickListener(this);
            }
        }
        ArrayList arrayList = this.initialIds;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                Long l = (Long) arrayList.get(i9);
                Object user = l.longValue() > 0 ? getMessagesController().getUser(l) : getMessagesController().getChat(Long.valueOf(-l.longValue()));
                if (user != null) {
                    GroupCreateSpan groupCreateSpan2 = new GroupCreateSpan(this.editText.getContext(), user);
                    this.spansContainer.addSpan(groupCreateSpan2, false);
                    groupCreateSpan2.setOnClickListener(this);
                }
            }
        }
        updateHint$2();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.contactsDidLoad) {
            AnonymousClass8 anonymousClass8 = this.emptyView;
            if (anonymousClass8 != null) {
                anonymousClass8.showProgress(false, true);
            }
            GroupCreateAdapter groupCreateAdapter = this.adapter;
            if (groupCreateAdapter != null) {
                groupCreateAdapter.mObservable.notifyChanged();
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
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        QrActivity$$ExternalSyntheticLambda9 qrActivity$$ExternalSyntheticLambda9 = new QrActivity$$ExternalSyntheticLambda9(22, this);
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
        arrayList.add(new ThemeDescription(this.scrollView, 32768, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 33554432, null, null, null, null, Theme.key_fastScrollActive));
        arrayList.add(new ThemeDescription(this.listView, 33554432, null, null, null, null, Theme.key_fastScrollInactive));
        arrayList.add(new ThemeDescription(this.listView, 33554432, null, null, null, null, Theme.key_fastScrollText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.emptyView, 4, null, null, null, null, Theme.key_emptyListPlaceholder));
        arrayList.add(new ThemeDescription(this.emptyView, 2048, null, null, null, null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.editText, 4, null, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.editText, 8388608, null, null, null, null, Theme.key_groupcreate_hintText));
        arrayList.add(new ThemeDescription(this.editText, 16777216, null, null, null, null, Theme.key_groupcreate_cursor));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{GraySectionCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_graySectionText));
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{GraySectionCell.class}, null, null, null, Theme.key_graySection));
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{GroupCreateUserCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_groupcreate_sectionText));
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{GroupCreateUserCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_checkbox));
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{GroupCreateUserCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_checkboxDisabled));
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{GroupCreateUserCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_checkboxCheck));
        arrayList.add(new ThemeDescription(this.listView, 262148, new Class[]{GroupCreateUserCell.class}, new String[]{"statusTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, 262148, new Class[]{GroupCreateUserCell.class}, new String[]{"statusTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{GroupCreateUserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundCyan));
        int i3 = Theme.key_avatar_backgroundBlue;
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, i3));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.spansContainer, 0, new Class[]{GroupCreateSpan.class}, null, null, null, Theme.key_groupcreate_spanBackground));
        arrayList.add(new ThemeDescription(this.spansContainer, 0, new Class[]{GroupCreateSpan.class}, null, null, null, Theme.key_groupcreate_spanText));
        arrayList.add(new ThemeDescription(this.spansContainer, 0, new Class[]{GroupCreateSpan.class}, null, null, null, Theme.key_groupcreate_spanDelete));
        arrayList.add(new ThemeDescription(this.spansContainer, 0, new Class[]{GroupCreateSpan.class}, null, null, null, i3));
        return arrayList;
    }

    public final void lambda$createView$1$1(Context context, View view, int i) {
        long j;
        UsersSelectActivity usersSelectActivity;
        if (view instanceof GroupCreateUserCell) {
            GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) view;
            Object object = groupCreateUserCell.getObject();
            boolean z = object instanceof String;
            if (z) {
                j = -9223372036854775807L;
                int i2 = 4;
                if (this.type == 2) {
                    if (i == 1) {
                        j = -9223372036854775800L;
                        i2 = 1;
                    } else if (i == 2 && !this.doNotNewChats) {
                        j = -9223372036854775799L;
                        i2 = 2;
                    } else if (i == (!this.doNotNewChats ? 1 : 0) + 2) {
                        j = Long.MIN_VALUE;
                    } else {
                        i2 = 8;
                    }
                } else if (this.isInclude) {
                    if (i == 1) {
                        i2 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                        j = Long.MIN_VALUE;
                    } else if (i == 2) {
                        i2 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                    } else if (i == 3) {
                        i2 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                        j = -9223372036854775806L;
                    } else if (i == 4) {
                        i2 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                        j = -9223372036854775805L;
                    } else {
                        i2 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                        j = -9223372036854775804L;
                    }
                } else if (i == 1) {
                    i2 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                    j = -9223372036854775803L;
                } else if (i == 2) {
                    i2 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                    j = -9223372036854775802L;
                } else {
                    i2 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                    j = -9223372036854775801L;
                }
                CheckBox2 checkBox2 = groupCreateUserCell.checkBox;
                if (checkBox2 != null ? checkBox2.checkBoxBase.isChecked : groupCreateUserCell.isChecked) {
                    this.filterFlags &= ~i2;
                } else {
                    this.filterFlags |= i2;
                }
            } else if (object instanceof TLRPC.User) {
                j = ((TLRPC.User) object).id;
            } else if (object instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) object;
                j = -chat.id;
                if (this.type == 1 && !ChatObject.canUserDoAdminAction(chat, 13)) {
                    UserNameResolver$$ExternalSyntheticOutline0.m(R.string.NeedAdminRightForSetAutoDeleteTimer, BulletinFactory.of(this), null);
                    return;
                }
            }
            LongSparseArray longSparseArray = this.selectedContacts;
            boolean z2 = longSparseArray.indexOfKey(j) >= 0;
            if (z2) {
                this.spansContainer.removeSpan((GroupCreateSpan) longSparseArray.get(j));
                usersSelectActivity = this;
            } else {
                if ((!z && !getUserConfig().isPremium() && this.selectedCount >= MessagesController.getInstance(this.currentAccount).dialogFiltersChatsLimitDefault) || this.selectedCount >= MessagesController.getInstance(this.currentAccount).dialogFiltersChatsLimitPremium) {
                    LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(4, this.currentAccount, context, this, null);
                    limitReachedBottomSheet.currentValue = this.selectedCount;
                    showDialog(limitReachedBottomSheet);
                    return;
                }
                usersSelectActivity = this;
                if (object instanceof TLRPC.User) {
                    MessagesController.getInstance(usersSelectActivity.currentAccount).putUser((TLRPC.User) object, !usersSelectActivity.searching);
                } else if (object instanceof TLRPC.Chat) {
                    MessagesController.getInstance(usersSelectActivity.currentAccount).putChat((TLRPC.Chat) object, !usersSelectActivity.searching);
                }
                GroupCreateSpan groupCreateSpan = new GroupCreateSpan(usersSelectActivity.editText.getContext(), object);
                usersSelectActivity.spansContainer.addSpan(groupCreateSpan, true);
                groupCreateSpan.setOnClickListener(this);
            }
            updateHint$2();
            if (usersSelectActivity.searching || usersSelectActivity.searchWas) {
                AndroidUtilities.showKeyboard(usersSelectActivity.editText);
            } else {
                groupCreateUserCell.setChecked(!z2, true);
            }
            if (usersSelectActivity.editText.length() > 0) {
                usersSelectActivity.editText.setText((CharSequence) null);
            }
        }
    }

    @Override
    public final void onClick(View view) {
        GroupCreateSpan groupCreateSpan = (GroupCreateSpan) view;
        if (!groupCreateSpan.deleting) {
            GroupCreateSpan groupCreateSpan2 = this.currentDeletingSpan;
            if (groupCreateSpan2 != null) {
                groupCreateSpan2.cancelDeleteAnimation();
            }
            this.currentDeletingSpan = groupCreateSpan;
            groupCreateSpan.startDeleteAnimation();
            return;
        }
        this.currentDeletingSpan = null;
        this.spansContainer.removeSpan(groupCreateSpan);
        if (this.type == 2) {
            if (groupCreateSpan.getUid() == -9223372036854775800L) {
                this.filterFlags &= -2;
            } else if (groupCreateSpan.getUid() == -9223372036854775799L) {
                this.filterFlags &= -3;
            } else if (groupCreateSpan.getUid() == Long.MIN_VALUE) {
                this.filterFlags &= -5;
            } else if (groupCreateSpan.getUid() == -9223372036854775807L) {
                this.filterFlags &= -9;
            }
        } else if (groupCreateSpan.getUid() == Long.MIN_VALUE) {
            this.filterFlags &= ~MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
        } else if (groupCreateSpan.getUid() == -9223372036854775807L) {
            this.filterFlags &= ~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
        } else if (groupCreateSpan.getUid() == -9223372036854775806L) {
            this.filterFlags &= ~MessagesController.DIALOG_FILTER_FLAG_GROUPS;
        } else if (groupCreateSpan.getUid() == -9223372036854775805L) {
            this.filterFlags &= ~MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
        } else if (groupCreateSpan.getUid() == -9223372036854775804L) {
            this.filterFlags &= ~MessagesController.DIALOG_FILTER_FLAG_BOTS;
        } else if (groupCreateSpan.getUid() == -9223372036854775803L) {
            this.filterFlags &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
        } else if (groupCreateSpan.getUid() == -9223372036854775802L) {
            this.filterFlags &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
        } else if (groupCreateSpan.getUid() == -9223372036854775801L) {
            this.filterFlags &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
        }
        updateHint$2();
        checkVisibleRows$2();
    }

    public final void onDonePressed$1$1() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            LongSparseArray longSparseArray = this.selectedContacts;
            if (i >= longSparseArray.size()) {
                break;
            }
            if (longSparseArray.keyAt(i) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(longSparseArray.keyAt(i)));
            }
            i++;
        }
        FilterUsersActivityDelegate filterUsersActivityDelegate = this.delegate;
        if (filterUsersActivityDelegate != null) {
            filterUsersActivityDelegate.didSelectChats(this.filterFlags, arrayList);
        }
        finishFragment();
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
    }

    @Override
    public final void onResume() {
        super.onResume();
        AnonymousClass4 anonymousClass4 = this.editText;
        if (anonymousClass4 != null) {
            anonymousClass4.requestFocus();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void updateHint$2() {
        int i = this.type;
        if (i == 0) {
            int i2 = getUserConfig().isPremium() ? getMessagesController().dialogFiltersChatsLimitPremium : getMessagesController().dialogFiltersChatsLimitDefault;
            int i3 = this.selectedCount;
            if (i3 == 0) {
                this.actionBar.setSubtitle(LocaleController.formatString("MembersCountZero", R.string.MembersCountZero, LocaleController.formatPluralString("Chats", i2, new Object[0])));
                return;
            } else {
                this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", i3), Integer.valueOf(this.selectedCount), Integer.valueOf(i2)));
                return;
            }
        }
        if (i == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.selectedCount == 0) {
                this.animatedAvatarContainer.getTitle().setText(LocaleController.getString(R.string.SelectChats), true, true);
                if (this.ttlPeriod > 0) {
                    this.animatedAvatarContainer.getSubtitleTextView().setText(LocaleController.getString(R.string.SelectChatsForAutoDelete), true, true);
                    return;
                } else {
                    this.animatedAvatarContainer.getSubtitleTextView().setText(LocaleController.getString(R.string.SelectChatsForDisableAutoDelete), true, true);
                    return;
                }
            }
            AnimatedTextView title = this.animatedAvatarContainer.getTitle();
            int i4 = this.selectedCount;
            title.setText(LocaleController.formatPluralString("Chats", i4, Integer.valueOf(i4)));
            if (this.ttlPeriod > 0) {
                this.animatedAvatarContainer.getSubtitleTextView().setText(LocaleController.getString(R.string.SelectChatsForAutoDelete2));
            } else {
                this.animatedAvatarContainer.getSubtitleTextView().setText(LocaleController.getString(R.string.SelectChatsForDisableAutoDelete2));
            }
        }
    }

    public UsersSelectActivity(int i, ArrayList arrayList, boolean z) {
        super(null);
        this.selectedContacts = new LongSparseArray();
        this.allSpans = new ArrayList();
        this.isInclude = z;
        this.filterFlags = i;
        this.initialIds = arrayList;
        this.type = 0;
        this.allowSelf = true;
    }
}
