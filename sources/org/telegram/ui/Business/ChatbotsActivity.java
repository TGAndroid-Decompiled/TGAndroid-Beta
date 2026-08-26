package org.telegram.ui.Business;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController$$ExternalSyntheticLambda37;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda8;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.TextCheckCell2;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.iv.RichEditText$$ExternalSyntheticLambda4;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.web.HistoryFragment;
import org.telegram.ui.web.WebActionBar;

public final class ChatbotsActivity extends BaseFragment {
    public TL_account.TL_connectedBot currentBot;
    public TL_account.connectedBots currentValue;
    public ActionBarMenuItem doneButton;
    public CrossfadeDrawable doneButtonDrawable;
    public EditTextBoldCursor editText;
    public FrameLayout editTextContainer;
    public View editTextDivider;
    public ActionBar.AnonymousClass8 emptyView;
    public ImageView emptyViewLoading;
    public TextView emptyViewText;
    public boolean exclude;
    public boolean expandedGiftsSection;
    public boolean expandedMessagesSection;
    public boolean expandedProfileSection;
    public final LongSparseArray foundBots;
    public String lastQuery;
    public UniversalRecyclerView listView;
    public boolean loading;
    public BusinessRecipientsHelper recipientsHelper;
    public TL_account.TL_businessBotRights rights;
    public boolean scheduledLoading;
    public final ChatbotsActivity$$ExternalSyntheticLambda5 search;
    public SearchAdapterHelper searchHelper;
    public int searchId;
    public TLRPC.User selectedBot;
    public int shakeDp;
    public boolean shownGiftsPermissionsAlert;
    public boolean shownUsernamePermissionsAlert;
    public boolean valueSet;
    public boolean wasLoading;

    public final class AnonymousClass4 extends CircularProgressDrawable {
        public final int $r8$classId = 1;

        public AnonymousClass4(float f, float f2, int i) {
            super(f, f2, i);
        }

        @Override
        public final int getIntrinsicHeight() {
            switch (this.$r8$classId) {
                case 0:
                    return (int) ((this.thickness * 2.0f) + this.size);
                default:
                    return AndroidUtilities.dp(26.0f);
            }
        }

        @Override
        public final int getIntrinsicWidth() {
            switch (this.$r8$classId) {
                case 0:
                    return (int) ((this.thickness * 2.0f) + this.size);
                default:
                    return AndroidUtilities.dp(26.0f);
            }
        }

        public AnonymousClass4(int i) {
            super(i);
        }
    }

    public ChatbotsActivity() {
        super(null);
        this.searchId = 0;
        this.search = new ChatbotsActivity$$ExternalSyntheticLambda5(this, 4);
        this.rights = TL_account.TL_businessBotRights.makeDefault();
        this.selectedBot = null;
        this.foundBots = new LongSparseArray();
        this.shakeDp = -4;
        this.expandedMessagesSection = true;
        this.expandedProfileSection = false;
        this.expandedGiftsSection = false;
    }

