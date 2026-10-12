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
public final class ea extends org.telegram.ui.ActionBar.m2 {
    public da f35494a;
    public da f35495b;
    public org.telegram.ui.ActionBar.u0 f35496c;
    public org.telegram.ui.ActionBar.c6 d;

    public static void U(ea eaVar) {
        String str;
        TLRPC.User currentUser = UserConfig.getInstance(eaVar.currentAccount).getCurrentUser();
        if (currentUser != null && eaVar.f35495b.getText() != null && eaVar.f35494a.getText() != null) {
            String obj = eaVar.f35494a.getText().toString();
            String obj2 = eaVar.f35495b.getText().toString();
            String str2 = currentUser.first_name;
            if (str2 == null || !str2.equals(obj) || (str = currentUser.last_name) == null || !str.equals(obj2)) {
                TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                updateprofile.flags = 3;
                updateprofile.first_name = obj;
                currentUser.first_name = obj;
                updateprofile.last_name = obj2;
                currentUser.last_name = obj2;
                TLRPC.User user = MessagesController.getInstance(eaVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(eaVar.currentAccount).getClientUserId()));
                if (user != null) {
                    user.first_name = updateprofile.first_name;
                    user.last_name = updateprofile.last_name;
                }
                UserConfig.getInstance(eaVar.currentAccount).saveConfig(true);
                NotificationCenter.getInstance(eaVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                NotificationCenter.getInstance(eaVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
                ConnectionsManager.getInstance(eaVar.currentAccount).sendRequest(updateprofile, new bi.g7(8));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.g6.f19938f8;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        kVar.B(org.telegram.ui.ActionBar.g6.w0(i12, c6Var), false);
        this.actionBar.D(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20235v8, c6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EditName));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 28));
        this.f35496c = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new ci.d(2));
        da daVar = new da(this, context, 0);
        this.f35494a = daVar;
        daVar.setTextSize(1, 18.0f);
        da daVar2 = this.f35494a;
        int i13 = org.telegram.ui.ActionBar.g6.H6;
        daVar2.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
        da daVar3 = this.f35494a;
        int i14 = org.telegram.ui.ActionBar.g6.G6;
        daVar3.setTextColor(org.telegram.ui.ActionBar.g6.w0(i14, c6Var));
        this.f35494a.setBackgroundDrawable(null);
        da daVar4 = this.f35494a;
        int i15 = org.telegram.ui.ActionBar.g6.f20028k6;
        int themedColor = getThemedColor(i15);
        int i16 = org.telegram.ui.ActionBar.g6.f20045l6;
        int themedColor2 = getThemedColor(i16);
        int i17 = org.telegram.ui.ActionBar.g6.f20122p7;
        daVar4.setLineColors(themedColor, themedColor2, getThemedColor(i17));
        this.f35494a.setMaxLines(1);
        this.f35494a.setLines(1);
        this.f35494a.setSingleLine(true);
        da daVar5 = this.f35494a;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        daVar5.setGravity(i10);
        this.f35494a.setInputType(49152);
        this.f35494a.setImeOptions(5);
        this.f35494a.setHint(LocaleController.getString(R.string.FirstName));
        this.f35494a.setCursorColor(org.telegram.ui.ActionBar.g6.w0(i14, c6Var));
        this.f35494a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f35494a.setCursorWidth(1.5f);
        linearLayout.addView(this.f35494a, w7.a6.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.f35494a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ea f34767b;

            {
                this.f34767b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i18 == 5) {
                            ea eaVar = this.f34767b;
                            eaVar.f35495b.requestFocus();
                            da daVar6 = eaVar.f35495b;
                            daVar6.setSelection(daVar6.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i18 == 6) {
                            this.f34767b.f35496c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        da daVar6 = new da(this, context, 1);
        this.f35495b = daVar6;
        daVar6.setTextSize(1, 18.0f);
        this.f35495b.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
        this.f35495b.setTextColor(org.telegram.ui.ActionBar.g6.w0(i14, c6Var));
        this.f35495b.setBackgroundDrawable(null);
        this.f35495b.setLineColors(getThemedColor(i15), getThemedColor(i16), getThemedColor(i17));
        this.f35495b.setMaxLines(1);
        this.f35495b.setLines(1);
        this.f35495b.setSingleLine(true);
        da daVar7 = this.f35495b;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        daVar7.setGravity(i11);
        this.f35495b.setInputType(49152);
        this.f35495b.setImeOptions(6);
        this.f35495b.setHint(LocaleController.getString(R.string.LastName));
        this.f35495b.setCursorColor(org.telegram.ui.ActionBar.g6.w0(i14, c6Var));
        this.f35495b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f35495b.setCursorWidth(1.5f);
        linearLayout.addView(this.f35495b, w7.a6.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.f35495b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ea f34767b;

            {
                this.f34767b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i18 == 5) {
                            ea eaVar = this.f34767b;
                            eaVar.f35495b.requestFocus();
                            da daVar62 = eaVar.f35495b;
                            daVar62.setSelection(daVar62.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i18 == 6) {
                            this.f34767b.f35496c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (user != null) {
            this.f35494a.setText(user.first_name);
            da daVar8 = this.f35494a;
            daVar8.setSelection(daVar8.length());
            this.f35495b.setText(user.last_name);
        }
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19901d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f20180s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f20235v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f20199t8));
        da daVar = this.f35494a;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(daVar, 4, null, null, null, null, i10));
        da daVar2 = this.f35494a;
        int i11 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(daVar2, 8388608, null, null, null, null, i11));
        da daVar3 = this.f35494a;
        int i12 = org.telegram.ui.ActionBar.g6.f20028k6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(daVar3, 32, null, null, null, null, i12));
        da daVar4 = this.f35494a;
        int i13 = org.telegram.ui.ActionBar.g6.f20045l6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(daVar4, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35495b, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35495b, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35495b, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35495b, 65568, null, null, null, null, i13));
        return arrayList;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            this.f35494a.requestFocus();
            AndroidUtilities.showKeyboard(this.f35494a);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new tu0(this, 18), 100L);
        }
    }
}
