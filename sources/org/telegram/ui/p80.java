package org.telegram.ui;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class p80 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public final org.telegram.ui.Components.d90 T;
    public final org.telegram.ui.ActionBar.f1 U;
    public final org.telegram.ui.ActionBar.f1 V;
    public final org.telegram.ui.ActionBar.f1 W;
    public final ArrayList f39452a0;
    public final org.telegram.ui.Components.l00 f39453b0;
    public int f39454c0;
    public final CacheByChatsController f39455d0;
    public n80 f39456e0;
    public ArrayList f39457f0;
    public final org.telegram.ui.ActionBar.n2 f39458g0;
    public final FrameLayout f39459h0;

    public p80(Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f39452a0 = arrayList;
        this.f39458g0 = n2Var;
        this.f39455d0 = n2Var.getMessagesController().getCacheByChatsController();
        setFitItems(true);
        org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_autodelete_1d, LocaleController.formatPluralString("Days", 1, new Object[0]), false, null);
        org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_autodelete_2d, LocaleController.formatPluralString("Days", 2, new Object[0]), false, null);
        this.W = c11;
        org.telegram.ui.ActionBar.f1 c12 = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_autodelete_1w, LocaleController.formatPluralString("Weeks", 1, new Object[0]), false, null);
        org.telegram.ui.ActionBar.f1 c13 = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_autodelete_1m, LocaleController.formatPluralString("Months", 1, new Object[0]), false, null);
        this.V = c13;
        org.telegram.ui.ActionBar.f1 c14 = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_cancel, LocaleController.getString(R.string.AutoDeleteMediaNever), false, null);
        org.telegram.ui.ActionBar.f1 c15 = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
        this.U = c15;
        int i10 = org.telegram.ui.ActionBar.j6.f20907p7;
        c15.c(org.telegram.ui.ActionBar.j6.w0(null, i10, false), org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        arrayList.add(new o80(c10, CacheByChatsController.KEEP_MEDIA_ONE_DAY));
        arrayList.add(new o80(c11, CacheByChatsController.KEEP_MEDIA_TWO_DAY));
        arrayList.add(new o80(c12, CacheByChatsController.KEEP_MEDIA_ONE_WEEK));
        arrayList.add(new o80(c13, CacheByChatsController.KEEP_MEDIA_ONE_MONTH));
        arrayList.add(new o80(c14, CacheByChatsController.KEEP_MEDIA_FOREVER));
        arrayList.add(new o80(c15, CacheByChatsController.KEEP_MEDIA_DELETE));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39459h0 = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H8, false));
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.j6.U0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20654b7, null)));
        frameLayout.addView(view, w7.x5.c(-1.0f, -1));
        frameLayout.setTag(R.id.fit_width_tag, 1);
        a(frameLayout, w7.x5.n(-1, 8));
        org.telegram.ui.Components.l00 l00Var = new org.telegram.ui.Components.l00(this, context);
        this.f39453b0 = l00Var;
        a(l00Var, w7.x5.n(-1, 48));
        l00Var.setOnClickListener(new tv(12, this, n2Var));
        for (int i11 = 0; i11 < this.f39452a0.size(); i11++) {
            ((o80) this.f39452a0.get(i11)).f39160a.setOnClickListener(new di.o4(this, ((o80) this.f39452a0.get(i11)).f39161b, 18));
        }
        org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(context, null);
        this.T = d90Var;
        d90Var.setTag(R.id.fit_width_tag, 1);
        d90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        d90Var.setTextSize(1, 13.0f);
        d90Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        d90Var.setMovementMethod(LinkMovementMethod.getInstance());
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
        d90Var.setText(LocaleController.getString(R.string.KeepMediaPopupDescription));
        a(d90Var, w7.x5.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
    }

    public final void f() {
        if (this.f39457f0 != null) {
            ((org.telegram.ui.Components.l9) this.f39453b0.d).setTranslationX((3 - Math.min(3, this.f39457f0.size())) * AndroidUtilities.dp(12.0f));
        }
    }

    public final void g(boolean z10) {
        int i10;
        this.f39454c0 = -1;
        this.f39459h0.setVisibility(0);
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.U.setVisibility(i10);
        this.T.setVisibility(0);
        this.f39453b0.setVisibility(8);
    }

    public void setCallback(n80 n80Var) {
        this.f39456e0 = n80Var;
    }
}
