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
public final class ca extends org.telegram.ui.ActionBar.p2 {
    public ba f33052a;
    public ba f33053b;
    public org.telegram.ui.ActionBar.w0 f33054c;
    public org.telegram.ui.ActionBar.f6 d;

    public static void U(ca caVar) {
        String str;
        TLRPC.User currentUser = UserConfig.getInstance(caVar.currentAccount).getCurrentUser();
        if (currentUser != null && caVar.f33053b.getText() != null && caVar.f33052a.getText() != null) {
            String obj = caVar.f33052a.getText().toString();
            String obj2 = caVar.f33053b.getText().toString();
            String str2 = currentUser.first_name;
            if (str2 == null || !str2.equals(obj) || (str = currentUser.last_name) == null || !str.equals(obj2)) {
                TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                updateprofile.flags = 3;
                updateprofile.first_name = obj;
                currentUser.first_name = obj;
                updateprofile.last_name = obj2;
                currentUser.last_name = obj2;
                TLRPC.User user = MessagesController.getInstance(caVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(caVar.currentAccount).getClientUserId()));
                if (user != null) {
                    user.first_name = updateprofile.first_name;
                    user.last_name = updateprofile.last_name;
                }
                UserConfig.getInstance(caVar.currentAccount).saveConfig(true);
                NotificationCenter.getInstance(caVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                NotificationCenter.getInstance(caVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
                ConnectionsManager.getInstance(caVar.currentAccount).sendRequest(updateprofile, new nh.p5(4));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.j6.f19919f8;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        kVar.B(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20202v8, f6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EditName));
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 13));
        this.f33054c = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new oh.d(2));
        ba baVar = new ba(this, context, 0);
        this.f33052a = baVar;
        baVar.setTextSize(1, 18.0f);
        ba baVar2 = this.f33052a;
        int i13 = org.telegram.ui.ActionBar.j6.H6;
        baVar2.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        ba baVar3 = this.f33052a;
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        baVar3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        this.f33052a.setBackgroundDrawable(null);
        ba baVar4 = this.f33052a;
        int i15 = org.telegram.ui.ActionBar.j6.f20006k6;
        int themedColor = getThemedColor(i15);
        int i16 = org.telegram.ui.ActionBar.j6.f20024l6;
        int themedColor2 = getThemedColor(i16);
        int i17 = org.telegram.ui.ActionBar.j6.f20097p7;
        baVar4.setLineColors(themedColor, themedColor2, getThemedColor(i17));
        this.f33052a.setMaxLines(1);
        this.f33052a.setLines(1);
        this.f33052a.setSingleLine(true);
        ba baVar5 = this.f33052a;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        baVar5.setGravity(i10);
        this.f33052a.setInputType(49152);
        this.f33052a.setImeOptions(5);
        this.f33052a.setHint(LocaleController.getString(R.string.FirstName));
        this.f33052a.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        this.f33052a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f33052a.setCursorWidth(1.5f);
        linearLayout.addView(this.f33052a, k7.b6.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.f33052a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ca f32523b;

            {
                this.f32523b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i18 == 5) {
                            ca caVar = this.f32523b;
                            caVar.f33053b.requestFocus();
                            ba baVar6 = caVar.f33053b;
                            baVar6.setSelection(baVar6.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i18 == 6) {
                            this.f32523b.f33054c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        ba baVar6 = new ba(this, context, 1);
        this.f33053b = baVar6;
        baVar6.setTextSize(1, 18.0f);
        this.f33053b.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        this.f33053b.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        this.f33053b.setBackgroundDrawable(null);
        this.f33053b.setLineColors(getThemedColor(i15), getThemedColor(i16), getThemedColor(i17));
        this.f33053b.setMaxLines(1);
        this.f33053b.setLines(1);
        this.f33053b.setSingleLine(true);
        ba baVar7 = this.f33053b;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        baVar7.setGravity(i11);
        this.f33053b.setInputType(49152);
        this.f33053b.setImeOptions(6);
        this.f33053b.setHint(LocaleController.getString(R.string.LastName));
        this.f33053b.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        this.f33053b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f33053b.setCursorWidth(1.5f);
        linearLayout.addView(this.f33053b, k7.b6.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.f33053b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ca f32523b;

            {
                this.f32523b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i18 == 5) {
                            ca caVar = this.f32523b;
                            caVar.f33053b.requestFocus();
                            ba baVar62 = caVar.f33053b;
                            baVar62.setSelection(baVar62.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i18 == 6) {
                            this.f32523b.f33054c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (user != null) {
            this.f33052a.setText(user.first_name);
            ba baVar8 = this.f33052a;
            baVar8.setSelection(baVar8.length());
            this.f33053b.setText(user.last_name);
        }
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19881d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20151s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20202v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20167t8));
        ba baVar = this.f33052a;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(baVar, 4, null, null, null, null, i10));
        ba baVar2 = this.f33052a;
        int i11 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(baVar2, 8388608, null, null, null, null, i11));
        ba baVar3 = this.f33052a;
        int i12 = org.telegram.ui.ActionBar.j6.f20006k6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(baVar3, 32, null, null, null, null, i12));
        ba baVar4 = this.f33052a;
        int i13 = org.telegram.ui.ActionBar.j6.f20024l6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(baVar4, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33053b, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33053b, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33053b, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33053b, 65568, null, null, null, null, i13));
        return arrayList;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            this.f33052a.requestFocus();
            AndroidUtilities.showKeyboard(this.f33052a);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4) {
            AndroidUtilities.runOnUIThread(new yt0(this, 18), 100L);
        }
    }
}
