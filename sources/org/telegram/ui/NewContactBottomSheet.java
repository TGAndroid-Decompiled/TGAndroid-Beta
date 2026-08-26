package org.telegram.ui;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.OperationApplicationException;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Vibrator;
import android.provider.ContactsContract;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_language_id_common.zzij;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.ContextProgressView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.OutlineEditText;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.PermissionRequest;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class NewContactBottomSheet extends BottomSheet implements AdapterView.OnItemSelectedListener {
    public static final int $r8$clinit = 0;
    public final CheckBox2 checkBox;
    public final LinearLayout checkLayout;
    public final TextView checkTextView;
    public final int classGuid;
    public final View codeDividerView;
    public final AnonymousClass3 codeField;
    public final HashMap codesMap;
    public final LinearLayout contentLayout;
    public final ArrayList countriesArray;
    public final AnonymousClass1 countryFlag;
    public final TextView doneButton;
    public final FrameLayout doneButtonContainer;
    public boolean donePressed;
    public final ContextProgressView editDoneItemProgress;
    public final OutlineEditText firstNameField;
    public boolean ignoreOnPhoneChange;
    public boolean ignoreOnTextChange;
    public boolean ignoreSelection;
    public String initialFirstName;
    public String initialLastName;
    public String initialPhoneNumber;
    public boolean initialPhoneNumberWithCountryCode;
    public final OutlineEditText lastNameField;
    public String lastPhone;
    public final OutlineEditText notesField;
    public final BaseFragment parentFragment;
    public final AnonymousClass3 phoneField;
    public final HashMap phoneFormatMap;
    public final OutlineTextContainerView phoneOutlineView;
    public final ImageView phoneStatusView;
    public final TextView plusTextView;
    public final RadialProgressView progressView;
    public final ButtonWithCounterView qrButton;
    public final FrameLayout qrButtonContainer;
    public final View qrButtonSeparator;
    public int requestingPhoneId;
    public final LinkSpanDrawable.LinksTextView underPhoneTextView;
    public int wasCountryHintIndex;

    public final class AnonymousClass3 extends AnimatedPhoneNumberEditText {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass3(Object obj, Context context, int i) {
            super(context);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            switch (this.$r8$classId) {
                case 0:
                    super.onFocusChanged(z, i, rect);
                    NewContactBottomSheet newContactBottomSheet = (NewContactBottomSheet) this.this$0;
                    OutlineTextContainerView outlineTextContainerView = newContactBottomSheet.phoneOutlineView;
                    float f = (z || newContactBottomSheet.phoneField.isFocused()) ? 1.0f : 0.0f;
                    outlineTextContainerView.animateSelection(f, f, true);
                    break;
                case 1:
                    super.onFocusChanged(z, i, rect);
                    NewContactBottomSheet newContactBottomSheet2 = (NewContactBottomSheet) this.this$0;
                    OutlineTextContainerView outlineTextContainerView2 = newContactBottomSheet2.phoneOutlineView;
                    float f2 = (z || newContactBottomSheet2.codeField.isFocused()) ? 1.0f : 0.0f;
                    outlineTextContainerView2.animateSelection(f2, f2, true);
                    break;
                default:
                    super.onFocusChanged(z, i, rect);
                    LoginActivity.PhoneView phoneView = (LoginActivity.PhoneView) this.this$0;
                    OutlineTextContainerView outlineTextContainerView3 = phoneView.phoneOutlineView;
                    float f3 = (z || phoneView.phoneField.isFocused()) ? 1.0f : 0.0f;
                    outlineTextContainerView3.animateSelection(f3, f3, true);
                    if (z) {
                        LoginActivity.this.keyboardView.setEditText(this);
                    }
                    break;
            }
        }

        @Override
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            switch (this.$r8$classId) {
                case 1:
                    if (i == 67) {
                        NewContactBottomSheet newContactBottomSheet = (NewContactBottomSheet) this.this$0;
                        if (newContactBottomSheet.phoneField.length() == 0) {
                            newContactBottomSheet.codeField.requestFocus();
                            AnonymousClass3 anonymousClass3 = newContactBottomSheet.codeField;
                            anonymousClass3.setSelection(anonymousClass3.length());
                            newContactBottomSheet.codeField.dispatchKeyEvent(keyEvent);
                        }
                    }
                    return super.onKeyDown(i, keyEvent);
                default:
                    return super.onKeyDown(i, keyEvent);
            }
        }
    }

    public NewContactBottomSheet(Context context, BaseFragment baseFragment) {
        String upperCase;
        String str;
        CountrySelectActivity.Country country;
        super(context, null, true, false);
        final int i = 2;
        final int i2 = 1;
        final int i3 = 0;
        this.countriesArray = new ArrayList();
        this.codesMap = new HashMap();
        this.phoneFormatMap = new HashMap();
        this.requestingPhoneId = -1;
        fixNavigationBar();
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.parentFragment = baseFragment;
        Context context2 = getContext();
        ContextProgressView contextProgressView = new ContextProgressView(context2, 1);
        this.editDoneItemProgress = contextProgressView;
        contextProgressView.setVisibility(4);
        ScrollView scrollView = new ScrollView(context2);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.contentLayout = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.contentLayout.setOrientation(1);
        scrollView.addView(this.contentLayout, LayoutHelper.createScroll(-1, -2, 51));
        this.contentLayout.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(26));
        FrameLayout frameLayout = new FrameLayout(context2);
        this.contentLayout.addView(frameLayout, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        OutlineEditText outlineEditText = new OutlineEditText(context2);
        this.firstNameField = outlineEditText;
        outlineEditText.getEditText().setInputType(49152);
        this.firstNameField.getEditText().setImeOptions(5);
        this.firstNameField.setHint(LocaleController.getString(R.string.FirstName));
        if (this.initialFirstName != null) {
            this.firstNameField.getEditText().setText(this.initialFirstName);
            this.initialFirstName = null;
        }
        frameLayout.addView(this.firstNameField, LayoutHelper.createFrame(-1, 58.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.firstNameField.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final NewContactBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                switch (i3) {
                    case 0:
                        NewContactBottomSheet newContactBottomSheet = this.f$0;
                        if (i4 != 5) {
                            newContactBottomSheet.getClass();
                            return false;
                        }
                        newContactBottomSheet.lastNameField.requestFocus();
                        newContactBottomSheet.lastNameField.getEditText().setSelection(newContactBottomSheet.lastNameField.getEditText().length());
                        return true;
                    case 1:
                        NewContactBottomSheet newContactBottomSheet2 = this.f$0;
                        if (i4 != 5) {
                            newContactBottomSheet2.getClass();
                            return false;
                        }
                        newContactBottomSheet2.codeField.requestFocus();
                        NewContactBottomSheet.AnonymousClass3 anonymousClass3 = newContactBottomSheet2.codeField;
                        anonymousClass3.setSelection(anonymousClass3.length());
                        return true;
                    case 2:
                        NewContactBottomSheet newContactBottomSheet3 = this.f$0;
                        if (i4 != 5) {
                            newContactBottomSheet3.getClass();
                            return false;
                        }
                        newContactBottomSheet3.codeField.requestFocus();
                        NewContactBottomSheet.AnonymousClass3 anonymousClass4 = newContactBottomSheet3.codeField;
                        anonymousClass4.setSelection(anonymousClass4.length());
                        return true;
                    case 3:
                        NewContactBottomSheet newContactBottomSheet4 = this.f$0;
                        if (i4 != 5) {
                            newContactBottomSheet4.getClass();
                            return false;
                        }
                        newContactBottomSheet4.phoneField.requestFocus();
                        NewContactBottomSheet.AnonymousClass3 anonymousClass5 = newContactBottomSheet4.phoneField;
                        anonymousClass5.setSelection(anonymousClass5.length());
                        return true;
                    default:
                        NewContactBottomSheet newContactBottomSheet5 = this.f$0;
                        if (i4 == 5) {
                            newContactBottomSheet5.doneButtonContainer.callOnClick();
                            return true;
                        }
                        newContactBottomSheet5.getClass();
                        return false;
                }
            }
        });
        OutlineEditText outlineEditText2 = new OutlineEditText(context2);
        this.lastNameField = outlineEditText2;
        outlineEditText2.setBackground(null);
        this.lastNameField.getEditText().setInputType(49152);
        this.lastNameField.getEditText().setImeOptions(5);
        this.lastNameField.setHint(LocaleController.getString(R.string.LastName));
        if (this.initialLastName != null) {
            this.lastNameField.getEditText().setText(this.initialLastName);
            this.initialLastName = null;
        }
        frameLayout.addView(this.lastNameField, LayoutHelper.createFrame(-1, 58.0f, 51, 0.0f, 68.0f, 0.0f, 0.0f));
        this.lastNameField.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final NewContactBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                switch (i) {
                    case 0:
                        NewContactBottomSheet newContactBottomSheet = this.f$0;
                        if (i4 != 5) {
                            newContactBottomSheet.getClass();
                            return false;
                        }
                        newContactBottomSheet.lastNameField.requestFocus();
                        newContactBottomSheet.lastNameField.getEditText().setSelection(newContactBottomSheet.lastNameField.getEditText().length());
                        return true;
                    case 1:
                        NewContactBottomSheet newContactBottomSheet2 = this.f$0;
                        if (i4 != 5) {
                            newContactBottomSheet2.getClass();
                            return false;
                        }
                        newContactBottomSheet2.codeField.requestFocus();
                        NewContactBottomSheet.AnonymousClass3 anonymousClass3 = newContactBottomSheet2.codeField;
                        anonymousClass3.setSelection(anonymousClass3.length());
                        return true;
                    case 2:
                        NewContactBottomSheet newContactBottomSheet3 = this.f$0;
                        if (i4 != 5) {
                            newContactBottomSheet3.getClass();
                            return false;
                        }
                        newContactBottomSheet3.codeField.requestFocus();
                        NewContactBottomSheet.AnonymousClass3 anonymousClass4 = newContactBottomSheet3.codeField;
                        anonymousClass4.setSelection(anonymousClass4.length());
                        return true;
                    case 3:
                        NewContactBottomSheet newContactBottomSheet4 = this.f$0;
                        if (i4 != 5) {
                            newContactBottomSheet4.getClass();
                            return false;
                        }
                        newContactBottomSheet4.phoneField.requestFocus();
                        NewContactBottomSheet.AnonymousClass3 anonymousClass5 = newContactBottomSheet4.phoneField;
                        anonymousClass5.setSelection(anonymousClass5.length());
                        return true;
                    default:
                        NewContactBottomSheet newContactBottomSheet5 = this.f$0;
                        if (i4 == 5) {
                            newContactBottomSheet5.doneButtonContainer.callOnClick();
                            return true;
                        }
                        newContactBottomSheet5.getClass();
                        return false;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context2, null);
        this.phoneOutlineView = outlineTextContainerView;
        outlineTextContainerView.addView(linearLayout2, LayoutHelper.createFrame(-1, -2.0f, 16, 4.0f, 8.0f, 16.0f, 8.0f));
        OutlineTextContainerView outlineTextContainerView2 = this.phoneOutlineView;
        int i4 = R.string.PhoneNumber;
        outlineTextContainerView2.setText(LocaleController.getString(i4));
        this.contentLayout.addView(this.phoneOutlineView, LayoutHelper.createLinear(0.0f, 12.0f, 0.0f, 6.0f, -1, 58));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context2, null);
        this.underPhoneTextView = linksTextView;
        linksTextView.setTextSize(1, 12.0f);
        this.underPhoneTextView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
        this.underPhoneTextView.setLinkTextColor(getThemedColor(Theme.key_chat_messageLinkIn));
        this.contentLayout.addView(this.underPhoneTextView, LayoutHelper.createLinear(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context2);
        ?? r5 = new TextView(context2) {
            public final CountrySelectActivity$4$$ExternalSyntheticLambda0 delegate = new CountrySelectActivity$4$$ExternalSyntheticLambda0(1, this);

            @Override
            public final void onAttachedToWindow() {
                super.onAttachedToWindow();
                NotificationCenter.getGlobalInstance().addObserver(this.delegate, NotificationCenter.emojiLoaded);
            }

            @Override
            public final void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                NotificationCenter.getGlobalInstance().removeObserver(this.delegate, NotificationCenter.emojiLoaded);
            }
        };
        this.countryFlag = r5;
        r5.setTextSize(1, 16.0f);
        setFocusable(false);
        setGravity(17);
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final NewContactBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                BaseFragment baseFragment2;
                switch (i) {
                    case 0:
                        NewContactBottomSheet newContactBottomSheet = this.f$0;
                        if (!newContactBottomSheet.donePressed && (baseFragment2 = newContactBottomSheet.parentFragment) != null && baseFragment2.getParentActivity() != null) {
                            if (newContactBottomSheet.firstNameField.getEditText().length() == 0) {
                                Vibrator vibrator = (Vibrator) baseFragment2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(newContactBottomSheet.firstNameField);
                            } else if (newContactBottomSheet.codeField.length() == 0) {
                                Vibrator vibrator2 = (Vibrator) baseFragment2.getParentActivity().getSystemService("vibrator");
                                if (vibrator2 != null) {
                                    vibrator2.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(newContactBottomSheet.codeField);
                            } else if (newContactBottomSheet.phoneField.length() == 0) {
                                Vibrator vibrator3 = (Vibrator) baseFragment2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(newContactBottomSheet.phoneField);
                            } else if (!newContactBottomSheet.checkBox.checkBoxBase.isChecked) {
                                newContactBottomSheet.done();
                            } else {
                                PermissionRequest.ensureEitherPermission(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new PollItemMenu$$ExternalSyntheticLambda14(newContactBottomSheet, 21));
                            }
                            break;
                        }
                        break;
                    case 1:
                        final NewContactBottomSheet newContactBottomSheet2 = this.f$0;
                        newContactBottomSheet2.lambda$showGiftOfferSheet$15();
                        CameraScanActivity.showAsSheet(LaunchActivity.instance, 1, new CameraScanActivity.CameraScanActivityDelegate() {
                            @Override
                            public final void didFindMrzInfo(MrzRecognizer.Result result) {
                            }

                            @Override
                            public final void didFindQr(String str2) {
                                String strExtractUsername = Browser.extractUsername(str2);
                                if (TextUtils.isEmpty(strExtractUsername)) {
                                    AndroidUtilities.runOnUIThread(new QrActivity$5$$ExternalSyntheticLambda1(21));
                                } else {
                                    MessagesController.getInstance(((BottomSheet) NewContactBottomSheet.this).currentAccount).getUserNameResolver().resolve(strExtractUsername, new ChatActivity$$ExternalSyntheticLambda151(10));
                                }
                            }

                            @Override
                            public final String getSubtitleText() {
                                return null;
                            }

                            @Override
                            public final void onDismiss() {
                            }

                            @Override
                            public final boolean processQr(String str2, CameraScanActivity$$ExternalSyntheticLambda0 cameraScanActivity$$ExternalSyntheticLambda0) {
                                return false;
                            }
                        });
                        break;
                    case 2:
                        NewContactBottomSheet newContactBottomSheet3 = this.f$0;
                        newContactBottomSheet3.getClass();
                        CountrySelectActivity countrySelectActivity = new CountrySelectActivity(null, true);
                        countrySelectActivity.delegate = new PollItemMenu.AnonymousClass6(newContactBottomSheet3, 3);
                        newContactBottomSheet3.parentFragment.showAsSheet(countrySelectActivity);
                        break;
                    default:
                        NewContactBottomSheet newContactBottomSheet4 = this.f$0;
                        CheckBoxBase checkBoxBase = newContactBottomSheet4.checkBox.checkBoxBase;
                        checkBoxBase.setChecked(-1, !checkBoxBase.isChecked, true);
                        newContactBottomSheet4.updateQrButtonVisible(true);
                        break;
                }
            }
        });
        int iDp = AndroidUtilities.dp(6.0f);
        int i5 = Theme.key_listSelector;
        int color = Theme.getColor(null, i5, false);
        frameLayout2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, color, color));
        frameLayout2.addView(this.countryFlag, LayoutHelper.createFrame(-1, -2, 16));
        linearLayout2.addView(frameLayout2, LayoutHelper.createLinear(42, -1));
        TextView textView = new TextView(context2);
        this.plusTextView = textView;
        textView.setText("+");
        this.plusTextView.setTextSize(1, 16.0f);
        this.plusTextView.setFocusable(false);
        linearLayout2.addView(this.plusTextView, LayoutHelper.createLinear(-2, -2));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this, context2, i3);
        this.codeField = anonymousClass3;
        int i6 = Theme.key_windowBackgroundWhiteBlackText;
        anonymousClass3.setTextColor(Theme.getColor(null, i6, false));
        this.codeField.setInputType(3);
        this.codeField.setCursorSize(AndroidUtilities.dp(20.0f));
        this.codeField.setCursorWidth(1.5f);
        this.codeField.setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
        this.codeField.setTextSize(1, 16.0f);
        this.codeField.setMaxLines(1);
        this.codeField.setGravity(19);
        this.codeField.setImeOptions(268435461);
        this.codeField.setBackground(null);
        this.codeField.setContentDescription(LocaleController.getString(R.string.LoginAccessibilityCountryCode));
        linearLayout2.addView(this.codeField, LayoutHelper.createLinear(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        this.codeField.addTextChangedListener(new ArticleViewer.AnonymousClass16(this, 27));
        final int i7 = 3;
        this.codeField.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final NewContactBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView2, int i8, KeyEvent keyEvent) {
                switch (i7) {
                    case 0:
                        NewContactBottomSheet newContactBottomSheet = this.f$0;
                        if (i8 != 5) {
                            newContactBottomSheet.getClass();
                            return false;
                        }
                        newContactBottomSheet.lastNameField.requestFocus();
                        newContactBottomSheet.lastNameField.getEditText().setSelection(newContactBottomSheet.lastNameField.getEditText().length());
                        return true;
                    case 1:
                        NewContactBottomSheet newContactBottomSheet2 = this.f$0;
                        if (i8 != 5) {
                            newContactBottomSheet2.getClass();
                            return false;
                        }
                        newContactBottomSheet2.codeField.requestFocus();
                        NewContactBottomSheet.AnonymousClass3 anonymousClass4 = newContactBottomSheet2.codeField;
                        anonymousClass4.setSelection(anonymousClass4.length());
                        return true;
                    case 2:
                        NewContactBottomSheet newContactBottomSheet3 = this.f$0;
                        if (i8 != 5) {
                            newContactBottomSheet3.getClass();
                            return false;
                        }
                        newContactBottomSheet3.codeField.requestFocus();
                        NewContactBottomSheet.AnonymousClass3 anonymousClass5 = newContactBottomSheet3.codeField;
                        anonymousClass5.setSelection(anonymousClass5.length());
                        return true;
                    case 3:
                        NewContactBottomSheet newContactBottomSheet4 = this.f$0;
                        if (i8 != 5) {
                            newContactBottomSheet4.getClass();
                            return false;
                        }
                        newContactBottomSheet4.phoneField.requestFocus();
                        NewContactBottomSheet.AnonymousClass3 anonymousClass6 = newContactBottomSheet4.phoneField;
                        anonymousClass6.setSelection(anonymousClass6.length());
                        return true;
                    default:
                        NewContactBottomSheet newContactBottomSheet5 = this.f$0;
                        if (i8 == 5) {
                            newContactBottomSheet5.doneButtonContainer.callOnClick();
                            return true;
                        }
                        newContactBottomSheet5.getClass();
                        return false;
                }
            }
        });
        this.codeDividerView = new View(context2);
        LinearLayout.LayoutParams layoutParamsCreateLinear = LayoutHelper.createLinear(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        layoutParamsCreateLinear.width = Math.max(2, AndroidUtilities.dp(0.5f));
        linearLayout2.addView(this.codeDividerView, layoutParamsCreateLinear);
        AnonymousClass3 anonymousClass4 = new AnonymousClass3(this, context2, i2);
        this.phoneField = anonymousClass4;
        anonymousClass4.setTextColor(Theme.getColor(null, i6, false));
        this.phoneField.setInputType(3);
        this.phoneField.setPadding(0, 0, 0, 0);
        this.phoneField.setCursorSize(AndroidUtilities.dp(20.0f));
        this.phoneField.setCursorWidth(1.5f);
        this.phoneField.setTextSize(1, 16.0f);
        this.phoneField.setMaxLines(1);
        this.phoneField.setGravity(19);
        this.phoneField.setImeOptions(268435461);
        this.phoneField.setBackground(null);
        this.phoneField.setContentDescription(LocaleController.getString(i4));
        linearLayout2.addView(this.phoneField, LayoutHelper.createLinear(-1, 36));
        this.phoneField.addTextChangedListener(new PassportActivity.AnonymousClass10(this, 3));
        final int i8 = 4;
        this.phoneField.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final NewContactBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView2, int i9, KeyEvent keyEvent) {
                switch (i8) {
                    case 0:
                        NewContactBottomSheet newContactBottomSheet = this.f$0;
                        if (i9 != 5) {
                            newContactBottomSheet.getClass();
                            return false;
                        }
                        newContactBottomSheet.lastNameField.requestFocus();
                        newContactBottomSheet.lastNameField.getEditText().setSelection(newContactBottomSheet.lastNameField.getEditText().length());
                        return true;
                    case 1:
                        NewContactBottomSheet newContactBottomSheet2 = this.f$0;
                        if (i9 != 5) {
                            newContactBottomSheet2.getClass();
                            return false;
                        }
                        newContactBottomSheet2.codeField.requestFocus();
                        NewContactBottomSheet.AnonymousClass3 anonymousClass5 = newContactBottomSheet2.codeField;
                        anonymousClass5.setSelection(anonymousClass5.length());
                        return true;
                    case 2:
                        NewContactBottomSheet newContactBottomSheet3 = this.f$0;
                        if (i9 != 5) {
                            newContactBottomSheet3.getClass();
                            return false;
                        }
                        newContactBottomSheet3.codeField.requestFocus();
                        NewContactBottomSheet.AnonymousClass3 anonymousClass6 = newContactBottomSheet3.codeField;
                        anonymousClass6.setSelection(anonymousClass6.length());
                        return true;
                    case 3:
                        NewContactBottomSheet newContactBottomSheet4 = this.f$0;
                        if (i9 != 5) {
                            newContactBottomSheet4.getClass();
                            return false;
                        }
                        newContactBottomSheet4.phoneField.requestFocus();
                        NewContactBottomSheet.AnonymousClass3 anonymousClass7 = newContactBottomSheet4.phoneField;
                        anonymousClass7.setSelection(anonymousClass7.length());
                        return true;
                    default:
                        NewContactBottomSheet newContactBottomSheet5 = this.f$0;
                        if (i9 == 5) {
                            newContactBottomSheet5.doneButtonContainer.callOnClick();
                            return true;
                        }
                        newContactBottomSheet5.getClass();
                        return false;
                }
            }
        });
        ImageView imageView = new ImageView(context2);
        this.phoneStatusView = imageView;
        imageView.setScaleX(0.5f);
        this.phoneStatusView.setScaleY(0.5f);
        this.phoneStatusView.setAlpha(0.0f);
        this.phoneOutlineView.addView(this.phoneStatusView, LayoutHelper.createFrame(24, 24.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        CheckBox2 checkBox2 = new CheckBox2(context2, 21, this.resourcesProvider);
        this.checkBox = checkBox2;
        checkBox2.checkBoxBase.setColor(Theme.key_radioBackgroundChecked, Theme.key_checkboxDisabled, Theme.key_checkboxCheck);
        this.checkBox.setDrawUnchecked(true);
        this.checkBox.checkBoxBase.setChecked(-1, false, false);
        this.checkBox.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context2);
        this.checkTextView = textView2;
        textView2.setTextColor(Theme.getColor(i6, this.resourcesProvider));
        this.checkTextView.setTextSize(1, 14.0f);
        this.checkTextView.setText(LocaleController.getString(R.string.AddContactSync));
        LinearLayout linearLayout3 = new LinearLayout(context2);
        this.checkLayout = linearLayout3;
        linearLayout3.setOrientation(0);
        this.checkLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        this.checkLayout.addView(this.checkBox, LayoutHelper.createLinear(21, 21, 16, 0, 0, 9, 0));
        this.checkLayout.addView(this.checkTextView, LayoutHelper.createLinear(-2, -2, 16));
        final int i9 = 3;
        this.checkLayout.setOnClickListener(new View.OnClickListener(this) {
            public final NewContactBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                BaseFragment baseFragment2;
                switch (i9) {
                    case 0:
                        NewContactBottomSheet newContactBottomSheet = this.f$0;
                        if (!newContactBottomSheet.donePressed && (baseFragment2 = newContactBottomSheet.parentFragment) != null && baseFragment2.getParentActivity() != null) {
                            if (newContactBottomSheet.firstNameField.getEditText().length() == 0) {
                                Vibrator vibrator = (Vibrator) baseFragment2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(newContactBottomSheet.firstNameField);
                            } else if (newContactBottomSheet.codeField.length() == 0) {
                                Vibrator vibrator2 = (Vibrator) baseFragment2.getParentActivity().getSystemService("vibrator");
                                if (vibrator2 != null) {
                                    vibrator2.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(newContactBottomSheet.codeField);
                            } else if (newContactBottomSheet.phoneField.length() == 0) {
                                Vibrator vibrator3 = (Vibrator) baseFragment2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(newContactBottomSheet.phoneField);
                            } else if (!newContactBottomSheet.checkBox.checkBoxBase.isChecked) {
                                newContactBottomSheet.done();
                            } else {
                                PermissionRequest.ensureEitherPermission(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new PollItemMenu$$ExternalSyntheticLambda14(newContactBottomSheet, 21));
                            }
                            break;
                        }
                        break;
                    case 1:
                        final NewContactBottomSheet newContactBottomSheet2 = this.f$0;
                        newContactBottomSheet2.lambda$showGiftOfferSheet$15();
                        CameraScanActivity.showAsSheet(LaunchActivity.instance, 1, new CameraScanActivity.CameraScanActivityDelegate() {
                            @Override
                            public final void didFindMrzInfo(MrzRecognizer.Result result) {
                            }

                            @Override
                            public final void didFindQr(String str2) {
                                String strExtractUsername = Browser.extractUsername(str2);
                                if (TextUtils.isEmpty(strExtractUsername)) {
                                    AndroidUtilities.runOnUIThread(new QrActivity$5$$ExternalSyntheticLambda1(21));
                                } else {
                                    MessagesController.getInstance(((BottomSheet) NewContactBottomSheet.this).currentAccount).getUserNameResolver().resolve(strExtractUsername, new ChatActivity$$ExternalSyntheticLambda151(10));
                                }
                            }

                            @Override
                            public final String getSubtitleText() {
                                return null;
                            }

                            @Override
                            public final void onDismiss() {
                            }

                            @Override
                            public final boolean processQr(String str2, CameraScanActivity$$ExternalSyntheticLambda0 cameraScanActivity$$ExternalSyntheticLambda0) {
                                return false;
                            }
                        });
                        break;
                    case 2:
                        NewContactBottomSheet newContactBottomSheet3 = this.f$0;
                        newContactBottomSheet3.getClass();
                        CountrySelectActivity countrySelectActivity = new CountrySelectActivity(null, true);
                        countrySelectActivity.delegate = new PollItemMenu.AnonymousClass6(newContactBottomSheet3, 3);
                        newContactBottomSheet3.parentFragment.showAsSheet(countrySelectActivity);
                        break;
                    default:
                        NewContactBottomSheet newContactBottomSheet4 = this.f$0;
                        CheckBoxBase checkBoxBase = newContactBottomSheet4.checkBox.checkBoxBase;
                        checkBoxBase.setChecked(-1, !checkBoxBase.isChecked, true);
                        newContactBottomSheet4.updateQrButtonVisible(true);
                        break;
                }
            }
        });
        this.checkLayout.setTranslationY(AndroidUtilities.dp(-21.33f));
        this.checkLayout.setPivotX(0.0f);
        ScaleStateListAnimator.apply(this.checkLayout, 0.0125f, 1.2f);
        this.checkLayout.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(i5, this.resourcesProvider), 6, 6));
        this.contentLayout.addView(this.checkLayout, LayoutHelper.createLinear(0.0f, 5.0f, 0.0f, 0.0f, -2, -2));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.qrButtonContainer = frameLayout3;
        frameLayout3.setTranslationY(AndroidUtilities.dp(-10.665f));
        this.contentLayout.addView(this.qrButtonContainer, LayoutHelper.createLinear(0.0f, 6.0f, 0.0f, -6.0f, -1, -2));
        View view = new View(context2);
        this.qrButtonSeparator = view;
        view.setBackgroundColor(Theme.getColor(Theme.key_divider, this.resourcesProvider));
        this.qrButtonContainer.addView(this.qrButtonSeparator, LayoutHelper.createFrame(-1, 1.0f / AndroidUtilities.density, 48, 0.0f, 6.0f, 0.0f, 0.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context2, this.resourcesProvider, false);
        this.qrButton = buttonWithCounterView;
        buttonWithCounterView.setRoundRadius(24);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("QR");
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.header_qr_24), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AddContactQr));
        this.qrButton.setText(spannableStringBuilder, false, true);
        this.qrButton.setOnClickListener(new View.OnClickListener(this) {
            public final NewContactBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                BaseFragment baseFragment2;
                switch (i2) {
                    case 0:
                        NewContactBottomSheet newContactBottomSheet = this.f$0;
                        if (!newContactBottomSheet.donePressed && (baseFragment2 = newContactBottomSheet.parentFragment) != null && baseFragment2.getParentActivity() != null) {
                            if (newContactBottomSheet.firstNameField.getEditText().length() == 0) {
                                Vibrator vibrator = (Vibrator) baseFragment2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(newContactBottomSheet.firstNameField);
                            } else if (newContactBottomSheet.codeField.length() == 0) {
                                Vibrator vibrator2 = (Vibrator) baseFragment2.getParentActivity().getSystemService("vibrator");
                                if (vibrator2 != null) {
                                    vibrator2.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(newContactBottomSheet.codeField);
                            } else if (newContactBottomSheet.phoneField.length() == 0) {
                                Vibrator vibrator3 = (Vibrator) baseFragment2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(newContactBottomSheet.phoneField);
                            } else if (!newContactBottomSheet.checkBox.checkBoxBase.isChecked) {
                                newContactBottomSheet.done();
                            } else {
                                PermissionRequest.ensureEitherPermission(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new PollItemMenu$$ExternalSyntheticLambda14(newContactBottomSheet, 21));
                            }
                            break;
                        }
                        break;
                    case 1:
                        final NewContactBottomSheet newContactBottomSheet2 = this.f$0;
                        newContactBottomSheet2.lambda$showGiftOfferSheet$15();
                        CameraScanActivity.showAsSheet(LaunchActivity.instance, 1, new CameraScanActivity.CameraScanActivityDelegate() {
                            @Override
                            public final void didFindMrzInfo(MrzRecognizer.Result result) {
                            }

                            @Override
                            public final void didFindQr(String str2) {
                                String strExtractUsername = Browser.extractUsername(str2);
                                if (TextUtils.isEmpty(strExtractUsername)) {
                                    AndroidUtilities.runOnUIThread(new QrActivity$5$$ExternalSyntheticLambda1(21));
                                } else {
                                    MessagesController.getInstance(((BottomSheet) NewContactBottomSheet.this).currentAccount).getUserNameResolver().resolve(strExtractUsername, new ChatActivity$$ExternalSyntheticLambda151(10));
                                }
                            }

                            @Override
                            public final String getSubtitleText() {
                                return null;
                            }

                            @Override
                            public final void onDismiss() {
                            }

                            @Override
                            public final boolean processQr(String str2, CameraScanActivity$$ExternalSyntheticLambda0 cameraScanActivity$$ExternalSyntheticLambda0) {
                                return false;
                            }
                        });
                        break;
                    case 2:
                        NewContactBottomSheet newContactBottomSheet3 = this.f$0;
                        newContactBottomSheet3.getClass();
                        CountrySelectActivity countrySelectActivity = new CountrySelectActivity(null, true);
                        countrySelectActivity.delegate = new PollItemMenu.AnonymousClass6(newContactBottomSheet3, 3);
                        newContactBottomSheet3.parentFragment.showAsSheet(countrySelectActivity);
                        break;
                    default:
                        NewContactBottomSheet newContactBottomSheet4 = this.f$0;
                        CheckBoxBase checkBoxBase = newContactBottomSheet4.checkBox.checkBoxBase;
                        checkBoxBase.setChecked(-1, !checkBoxBase.isChecked, true);
                        newContactBottomSheet4.updateQrButtonVisible(true);
                        break;
                }
            }
        });
        this.qrButtonContainer.addView(this.qrButton, LayoutHelper.createFrame(-1, 48.0f, 48, 0.0f, 12.0f, 0.0f, 0.0f));
        OutlineEditText outlineEditText3 = new OutlineEditText(context2);
        this.notesField = outlineEditText3;
        outlineEditText3.setBackground(null);
        this.notesField.getEditText().setInputType(49152);
        this.notesField.getEditText().setImeOptions(5);
        this.notesField.setHint("Notes");
        this.qrButtonContainer.addView(this.notesField, LayoutHelper.createFrame(-1, 58.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        this.notesField.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final NewContactBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i10, KeyEvent keyEvent) {
                switch (i2) {
                    case 0:
                        NewContactBottomSheet newContactBottomSheet = this.f$0;
                        if (i10 != 5) {
                            newContactBottomSheet.getClass();
                            return false;
                        }
                        newContactBottomSheet.lastNameField.requestFocus();
                        newContactBottomSheet.lastNameField.getEditText().setSelection(newContactBottomSheet.lastNameField.getEditText().length());
                        return true;
                    case 1:
                        NewContactBottomSheet newContactBottomSheet2 = this.f$0;
                        if (i10 != 5) {
                            newContactBottomSheet2.getClass();
                            return false;
                        }
                        newContactBottomSheet2.codeField.requestFocus();
                        NewContactBottomSheet.AnonymousClass3 anonymousClass5 = newContactBottomSheet2.codeField;
                        anonymousClass5.setSelection(anonymousClass5.length());
                        return true;
                    case 2:
                        NewContactBottomSheet newContactBottomSheet3 = this.f$0;
                        if (i10 != 5) {
                            newContactBottomSheet3.getClass();
                            return false;
                        }
                        newContactBottomSheet3.codeField.requestFocus();
                        NewContactBottomSheet.AnonymousClass3 anonymousClass6 = newContactBottomSheet3.codeField;
                        anonymousClass6.setSelection(anonymousClass6.length());
                        return true;
                    case 3:
                        NewContactBottomSheet newContactBottomSheet4 = this.f$0;
                        if (i10 != 5) {
                            newContactBottomSheet4.getClass();
                            return false;
                        }
                        newContactBottomSheet4.phoneField.requestFocus();
                        NewContactBottomSheet.AnonymousClass3 anonymousClass7 = newContactBottomSheet4.phoneField;
                        anonymousClass7.setSelection(anonymousClass7.length());
                        return true;
                    default:
                        NewContactBottomSheet newContactBottomSheet5 = this.f$0;
                        if (i10 == 5) {
                            newContactBottomSheet5.doneButtonContainer.callOnClick();
                            return true;
                        }
                        newContactBottomSheet5.getClass();
                        return false;
                }
            }
        });
        updateQrButtonVisible(false);
        HashMap map = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ApplicationLoader.applicationContext.getResources().getAssets().open("countries.txt")));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] strArrSplit = line.split(";");
                CountrySelectActivity.Country country2 = new CountrySelectActivity.Country();
                country2.name = strArrSplit[2];
                country2.code = strArrSplit[0];
                country2.shortname = strArrSplit[1];
                this.countriesArray.add(0, country2);
                List list = (List) this.codesMap.get(strArrSplit[0]);
                if (list == null) {
                    HashMap map2 = this.codesMap;
                    String str2 = strArrSplit[0];
                    ArrayList arrayList = new ArrayList();
                    map2.put(str2, arrayList);
                    list = arrayList;
                }
                list.add(country2);
                if (strArrSplit.length > 3) {
                    this.phoneFormatMap.put(strArrSplit[0], Collections.singletonList(strArrSplit[3]));
                }
                map.put(strArrSplit[1], strArrSplit[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        Collections.sort(this.countriesArray, Comparator$CC.comparing(new GroupCallSheet$$ExternalSyntheticLambda3(7)));
        if (TextUtils.isEmpty(this.initialPhoneNumber)) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
                upperCase = telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase() : null;
            } catch (Exception e2) {
                FileLog.e(e2);
            }
            if (upperCase != null && (str = (String) map.get(upperCase)) != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= this.countriesArray.size()) {
                        country = null;
                        break;
                    } else {
                        if (Objects.equals(((CountrySelectActivity.Country) this.countriesArray.get(i10)).name, str)) {
                            country = (CountrySelectActivity.Country) this.countriesArray.get(i10);
                            break;
                        }
                        i10++;
                    }
                }
                if (country != null) {
                    this.codeField.setText(country.code);
                }
            }
            if (this.codeField.length() == 0) {
                this.phoneField.setHintText((String) null);
            }
        } else {
            TLRPC.User currentUser = this.parentFragment.getUserConfig().getCurrentUser();
            if (this.initialPhoneNumber.startsWith("+")) {
                this.codeField.setText(this.initialPhoneNumber.substring(1));
            } else if (this.initialPhoneNumberWithCountryCode || currentUser == null || TextUtils.isEmpty(currentUser.phone)) {
                this.codeField.setText(this.initialPhoneNumber);
            } else {
                String str3 = currentUser.phone;
                while (i8 >= 1) {
                    String strSubstring = str3.substring(0, i8);
                    if (((List) this.codesMap.get(strSubstring)) != null) {
                        this.codeField.setText(strSubstring);
                        break;
                    }
                    i8--;
                }
                this.phoneField.setText(this.initialPhoneNumber);
            }
            this.initialPhoneNumber = null;
        }
        this.doneButtonContainer = new FrameLayout(getContext());
        TextView textView3 = new TextView(context2);
        this.doneButton = textView3;
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        this.doneButton.setGravity(17);
        this.doneButton.setLines(1);
        this.doneButton.setSingleLine(true);
        this.doneButton.setText(LocaleController.getString(R.string.CreateContact));
        TextView textView4 = this.doneButton;
        BaseFragment baseFragment2 = this.parentFragment;
        int i11 = Theme.key_featuredStickers_buttonText;
        textView4.setTextColor(baseFragment2.getThemedColor(i11));
        this.doneButton.setTextSize(1, 15.0f);
        this.doneButton.setTypeface(AndroidUtilities.bold());
        ScaleStateListAnimator.apply(this.doneButtonContainer, 0.02f, 1.2f);
        RadialProgressView radialProgressView = new RadialProgressView(context2, null);
        this.progressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(20.0f));
        this.progressView.setProgressColor(this.parentFragment.getThemedColor(i11));
        this.doneButtonContainer.addView(this.doneButton, LayoutHelper.createFrame(-1.0f, -1));
        this.doneButtonContainer.addView(this.progressView, LayoutHelper.createFrame(40, 40, 17));
        this.contentLayout.addView(this.doneButtonContainer, LayoutHelper.createLinear(-1, 48, 0, 0, 8, 0, 4));
        AndroidUtilities.updateViewVisibilityAnimated(this.doneButton, true, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(this.progressView, false, 1.0f, false);
        FrameLayout frameLayout4 = this.doneButtonContainer;
        int themedColor = this.parentFragment.getThemedColor(Theme.key_featuredStickers_addButton);
        frameLayout4.setBackground(Theme.AdaptiveRipple.createRect(new float[]{24.0f}, themedColor, Theme.AdaptiveRipple.calcRippleColor(themedColor)));
        this.doneButtonContainer.setOnClickListener(new View.OnClickListener(this) {
            public final NewContactBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                BaseFragment baseFragment3;
                switch (i3) {
                    case 0:
                        NewContactBottomSheet newContactBottomSheet = this.f$0;
                        if (!newContactBottomSheet.donePressed && (baseFragment3 = newContactBottomSheet.parentFragment) != null && baseFragment3.getParentActivity() != null) {
                            if (newContactBottomSheet.firstNameField.getEditText().length() == 0) {
                                Vibrator vibrator = (Vibrator) baseFragment3.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(newContactBottomSheet.firstNameField);
                            } else if (newContactBottomSheet.codeField.length() == 0) {
                                Vibrator vibrator2 = (Vibrator) baseFragment3.getParentActivity().getSystemService("vibrator");
                                if (vibrator2 != null) {
                                    vibrator2.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(newContactBottomSheet.codeField);
                            } else if (newContactBottomSheet.phoneField.length() == 0) {
                                Vibrator vibrator3 = (Vibrator) baseFragment3.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(newContactBottomSheet.phoneField);
                            } else if (!newContactBottomSheet.checkBox.checkBoxBase.isChecked) {
                                newContactBottomSheet.done();
                            } else {
                                PermissionRequest.ensureEitherPermission(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new PollItemMenu$$ExternalSyntheticLambda14(newContactBottomSheet, 21));
                            }
                            break;
                        }
                        break;
                    case 1:
                        final NewContactBottomSheet newContactBottomSheet2 = this.f$0;
                        newContactBottomSheet2.lambda$showGiftOfferSheet$15();
                        CameraScanActivity.showAsSheet(LaunchActivity.instance, 1, new CameraScanActivity.CameraScanActivityDelegate() {
                            @Override
                            public final void didFindMrzInfo(MrzRecognizer.Result result) {
                            }

                            @Override
                            public final void didFindQr(String str4) {
                                String strExtractUsername = Browser.extractUsername(str4);
                                if (TextUtils.isEmpty(strExtractUsername)) {
                                    AndroidUtilities.runOnUIThread(new QrActivity$5$$ExternalSyntheticLambda1(21));
                                } else {
                                    MessagesController.getInstance(((BottomSheet) NewContactBottomSheet.this).currentAccount).getUserNameResolver().resolve(strExtractUsername, new ChatActivity$$ExternalSyntheticLambda151(10));
                                }
                            }

                            @Override
                            public final String getSubtitleText() {
                                return null;
                            }

                            @Override
                            public final void onDismiss() {
                            }

                            @Override
                            public final boolean processQr(String str4, CameraScanActivity$$ExternalSyntheticLambda0 cameraScanActivity$$ExternalSyntheticLambda0) {
                                return false;
                            }
                        });
                        break;
                    case 2:
                        NewContactBottomSheet newContactBottomSheet3 = this.f$0;
                        newContactBottomSheet3.getClass();
                        CountrySelectActivity countrySelectActivity = new CountrySelectActivity(null, true);
                        countrySelectActivity.delegate = new PollItemMenu.AnonymousClass6(newContactBottomSheet3, 3);
                        newContactBottomSheet3.parentFragment.showAsSheet(countrySelectActivity);
                        break;
                    default:
                        NewContactBottomSheet newContactBottomSheet4 = this.f$0;
                        CheckBoxBase checkBoxBase = newContactBottomSheet4.checkBox.checkBoxBase;
                        checkBoxBase.setChecked(-1, !checkBoxBase.isChecked, true);
                        newContactBottomSheet4.updateQrButtonVisible(true);
                        break;
                }
            }
        });
        this.plusTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        this.codeDividerView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteInputField, false));
        setCustomView(scrollView);
        setTitle(LocaleController.getString(R.string.NewContactTitle), true);
    }

    public static void access$900(NewContactBottomSheet newContactBottomSheet) {
        String strReplaceAll = (newContactBottomSheet.codeField.getText().toString() + newContactBottomSheet.phoneField.getText().toString()).replaceAll("[^\\d]+", "");
        boolean z = false;
        for (int iMin = Math.min(3, strReplaceAll.length()); iMin >= 0; iMin--) {
            String strSubstring = strReplaceAll.substring(0, iMin);
            List list = (List) newContactBottomSheet.codesMap.get(strSubstring);
            if (list == null || list.isEmpty()) {
                if (z) {
                    break;
                }
            } else {
                List list2 = (List) newContactBottomSheet.phoneFormatMap.get(strSubstring);
                if (list2 != null && !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (strReplaceAll.length() - iMin >= ((String) it.next()).replace(" ", "").length()) {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        break;
                        break;
                    }
                }
            }
        }
        if (z) {
            if (TextUtils.equals(newContactBottomSheet.lastPhone, strReplaceAll)) {
                return;
            }
            newContactBottomSheet.lastPhone = strReplaceAll;
            newContactBottomSheet.updatedPhone(strReplaceAll);
            return;
        }
        if (TextUtils.isEmpty(newContactBottomSheet.lastPhone)) {
            return;
        }
        newContactBottomSheet.lastPhone = null;
        newContactBottomSheet.updatedPhone(null);
    }

    public static String getPhoneNumber(LaunchActivity launchActivity, TLRPC.User user, String str) {
        HashMap map = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(launchActivity.getResources().getAssets().open("countries.txt")));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] strArrSplit = line.split(";");
                map.put(strArrSplit[0], strArrSplit[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (!str.startsWith("+")) {
            if (user == null || TextUtils.isEmpty(user.phone)) {
                return "+".concat(str);
            }
            String str2 = user.phone;
            for (int i = 4; i >= 1; i--) {
                String strSubstring = str2.substring(0, i);
                if (((String) map.get(strSubstring)) != null) {
                    return zzij.m("+", strSubstring, str);
                }
            }
        }
        return str;
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        super.lambda$showGiftOfferSheet$15();
        AndroidUtilities.runOnUIThread(new NewContactBottomSheet$$ExternalSyntheticLambda0(this, 0), 50L);
    }

    public final void done() {
        this.donePressed = true;
        AndroidUtilities.updateViewVisibilityAnimated(this.doneButton, false, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.progressView, true, 0.5f, true);
        String str = "+" + this.codeField.getText().toString() + this.phoneField.getText().toString();
        String string = this.firstNameField.getEditText().getText().toString();
        String string2 = this.lastNameField.getEditText().getText().toString();
        String string3 = this.notesField.getVisibility() == 0 ? this.notesField.getEditText().getText().toString() : "";
        TLRPC.TL_contacts_importContacts tL_contacts_importContacts = new TLRPC.TL_contacts_importContacts();
        TLRPC.TL_inputPhoneContact tL_inputPhoneContact = new TLRPC.TL_inputPhoneContact();
        tL_inputPhoneContact.first_name = string;
        tL_inputPhoneContact.last_name = string2;
        tL_inputPhoneContact.phone = str;
        if (!TextUtils.isEmpty(string3)) {
            tL_inputPhoneContact.flags = 1 | tL_inputPhoneContact.flags;
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_inputPhoneContact.note = tL_textWithEntities;
            tL_textWithEntities.text = string3;
        }
        tL_contacts_importContacts.contacts.add(tL_inputPhoneContact);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_importContacts, new LinkManager$$ExternalSyntheticLambda0(this, tL_inputPhoneContact, tL_contacts_importContacts, 15), 2), this.classGuid);
        if (this.checkBox.checkBoxBase.isChecked) {
            Context context = getContext();
            ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
            ContentProviderOperation.Builder builderNewInsert = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
            builderNewInsert.withValue("account_type", null);
            builderNewInsert.withValue("account_name", null);
            arrayList.add(builderNewInsert.build());
            Uri uri = ContactsContract.Data.CONTENT_URI;
            ContentProviderOperation.Builder builderWithValue = ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name");
            if (!TextUtils.isEmpty(string)) {
                builderWithValue = builderWithValue.withValue("data2", string);
            }
            if (!TextUtils.isEmpty(string2)) {
                builderWithValue = builderWithValue.withValue("data2", string2);
            }
            arrayList.add(builderWithValue.build());
            if (str != null && !str.isEmpty()) {
                arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", str).withValue("data2", 2).build());
            }
            try {
                context.getContentResolver().applyBatch("com.android.contacts", arrayList);
            } catch (OperationApplicationException | RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        OutlineEditText outlineEditText = this.firstNameField;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(outlineEditText, 4, null, null, null, null, i));
        OutlineEditText outlineEditText2 = this.firstNameField;
        int i2 = Theme.key_windowBackgroundWhiteHintText;
        arrayList.add(new ThemeDescription(outlineEditText2, 8388608, null, null, null, null, i2));
        OutlineEditText outlineEditText3 = this.firstNameField;
        int i3 = Theme.key_windowBackgroundWhiteInputField;
        arrayList.add(new ThemeDescription(outlineEditText3, 32, null, null, null, null, i3));
        OutlineEditText outlineEditText4 = this.firstNameField;
        int i4 = Theme.key_windowBackgroundWhiteInputFieldActivated;
        arrayList.add(new ThemeDescription(outlineEditText4, 65568, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.lastNameField, 4, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.lastNameField, 8388608, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.lastNameField, 32, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.lastNameField, 65568, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.codeField, 4, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.codeField, 32, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.codeField, 65568, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.phoneField, 4, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.phoneField, 8388608, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.phoneField, 32, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.phoneField, 65568, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.editDoneItemProgress, 0, null, null, null, null, Theme.key_contextProgressInner2));
        arrayList.add(new ThemeDescription(this.editDoneItemProgress, 0, null, null, null, null, Theme.key_contextProgressOuter2));
        return arrayList;
    }

    public final void lambda$done$22(TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        this.donePressed = false;
        BaseFragment baseFragment = this.parentFragment;
        if (tL_contacts_importedContacts == null) {
            AndroidUtilities.updateViewVisibilityAnimated(this.doneButton, true, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(this.progressView, false, 0.5f, true);
            AlertsCreator.processError(this.currentAccount, tL_error, baseFragment, tL_contacts_importContacts, new Object[0]);
        } else if (!tL_contacts_importedContacts.users.isEmpty()) {
            MessagesController.getInstance(this.currentAccount).putUsers(tL_contacts_importedContacts.users, false);
            MessagesController.getInstance(this.currentAccount).openChatOrProfileWith(tL_contacts_importedContacts.users.get(0), null, this.parentFragment, 1, false);
            lambda$showGiftOfferSheet$15();
        } else {
            if (baseFragment.getParentActivity() == null) {
                return;
            }
            AndroidUtilities.updateViewVisibilityAnimated(this.doneButton, true, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(this.progressView, false, 0.5f, true);
            AlertsCreator.createContactInviteDialog(baseFragment, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
        }
    }

    public final void lambda$updatedPhone$18(TLRPC.TL_contact tL_contact, OAuthSheet$$ExternalSyntheticLambda13 oAuthSheet$$ExternalSyntheticLambda13) {
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda2(23, oAuthSheet$$ExternalSyntheticLambda13, MessagesStorage.getInstance(this.currentAccount).getUser(tL_contact.user_id)));
    }

    public final void lambda$updatedPhone$19(TLObject tLObject, OAuthSheet$$ExternalSyntheticLambda13 oAuthSheet$$ExternalSyntheticLambda13) {
        TLRPC.User user;
        if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
            long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
            if (peerDialogId >= 0) {
                user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
            } else {
                user = null;
            }
        } else {
            user = null;
        }
        oAuthSheet$$ExternalSyntheticLambda13.run(user);
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (this.ignoreSelection) {
            this.ignoreSelection = false;
            return;
        }
        this.ignoreOnTextChange = true;
        this.codeField.setText(((CountrySelectActivity.Country) this.countriesArray.get(i)).code);
        this.ignoreOnTextChange = false;
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void setCountryButtonText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = animate();
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            viewPropertyAnimatorAnimate.setInterpolator(cubicBezierInterpolator).translationY(AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.plusTextView.animate().setInterpolator(cubicBezierInterpolator).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.codeField.animate().setInterpolator(cubicBezierInterpolator).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            return;
        }
        animate().setInterpolator(AndroidUtilities.overshootInterpolator).translationY(0.0f).setDuration(350L).start();
        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = this.plusTextView.animate();
        CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.DEFAULT;
        viewPropertyAnimatorAnimate2.setInterpolator(cubicBezierInterpolator2).translationX(0.0f).setDuration(150L);
        this.codeField.animate().setInterpolator(cubicBezierInterpolator2).translationX(0.0f).setDuration(150L);
        setText(charSequence);
    }

    public final void setCountryHint$1(String str, CountrySelectActivity.Country country) {
        int i;
        int i2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(country.shortname);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag);
        }
        setCountryButtonText(Emoji.replaceEmoji(spannableStringBuilder, getPaint().getFontMetricsInt(), false));
        this.wasCountryHintIndex = -1;
        String strReplace = this.phoneField.getText() != null ? this.phoneField.getText().toString().replace(" ", "") : "";
        HashMap map = this.phoneFormatMap;
        if (map.get(str) == null || ((List) map.get(str)).isEmpty()) {
            if (this.wasCountryHintIndex != -1) {
                int selectionStart = this.phoneField.getSelectionStart();
                int selectionEnd = this.phoneField.getSelectionEnd();
                this.phoneField.setHintText((String) null);
                this.phoneField.setSelection(selectionStart, selectionEnd);
                this.wasCountryHintIndex = -1;
                return;
            }
            return;
        }
        List list = (List) map.get(str);
        if (strReplace.isEmpty()) {
            i = -1;
            break;
        }
        i = 0;
        while (true) {
            if (i >= list.size()) {
                i = -1;
                break;
            } else if (strReplace.startsWith(((String) list.get(i)).replace(" ", "").replace("X", "").replace("0", ""))) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                String str2 = (String) list.get(i3);
                if (str2.startsWith("X") || str2.startsWith("0")) {
                    i = i3;
                    break;
                }
            }
            i2 = i != -1 ? i : 0;
        }
        if (this.wasCountryHintIndex != i2) {
            String str3 = (String) ((List) map.get(str)).get(i2);
            int selectionStart2 = this.phoneField.getSelectionStart();
            int selectionEnd2 = this.phoneField.getSelectionEnd();
            this.phoneField.setHintText(str3 != null ? str3.replace('X', '0') : null);
            this.phoneField.setSelection(selectionStart2, selectionEnd2);
            this.wasCountryHintIndex = i2;
        }
    }

    public final void setInitialPhoneNumber(String str, boolean z) {
        this.initialPhoneNumber = str;
        this.initialPhoneNumberWithCountryCode = z;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (this.initialPhoneNumber.startsWith("+")) {
            this.codeField.setText(this.initialPhoneNumber.substring(1));
        } else if (this.initialPhoneNumberWithCountryCode || currentUser == null || TextUtils.isEmpty(currentUser.phone)) {
            this.codeField.setText(this.initialPhoneNumber);
        } else {
            String str2 = currentUser.phone;
            int i = 4;
            while (true) {
                if (i < 1) {
                    if (Build.VERSION.SDK_INT < 23) {
                        break;
                    }
                    Context context = ApplicationLoader.applicationContext;
                    String upperCase = context != null ? ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US) : Locale.getDefault().getCountry();
                    this.codeField.setText(upperCase);
                    if (!upperCase.endsWith("0") || !this.initialPhoneNumber.startsWith("0")) {
                        break;
                        break;
                    } else {
                        this.initialPhoneNumber = this.initialPhoneNumber.substring(1);
                        break;
                    }
                }
                List list = (List) this.codesMap.get(str2.substring(0, i));
                if (list != null && list.size() > 0) {
                    String str3 = ((CountrySelectActivity.Country) list.get(0)).code;
                    this.codeField.setText(str3);
                    if (!str3.endsWith("0") || !this.initialPhoneNumber.startsWith("0")) {
                        break;
                        break;
                    } else {
                        this.initialPhoneNumber = this.initialPhoneNumber.substring(1);
                        break;
                    }
                }
                i--;
            }
            this.phoneField.setText(this.initialPhoneNumber);
        }
        this.initialPhoneNumber = null;
    }

    @Override
    public final void show() {
        super.show();
        this.firstNameField.getEditText().requestFocus();
        this.firstNameField.getEditText().setSelection(this.firstNameField.getEditText().length());
        AndroidUtilities.runOnUIThread(new NewContactBottomSheet$$ExternalSyntheticLambda0(this, 1), 50L);
    }

    public final void updateBottomTranslation(boolean z) {
        ViewPropertyAnimator viewPropertyAnimatorTranslationY = this.checkLayout.animate().translationY(z ? -AndroidUtilities.dp(21.33f) : 0.0f);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        OKLCH.m(viewPropertyAnimatorTranslationY, cubicBezierInterpolator, 420L);
        this.qrButtonContainer.animate().translationY(z ? -AndroidUtilities.dp(10.665f) : 0.0f).setInterpolator(cubicBezierInterpolator).setDuration(420L).start();
    }

    public final void updateQrButtonVisible(boolean z) {
        boolean z2 = this.checkBox.checkBoxBase.isChecked;
        final boolean z3 = !z2;
        if (!z) {
            this.qrButton.animate().cancel();
            this.qrButton.setVisibility(!z2 ? 0 : 4);
            this.qrButton.setAlpha(!z2 ? 1.0f : 0.0f);
            this.qrButtonSeparator.animate().cancel();
            this.qrButtonSeparator.setVisibility(!z2 ? 0 : 8);
            this.qrButtonSeparator.setAlpha(!z2 ? 1.0f : 0.0f);
            this.notesField.animate().cancel();
            this.notesField.setVisibility(z2 ? 0 : 4);
            this.notesField.setAlpha(z2 ? 1.0f : 0.0f);
            return;
        }
        this.qrButton.setVisibility(0);
        ViewPropertyAnimator viewPropertyAnimatorAlpha = this.qrButton.animate().alpha(!z2 ? 1.0f : 0.0f);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        final int i = 0;
        viewPropertyAnimatorAlpha.setInterpolator(cubicBezierInterpolator).setDuration(420L).withEndAction(new Runnable(this) {
            public final NewContactBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i) {
                    case 0:
                        NewContactBottomSheet newContactBottomSheet = this.f$0;
                        if (!z3) {
                            newContactBottomSheet.qrButton.setVisibility(4);
                        } else {
                            newContactBottomSheet.getClass();
                        }
                        break;
                    case 1:
                        NewContactBottomSheet newContactBottomSheet2 = this.f$0;
                        if (!z3) {
                            newContactBottomSheet2.qrButtonSeparator.setVisibility(4);
                        } else {
                            newContactBottomSheet2.getClass();
                        }
                        break;
                    default:
                        NewContactBottomSheet newContactBottomSheet3 = this.f$0;
                        if (!z3) {
                            newContactBottomSheet3.getClass();
                        } else {
                            newContactBottomSheet3.notesField.setVisibility(4);
                        }
                        break;
                }
            }
        }).start();
        this.qrButtonSeparator.setVisibility(0);
        final int i2 = 1;
        this.qrButtonSeparator.animate().alpha(!z2 ? 1.0f : 0.0f).setInterpolator(cubicBezierInterpolator).setDuration(420L).withEndAction(new Runnable(this) {
            public final NewContactBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i2) {
                    case 0:
                        NewContactBottomSheet newContactBottomSheet = this.f$0;
                        if (!z3) {
                            newContactBottomSheet.qrButton.setVisibility(4);
                        } else {
                            newContactBottomSheet.getClass();
                        }
                        break;
                    case 1:
                        NewContactBottomSheet newContactBottomSheet2 = this.f$0;
                        if (!z3) {
                            newContactBottomSheet2.qrButtonSeparator.setVisibility(4);
                        } else {
                            newContactBottomSheet2.getClass();
                        }
                        break;
                    default:
                        NewContactBottomSheet newContactBottomSheet3 = this.f$0;
                        if (!z3) {
                            newContactBottomSheet3.getClass();
                        } else {
                            newContactBottomSheet3.notesField.setVisibility(4);
                        }
                        break;
                }
            }
        }).start();
        this.notesField.setVisibility(0);
        final int i3 = 2;
        this.notesField.animate().alpha(z2 ? 1.0f : 0.0f).setInterpolator(cubicBezierInterpolator).setDuration(420L).withEndAction(new Runnable(this) {
            public final NewContactBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i3) {
                    case 0:
                        NewContactBottomSheet newContactBottomSheet = this.f$0;
                        if (!z3) {
                            newContactBottomSheet.qrButton.setVisibility(4);
                        } else {
                            newContactBottomSheet.getClass();
                        }
                        break;
                    case 1:
                        NewContactBottomSheet newContactBottomSheet2 = this.f$0;
                        if (!z3) {
                            newContactBottomSheet2.qrButtonSeparator.setVisibility(4);
                        } else {
                            newContactBottomSheet2.getClass();
                        }
                        break;
                    default:
                        NewContactBottomSheet newContactBottomSheet3 = this.f$0;
                        if (!z3) {
                            newContactBottomSheet3.getClass();
                        } else {
                            newContactBottomSheet3.notesField.setVisibility(4);
                        }
                        break;
                }
            }
        }).start();
    }

    public final void updatedPhone(String str) {
        if (this.requestingPhoneId >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestingPhoneId, true);
            this.requestingPhoneId = -1;
        }
        if (TextUtils.isEmpty(str)) {
            OKLCH.m(this.phoneStatusView.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f), CubicBezierInterpolator.EASE_OUT_QUINT, 420L);
            this.underPhoneTextView.setText("");
            updateBottomTranslation(true);
            return;
        }
        OKLCH.m(this.phoneStatusView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), CubicBezierInterpolator.EASE_OUT_QUINT, 420L);
        this.phoneStatusView.setImageDrawable(new CircularProgressDrawable(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), getThemedColor(Theme.key_dialogTextBlue)));
        this.underPhoneTextView.setText("");
        updateBottomTranslation(true);
        OAuthSheet$$ExternalSyntheticLambda13 oAuthSheet$$ExternalSyntheticLambda13 = new OAuthSheet$$ExternalSyntheticLambda13(17, this, str);
        TLRPC.TL_contact tL_contact = ContactsController.getInstance(this.currentAccount).contactsByPhone.get(PhoneFormat.stripExceptNumbers(str, false));
        if (tL_contact == null) {
            TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
            tL_contacts_resolvePhone.phone = PhoneFormat.stripExceptNumbers(str, false);
            this.requestingPhoneId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolvePhone, new ProfileActivity$$ExternalSyntheticLambda65(2, this, oAuthSheet$$ExternalSyntheticLambda13));
        } else {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                oAuthSheet$$ExternalSyntheticLambda13.run(user);
            } else {
                MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new LinkManager$$ExternalSyntheticLambda21(this, tL_contact, oAuthSheet$$ExternalSyntheticLambda13, 22));
            }
        }
    }
}
