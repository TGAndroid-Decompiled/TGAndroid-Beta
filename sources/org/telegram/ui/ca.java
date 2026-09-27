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
public final class ca extends org.telegram.ui.ActionBar.o2 {
    public ba f32642a;
    public ba f32643b;
    public org.telegram.ui.ActionBar.w0 f32644c;
    public org.telegram.ui.ActionBar.e6 d;

    public static void U(ca caVar) {
        String str;
        TLRPC.User currentUser = UserConfig.getInstance(caVar.currentAccount).getCurrentUser();
        if (currentUser != null && caVar.f32643b.getText() != null && caVar.f32642a.getText() != null) {
            String obj = caVar.f32642a.getText().toString();
            String obj2 = caVar.f32643b.getText().toString();
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
                ConnectionsManager.getInstance(caVar.currentAccount).sendRequest(updateprofile, new ai.u7(8));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.i6.f19094f8;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        lVar.B(org.telegram.ui.ActionBar.i6.v0(i12, e6Var), false);
        this.actionBar.E(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19392v8, e6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EditName));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 26));
        this.f32644c = this.actionBar.o().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new bi.d(2));
        ba baVar = new ba(this, context, 0);
        this.f32642a = baVar;
        baVar.setTextSize(1, 18.0f);
        ba baVar2 = this.f32642a;
        int i13 = org.telegram.ui.ActionBar.i6.H6;
        baVar2.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(i13, e6Var));
        ba baVar3 = this.f32642a;
        int i14 = org.telegram.ui.ActionBar.i6.G6;
        baVar3.setTextColor(org.telegram.ui.ActionBar.i6.v0(i14, e6Var));
        this.f32642a.setBackgroundDrawable(null);
        ba baVar4 = this.f32642a;
        int i15 = org.telegram.ui.ActionBar.i6.f19185k6;
        int themedColor = getThemedColor(i15);
        int i16 = org.telegram.ui.ActionBar.i6.f19203l6;
        int themedColor2 = getThemedColor(i16);
        int i17 = org.telegram.ui.ActionBar.i6.f19278p7;
        baVar4.setLineColors(themedColor, themedColor2, getThemedColor(i17));
        this.f32642a.setMaxLines(1);
        this.f32642a.setLines(1);
        this.f32642a.setSingleLine(true);
        ba baVar5 = this.f32642a;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        baVar5.setGravity(i10);
        this.f32642a.setInputType(49152);
        this.f32642a.setImeOptions(5);
        this.f32642a.setHint(LocaleController.getString(R.string.FirstName));
        this.f32642a.setCursorColor(org.telegram.ui.ActionBar.i6.v0(i14, e6Var));
        this.f32642a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f32642a.setCursorWidth(1.5f);
        linearLayout.addView(this.f32642a, w7.y5.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.f32642a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ca f32023b;

            {
                this.f32023b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i18 == 5) {
                            ca caVar = this.f32023b;
                            caVar.f32643b.requestFocus();
                            ba baVar6 = caVar.f32643b;
                            baVar6.setSelection(baVar6.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i18 == 6) {
                            this.f32023b.f32644c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        ba baVar6 = new ba(this, context, 1);
        this.f32643b = baVar6;
        baVar6.setTextSize(1, 18.0f);
        this.f32643b.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(i13, e6Var));
        this.f32643b.setTextColor(org.telegram.ui.ActionBar.i6.v0(i14, e6Var));
        this.f32643b.setBackgroundDrawable(null);
        this.f32643b.setLineColors(getThemedColor(i15), getThemedColor(i16), getThemedColor(i17));
        this.f32643b.setMaxLines(1);
        this.f32643b.setLines(1);
        this.f32643b.setSingleLine(true);
        ba baVar7 = this.f32643b;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        baVar7.setGravity(i11);
        this.f32643b.setInputType(49152);
        this.f32643b.setImeOptions(6);
        this.f32643b.setHint(LocaleController.getString(R.string.LastName));
        this.f32643b.setCursorColor(org.telegram.ui.ActionBar.i6.v0(i14, e6Var));
        this.f32643b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f32643b.setCursorWidth(1.5f);
        linearLayout.addView(this.f32643b, w7.y5.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.f32643b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ca f32023b;

            {
                this.f32023b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i18 == 5) {
                            ca caVar = this.f32023b;
                            caVar.f32643b.requestFocus();
                            ba baVar62 = caVar.f32643b;
                            baVar62.setSelection(baVar62.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i18 == 6) {
                            this.f32023b.f32644c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (user != null) {
            this.f32642a.setText(user.first_name);
            ba baVar8 = this.f32642a;
            baVar8.setSelection(baVar8.length());
            this.f32643b.setText(user.last_name);
        }
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f19057d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f19337s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f19392v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f19356t8));
        ba baVar = this.f32642a;
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(baVar, 4, null, null, null, null, i10));
        ba baVar2 = this.f32642a;
        int i11 = org.telegram.ui.ActionBar.i6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(baVar2, 8388608, null, null, null, null, i11));
        ba baVar3 = this.f32642a;
        int i12 = org.telegram.ui.ActionBar.i6.f19185k6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(baVar3, 32, null, null, null, null, i12));
        ba baVar4 = this.f32642a;
        int i13 = org.telegram.ui.ActionBar.i6.f19203l6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(baVar4, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32643b, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32643b, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32643b, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32643b, 65568, null, null, null, null, i13));
        return arrayList;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            this.f32642a.requestFocus();
            AndroidUtilities.showKeyboard(this.f32642a);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new hu0(this, 18), 100L);
        }
    }
}
