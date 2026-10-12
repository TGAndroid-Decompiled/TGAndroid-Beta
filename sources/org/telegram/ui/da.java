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
public final class da extends org.telegram.ui.ActionBar.m2 {
    public ca f36705a;
    public ca f36706b;
    public org.telegram.ui.ActionBar.u0 f36707c;
    public org.telegram.ui.ActionBar.c6 d;

    public static void U(da daVar) {
        String str;
        TLRPC.User currentUser = UserConfig.getInstance(daVar.currentAccount).getCurrentUser();
        if (currentUser != null && daVar.f36706b.getText() != null && daVar.f36705a.getText() != null) {
            String obj = daVar.f36705a.getText().toString();
            String obj2 = daVar.f36706b.getText().toString();
            String str2 = currentUser.first_name;
            if (str2 == null || !str2.equals(obj) || (str = currentUser.last_name) == null || !str.equals(obj2)) {
                TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                updateprofile.flags = 3;
                updateprofile.first_name = obj;
                currentUser.first_name = obj;
                updateprofile.last_name = obj2;
                currentUser.last_name = obj2;
                TLRPC.User user = MessagesController.getInstance(daVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(daVar.currentAccount).getClientUserId()));
                if (user != null) {
                    user.first_name = updateprofile.first_name;
                    user.last_name = updateprofile.last_name;
                }
                UserConfig.getInstance(daVar.currentAccount).saveConfig(true);
                NotificationCenter.getInstance(daVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                NotificationCenter.getInstance(daVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
                ConnectionsManager.getInstance(daVar.currentAccount).sendRequest(updateprofile, new ai.v7(8));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.h6.f20598f8;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        kVar.D(org.telegram.ui.ActionBar.h6.w0(i12, c6Var), false);
        this.actionBar.E(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20895v8, c6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EditName));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 27));
        this.f36707c = this.actionBar.p().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new bi.d(2));
        ca caVar = new ca(this, context, 0);
        this.f36705a = caVar;
        caVar.setTextSize(1, 18.0f);
        ca caVar2 = this.f36705a;
        int i13 = org.telegram.ui.ActionBar.h6.H6;
        caVar2.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(i13, c6Var));
        ca caVar3 = this.f36705a;
        int i14 = org.telegram.ui.ActionBar.h6.G6;
        caVar3.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, c6Var));
        this.f36705a.setBackgroundDrawable(null);
        ca caVar4 = this.f36705a;
        int i15 = org.telegram.ui.ActionBar.h6.f20688k6;
        int themedColor = getThemedColor(i15);
        int i16 = org.telegram.ui.ActionBar.h6.f20706l6;
        int themedColor2 = getThemedColor(i16);
        int i17 = org.telegram.ui.ActionBar.h6.f20781p7;
        caVar4.setLineColors(themedColor, themedColor2, getThemedColor(i17));
        this.f36705a.setMaxLines(1);
        this.f36705a.setLines(1);
        this.f36705a.setSingleLine(true);
        ca caVar5 = this.f36705a;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        caVar5.setGravity(i10);
        this.f36705a.setInputType(49152);
        this.f36705a.setImeOptions(5);
        this.f36705a.setHint(LocaleController.getString(R.string.FirstName));
        this.f36705a.setCursorColor(org.telegram.ui.ActionBar.h6.w0(i14, c6Var));
        this.f36705a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f36705a.setCursorWidth(1.5f);
        linearLayout.addView(this.f36705a, w7.w5.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.f36705a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final da f36119b;

            {
                this.f36119b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i18 == 5) {
                            da daVar = this.f36119b;
                            daVar.f36706b.requestFocus();
                            ca caVar6 = daVar.f36706b;
                            caVar6.setSelection(caVar6.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i18 == 6) {
                            this.f36119b.f36707c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        ca caVar6 = new ca(this, context, 1);
        this.f36706b = caVar6;
        caVar6.setTextSize(1, 18.0f);
        this.f36706b.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(i13, c6Var));
        this.f36706b.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, c6Var));
        this.f36706b.setBackgroundDrawable(null);
        this.f36706b.setLineColors(getThemedColor(i15), getThemedColor(i16), getThemedColor(i17));
        this.f36706b.setMaxLines(1);
        this.f36706b.setLines(1);
        this.f36706b.setSingleLine(true);
        ca caVar7 = this.f36706b;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        caVar7.setGravity(i11);
        this.f36706b.setInputType(49152);
        this.f36706b.setImeOptions(6);
        this.f36706b.setHint(LocaleController.getString(R.string.LastName));
        this.f36706b.setCursorColor(org.telegram.ui.ActionBar.h6.w0(i14, c6Var));
        this.f36706b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f36706b.setCursorWidth(1.5f);
        linearLayout.addView(this.f36706b, w7.w5.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.f36706b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final da f36119b;

            {
                this.f36119b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i18 == 5) {
                            da daVar = this.f36119b;
                            daVar.f36706b.requestFocus();
                            ca caVar62 = daVar.f36706b;
                            caVar62.setSelection(caVar62.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i18 == 6) {
                            this.f36119b.f36707c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (user != null) {
            this.f36705a.setText(user.first_name);
            ca caVar8 = this.f36705a;
            caVar8.setSelection(caVar8.length());
            this.f36706b.setText(user.last_name);
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
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20560d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20840s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f20895v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f20859t8));
        ca caVar = this.f36705a;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(caVar, 4, null, null, null, null, i10));
        ca caVar2 = this.f36705a;
        int i11 = org.telegram.ui.ActionBar.h6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(caVar2, 8388608, null, null, null, null, i11));
        ca caVar3 = this.f36705a;
        int i12 = org.telegram.ui.ActionBar.h6.f20688k6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(caVar3, 32, null, null, null, null, i12));
        ca caVar4 = this.f36705a;
        int i13 = org.telegram.ui.ActionBar.h6.f20706l6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(caVar4, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36706b, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36706b, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36706b, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36706b, 65568, null, null, null, null, i13));
        return arrayList;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            this.f36705a.requestFocus();
            AndroidUtilities.showKeyboard(this.f36705a);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new pu0(this, 18), 100L);
        }
    }
}