    public final void checkAlert(int i, boolean z, final Runnable runnable) {
        final int i2 = 1;
        final int i3 = 0;
        if (!this.shownUsernamePermissionsAlert && i == -14 && z) {
            new AlertDialog.Builder(getContext(), 0, getResourceProvider()).setTitle(LocaleController.getString(R.string.BusinessBotPermissionsWarning)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsUsernamesWarningText, UserObject.getPublicUsername(this.selectedBot)))).setNegativeButton(LocaleController.getString(R.string.Cancel), null).setPositiveButton(LocaleController.getString(R.string.Allow), new AlertDialog.OnButtonClickListener(this) {
                public final ChatbotsActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog, int i4) {
                    switch (i3) {
                        case 0:
                            this.f$0.shownUsernamePermissionsAlert = true;
                            runnable.run();
                            break;
                        default:
                            this.f$0.shownGiftsPermissionsAlert = true;
                            runnable.run();
                            break;
                    }
                }
            }).makeRed(-1).show();
            return;
        }
        if (!this.shownGiftsPermissionsAlert && z && (i == -17 || i == -18 || i == -19 || i == -20)) {
            new AlertDialog.Builder(getContext(), 0, getResourceProvider()).setTitle(LocaleController.getString(R.string.BusinessBotPermissionsWarning)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsGiftsWarningText, UserObject.getPublicUsername(this.selectedBot)))).setNegativeButton(LocaleController.getString(R.string.Cancel), null).setPositiveButton(LocaleController.getString(R.string.Allow), new AlertDialog.OnButtonClickListener(this) {
                public final ChatbotsActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog, int i4) {
                    switch (i2) {
                        case 0:
                            this.f$0.shownUsernamePermissionsAlert = true;
                            runnable.run();
                            break;
                        default:
                            this.f$0.shownGiftsPermissionsAlert = true;
                            runnable.run();
                            break;
                    }
                }
            }).makeRed(-1).show();
        } else {
            runnable.run();
        }
    }

    public final void checkDone$5(boolean z) {
        if (this.doneButton == null) {
            return;
        }
        boolean zHasChanges = hasChanges();
        this.doneButton.setEnabled(zHasChanges);
        if (z) {
            this.doneButton.animate().alpha(zHasChanges ? 1.0f : 0.0f).scaleX(zHasChanges ? 1.0f : 0.0f).scaleY(zHasChanges ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.doneButton.setAlpha(zHasChanges ? 1.0f : 0.0f);
        this.doneButton.setScaleX(zHasChanges ? 1.0f : 0.0f);
        this.doneButton.setScaleY(zHasChanges ? 1.0f : 0.0f);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessBots2));
        this.actionBar.setActionBarMenuOnItemClick(new HistoryFragment.AnonymousClass1(this, 3));
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i = Theme.key_actionBarDefaultIcon;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), PorterDuff.Mode.MULTIPLY));
        this.doneButtonDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(null, i, false)));
        this.doneButton = this.actionBar.createMenu().addItemWithWidth(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.doneButtonDrawable);
        checkDone$5(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        new LinearLayout(getContext()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        this.editText = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        this.editText.setHintTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
        EditTextBoldCursor editTextBoldCursor2 = this.editText;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        editTextBoldCursor2.setTextColor(Theme.getColor(null, i2, false));
        this.editText.setBackgroundDrawable(null);
        this.editText.setMaxLines(1);
        this.editText.setLines(1);
        this.editText.setPadding(0, 0, 0, 0);
        this.editText.setSingleLine(true);
        this.editText.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.editText.setInputType(180224);
        this.editText.setImeOptions(6);
        this.editText.setHint(LocaleController.getString(R.string.BusinessBotLink));
        this.editText.setCursorColor(Theme.getColor(null, i2, false));
        this.editText.setCursorSize(AndroidUtilities.dp(19.0f));
        this.editText.setCursorWidth(1.5f);
        this.editText.setOnEditorActionListener(new RichEditText$$ExternalSyntheticLambda4(this, 1));
        this.editText.addTextChangedListener(new WebActionBar.AnonymousClass5(this, 2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.editTextContainer = frameLayout2;
        frameLayout2.addView(this.editText, LayoutHelper.createFrame(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.editTextContainer;
        int i3 = Theme.key_windowBackgroundWhite;
        frameLayout3.setBackgroundColor(getThemedColor(i3));
        View view = new View(context);
        this.editTextDivider = view;
        view.setBackgroundColor(getThemedColor(Theme.key_divider));
        FrameLayout frameLayout4 = this.editTextContainer;
        View view2 = this.editTextDivider;
        float f = 1.0f / AndroidUtilities.density;
        boolean z = LocaleController.isRTL;
        frameLayout4.addView(view2, LayoutHelper.createFrame(-1, f, 87, z ? 0 : 21, 0.0f, z ? 21 : 0, 0.0f));
        ActionBar.AnonymousClass8 anonymousClass8 = new ActionBar.AnonymousClass8(context, 2);
        this.emptyView = anonymousClass8;
        anonymousClass8.setBackgroundColor(getThemedColor(i3));
        TextView textView = new TextView(context);
        this.emptyViewText = textView;
        textView.setText(LocaleController.getString(R.string.BusinessBotNotFound));
        this.emptyViewText.setTextSize(1, 14.0f);
        TextView textView2 = this.emptyViewText;
        int i4 = Theme.key_windowBackgroundWhiteGrayText2;
        textView2.setTextColor(getThemedColor(i4));
        this.emptyView.addView(this.emptyViewText, LayoutHelper.createFrame(-2, -2, 17));
        this.emptyViewLoading = new ImageView(context);
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(getThemedColor(i4));
        this.emptyViewLoading.setScaleType(ImageView.ScaleType.CENTER);
        this.emptyViewLoading.setImageDrawable(anonymousClass4);
        this.emptyView.addView(this.emptyViewLoading, LayoutHelper.createFrame(-2, -2, 17));
        this.emptyViewLoading.setAlpha(0.0f);
        this.emptyViewLoading.setTranslationY(AndroidUtilities.dp(8.0f));
        SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(true);
        this.searchHelper = searchAdapterHelper;
        searchAdapterHelper.setDelegate(new RichEditor.AnonymousClass3(this));
        BusinessRecipientsHelper businessRecipientsHelper = new BusinessRecipientsHelper(this, new ChatbotsActivity$$ExternalSyntheticLambda5(this, 0));
        this.recipientsHelper = businessRecipientsHelper;
        TL_account.TL_connectedBot tL_connectedBot = this.currentBot;
        businessRecipientsHelper.setValue(tL_connectedBot == null ? null : tL_connectedBot.recipients);
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new GiftSheet$$ExternalSyntheticLambda8(this, 5), new ChatbotsActivity$$ExternalSyntheticLambda1(this, 3), null);
        this.listView = universalRecyclerView;
        universalRecyclerView.setSections();
        this.listView.adapter.setApplyBackground(false);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.actionBar.setAdaptiveBackground(this.listView, true);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final boolean hasChanges() {
        BusinessRecipientsHelper businessRecipientsHelper;
        if (this.valueSet) {
            TLRPC.User user = this.selectedBot;
            boolean z = user != null;
            TL_account.TL_connectedBot tL_connectedBot = this.currentBot;
            if (z == (tL_connectedBot != null)) {
                if ((user == null ? 0L : user.id) == (tL_connectedBot != null ? tL_connectedBot.bot_id : 0L) && (user == null || (this.rights.equals(tL_connectedBot.rights) && ((businessRecipientsHelper = this.recipientsHelper) == null || !businessRecipientsHelper.hasChanges())))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$processDone$18(TLObject tLObject) {
        MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
    }

    public final void lambda$processDone$19(TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z, TLRPC.User user) {
        BaseFragment safeLastFragment;
        if (tL_error != null) {
            this.doneButtonDrawable.animateToProgress(0.0f);
            BulletinFactory.showError(tL_error);
            return;
        }
        if (tLObject instanceof TLRPC.TL_boolFalse) {
            this.doneButtonDrawable.animateToProgress(0.0f);
            UserNameResolver$$ExternalSyntheticOutline0.m(BulletinFactory.of(this), R.string.UnknownError);
            return;
        }
        if (tLObject instanceof TLRPC.Updates) {
            Utilities.stageQueue.postRunnable(new ChatActionCell$$ExternalSyntheticLambda8(8, this, tLObject));
        }
        int i = iArr[0] + 1;
        iArr[0] = i;
        if (i == arrayList.size()) {
            BusinessChatbotController businessChatbotController = BusinessChatbotController.getInstance(this.currentAccount);
            businessChatbotController.loaded = false;
            businessChatbotController.load(null);
            getMessagesController().clearFullUsers();
            finishFragment();
            if (!z || user == null) {
                if (user == null || (safeLastFragment = LaunchActivity.getSafeLastFragment()) == null) {
                    return;
                }
                zzkh.m(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(user)}, BulletinFactory.of(safeLastFragment), R.raw.contact_check);
                return;
            }
            BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment2 != null) {
                zzkh.m(R.string.BusinessBotDone, new Object[]{UserObject.getUserName(user)}, BulletinFactory.of(safeLastFragment2), R.raw.contact_check);
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (hasChanges()) {
            if (z) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                builder.setTitle(LocaleController.getString(R.string.UnsavedChanges));
                builder.setMessage(LocaleController.getString(R.string.BusinessBotUnsavedChanges));
                builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new ChatbotsActivity$$ExternalSyntheticLambda1(this, 0));
                builder.setNegativeButton(LocaleController.getString(R.string.PassportDiscard), new ChatbotsActivity$$ExternalSyntheticLambda1(this, 1));
                showDialog(builder.create());
                return false;
            }
        } else {
            if (this.selectedBot != null || hasChanges() || (this.searchHelper.getLocalServerSearch().isEmpty() && this.searchHelper.getGlobalSearch().isEmpty())) {
                return super.onBackPressed(z);
            }
            if (z) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity(), 0, null);
                builder2.setTitle(LocaleController.getString(R.string.BusinessBotNoAddedTitle));
                builder2.setMessage(LocaleController.getString(R.string.BusinessBotNoAddedText));
                builder2.setPositiveButton(LocaleController.getString(R.string.BusinessBotNoAddedButton), new ChatbotsActivity$$ExternalSyntheticLambda1(this, 2));
                builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                showDialog(builder2.create());
            }
        }
        return false;
    }

    public final void onClick$11(UItem uItem, final View view) {
        if (uItem.enabled && !this.recipientsHelper.onClick(uItem)) {
            int i = uItem.id;
            if (i == -1) {
                BusinessRecipientsHelper businessRecipientsHelper = this.recipientsHelper;
                this.exclude = true;
                businessRecipientsHelper.exclude = true;
                this.listView.adapter.update(true);
                checkDone$5(true);
                return;
            }
            if (i == -2) {
                BusinessRecipientsHelper businessRecipientsHelper2 = this.recipientsHelper;
                this.exclude = false;
                businessRecipientsHelper2.exclude = false;
                this.listView.adapter.update(true);
                checkDone$5(true);
                return;
            }
            if (i == -3) {
                this.selectedBot = null;
                this.listView.adapter.update(true);
                checkDone$5(true);
                return;
            }
            if (uItem.viewType == 13) {
                TLRPC.User user = (TLRPC.User) this.foundBots.get(uItem.dialogId);
                if (user == null) {
                    return;
                }
                if (!user.bot_business) {
                    showDialog(new AlertDialog.Builder(getContext(), 0, this.resourceProvider).setTitle(LocaleController.getString(R.string.BusinessBotNotSupportedTitle)).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.BusinessBotNotSupportedMessage))).setPositiveButton(LocaleController.getString(R.string.OK), null).create());
                    return;
                }
                this.selectedBot = user;
                AndroidUtilities.hideKeyboard(this.editText);
                this.listView.adapter.update(true);
                checkDone$5(true);
                return;
            }
            if (i == -4) {
                boolean z = !this.expandedMessagesSection;
                this.expandedMessagesSection = z;
                ((TextCheckCell2) view).setChecked(z);
                this.listView.adapter.update(true);
                return;
            }
            if (i == -5) {
                int i2 = -this.shakeDp;
                this.shakeDp = i2;
                AndroidUtilities.shakeViewSpring(view, i2);
                return;
            }
            if (i == -6) {
                TL_account.TL_businessBotRights tL_businessBotRights = this.rights;
                boolean z2 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z2;
                ((CheckBoxCell) view).setChecked(z2, true);
                this.listView.adapter.update(true);
                checkDone$5(true);
                return;
            }
            if (i == -7) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = this.rights;
                boolean z3 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z3;
                ((CheckBoxCell) view).setChecked(z3, true);
                this.listView.adapter.update(true);
                checkDone$5(true);
                return;
            }
            if (i == -8) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = this.rights;
                boolean z4 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z4;
                ((CheckBoxCell) view).setChecked(z4, true);
                this.listView.adapter.update(true);
                checkDone$5(true);
                return;
            }
            if (i == -9) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = this.rights;
                boolean z5 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z5;
                ((CheckBoxCell) view).setChecked(z5, true);
                this.listView.adapter.update(true);
                checkDone$5(true);
                return;
            }
            if (i == -10) {
                boolean z6 = !this.expandedProfileSection;
                this.expandedProfileSection = z6;
                ((TextCheckCell2) view).setChecked(z6);
                this.listView.adapter.update(true);
                return;
            }
            if (i == -11) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = this.rights;
                boolean z7 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z7;
                ((CheckBoxCell) view).setChecked(z7, true);
                this.listView.adapter.update(true);
                checkDone$5(true);
                return;
            }
            if (i == -12) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = this.rights;
                boolean z8 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z8;
                ((CheckBoxCell) view).setChecked(z8, true);
                this.listView.adapter.update(true);
                checkDone$5(true);
                return;
            }
            if (i == -13) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = this.rights;
                boolean z9 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z9;
                ((CheckBoxCell) view).setChecked(z9, true);
                this.listView.adapter.update(true);
                checkDone$5(true);
                return;
            }
            if (i == -14) {
                final int i3 = 0;
                checkAlert(i, !this.rights.edit_username, new Runnable(this) {
                    public final ChatbotsActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i3) {
                            case 0:
                                ChatbotsActivity chatbotsActivity = this.f$0;
                                chatbotsActivity.getClass();
                                CheckBoxCell checkBoxCell = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = chatbotsActivity.rights;
                                boolean z10 = !tL_businessBotRights8.edit_username;
                                tL_businessBotRights8.edit_username = z10;
                                checkBoxCell.setChecked(z10, true);
                                chatbotsActivity.listView.adapter.update(true);
                                chatbotsActivity.checkDone$5(true);
                                break;
                            case 1:
                                ChatbotsActivity chatbotsActivity2 = this.f$0;
                                chatbotsActivity2.getClass();
                                CheckBoxCell checkBoxCell2 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = chatbotsActivity2.rights;
                                boolean z11 = !tL_businessBotRights9.view_gifts;
                                tL_businessBotRights9.view_gifts = z11;
                                checkBoxCell2.setChecked(z11, true);
                                chatbotsActivity2.listView.adapter.update(true);
                                chatbotsActivity2.checkDone$5(true);
                                break;
                            case 2:
                                ChatbotsActivity chatbotsActivity3 = this.f$0;
                                chatbotsActivity3.getClass();
                                CheckBoxCell checkBoxCell3 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = chatbotsActivity3.rights;
                                boolean z12 = !tL_businessBotRights10.sell_gifts;
                                tL_businessBotRights10.sell_gifts = z12;
                                checkBoxCell3.setChecked(z12, true);
                                chatbotsActivity3.listView.adapter.update(true);
                                chatbotsActivity3.checkDone$5(true);
                                break;
                            case 3:
                                ChatbotsActivity chatbotsActivity4 = this.f$0;
                                chatbotsActivity4.getClass();
                                CheckBoxCell checkBoxCell4 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = chatbotsActivity4.rights;
                                boolean z13 = !tL_businessBotRights11.change_gift_settings;
                                tL_businessBotRights11.change_gift_settings = z13;
                                checkBoxCell4.setChecked(z13, true);
                                chatbotsActivity4.listView.adapter.update(true);
                                chatbotsActivity4.checkDone$5(true);
                                break;
                            case 4:
                                ChatbotsActivity chatbotsActivity5 = this.f$0;
                                chatbotsActivity5.getClass();
                                CheckBoxCell checkBoxCell5 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = chatbotsActivity5.rights;
                                boolean z14 = !tL_businessBotRights12.transfer_and_upgrade_gifts;
                                tL_businessBotRights12.transfer_and_upgrade_gifts = z14;
                                checkBoxCell5.setChecked(z14, true);
                                chatbotsActivity5.listView.adapter.update(true);
                                chatbotsActivity5.checkDone$5(true);
                                break;
                            default:
                                ChatbotsActivity chatbotsActivity6 = this.f$0;
                                chatbotsActivity6.getClass();
                                CheckBoxCell checkBoxCell6 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = chatbotsActivity6.rights;
                                boolean z15 = !tL_businessBotRights13.transfer_stars;
                                tL_businessBotRights13.transfer_stars = z15;
                                checkBoxCell6.setChecked(z15, true);
                                chatbotsActivity6.listView.adapter.update(true);
                                chatbotsActivity6.checkDone$5(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i == -15) {
                boolean z10 = !this.expandedGiftsSection;
                this.expandedGiftsSection = z10;
                ((TextCheckCell2) view).setChecked(z10);
                this.listView.adapter.update(true);
                return;
            }
            if (i == -16) {
                final int i4 = 1;
                checkAlert(i, !this.rights.view_gifts, new Runnable(this) {
                    public final ChatbotsActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i4) {
                            case 0:
                                ChatbotsActivity chatbotsActivity = this.f$0;
                                chatbotsActivity.getClass();
                                CheckBoxCell checkBoxCell = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = chatbotsActivity.rights;
                                boolean z11 = !tL_businessBotRights8.edit_username;
                                tL_businessBotRights8.edit_username = z11;
                                checkBoxCell.setChecked(z11, true);
                                chatbotsActivity.listView.adapter.update(true);
                                chatbotsActivity.checkDone$5(true);
                                break;
                            case 1:
                                ChatbotsActivity chatbotsActivity2 = this.f$0;
                                chatbotsActivity2.getClass();
                                CheckBoxCell checkBoxCell2 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = chatbotsActivity2.rights;
                                boolean z12 = !tL_businessBotRights9.view_gifts;
                                tL_businessBotRights9.view_gifts = z12;
                                checkBoxCell2.setChecked(z12, true);
                                chatbotsActivity2.listView.adapter.update(true);
                                chatbotsActivity2.checkDone$5(true);
                                break;
                            case 2:
                                ChatbotsActivity chatbotsActivity3 = this.f$0;
                                chatbotsActivity3.getClass();
                                CheckBoxCell checkBoxCell3 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = chatbotsActivity3.rights;
                                boolean z13 = !tL_businessBotRights10.sell_gifts;
                                tL_businessBotRights10.sell_gifts = z13;
                                checkBoxCell3.setChecked(z13, true);
                                chatbotsActivity3.listView.adapter.update(true);
                                chatbotsActivity3.checkDone$5(true);
                                break;
                            case 3:
                                ChatbotsActivity chatbotsActivity4 = this.f$0;
                                chatbotsActivity4.getClass();
                                CheckBoxCell checkBoxCell4 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = chatbotsActivity4.rights;
                                boolean z14 = !tL_businessBotRights11.change_gift_settings;
                                tL_businessBotRights11.change_gift_settings = z14;
                                checkBoxCell4.setChecked(z14, true);
                                chatbotsActivity4.listView.adapter.update(true);
                                chatbotsActivity4.checkDone$5(true);
                                break;
                            case 4:
                                ChatbotsActivity chatbotsActivity5 = this.f$0;
                                chatbotsActivity5.getClass();
                                CheckBoxCell checkBoxCell5 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = chatbotsActivity5.rights;
                                boolean z15 = !tL_businessBotRights12.transfer_and_upgrade_gifts;
                                tL_businessBotRights12.transfer_and_upgrade_gifts = z15;
                                checkBoxCell5.setChecked(z15, true);
                                chatbotsActivity5.listView.adapter.update(true);
                                chatbotsActivity5.checkDone$5(true);
                                break;
                            default:
                                ChatbotsActivity chatbotsActivity6 = this.f$0;
                                chatbotsActivity6.getClass();
                                CheckBoxCell checkBoxCell6 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = chatbotsActivity6.rights;
                                boolean z16 = !tL_businessBotRights13.transfer_stars;
                                tL_businessBotRights13.transfer_stars = z16;
                                checkBoxCell6.setChecked(z16, true);
                                chatbotsActivity6.listView.adapter.update(true);
                                chatbotsActivity6.checkDone$5(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i == -17) {
                final int i5 = 2;
                checkAlert(i, !this.rights.sell_gifts, new Runnable(this) {
                    public final ChatbotsActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i5) {
                            case 0:
                                ChatbotsActivity chatbotsActivity = this.f$0;
                                chatbotsActivity.getClass();
                                CheckBoxCell checkBoxCell = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = chatbotsActivity.rights;
                                boolean z11 = !tL_businessBotRights8.edit_username;
                                tL_businessBotRights8.edit_username = z11;
                                checkBoxCell.setChecked(z11, true);
                                chatbotsActivity.listView.adapter.update(true);
                                chatbotsActivity.checkDone$5(true);
                                break;
                            case 1:
                                ChatbotsActivity chatbotsActivity2 = this.f$0;
                                chatbotsActivity2.getClass();
                                CheckBoxCell checkBoxCell2 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = chatbotsActivity2.rights;
                                boolean z12 = !tL_businessBotRights9.view_gifts;
                                tL_businessBotRights9.view_gifts = z12;
                                checkBoxCell2.setChecked(z12, true);
                                chatbotsActivity2.listView.adapter.update(true);
                                chatbotsActivity2.checkDone$5(true);
                                break;
                            case 2:
                                ChatbotsActivity chatbotsActivity3 = this.f$0;
                                chatbotsActivity3.getClass();
                                CheckBoxCell checkBoxCell3 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = chatbotsActivity3.rights;
                                boolean z13 = !tL_businessBotRights10.sell_gifts;
                                tL_businessBotRights10.sell_gifts = z13;
                                checkBoxCell3.setChecked(z13, true);
                                chatbotsActivity3.listView.adapter.update(true);
                                chatbotsActivity3.checkDone$5(true);
                                break;
                            case 3:
                                ChatbotsActivity chatbotsActivity4 = this.f$0;
                                chatbotsActivity4.getClass();
                                CheckBoxCell checkBoxCell4 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = chatbotsActivity4.rights;
                                boolean z14 = !tL_businessBotRights11.change_gift_settings;
                                tL_businessBotRights11.change_gift_settings = z14;
                                checkBoxCell4.setChecked(z14, true);
                                chatbotsActivity4.listView.adapter.update(true);
                                chatbotsActivity4.checkDone$5(true);
                                break;
                            case 4:
                                ChatbotsActivity chatbotsActivity5 = this.f$0;
                                chatbotsActivity5.getClass();
                                CheckBoxCell checkBoxCell5 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = chatbotsActivity5.rights;
                                boolean z15 = !tL_businessBotRights12.transfer_and_upgrade_gifts;
                                tL_businessBotRights12.transfer_and_upgrade_gifts = z15;
                                checkBoxCell5.setChecked(z15, true);
                                chatbotsActivity5.listView.adapter.update(true);
                                chatbotsActivity5.checkDone$5(true);
                                break;
                            default:
                                ChatbotsActivity chatbotsActivity6 = this.f$0;
                                chatbotsActivity6.getClass();
                                CheckBoxCell checkBoxCell6 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = chatbotsActivity6.rights;
                                boolean z16 = !tL_businessBotRights13.transfer_stars;
                                tL_businessBotRights13.transfer_stars = z16;
                                checkBoxCell6.setChecked(z16, true);
                                chatbotsActivity6.listView.adapter.update(true);
                                chatbotsActivity6.checkDone$5(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i == -18) {
                final int i6 = 3;
                checkAlert(i, !this.rights.change_gift_settings, new Runnable(this) {
                    public final ChatbotsActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i6) {
                            case 0:
                                ChatbotsActivity chatbotsActivity = this.f$0;
                                chatbotsActivity.getClass();
                                CheckBoxCell checkBoxCell = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = chatbotsActivity.rights;
                                boolean z11 = !tL_businessBotRights8.edit_username;
                                tL_businessBotRights8.edit_username = z11;
                                checkBoxCell.setChecked(z11, true);
                                chatbotsActivity.listView.adapter.update(true);
                                chatbotsActivity.checkDone$5(true);
                                break;
                            case 1:
                                ChatbotsActivity chatbotsActivity2 = this.f$0;
                                chatbotsActivity2.getClass();
                                CheckBoxCell checkBoxCell2 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = chatbotsActivity2.rights;
                                boolean z12 = !tL_businessBotRights9.view_gifts;
                                tL_businessBotRights9.view_gifts = z12;
                                checkBoxCell2.setChecked(z12, true);
                                chatbotsActivity2.listView.adapter.update(true);
                                chatbotsActivity2.checkDone$5(true);
                                break;
                            case 2:
                                ChatbotsActivity chatbotsActivity3 = this.f$0;
                                chatbotsActivity3.getClass();
                                CheckBoxCell checkBoxCell3 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = chatbotsActivity3.rights;
                                boolean z13 = !tL_businessBotRights10.sell_gifts;
                                tL_businessBotRights10.sell_gifts = z13;
                                checkBoxCell3.setChecked(z13, true);
                                chatbotsActivity3.listView.adapter.update(true);
                                chatbotsActivity3.checkDone$5(true);
                                break;
                            case 3:
                                ChatbotsActivity chatbotsActivity4 = this.f$0;
                                chatbotsActivity4.getClass();
                                CheckBoxCell checkBoxCell4 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = chatbotsActivity4.rights;
                                boolean z14 = !tL_businessBotRights11.change_gift_settings;
                                tL_businessBotRights11.change_gift_settings = z14;
                                checkBoxCell4.setChecked(z14, true);
                                chatbotsActivity4.listView.adapter.update(true);
                                chatbotsActivity4.checkDone$5(true);
                                break;
                            case 4:
                                ChatbotsActivity chatbotsActivity5 = this.f$0;
                                chatbotsActivity5.getClass();
                                CheckBoxCell checkBoxCell5 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = chatbotsActivity5.rights;
                                boolean z15 = !tL_businessBotRights12.transfer_and_upgrade_gifts;
                                tL_businessBotRights12.transfer_and_upgrade_gifts = z15;
                                checkBoxCell5.setChecked(z15, true);
                                chatbotsActivity5.listView.adapter.update(true);
                                chatbotsActivity5.checkDone$5(true);
                                break;
                            default:
                                ChatbotsActivity chatbotsActivity6 = this.f$0;
                                chatbotsActivity6.getClass();
                                CheckBoxCell checkBoxCell6 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = chatbotsActivity6.rights;
                                boolean z16 = !tL_businessBotRights13.transfer_stars;
                                tL_businessBotRights13.transfer_stars = z16;
                                checkBoxCell6.setChecked(z16, true);
                                chatbotsActivity6.listView.adapter.update(true);
                                chatbotsActivity6.checkDone$5(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i == -19) {
                final int i7 = 4;
                checkAlert(i, !this.rights.transfer_and_upgrade_gifts, new Runnable(this) {
                    public final ChatbotsActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i7) {
                            case 0:
                                ChatbotsActivity chatbotsActivity = this.f$0;
                                chatbotsActivity.getClass();
                                CheckBoxCell checkBoxCell = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = chatbotsActivity.rights;
                                boolean z11 = !tL_businessBotRights8.edit_username;
                                tL_businessBotRights8.edit_username = z11;
                                checkBoxCell.setChecked(z11, true);
                                chatbotsActivity.listView.adapter.update(true);
                                chatbotsActivity.checkDone$5(true);
                                break;
                            case 1:
                                ChatbotsActivity chatbotsActivity2 = this.f$0;
                                chatbotsActivity2.getClass();
                                CheckBoxCell checkBoxCell2 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = chatbotsActivity2.rights;
                                boolean z12 = !tL_businessBotRights9.view_gifts;
                                tL_businessBotRights9.view_gifts = z12;
                                checkBoxCell2.setChecked(z12, true);
                                chatbotsActivity2.listView.adapter.update(true);
                                chatbotsActivity2.checkDone$5(true);
                                break;
                            case 2:
                                ChatbotsActivity chatbotsActivity3 = this.f$0;
                                chatbotsActivity3.getClass();
                                CheckBoxCell checkBoxCell3 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = chatbotsActivity3.rights;
                                boolean z13 = !tL_businessBotRights10.sell_gifts;
                                tL_businessBotRights10.sell_gifts = z13;
                                checkBoxCell3.setChecked(z13, true);
                                chatbotsActivity3.listView.adapter.update(true);
                                chatbotsActivity3.checkDone$5(true);
                                break;
                            case 3:
                                ChatbotsActivity chatbotsActivity4 = this.f$0;
                                chatbotsActivity4.getClass();
                                CheckBoxCell checkBoxCell4 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = chatbotsActivity4.rights;
                                boolean z14 = !tL_businessBotRights11.change_gift_settings;
                                tL_businessBotRights11.change_gift_settings = z14;
                                checkBoxCell4.setChecked(z14, true);
                                chatbotsActivity4.listView.adapter.update(true);
                                chatbotsActivity4.checkDone$5(true);
                                break;
                            case 4:
                                ChatbotsActivity chatbotsActivity5 = this.f$0;
                                chatbotsActivity5.getClass();
                                CheckBoxCell checkBoxCell5 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = chatbotsActivity5.rights;
                                boolean z15 = !tL_businessBotRights12.transfer_and_upgrade_gifts;
                                tL_businessBotRights12.transfer_and_upgrade_gifts = z15;
                                checkBoxCell5.setChecked(z15, true);
                                chatbotsActivity5.listView.adapter.update(true);
                                chatbotsActivity5.checkDone$5(true);
                                break;
                            default:
                                ChatbotsActivity chatbotsActivity6 = this.f$0;
                                chatbotsActivity6.getClass();
                                CheckBoxCell checkBoxCell6 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = chatbotsActivity6.rights;
                                boolean z16 = !tL_businessBotRights13.transfer_stars;
                                tL_businessBotRights13.transfer_stars = z16;
                                checkBoxCell6.setChecked(z16, true);
                                chatbotsActivity6.listView.adapter.update(true);
                                chatbotsActivity6.checkDone$5(true);
                                break;
                        }
                    }
                });
            } else if (i == -20) {
                final int i8 = 5;
                checkAlert(i, !this.rights.transfer_stars, new Runnable(this) {
                    public final ChatbotsActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i8) {
                            case 0:
                                ChatbotsActivity chatbotsActivity = this.f$0;
                                chatbotsActivity.getClass();
                                CheckBoxCell checkBoxCell = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = chatbotsActivity.rights;
                                boolean z11 = !tL_businessBotRights8.edit_username;
                                tL_businessBotRights8.edit_username = z11;
                                checkBoxCell.setChecked(z11, true);
                                chatbotsActivity.listView.adapter.update(true);
                                chatbotsActivity.checkDone$5(true);
                                break;
                            case 1:
                                ChatbotsActivity chatbotsActivity2 = this.f$0;
                                chatbotsActivity2.getClass();
                                CheckBoxCell checkBoxCell2 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = chatbotsActivity2.rights;
                                boolean z12 = !tL_businessBotRights9.view_gifts;
                                tL_businessBotRights9.view_gifts = z12;
                                checkBoxCell2.setChecked(z12, true);
                                chatbotsActivity2.listView.adapter.update(true);
                                chatbotsActivity2.checkDone$5(true);
                                break;
                            case 2:
                                ChatbotsActivity chatbotsActivity3 = this.f$0;
                                chatbotsActivity3.getClass();
                                CheckBoxCell checkBoxCell3 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = chatbotsActivity3.rights;
                                boolean z13 = !tL_businessBotRights10.sell_gifts;
                                tL_businessBotRights10.sell_gifts = z13;
                                checkBoxCell3.setChecked(z13, true);
                                chatbotsActivity3.listView.adapter.update(true);
                                chatbotsActivity3.checkDone$5(true);
                                break;
                            case 3:
                                ChatbotsActivity chatbotsActivity4 = this.f$0;
                                chatbotsActivity4.getClass();
                                CheckBoxCell checkBoxCell4 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = chatbotsActivity4.rights;
                                boolean z14 = !tL_businessBotRights11.change_gift_settings;
                                tL_businessBotRights11.change_gift_settings = z14;
                                checkBoxCell4.setChecked(z14, true);
                                chatbotsActivity4.listView.adapter.update(true);
                                chatbotsActivity4.checkDone$5(true);
                                break;
                            case 4:
                                ChatbotsActivity chatbotsActivity5 = this.f$0;
                                chatbotsActivity5.getClass();
                                CheckBoxCell checkBoxCell5 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = chatbotsActivity5.rights;
                                boolean z15 = !tL_businessBotRights12.transfer_and_upgrade_gifts;
                                tL_businessBotRights12.transfer_and_upgrade_gifts = z15;
                                checkBoxCell5.setChecked(z15, true);
                                chatbotsActivity5.listView.adapter.update(true);
                                chatbotsActivity5.checkDone$5(true);
                                break;
                            default:
                                ChatbotsActivity chatbotsActivity6 = this.f$0;
                                chatbotsActivity6.getClass();
                                CheckBoxCell checkBoxCell6 = (CheckBoxCell) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = chatbotsActivity6.rights;
                                boolean z16 = !tL_businessBotRights13.transfer_stars;
                                tL_businessBotRights13.transfer_stars = z16;
                                checkBoxCell6.setChecked(z16, true);
                                chatbotsActivity6.listView.adapter.update(true);
                                chatbotsActivity6.checkDone$5(true);
                                break;
                        }
                    }
                });
            } else if (i == -21) {
                checkAlert(i, !this.rights.manage_stories, new ChatbotsActivity$$ExternalSyntheticLambda5(this, 1));
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        if (!this.loading && !this.valueSet) {
            this.loading = true;
            BusinessChatbotController.getInstance(this.currentAccount).load(new DialogCell$$ExternalSyntheticLambda6(this, 5));
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    public final void processDone$8() {
        TLRPC.User user;
        TL_account.TL_connectedBot tL_connectedBot;
        if (this.doneButtonDrawable.getProgress() > 0.0f) {
            return;
        }
        if (!hasChanges()) {
            finishFragment();
            return;
        }
        if (this.recipientsHelper.validate(this.listView)) {
            TLRPC.User user2 = this.selectedBot;
            boolean z = user2 != null && ((tL_connectedBot = this.currentBot) == null || tL_connectedBot.bot_id != user2.id);
            ArrayList arrayList = new ArrayList();
            TL_account.TL_connectedBot tL_connectedBot2 = this.currentBot;
            if (tL_connectedBot2 != null && ((user = this.selectedBot) == null || tL_connectedBot2.bot_id != user.id)) {
                TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                updateconnectedbot.deleted = true;
                updateconnectedbot.bot = getMessagesController().getInputUser(this.currentBot.bot_id);
                updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                arrayList.add(updateconnectedbot);
            }
            if (this.selectedBot != null) {
                TL_account.updateConnectedBot updateconnectedbot2 = new TL_account.updateConnectedBot();
                updateconnectedbot2.deleted = false;
                updateconnectedbot2.rights = this.rights;
                updateconnectedbot2.bot = getMessagesController().getInputUser(this.selectedBot);
                updateconnectedbot2.recipients = this.recipientsHelper.getBotInputValue();
                arrayList.add(updateconnectedbot2);
                TL_account.TL_connectedBot tL_connectedBot3 = this.currentBot;
                if (tL_connectedBot3 != null) {
                    tL_connectedBot3.bot_id = this.selectedBot.id;
                    tL_connectedBot3.recipients = this.recipientsHelper.getBotValue();
                    this.currentBot.rights = this.rights;
                }
            }
            if (arrayList.isEmpty()) {
                finishFragment();
                return;
            }
            int[] iArr = {0};
            for (int i = 0; i < arrayList.size(); i++) {
                getConnectionsManager().sendRequest((TLObject) arrayList.get(i), new ContactsController$$ExternalSyntheticLambda37(this, iArr, arrayList, z, user2));
            }
        }
    }

    public final void updateSearchLoading() {
        boolean z = this.wasLoading;
        boolean zIsSearchInProgress = this.searchHelper.isSearchInProgress();
        LongSparseArray longSparseArray = this.foundBots;
        boolean z2 = true;
        if (z != (zIsSearchInProgress || this.scheduledLoading || longSparseArray.size() > 0)) {
            if (!this.searchHelper.isSearchInProgress() && !this.scheduledLoading && longSparseArray.size() <= 0) {
                z2 = false;
            }
            this.wasLoading = z2;
            ViewPropertyAnimator duration = this.emptyViewText.animate().alpha(z2 ? 0.0f : 1.0f).translationY(z2 ? -AndroidUtilities.dp(8.0f) : 0.0f).setDuration(320L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            this.emptyViewLoading.animate().alpha(z2 ? 1.0f : 0.0f).translationY(z2 ? 0.0f : AndroidUtilities.dp(8.0f)).setDuration(320L).setInterpolator(cubicBezierInterpolator).start();
        }
    }
}
