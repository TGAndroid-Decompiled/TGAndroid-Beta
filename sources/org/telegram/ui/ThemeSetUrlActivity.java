package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.AboutLinkCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Cells.ThemePreviewMessagesCell;
import org.telegram.ui.Cells.ThemesHorizontalListCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.iv.RichTextCell$$ExternalSyntheticLambda3;

public final class ThemeSetUrlActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public TextInfoPrivacyCell checkInfoCell;
    public int checkReqId;
    public TodoItemMenu$$ExternalSyntheticLambda9 checkRunnable;
    public TextSettingsCell createCell;
    public TextInfoPrivacyCell createInfoCell;
    public final boolean creatingNewTheme;
    public PaymentFormActivity.AnonymousClass2 divider;
    public ActionBarMenuItem doneButton;
    public EditTextBoldCursor editText;
    public HeaderCell headerCell;
    public TextInfoPrivacyCell helpInfoCell;
    public boolean ignoreCheck;
    public final TLRPC.TL_theme info;
    public SpannableStringBuilder infoText;
    public String lastCheckName;
    public LinearLayout linearLayoutTypeContainer;
    public EditTextBoldCursor linkField;
    public ThemePreviewMessagesCell messagesCell;
    public EditTextBoldCursor nameField;
    public AlertDialog progressDialog;
    public final Theme.ThemeAccent themeAccent;
    public final Theme.ThemeInfo themeInfo;

    public final class AnonymousClass4 extends ThemesHorizontalListCell {
        public final int $r8$classId = 0;
        public final Object val$builder;

        public AnonymousClass4(Context context, ThemeSetUrlActivity themeSetUrlActivity, ArrayList arrayList, ArrayList arrayList2, BottomSheet.Builder builder) {
            super(context, themeSetUrlActivity, 2, arrayList, arrayList2);
            this.val$builder = builder;
        }

        @Override
        public void showOptionsForTheme(Theme.ThemeInfo themeInfo) {
            boolean z;
            CharSequence[] charSequenceArr;
            int[] iArr;
            switch (this.$r8$classId) {
                case 1:
                    ThemeActivity.ListAdapter listAdapter = ThemeActivity.this.listAdapter;
                    ThemeActivity themeActivity = ThemeActivity.this;
                    if (themeActivity.getParentActivity() != null) {
                        if ((themeInfo.info == null || themeInfo.themeLoaded) && themeActivity.currentType != 1) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(themeActivity.getParentActivity(), 0, null);
                            if (themeInfo.pathToFile == null) {
                                CharSequence[] charSequenceArr2 = {null, LocaleController.getString("ExportTheme", R.string.ExportTheme)};
                                iArr = new int[]{0, R.drawable.msg_shareout};
                                charSequenceArr = charSequenceArr2;
                                z = false;
                            } else {
                                TLRPC.TL_theme tL_theme = themeInfo.info;
                                z = tL_theme == null || !tL_theme.isDefault;
                                String string = LocaleController.getString("ShareFile", R.string.ShareFile);
                                String string2 = LocaleController.getString("ExportTheme", R.string.ExportTheme);
                                TLRPC.TL_theme tL_theme2 = themeInfo.info;
                                String string3 = (tL_theme2 == null || (!tL_theme2.isDefault && tL_theme2.creator)) ? LocaleController.getString("Edit", R.string.Edit) : null;
                                TLRPC.TL_theme tL_theme3 = themeInfo.info;
                                charSequenceArr = new CharSequence[]{string, string2, string3, (tL_theme3 == null || !tL_theme3.creator) ? null : LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl), z ? LocaleController.getString("Delete", R.string.Delete) : null};
                                iArr = new int[]{R.drawable.msg_share, R.drawable.msg_shareout, R.drawable.msg_edit, R.drawable.msg_link, R.drawable.msg_delete};
                            }
                            ArticleViewer$$ExternalSyntheticLambda24 articleViewer$$ExternalSyntheticLambda24 = new ArticleViewer$$ExternalSyntheticLambda24(13, listAdapter, themeInfo);
                            AlertDialog alertDialog = builder.alertDialog;
                            alertDialog.items = charSequenceArr;
                            alertDialog.itemIcons = iArr;
                            alertDialog.onClickListener = articleViewer$$ExternalSyntheticLambda24;
                            themeActivity.showDialog(alertDialog);
                            if (z) {
                                ArrayList arrayList = alertDialog.itemViews;
                                int size = arrayList.size() - 1;
                                int color = Theme.getColor(null, Theme.key_text_RedBold, false);
                                int color2 = Theme.getColor(null, Theme.key_text_RedRegular, false);
                                if (size >= 0 && size < arrayList.size()) {
                                    AlertDialog.AlertDialogCell alertDialogCell = (AlertDialog.AlertDialogCell) arrayList.get(size);
                                    alertDialogCell.textView.setTextColor(color);
                                    alertDialogCell.imageView.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.MULTIPLY));
                                    break;
                                }
                            }
                        }
                    }
                    break;
            }
        }

        @Override
        public final void updateRows$2() {
            switch (this.$r8$classId) {
                case 0:
                    ((BottomSheet.Builder) this.val$builder).bottomSheet.dismissRunnable.run();
                    break;
                default:
                    ThemeActivity.this.updateRows$8(false);
                    break;
            }
        }

        public AnonymousClass4(ThemeActivity.ListAdapter listAdapter, Context context, BaseFragment baseFragment, int i, ArrayList arrayList, ArrayList arrayList2) {
            super(context, baseFragment, i, arrayList, arrayList2);
            this.val$builder = listAdapter;
        }
    }

    public ThemeSetUrlActivity(Theme.ThemeInfo themeInfo, Theme.ThemeAccent themeAccent, boolean z) {
        super(null);
        this.themeInfo = themeInfo;
        this.themeAccent = themeAccent;
        this.info = themeAccent != null ? themeAccent.info : themeInfo.info;
        this.currentAccount = themeAccent != null ? themeAccent.account : themeInfo.account;
        this.creatingNewTheme = z;
    }

    public final boolean checkUrl(String str, boolean z) {
        String str2;
        TodoItemMenu$$ExternalSyntheticLambda9 todoItemMenu$$ExternalSyntheticLambda9 = this.checkRunnable;
        if (todoItemMenu$$ExternalSyntheticLambda9 != null) {
            AndroidUtilities.cancelRunOnUIThread(todoItemMenu$$ExternalSyntheticLambda9);
            this.checkRunnable = null;
            this.lastCheckName = null;
            if (this.checkReqId != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.checkReqId, true);
            }
        }
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                setCheckText(Theme.key_text_RedRegular, LocaleController.getString(R.string.SetUrlInvalid));
                return false;
            }
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (i == 0 && cCharAt >= '0' && cCharAt <= '9') {
                    if (z) {
                        AlertsCreator.showSimpleAlert(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidStartNumber), null);
                        return false;
                    }
                    setCheckText(Theme.key_text_RedRegular, LocaleController.getString(R.string.SetUrlInvalidStartNumber));
                    return false;
                }
                if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && cCharAt != '_'))) {
                    if (z) {
                        AlertsCreator.showSimpleAlert(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalid), null);
                        return false;
                    }
                    setCheckText(Theme.key_text_RedRegular, LocaleController.getString(R.string.SetUrlInvalid));
                    return false;
                }
            }
        }
        if (str == null || str.length() < 5) {
            if (z) {
                AlertsCreator.showSimpleAlert(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidShort), null);
                return false;
            }
            setCheckText(Theme.key_text_RedRegular, LocaleController.getString(R.string.SetUrlInvalidShort));
            return false;
        }
        if (str.length() > 64) {
            if (z) {
                AlertsCreator.showSimpleAlert(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidLong), null);
                return false;
            }
            setCheckText(Theme.key_text_RedRegular, LocaleController.getString(R.string.SetUrlInvalidLong));
            return false;
        }
        if (!z) {
            TLRPC.TL_theme tL_theme = this.info;
            if (tL_theme == null || (str2 = tL_theme.slug) == null) {
                str2 = "";
            }
            if (str.equals(str2)) {
                setCheckText(Theme.key_windowBackgroundWhiteGreenText, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                return true;
            }
            setCheckText(Theme.key_windowBackgroundWhiteGrayText8, LocaleController.getString(R.string.SetUrlChecking));
            this.lastCheckName = str;
            TodoItemMenu$$ExternalSyntheticLambda9 todoItemMenu$$ExternalSyntheticLambda10 = new TodoItemMenu$$ExternalSyntheticLambda9(11, this, str);
            this.checkRunnable = todoItemMenu$$ExternalSyntheticLambda10;
            AndroidUtilities.runOnUIThread(todoItemMenu$$ExternalSyntheticLambda10, 300L);
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        final int i = 0;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i2 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        boolean z = this.creatingNewTheme;
        if (z) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewThemeTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditThemeTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(this, 28));
        this.doneButton = this.actionBar.createMenu().addItem(1, LocaleController.getString(R.string.Done).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.linearLayoutTypeContainer = linearLayout3;
        linearLayout3.setOrientation(1);
        this.linearLayoutTypeContainer.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        linearLayout2.addView(this.linearLayoutTypeContainer, LayoutHelper.createLinear(-1, -2));
        HeaderCell headerCell = new HeaderCell(context, 23);
        this.headerCell = headerCell;
        headerCell.setText(LocaleController.getString(R.string.Info));
        this.linearLayoutTypeContainer.addView(this.headerCell);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.nameField = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.nameField;
        int i3 = Theme.key_windowBackgroundWhiteHintText;
        editTextBoldCursor2.setHintTextColor(Theme.getColor(null, i3, false));
        EditTextBoldCursor editTextBoldCursor3 = this.nameField;
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        editTextBoldCursor3.setTextColor(Theme.getColor(null, i4, false));
        this.nameField.setMaxLines(1);
        this.nameField.setLines(1);
        this.nameField.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        this.nameField.setBackgroundDrawable(null);
        this.nameField.setPadding(0, 0, 0, 0);
        this.nameField.setSingleLine(true);
        this.nameField.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.nameField.setInputType(163872);
        this.nameField.setImeOptions(6);
        this.nameField.setHint(LocaleController.getString(R.string.ThemeNamePlaceholder));
        this.nameField.setCursorColor(Theme.getColor(null, i4, false));
        this.nameField.setCursorSize(AndroidUtilities.dp(20.0f));
        this.nameField.setCursorWidth(1.5f);
        this.linearLayoutTypeContainer.addView(this.nameField, LayoutHelper.createLinear(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.nameField.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ThemeSetUrlActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
                switch (i) {
                    case 0:
                        ThemeSetUrlActivity themeSetUrlActivity = this.f$0;
                        if (i5 == 6) {
                            AndroidUtilities.hideKeyboard(themeSetUrlActivity.nameField);
                            return true;
                        }
                        themeSetUrlActivity.getClass();
                        return false;
                    default:
                        ThemeSetUrlActivity themeSetUrlActivity2 = this.f$0;
                        if (i5 == 6) {
                            ActionBarMenuItem actionBarMenuItem = themeSetUrlActivity2.doneButton;
                            if (actionBarMenuItem != null) {
                                actionBarMenuItem.performClick();
                                return true;
                            }
                        } else {
                            themeSetUrlActivity2.getClass();
                        }
                        return false;
                }
            }
        });
        PaymentFormActivity.AnonymousClass2 anonymousClass2 = new PaymentFormActivity.AnonymousClass2(context, 29);
        this.divider = anonymousClass2;
        this.linearLayoutTypeContainer.addView(anonymousClass2, new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        this.linearLayoutTypeContainer.addView(linearLayout4, LayoutHelper.createLinear(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
        this.editText = editTextBoldCursor4;
        editTextBoldCursor4.setText(getMessagesController().linkPrefix + "/addtheme/");
        this.editText.setTextSize(1, 18.0f);
        this.editText.setHintTextColor(Theme.getColor(null, i3, false));
        this.editText.setTextColor(Theme.getColor(null, i4, false));
        this.editText.setMaxLines(1);
        this.editText.setLines(1);
        this.editText.setEnabled(false);
        this.editText.setBackgroundDrawable(null);
        this.editText.setPadding(0, 0, 0, 0);
        this.editText.setSingleLine(true);
        this.editText.setInputType(163840);
        this.editText.setImeOptions(6);
        linearLayout4.addView(this.editText, LayoutHelper.createLinear(-2, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.linkField = editTextBoldCursor5;
        editTextBoldCursor5.setTextSize(1, 18.0f);
        this.linkField.setHintTextColor(Theme.getColor(null, i3, false));
        this.linkField.setTextColor(Theme.getColor(null, i4, false));
        this.linkField.setMaxLines(1);
        this.linkField.setLines(1);
        this.linkField.setBackgroundDrawable(null);
        this.linkField.setPadding(0, 0, 0, 0);
        this.linkField.setSingleLine(true);
        this.linkField.setInputType(163872);
        this.linkField.setImeOptions(6);
        this.linkField.setHint(LocaleController.getString(R.string.SetUrlPlaceholder));
        this.linkField.setCursorColor(Theme.getColor(null, i4, false));
        this.linkField.setCursorSize(AndroidUtilities.dp(20.0f));
        this.linkField.setCursorWidth(1.5f);
        linearLayout4.addView(this.linkField, LayoutHelper.createLinear(-1, 50));
        this.linkField.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ThemeSetUrlActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
                switch (i2) {
                    case 0:
                        ThemeSetUrlActivity themeSetUrlActivity = this.f$0;
                        if (i5 == 6) {
                            AndroidUtilities.hideKeyboard(themeSetUrlActivity.nameField);
                            return true;
                        }
                        themeSetUrlActivity.getClass();
                        return false;
                    default:
                        ThemeSetUrlActivity themeSetUrlActivity2 = this.f$0;
                        if (i5 == 6) {
                            ActionBarMenuItem actionBarMenuItem = themeSetUrlActivity2.doneButton;
                            if (actionBarMenuItem != null) {
                                actionBarMenuItem.performClick();
                                return true;
                            }
                        } else {
                            themeSetUrlActivity2.getClass();
                        }
                        return false;
                }
            }
        });
        this.linkField.addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                ThemeSetUrlActivity themeSetUrlActivity = ThemeSetUrlActivity.this;
                if (themeSetUrlActivity.creatingNewTheme) {
                    return;
                }
                if (themeSetUrlActivity.linkField.length() <= 0) {
                    themeSetUrlActivity.helpInfoCell.setText(themeSetUrlActivity.infoText);
                    return;
                }
                String str = "https://" + themeSetUrlActivity.getMessagesController().linkPrefix + "/addtheme/" + ((Object) themeSetUrlActivity.linkField.getText());
                String string = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
                int iIndexOf = string.indexOf(str);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                if (iIndexOf >= 0) {
                    spannableStringBuilder.setSpan(new AboutLinkCell.AnonymousClass5(str, themeSetUrlActivity, 8), iIndexOf, str.length() + iIndexOf, 33);
                }
                themeSetUrlActivity.helpInfoCell.setText(TextUtils.concat(themeSetUrlActivity.infoText, "\n\n", spannableStringBuilder));
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                ThemeSetUrlActivity themeSetUrlActivity = ThemeSetUrlActivity.this;
                if (themeSetUrlActivity.ignoreCheck) {
                    return;
                }
                themeSetUrlActivity.checkUrl(themeSetUrlActivity.linkField.getText().toString(), false);
            }
        });
        if (z) {
            this.linkField.setOnFocusChangeListener(new RichTextCell$$ExternalSyntheticLambda3(this, 19));
        }
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, null);
        this.checkInfoCell = textInfoPrivacyCell;
        int i5 = R.drawable.greydivider_bottom;
        int i6 = Theme.key_windowBackgroundGrayShadow;
        textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i5, i6));
        this.checkInfoCell.setVisibility(8);
        this.checkInfoCell.setBottomPadding(0);
        linearLayout2.addView(this.checkInfoCell, LayoutHelper.createLinear(-1, -2));
        TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context, 24, null);
        this.helpInfoCell = textInfoPrivacyCell2;
        textInfoPrivacyCell2.getTextView().setMovementMethod(new IdenticonActivity.LinkMovementMethodMy(2));
        this.helpInfoCell.getTextView().setHighlightColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkSelection, false));
        if (z) {
            this.helpInfoCell.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
        } else {
            TextInfoPrivacyCell textInfoPrivacyCell3 = this.helpInfoCell;
            SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeSetUrlHelp));
            this.infoText = spannableStringBuilderReplaceTags;
            textInfoPrivacyCell3.setText(spannableStringBuilderReplaceTags);
        }
        linearLayout2.addView(this.helpInfoCell, LayoutHelper.createLinear(-1, -2));
        if (z) {
            this.helpInfoCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider, i6));
            ThemePreviewMessagesCell themePreviewMessagesCell = new ThemePreviewMessagesCell(context, this.parentLayout, 1, 0L, null);
            this.messagesCell = themePreviewMessagesCell;
            linearLayout2.addView(themePreviewMessagesCell, LayoutHelper.createLinear(-1, -2));
            TextSettingsCell textSettingsCell = new TextSettingsCell(context, 0, null);
            this.createCell = textSettingsCell;
            textSettingsCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
            this.createCell.setText(LocaleController.getString(R.string.UseDifferentTheme), false);
            linearLayout2.addView(this.createCell, LayoutHelper.createLinear(-1, -2));
            this.createCell.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda28(2, this, context));
            TextInfoPrivacyCell textInfoPrivacyCell4 = new TextInfoPrivacyCell(context, 24, null);
            this.createInfoCell = textInfoPrivacyCell4;
            textInfoPrivacyCell4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UseDifferentThemeInfo)));
            this.createInfoCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i5, i6));
            linearLayout2.addView(this.createInfoCell, LayoutHelper.createLinear(-1, -2));
        } else {
            this.helpInfoCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i5, i6));
        }
        TLRPC.TL_theme tL_theme = this.info;
        if (tL_theme != null) {
            this.ignoreCheck = true;
            this.nameField.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor6 = this.nameField;
            editTextBoldCursor6.setSelection(editTextBoldCursor6.length());
            this.linkField.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor7 = this.linkField;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.ignoreCheck = false;
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        AlertDialog alertDialog;
        AlertDialog alertDialog2;
        int i3 = NotificationCenter.themeUploadedToServer;
        Theme.ThemeAccent themeAccent = this.themeAccent;
        Theme.ThemeInfo themeInfo = this.themeInfo;
        if (i == i3) {
            Theme.ThemeInfo themeInfo2 = (Theme.ThemeInfo) objArr[0];
            Theme.ThemeAccent themeAccent2 = (Theme.ThemeAccent) objArr[1];
            if (themeInfo2 == themeInfo && themeAccent2 == themeAccent && (alertDialog2 = this.progressDialog) != null) {
                try {
                    alertDialog2.dismiss();
                    this.progressDialog = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                Theme.applyTheme(themeInfo, true, false);
                finishFragment();
                return;
            }
            return;
        }
        if (i == NotificationCenter.themeUploadError) {
            Theme.ThemeInfo themeInfo3 = (Theme.ThemeInfo) objArr[0];
            Theme.ThemeAccent themeAccent3 = (Theme.ThemeAccent) objArr[1];
            if (themeInfo3 == themeInfo && themeAccent3 == themeAccent && (alertDialog = this.progressDialog) != null) {
                try {
                    alertDialog.dismiss();
                    this.progressDialog = null;
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        LinearLayout linearLayout = this.linearLayoutTypeContainer;
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(linearLayout, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.actionBar, 1, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.headerCell, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        int i2 = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(this.createInfoCell, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i2));
        int i3 = Theme.key_windowBackgroundWhiteGrayText4;
        arrayList.add(new ThemeDescription(this.createInfoCell, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.helpInfoCell, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.helpInfoCell, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.checkInfoCell, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.checkInfoCell, 262144, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_text_RedRegular));
        arrayList.add(new ThemeDescription(this.checkInfoCell, 262144, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText8));
        arrayList.add(new ThemeDescription(this.checkInfoCell, 262144, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGreenText));
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.createCell, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.createCell, 268435456, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.createCell, 268435456, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.linkField, 4, null, null, null, null, i4));
        EditTextBoldCursor editTextBoldCursor = this.linkField;
        int i5 = Theme.key_windowBackgroundWhiteHintText;
        arrayList.add(new ThemeDescription(editTextBoldCursor, 8388608, null, null, null, null, i5));
        arrayList.add(new ThemeDescription(this.linkField, 32, null, null, null, null, Theme.key_windowBackgroundWhiteInputField));
        arrayList.add(new ThemeDescription(this.linkField, 65568, null, null, null, null, Theme.key_windowBackgroundWhiteInputFieldActivated));
        arrayList.add(new ThemeDescription(this.linkField, 4, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.linkField, 8388608, null, null, null, null, i5));
        arrayList.add(new ThemeDescription(this.linkField, 16777216, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.nameField, 4, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.nameField, 8388608, null, null, null, null, i5));
        arrayList.add(new ThemeDescription(this.nameField, 16777216, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.editText, 4, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.editText, 8388608, null, null, null, null, i5));
        PaymentFormActivity.AnonymousClass2 anonymousClass2 = this.divider;
        Paint paint = Theme.dividerPaint;
        int i6 = Theme.key_divider;
        arrayList.add(new ThemeDescription(anonymousClass2, 0, null, paint, null, null, i6));
        arrayList.add(new ThemeDescription(this.divider, 1, null, Theme.dividerPaint, null, null, i6));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, new Drawable[]{Theme.chat_msgInDrawable, Theme.chat_msgInMediaDrawable}, null, Theme.key_chat_inBubble));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, new Drawable[]{Theme.chat_msgInSelectedDrawable, Theme.chat_msgInMediaSelectedDrawable}, null, Theme.key_chat_inBubbleSelected));
        ThemePreviewMessagesCell themePreviewMessagesCell = this.messagesCell;
        Drawable[] drawableArr = Theme.chat_msgInDrawable.shadowDrawable;
        int i7 = Theme.key_chat_inBubbleShadow;
        arrayList.add(new ThemeDescription(themePreviewMessagesCell, 0, null, null, drawableArr, null, i7));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, Theme.chat_msgInMediaDrawable.shadowDrawable, null, i7));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubble));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient1));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient2));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient3));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, new Drawable[]{Theme.chat_msgOutSelectedDrawable, Theme.chat_msgOutMediaSelectedDrawable}, null, Theme.key_chat_outBubbleSelected));
        ThemePreviewMessagesCell themePreviewMessagesCell2 = this.messagesCell;
        Drawable[] drawableArr2 = Theme.chat_msgOutDrawable.shadowDrawable;
        int i8 = Theme.key_chat_outBubbleShadow;
        arrayList.add(new ThemeDescription(themePreviewMessagesCell2, 0, null, null, drawableArr2, null, i8));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, Theme.chat_msgOutMediaDrawable.shadowDrawable, null, i8));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, null, null, Theme.key_chat_messageTextIn));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, null, null, Theme.key_chat_messageTextOut));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, new Drawable[]{Theme.chat_msgOutCheckDrawable}, null, Theme.key_chat_outSentCheck));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, new Drawable[]{Theme.chat_msgOutCheckSelectedDrawable}, null, Theme.key_chat_outSentCheckSelected));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, new Drawable[]{Theme.chat_msgOutCheckReadDrawable, Theme.chat_msgOutHalfCheckDrawable}, null, Theme.key_chat_outSentCheckRead));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, new Drawable[]{Theme.chat_msgOutCheckReadSelectedDrawable, Theme.chat_msgOutHalfCheckSelectedDrawable}, null, Theme.key_chat_outSentCheckReadSelected));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, new Drawable[]{Theme.chat_msgMediaCheckDrawable, Theme.chat_msgMediaHalfCheckDrawable}, null, Theme.key_chat_mediaSentCheck));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, null, null, Theme.key_chat_inReplyLine));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, null, null, Theme.key_chat_outReplyLine));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, null, null, Theme.key_chat_inReplyNameText));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, null, null, Theme.key_chat_outReplyNameText));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, null, null, Theme.key_chat_inReplyMessageText));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, null, null, Theme.key_chat_outReplyMessageText));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, null, null, Theme.key_chat_inReplyMediaMessageSelectedText));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, null, null, Theme.key_chat_outReplyMediaMessageSelectedText));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, null, null, Theme.key_chat_inTimeText));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, null, null, Theme.key_chat_outTimeText));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, null, null, Theme.key_chat_inTimeSelectedText));
        arrayList.add(new ThemeDescription(this.messagesCell, 0, null, null, null, null, Theme.key_chat_outTimeSelectedText));
        return arrayList;
    }

    public final void lambda$checkUrl$8(String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        this.checkReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(createtheme, new ThemeSetUrlActivity$$ExternalSyntheticLambda6(5, this, str), 2);
    }

    public final void lambda$saveTheme$10(TLRPC.TL_theme tL_theme) {
        try {
            this.progressDialog.dismiss();
            this.progressDialog = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        Theme.setThemeUploadInfo(this.themeInfo, this.themeAccent, tL_theme, this.currentAccount, false);
        finishFragment();
    }

    public final void lambda$saveTheme$11(TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            this.progressDialog.dismiss();
            this.progressDialog = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AlertsCreator.processError(this.currentAccount, tL_error, this, updatetheme, new Object[0]);
    }

    public final void lambda$saveTheme$13(int i) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.themeUploadedToServer);
        getNotificationCenter().addObserver(this, NotificationCenter.themeUploadError);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.themeUploadedToServer);
        getNotificationCenter().removeObserver(this, NotificationCenter.themeUploadError);
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && this.creatingNewTheme) {
            this.linkField.requestFocus();
            AndroidUtilities.showKeyboard(this.linkField);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z || this.creatingNewTheme) {
            return;
        }
        this.linkField.requestFocus();
        AndroidUtilities.showKeyboard(this.linkField);
    }

    public final void saveTheme() {
        if (checkUrl(this.linkField.getText().toString(), true) && getParentActivity() != null) {
            if (this.nameField.length() == 0) {
                AlertsCreator.showSimpleAlert(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNameInvalid), null);
                return;
            }
            boolean z = this.creatingNewTheme;
            TLRPC.TL_theme tL_theme = this.info;
            if (z) {
                String str = tL_theme.title;
                AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3, null);
                this.progressDialog = alertDialog;
                alertDialog.setOnCancelListener(new ThemeSetUrlActivity$$ExternalSyntheticLambda5());
                this.progressDialog.show();
                String string = this.nameField.getText().toString();
                tL_theme.title = string;
                Theme.ThemeInfo themeInfo = this.themeInfo;
                themeInfo.name = string;
                themeInfo.info.slug = this.linkField.getText().toString();
                Theme.saveCurrentTheme(themeInfo, true, true, true);
                return;
            }
            String str2 = tL_theme.slug;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = tL_theme.title;
            String str4 = str3 != null ? str3 : "";
            String string2 = this.linkField.getText().toString();
            String string3 = this.nameField.getText().toString();
            if (str2.equals(string2) && str4.equals(string3)) {
                finishFragment();
                return;
            }
            this.progressDialog = new AlertDialog(getParentActivity(), 3, null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.id = tL_theme.id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = string2;
            int i = updatetheme.flags;
            updatetheme.title = string3;
            updatetheme.flags = i | 3;
            int iSendRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatetheme, new ThemeSetUrlActivity$$ExternalSyntheticLambda6(0, this, updatetheme), 2);
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(iSendRequest, this.classGuid);
            this.progressDialog.setOnCancelListener(new ChatEditActivity$$ExternalSyntheticLambda52(this, iSendRequest, 9));
            this.progressDialog.show();
        }
    }

    public final void setCheckText(int i, String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean z = this.creatingNewTheme;
        if (zIsEmpty) {
            this.checkInfoCell.setVisibility(8);
            if (z) {
                this.helpInfoCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(getParentActivity(), R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                return;
            } else {
                this.helpInfoCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(getParentActivity(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                return;
            }
        }
        this.checkInfoCell.setVisibility(0);
        this.checkInfoCell.setText(str);
        this.checkInfoCell.setTag(Integer.valueOf(i));
        this.checkInfoCell.setTextColorByKey(i);
        if (z) {
            this.helpInfoCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(getParentActivity(), R.drawable.greydivider_top, Theme.key_windowBackgroundGrayShadow));
        } else {
            this.helpInfoCell.setBackgroundDrawable(null);
        }
    }
}
