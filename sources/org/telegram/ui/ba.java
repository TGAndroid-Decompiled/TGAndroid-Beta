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
public final class ba extends org.telegram.ui.ActionBar.o2 {
    public aa f32083a;
    public aa f32084b;
    public org.telegram.ui.ActionBar.w0 f32085c;
    public org.telegram.ui.ActionBar.f6 d;

    public static void U(ba baVar) {
        String str;
        TLRPC.User currentUser = UserConfig.getInstance(baVar.currentAccount).getCurrentUser();
        if (currentUser != null && baVar.f32084b.getText() != null && baVar.f32083a.getText() != null) {
            String obj = baVar.f32083a.getText().toString();
            String obj2 = baVar.f32084b.getText().toString();
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
                ConnectionsManager.getInstance(baVar.currentAccount).sendRequest(updateprofile, new ai.t7(8));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.j6.f18899f8;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        kVar.A(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19194v8, f6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EditName));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 26));
        this.f32085c = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
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
        this.f32083a = aaVar;
        aaVar.setTextSize(1, 18.0f);
        aa aaVar2 = this.f32083a;
        int i13 = org.telegram.ui.ActionBar.j6.H6;
        aaVar2.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        aa aaVar3 = this.f32083a;
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        aaVar3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        this.f32083a.setBackgroundDrawable(null);
        aa aaVar4 = this.f32083a;
        int i15 = org.telegram.ui.ActionBar.j6.f18990k6;
        int themedColor = getThemedColor(i15);
        int i16 = org.telegram.ui.ActionBar.j6.f19008l6;
        int themedColor2 = getThemedColor(i16);
        int i17 = org.telegram.ui.ActionBar.j6.f19082p7;
        aaVar4.setLineColors(themedColor, themedColor2, getThemedColor(i17));
        this.f32083a.setMaxLines(1);
        this.f32083a.setLines(1);
        this.f32083a.setSingleLine(true);
        aa aaVar5 = this.f32083a;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        aaVar5.setGravity(i10);
        this.f32083a.setInputType(49152);
        this.f32083a.setImeOptions(5);
        this.f32083a.setHint(LocaleController.getString(R.string.FirstName));
        this.f32083a.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        this.f32083a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f32083a.setCursorWidth(1.5f);
        linearLayout.addView(this.f32083a, w7.x5.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.f32083a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ba f40158b;

            {
                this.f40158b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i18 == 5) {
                            ba baVar = this.f40158b;
                            baVar.f32084b.requestFocus();
                            aa aaVar6 = baVar.f32084b;
                            aaVar6.setSelection(aaVar6.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i18 == 6) {
                            this.f40158b.f32085c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        aa aaVar6 = new aa(this, context, 1);
        this.f32084b = aaVar6;
        aaVar6.setTextSize(1, 18.0f);
        this.f32084b.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        this.f32084b.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        this.f32084b.setBackgroundDrawable(null);
        this.f32084b.setLineColors(getThemedColor(i15), getThemedColor(i16), getThemedColor(i17));
        this.f32084b.setMaxLines(1);
        this.f32084b.setLines(1);
        this.f32084b.setSingleLine(true);
        aa aaVar7 = this.f32084b;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        aaVar7.setGravity(i11);
        this.f32084b.setInputType(49152);
        this.f32084b.setImeOptions(6);
        this.f32084b.setHint(LocaleController.getString(R.string.LastName));
        this.f32084b.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        this.f32084b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f32084b.setCursorWidth(1.5f);
        linearLayout.addView(this.f32084b, w7.x5.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.f32084b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ba f40158b;

            {
                this.f40158b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i18 == 5) {
                            ba baVar = this.f40158b;
                            baVar.f32084b.requestFocus();
                            aa aaVar62 = baVar.f32084b;
                            aaVar62.setSelection(aaVar62.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i18 == 6) {
                            this.f40158b.f32085c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (user != null) {
            this.f32083a.setText(user.first_name);
            aa aaVar8 = this.f32083a;
            aaVar8.setSelection(aaVar8.length());
            this.f32084b.setText(user.last_name);
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f18862d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19139s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19194v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19158t8));
        aa aaVar = this.f32083a;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(aaVar, 4, null, null, null, null, i10));
        aa aaVar2 = this.f32083a;
        int i11 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(aaVar2, 8388608, null, null, null, null, i11));
        aa aaVar3 = this.f32083a;
        int i12 = org.telegram.ui.ActionBar.j6.f18990k6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(aaVar3, 32, null, null, null, null, i12));
        aa aaVar4 = this.f32083a;
        int i13 = org.telegram.ui.ActionBar.j6.f19008l6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(aaVar4, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32084b, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32084b, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32084b, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32084b, 65568, null, null, null, null, i13));
        return arrayList;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            this.f32083a.requestFocus();
            AndroidUtilities.showKeyboard(this.f32083a);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new ou0(this, 18), 100L);
        }
    }
}
