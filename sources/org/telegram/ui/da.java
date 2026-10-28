package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class da extends org.telegram.ui.ActionBar.r2 {
    public ca f38561a;
    public ca f38562b;
    public org.telegram.ui.ActionBar.w0 f38563c;
    public org.telegram.ui.ActionBar.u6 d;

    public static void V(da daVar) {
        String str;
        TLRPC.User currentUser = UserConfig.getInstance(daVar.currentAccount).getCurrentUser();
        if (currentUser != null && daVar.f38562b.getText() != null && daVar.f38561a.getText() != null) {
            String obj = daVar.f38561a.getText().toString();
            String obj2 = daVar.f38562b.getText().toString();
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
                ConnectionsManager.getInstance(daVar.currentAccount).sendRequest(updateprofile, new di.d6(8));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23657t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23637s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d6));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.u6 u6Var = this.d;
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 3, org.telegram.ui.ActionBar.y6.f23395f8, u6Var);
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 1, org.telegram.ui.ActionBar.y6.f23695v8, u6Var);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EditName));
        this.actionBar.setActionBarMenuOnItemClick(new bh.m(this, 29));
        this.f38563c = this.actionBar.l().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new ei.d(2));
        ca caVar = new ca(this, context, 0);
        this.f38561a = caVar;
        caVar.setTextSize(1, 18.0f);
        ca caVar2 = this.f38561a;
        int i12 = org.telegram.ui.ActionBar.y6.H6;
        org.telegram.ui.ActionBar.f7.E(caVar2, i12, u6Var);
        ca caVar3 = this.f38561a;
        int i13 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(caVar3, i13, u6Var);
        this.f38561a.setBackgroundDrawable(null);
        ca caVar4 = this.f38561a;
        int i14 = org.telegram.ui.ActionBar.y6.f23485k6;
        int i15 = org.telegram.ui.ActionBar.y6.f23503l6;
        int i16 = org.telegram.ui.ActionBar.y6.f23582p7;
        org.telegram.ui.ActionBar.f7.G(caVar4, i14, i15, i16, u6Var);
        this.f38561a.setMaxLines(1);
        this.f38561a.setLines(1);
        this.f38561a.setSingleLine(true);
        ca caVar5 = this.f38561a;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        caVar5.setGravity(i10);
        this.f38561a.setInputType(49152);
        this.f38561a.setImeOptions(5);
        this.f38561a.setHint(LocaleController.getString(R.string.FirstName));
        org.telegram.ui.ActionBar.f7.w(this.f38561a, i13, u6Var);
        this.f38561a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f38561a.setCursorWidth(1.5f);
        linearLayout.addView(this.f38561a, org.telegram.ui.Components.kb1.o(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.f38561a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final da f37961b;

            {
                this.f37961b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i17, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i17 == 5) {
                            da daVar = this.f37961b;
                            daVar.f38562b.requestFocus();
                            ca caVar6 = daVar.f38562b;
                            caVar6.setSelection(caVar6.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i17 == 6) {
                            this.f37961b.f38563c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        ca caVar6 = new ca(this, context, 1);
        this.f38562b = caVar6;
        caVar6.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.f7.E(this.f38562b, i12, u6Var);
        org.telegram.ui.ActionBar.f7.V(this.f38562b, i13, u6Var);
        this.f38562b.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.f7.G(this.f38562b, i14, i15, i16, u6Var);
        this.f38562b.setMaxLines(1);
        this.f38562b.setLines(1);
        this.f38562b.setSingleLine(true);
        ca caVar7 = this.f38562b;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        caVar7.setGravity(i11);
        this.f38562b.setInputType(49152);
        this.f38562b.setImeOptions(6);
        this.f38562b.setHint(LocaleController.getString(R.string.LastName));
        org.telegram.ui.ActionBar.f7.w(this.f38562b, i13, u6Var);
        this.f38562b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f38562b.setCursorWidth(1.5f);
        linearLayout.addView(this.f38562b, org.telegram.ui.Components.kb1.o(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.f38562b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final da f37961b;

            {
                this.f37961b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i17, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i17 == 5) {
                            da daVar = this.f37961b;
                            daVar.f38562b.requestFocus();
                            ca caVar62 = daVar.f38562b;
                            caVar62.setSelection(caVar62.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i17 == 6) {
                            this.f37961b.f38563c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (user != null) {
            this.f38561a.setText(user.first_name);
            ca caVar8 = this.f38561a;
            caVar8.setSelection(caVar8.length());
            this.f38562b.setText(user.last_name);
        }
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.ActionBar.u6 getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ca caVar = this.f38561a;
        int i10 = org.telegram.ui.ActionBar.y6.f23485k6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(caVar, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        ca caVar2 = this.f38561a;
        int i11 = org.telegram.ui.ActionBar.y6.f23503l6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(caVar2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f38562b, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f38562b, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        return arrayList;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            this.f38561a.requestFocus();
            AndroidUtilities.showKeyboard(this.f38561a);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new bu0(this, 18), 100L);
        }
    }
}
