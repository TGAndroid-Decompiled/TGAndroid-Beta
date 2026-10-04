package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ba extends org.telegram.ui.ActionBar.n2 {
    public aa f35039a;
    public aa f35040b;
    public org.telegram.ui.ActionBar.v0 f35041c;
    public org.telegram.ui.ActionBar.d6 d;

    public static void S(ba baVar) {
        String str;
        TLRPC.User currentUser = UserConfig.getInstance(baVar.currentAccount).getCurrentUser();
        if (currentUser != null && baVar.f35040b.getText() != null && baVar.f35039a.getText() != null) {
            String obj = baVar.f35039a.getText().toString();
            String obj2 = baVar.f35040b.getText().toString();
            String str2 = currentUser.first_name;
            if (str2 == null || !str2.equals(obj) || (str = currentUser.last_name) == null || !str.equals(obj2)) {
                TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                updateprofile.flags = 3;
                updateprofile.first_name = obj;
                currentUser.first_name = obj;
                updateprofile.last_name = obj2;
                currentUser.last_name = obj2;
                TLRPC.User user = MessagesController.getInstance(baVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(baVar.currentAccount).getClientUserId()));
                if (user != null) {
                    user.first_name = updateprofile.first_name;
                    user.last_name = updateprofile.last_name;
                }
                UserConfig.getInstance(baVar.currentAccount).saveConfig(true);
                NotificationCenter.getInstance(baVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                NotificationCenter.getInstance(baVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
                ConnectionsManager.getInstance(baVar.currentAccount).sendRequest(updateprofile, new ai.u7(8));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.i6.f20855f8;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        kVar.A(org.telegram.ui.ActionBar.i6.v0(i12, d6Var), false);
        this.actionBar.B(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21154v8, d6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EditName));
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 26));
        this.f35041c = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new bi.d(2));
        aa aaVar = new aa(this, context, 0);
        this.f35039a = aaVar;
        aaVar.setTextSize(1, 18.0f);
        aa aaVar2 = this.f35039a;
        int i13 = org.telegram.ui.ActionBar.i6.H6;
        aaVar2.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(i13, d6Var));
        aa aaVar3 = this.f35039a;
        int i14 = org.telegram.ui.ActionBar.i6.G6;
        aaVar3.setTextColor(org.telegram.ui.ActionBar.i6.v0(i14, d6Var));
        this.f35039a.setBackgroundDrawable(null);
        aa aaVar4 = this.f35039a;
        int i15 = org.telegram.ui.ActionBar.i6.f20946k6;
        int themedColor = getThemedColor(i15);
        int i16 = org.telegram.ui.ActionBar.i6.f20964l6;
        int themedColor2 = getThemedColor(i16);
        int i17 = org.telegram.ui.ActionBar.i6.f21039p7;
        aaVar4.setLineColors(themedColor, themedColor2, getThemedColor(i17));
        this.f35039a.setMaxLines(1);
        this.f35039a.setLines(1);
        this.f35039a.setSingleLine(true);
        aa aaVar5 = this.f35039a;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        aaVar5.setGravity(i10);
        this.f35039a.setInputType(49152);
        this.f35039a.setImeOptions(5);
        this.f35039a.setHint(LocaleController.getString(R.string.FirstName));
        this.f35039a.setCursorColor(org.telegram.ui.ActionBar.i6.v0(i14, d6Var));
        this.f35039a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f35039a.setCursorWidth(1.5f);
        linearLayout.addView(this.f35039a, w7.z5.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.f35039a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ba f43727b;

            {
                this.f43727b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i18 == 5) {
                            ba baVar = this.f43727b;
                            baVar.f35040b.requestFocus();
                            aa aaVar6 = baVar.f35040b;
                            aaVar6.setSelection(aaVar6.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i18 == 6) {
                            this.f43727b.f35041c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        aa aaVar6 = new aa(this, context, 1);
        this.f35040b = aaVar6;
        aaVar6.setTextSize(1, 18.0f);
        this.f35040b.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(i13, d6Var));
        this.f35040b.setTextColor(org.telegram.ui.ActionBar.i6.v0(i14, d6Var));
        this.f35040b.setBackgroundDrawable(null);
        this.f35040b.setLineColors(getThemedColor(i15), getThemedColor(i16), getThemedColor(i17));
        this.f35040b.setMaxLines(1);
        this.f35040b.setLines(1);
        this.f35040b.setSingleLine(true);
        aa aaVar7 = this.f35040b;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        aaVar7.setGravity(i11);
        this.f35040b.setInputType(49152);
        this.f35040b.setImeOptions(6);
        this.f35040b.setHint(LocaleController.getString(R.string.LastName));
        this.f35040b.setCursorColor(org.telegram.ui.ActionBar.i6.v0(i14, d6Var));
        this.f35040b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f35040b.setCursorWidth(1.5f);
        linearLayout.addView(this.f35040b, w7.z5.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.f35040b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ba f43727b;

            {
                this.f43727b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i18 == 5) {
                            ba baVar = this.f43727b;
                            baVar.f35040b.requestFocus();
                            aa aaVar62 = baVar.f35040b;
                            aaVar62.setSelection(aaVar62.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i18 == 6) {
                            this.f43727b.f35041c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (user != null) {
            this.f35039a.setText(user.first_name);
            aa aaVar8 = this.f35039a;
            aaVar8.setSelection(aaVar8.length());
            this.f35040b.setText(user.last_name);
        }
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20817d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f21099s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21154v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21118t8));
        aa aaVar = this.f35039a;
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(aaVar, 4, null, null, null, null, i10));
        aa aaVar2 = this.f35039a;
        int i11 = org.telegram.ui.ActionBar.i6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(aaVar2, 8388608, null, null, null, null, i11));
        aa aaVar3 = this.f35039a;
        int i12 = org.telegram.ui.ActionBar.i6.f20946k6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(aaVar3, 32, null, null, null, null, i12));
        aa aaVar4 = this.f35039a;
        int i13 = org.telegram.ui.ActionBar.i6.f20964l6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(aaVar4, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35040b, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35040b, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35040b, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35040b, 65568, null, null, null, null, i13));
        return arrayList;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            this.f35039a.requestFocus();
            AndroidUtilities.showKeyboard(this.f35039a);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new hu0(this, 18), 100L);
        }
    }
}
