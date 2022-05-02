package org.telegram.p009ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.p009ui.ActionBar.ActionBarMenuItem;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1006ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.Components.AlertsCreator;
import org.telegram.p009ui.Components.AvatarDrawable;
import org.telegram.p009ui.Components.BackupImageView;
import org.telegram.p009ui.Components.ContextProgressView;
import org.telegram.p009ui.Components.EditTextBoldCursor;
import org.telegram.p009ui.Components.HintEditText;
import org.telegram.p009ui.CountrySelectActivity;
import org.telegram.p009ui.NewContactActivity;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_contacts_importContacts;
import org.telegram.tgnet.TLRPC$TL_contacts_importedContacts;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputPhoneContact;
import org.telegram.tgnet.TLRPC$User;

public class NewContactActivity extends BaseFragment implements AdapterView.OnItemSelectedListener {
    private AvatarDrawable avatarDrawable;
    private BackupImageView avatarImage;
    private EditTextBoldCursor codeField;
    private LinearLayout contentLayout;
    private TextView countryButton;
    private int countryState;
    private boolean donePressed;
    private ActionBarMenuItem editDoneItem;
    private AnimatorSet editDoneItemAnimation;
    private ContextProgressView editDoneItemProgress;
    private EditTextBoldCursor firstNameField;
    private boolean ignoreOnPhoneChange;
    private boolean ignoreOnTextChange;
    private boolean ignoreSelection;
    private String initialFirstName;
    private String initialLastName;
    private String initialPhoneNumber;
    private boolean initialPhoneNumberWithCountryCode;
    private EditTextBoldCursor lastNameField;
    private View lineView;
    private HintEditText phoneField;
    private TextView textView;
    private ArrayList<String> countriesArray = new ArrayList<>();
    private HashMap<String, String> countriesMap = new HashMap<>();
    private HashMap<String, String> codesMap = new HashMap<>();
    private HashMap<String, String> phoneFormatMap = new HashMap<>();

    public static boolean lambda$createView$0(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    @Override
    public android.view.View createView(android.content.Context r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.NewContactActivity.createView(android.content.Context):android.view.View");
    }

    public class C31401 extends C1006ActionBar.ActionBarMenuOnItemClick {
        C31401() {
        }

        @Override
        public void onItemClick(int i) {
            if (i == -1) {
                NewContactActivity.this.finishFragment();
            } else if (i == 1 && !NewContactActivity.this.donePressed) {
                if (NewContactActivity.this.firstNameField.length() == 0) {
                    Vibrator vibrator = (Vibrator) NewContactActivity.this.getParentActivity().getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(200L);
                    }
                    AndroidUtilities.shakeView(NewContactActivity.this.firstNameField, 2.0f, 0);
                } else if (NewContactActivity.this.codeField.length() == 0) {
                    Vibrator vibrator2 = (Vibrator) NewContactActivity.this.getParentActivity().getSystemService("vibrator");
                    if (vibrator2 != null) {
                        vibrator2.vibrate(200L);
                    }
                    AndroidUtilities.shakeView(NewContactActivity.this.codeField, 2.0f, 0);
                } else if (NewContactActivity.this.phoneField.length() == 0) {
                    Vibrator vibrator3 = (Vibrator) NewContactActivity.this.getParentActivity().getSystemService("vibrator");
                    if (vibrator3 != null) {
                        vibrator3.vibrate(200L);
                    }
                    AndroidUtilities.shakeView(NewContactActivity.this.phoneField, 2.0f, 0);
                } else {
                    NewContactActivity.this.donePressed = true;
                    NewContactActivity.this.showEditDoneProgress(true, true);
                    final TLRPC$TL_contacts_importContacts tLRPC$TL_contacts_importContacts = new TLRPC$TL_contacts_importContacts();
                    final TLRPC$TL_inputPhoneContact tLRPC$TL_inputPhoneContact = new TLRPC$TL_inputPhoneContact();
                    tLRPC$TL_inputPhoneContact.first_name = NewContactActivity.this.firstNameField.getText().toString();
                    tLRPC$TL_inputPhoneContact.last_name = NewContactActivity.this.lastNameField.getText().toString();
                    tLRPC$TL_inputPhoneContact.phone = "+" + NewContactActivity.this.codeField.getText().toString() + NewContactActivity.this.phoneField.getText().toString();
                    tLRPC$TL_contacts_importContacts.contacts.add(tLRPC$TL_inputPhoneContact);
                    ConnectionsManager.getInstance(((BaseFragment) NewContactActivity.this).currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(((BaseFragment) NewContactActivity.this).currentAccount).sendRequest(tLRPC$TL_contacts_importContacts, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            NewContactActivity.C31401.this.lambda$onItemClick$2(tLRPC$TL_inputPhoneContact, tLRPC$TL_contacts_importContacts, tLObject, tLRPC$TL_error);
                        }
                    }, 2), ((BaseFragment) NewContactActivity.this).classGuid);
                }
            }
        }

        public void lambda$onItemClick$2(final TLRPC$TL_inputPhoneContact tLRPC$TL_inputPhoneContact, final TLRPC$TL_contacts_importContacts tLRPC$TL_contacts_importContacts, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
            final TLRPC$TL_contacts_importedContacts tLRPC$TL_contacts_importedContacts = (TLRPC$TL_contacts_importedContacts) tLObject;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    NewContactActivity.C31401.this.lambda$onItemClick$1(tLRPC$TL_contacts_importedContacts, tLRPC$TL_inputPhoneContact, tLRPC$TL_error, tLRPC$TL_contacts_importContacts);
                }
            });
        }

        public void lambda$onItemClick$1(TLRPC$TL_contacts_importedContacts tLRPC$TL_contacts_importedContacts, final TLRPC$TL_inputPhoneContact tLRPC$TL_inputPhoneContact, TLRPC$TL_error tLRPC$TL_error, TLRPC$TL_contacts_importContacts tLRPC$TL_contacts_importContacts) {
            NewContactActivity.this.donePressed = false;
            if (tLRPC$TL_contacts_importedContacts == null) {
                NewContactActivity.this.showEditDoneProgress(false, true);
                AlertsCreator.processError(((BaseFragment) NewContactActivity.this).currentAccount, tLRPC$TL_error, NewContactActivity.this, tLRPC$TL_contacts_importContacts, new Object[0]);
            } else if (!tLRPC$TL_contacts_importedContacts.users.isEmpty()) {
                MessagesController.getInstance(((BaseFragment) NewContactActivity.this).currentAccount).putUsers(tLRPC$TL_contacts_importedContacts.users, false);
                MessagesController.openChatOrProfileWith(tLRPC$TL_contacts_importedContacts.users.get(0), null, NewContactActivity.this, 1, true);
            } else if (NewContactActivity.this.getParentActivity() != null) {
                NewContactActivity.this.showEditDoneProgress(false, true);
                AlertDialog.Builder builder = new AlertDialog.Builder(NewContactActivity.this.getParentActivity());
                builder.setTitle(LocaleController.getString("ContactNotRegisteredTitle", C0952R.string.ContactNotRegisteredTitle));
                builder.setMessage(LocaleController.formatString("ContactNotRegistered", C0952R.string.ContactNotRegistered, ContactsController.formatName(tLRPC$TL_inputPhoneContact.first_name, tLRPC$TL_inputPhoneContact.last_name)));
                builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
                builder.setPositiveButton(LocaleController.getString("Invite", C0952R.string.Invite), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        NewContactActivity.C31401.this.lambda$onItemClick$0(tLRPC$TL_inputPhoneContact, dialogInterface, i);
                    }
                });
                NewContactActivity.this.showDialog(builder.create());
            }
        }

        public void lambda$onItemClick$0(TLRPC$TL_inputPhoneContact tLRPC$TL_inputPhoneContact, DialogInterface dialogInterface, int i) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", tLRPC$TL_inputPhoneContact.phone, null));
                intent.putExtra("sms_body", ContactsController.getInstance(((BaseFragment) NewContactActivity.this).currentAccount).getInviteText(1));
                NewContactActivity.this.getParentActivity().startActivityForResult(intent, 500);
            } catch (Exception e) {
                FileLog.m30e(e);
            }
        }
    }

    public boolean lambda$createView$1(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        this.lastNameField.requestFocus();
        EditTextBoldCursor editTextBoldCursor = this.lastNameField;
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        return true;
    }

    public boolean lambda$createView$2(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        this.phoneField.requestFocus();
        HintEditText hintEditText = this.phoneField;
        hintEditText.setSelection(hintEditText.length());
        return true;
    }

    public void lambda$createView$4(View view) {
        CountrySelectActivity countrySelectActivity = new CountrySelectActivity(true);
        countrySelectActivity.setCountrySelectActivityDelegate(new CountrySelectActivity.CountrySelectActivityDelegate() {
            @Override
            public final void didSelectCountry(CountrySelectActivity.Country country) {
                NewContactActivity.this.lambda$createView$3(country);
            }
        });
        presentFragment(countrySelectActivity);
    }

    public void lambda$createView$3(CountrySelectActivity.Country country) {
        selectCountry(country.name);
        this.phoneField.requestFocus();
        HintEditText hintEditText = this.phoneField;
        hintEditText.setSelection(hintEditText.length());
    }

    public boolean lambda$createView$5(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        this.phoneField.requestFocus();
        HintEditText hintEditText = this.phoneField;
        hintEditText.setSelection(hintEditText.length());
        return true;
    }

    public boolean lambda$createView$6(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        this.editDoneItem.performClick();
        return true;
    }

    public boolean lambda$createView$7(View view, int i, KeyEvent keyEvent) {
        if (i != 67 || this.phoneField.length() != 0) {
            return false;
        }
        this.codeField.requestFocus();
        EditTextBoldCursor editTextBoldCursor = this.codeField;
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        this.codeField.dispatchKeyEvent(keyEvent);
        return true;
    }

    public static String getPhoneNumber(Context context, TLRPC$User tLRPC$User, String str, boolean z) {
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                hashMap.put(split[0], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.m30e(e);
        }
        if (str.startsWith("+")) {
            return str;
        }
        if (z || tLRPC$User == null || TextUtils.isEmpty(tLRPC$User.phone)) {
            return "+" + str;
        }
        String str2 = tLRPC$User.phone;
        for (int i = 4; i >= 1; i--) {
            String substring = str2.substring(0, i);
            if (((String) hashMap.get(substring)) != null) {
                return "+" + substring + str;
            }
        }
        return str;
    }

    public void invalidateAvatar() {
        this.avatarDrawable.setInfo(5L, this.firstNameField.getText().toString(), this.lastNameField.getText().toString());
        this.avatarImage.invalidate();
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            View findFocus = this.contentLayout.findFocus();
            if (findFocus == null) {
                this.firstNameField.requestFocus();
                findFocus = this.firstNameField;
            }
            AndroidUtilities.showKeyboard(findFocus);
        }
    }

    public void setInitialPhoneNumber(String str, boolean z) {
        this.initialPhoneNumber = str;
        this.initialPhoneNumberWithCountryCode = z;
    }

    public void setInitialName(String str, String str2) {
        this.initialFirstName = str;
        this.initialLastName = str2;
    }

    public void selectCountry(String str) {
        if (this.countriesArray.indexOf(str) != -1) {
            this.ignoreOnTextChange = true;
            String str2 = this.countriesMap.get(str);
            this.codeField.setText(str2);
            this.countryButton.setText(str);
            String str3 = this.phoneFormatMap.get(str2);
            this.phoneField.setHintText(str3 != null ? str3.replace('X', (char) 8211) : null);
            this.ignoreOnTextChange = false;
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.ignoreSelection) {
            this.ignoreSelection = false;
            return;
        }
        this.ignoreOnTextChange = true;
        this.codeField.setText(this.countriesMap.get(this.countriesArray.get(i)));
        this.ignoreOnTextChange = false;
    }

    public void showEditDoneProgress(final boolean z, boolean z2) {
        AnimatorSet animatorSet = this.editDoneItemAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z2) {
            this.editDoneItemAnimation = new AnimatorSet();
            if (z) {
                this.editDoneItemProgress.setVisibility(0);
                this.editDoneItem.setEnabled(false);
                this.editDoneItemAnimation.playTogether(ObjectAnimator.ofFloat(this.editDoneItem.getContentView(), "scaleX", 0.1f), ObjectAnimator.ofFloat(this.editDoneItem.getContentView(), "scaleY", 0.1f), ObjectAnimator.ofFloat(this.editDoneItem.getContentView(), "alpha", 0.0f), ObjectAnimator.ofFloat(this.editDoneItemProgress, "scaleX", 1.0f), ObjectAnimator.ofFloat(this.editDoneItemProgress, "scaleY", 1.0f), ObjectAnimator.ofFloat(this.editDoneItemProgress, "alpha", 1.0f));
            } else {
                this.editDoneItem.getContentView().setVisibility(0);
                this.editDoneItem.setEnabled(true);
                this.editDoneItemAnimation.playTogether(ObjectAnimator.ofFloat(this.editDoneItemProgress, "scaleX", 0.1f), ObjectAnimator.ofFloat(this.editDoneItemProgress, "scaleY", 0.1f), ObjectAnimator.ofFloat(this.editDoneItemProgress, "alpha", 0.0f), ObjectAnimator.ofFloat(this.editDoneItem.getContentView(), "scaleX", 1.0f), ObjectAnimator.ofFloat(this.editDoneItem.getContentView(), "scaleY", 1.0f), ObjectAnimator.ofFloat(this.editDoneItem.getContentView(), "alpha", 1.0f));
            }
            this.editDoneItemAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (NewContactActivity.this.editDoneItemAnimation != null && NewContactActivity.this.editDoneItemAnimation.equals(animator)) {
                        if (!z) {
                            NewContactActivity.this.editDoneItemProgress.setVisibility(4);
                        } else {
                            NewContactActivity.this.editDoneItem.getContentView().setVisibility(4);
                        }
                    }
                }

                @Override
                public void onAnimationCancel(Animator animator) {
                    if (NewContactActivity.this.editDoneItemAnimation != null && NewContactActivity.this.editDoneItemAnimation.equals(animator)) {
                        NewContactActivity.this.editDoneItemAnimation = null;
                    }
                }
            });
            this.editDoneItemAnimation.setDuration(150L);
            this.editDoneItemAnimation.start();
        } else if (z) {
            this.editDoneItem.getContentView().setScaleX(0.1f);
            this.editDoneItem.getContentView().setScaleY(0.1f);
            this.editDoneItem.getContentView().setAlpha(0.0f);
            this.editDoneItemProgress.setScaleX(1.0f);
            this.editDoneItemProgress.setScaleY(1.0f);
            this.editDoneItemProgress.setAlpha(1.0f);
            this.editDoneItem.getContentView().setVisibility(4);
            this.editDoneItemProgress.setVisibility(0);
            this.editDoneItem.setEnabled(false);
        } else {
            this.editDoneItemProgress.setScaleX(0.1f);
            this.editDoneItemProgress.setScaleY(0.1f);
            this.editDoneItemProgress.setAlpha(0.0f);
            this.editDoneItem.getContentView().setScaleX(1.0f);
            this.editDoneItem.getContentView().setScaleY(1.0f);
            this.editDoneItem.getContentView().setAlpha(1.0f);
            this.editDoneItem.getContentView().setVisibility(0);
            this.editDoneItemProgress.setVisibility(4);
            this.editDoneItem.setEnabled(true);
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ThemeDescription.ThemeDescriptionDelegate newContactActivity$$ExternalSyntheticLambda7 = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                NewContactActivity.this.lambda$getThemeDescriptions$8();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "actionBarDefaultIcon"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, "actionBarDefaultTitle"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarDefaultSelector"));
        arrayList.add(new ThemeDescription(this.firstNameField, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.firstNameField, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, "windowBackgroundWhiteHintText"));
        arrayList.add(new ThemeDescription(this.firstNameField, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "windowBackgroundWhiteInputField"));
        arrayList.add(new ThemeDescription(this.firstNameField, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "windowBackgroundWhiteInputFieldActivated"));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, "windowBackgroundWhiteHintText"));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "windowBackgroundWhiteInputField"));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "windowBackgroundWhiteInputFieldActivated"));
        arrayList.add(new ThemeDescription(this.codeField, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.codeField, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "windowBackgroundWhiteInputField"));
        arrayList.add(new ThemeDescription(this.codeField, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "windowBackgroundWhiteInputFieldActivated"));
        arrayList.add(new ThemeDescription(this.phoneField, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.phoneField, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, "windowBackgroundWhiteHintText"));
        arrayList.add(new ThemeDescription(this.phoneField, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "windowBackgroundWhiteInputField"));
        arrayList.add(new ThemeDescription(this.phoneField, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "windowBackgroundWhiteInputFieldActivated"));
        arrayList.add(new ThemeDescription(this.textView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.lineView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhiteGrayLine"));
        arrayList.add(new ThemeDescription(this.countryButton, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.countryButton, ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.countryButton, ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.editDoneItemProgress, 0, null, null, null, null, "contextProgressInner2"));
        arrayList.add(new ThemeDescription(this.editDoneItemProgress, 0, null, null, null, null, "contextProgressOuter2"));
        arrayList.add(new ThemeDescription(null, 0, null, null, Theme.avatarDrawables, newContactActivity$$ExternalSyntheticLambda7, "avatar_text"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, newContactActivity$$ExternalSyntheticLambda7, "avatar_backgroundRed"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, newContactActivity$$ExternalSyntheticLambda7, "avatar_backgroundOrange"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, newContactActivity$$ExternalSyntheticLambda7, "avatar_backgroundViolet"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, newContactActivity$$ExternalSyntheticLambda7, "avatar_backgroundGreen"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, newContactActivity$$ExternalSyntheticLambda7, "avatar_backgroundCyan"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, newContactActivity$$ExternalSyntheticLambda7, "avatar_backgroundBlue"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, newContactActivity$$ExternalSyntheticLambda7, "avatar_backgroundPink"));
        return arrayList;
    }

    public void lambda$getThemeDescriptions$8() {
        if (this.avatarImage != null) {
            invalidateAvatar();
        }
    }
}
