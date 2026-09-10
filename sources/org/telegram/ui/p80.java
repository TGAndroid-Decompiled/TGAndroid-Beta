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
    public final org.telegram.ui.Components.m90 T;
    public final org.telegram.ui.ActionBar.g1 U;
    public final org.telegram.ui.ActionBar.g1 V;
    public final org.telegram.ui.ActionBar.g1 W;
    public final ArrayList f35699a0;
    public final org.telegram.ui.Components.s00 f35700b0;
    public int f35701c0;
    public final CacheByChatsController f35702d0;
    public n80 f35703e0;
    public ArrayList f35704f0;
    public final org.telegram.ui.ActionBar.p2 f35705g0;
    public final FrameLayout f35706h0;

    public p80(Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f35699a0 = arrayList;
        this.f35705g0 = p2Var;
        this.f35702d0 = p2Var.getMessagesController().getCacheByChatsController();
        setFitItems(true);
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_autodelete_1d, LocaleController.formatPluralString("Days", 1, new Object[0]), false, null);
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_autodelete_2d, LocaleController.formatPluralString("Days", 2, new Object[0]), false, null);
        this.W = c11;
        org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_autodelete_1w, LocaleController.formatPluralString("Weeks", 1, new Object[0]), false, null);
        org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_autodelete_1m, LocaleController.formatPluralString("Months", 1, new Object[0]), false, null);
        this.V = c13;
        org.telegram.ui.ActionBar.g1 c14 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_cancel, LocaleController.getString(R.string.AutoDeleteMediaNever), false, null);
        org.telegram.ui.ActionBar.g1 c15 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
        this.U = c15;
        int i10 = org.telegram.ui.ActionBar.j6.f18144p7;
        c15.c(org.telegram.ui.ActionBar.j6.w0(null, i10, false), org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        arrayList.add(new o80(c10, CacheByChatsController.KEEP_MEDIA_ONE_DAY));
        arrayList.add(new o80(c11, CacheByChatsController.KEEP_MEDIA_TWO_DAY));
        arrayList.add(new o80(c12, CacheByChatsController.KEEP_MEDIA_ONE_WEEK));
        arrayList.add(new o80(c13, CacheByChatsController.KEEP_MEDIA_ONE_MONTH));
        arrayList.add(new o80(c14, CacheByChatsController.KEEP_MEDIA_FOREVER));
        arrayList.add(new o80(c15, CacheByChatsController.KEEP_MEDIA_DELETE));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35706h0 = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H8, false));
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.j6.U0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17892b7, null)));
        frameLayout.addView(view, w7.a6.c(-1.0f, -1));
        frameLayout.setTag(R.id.fit_width_tag, 1);
        a(frameLayout, w7.a6.n(-1, 8));
        org.telegram.ui.Components.s00 s00Var = new org.telegram.ui.Components.s00(this, context);
        this.f35700b0 = s00Var;
        a(s00Var, w7.a6.n(-1, 48));
        s00Var.setOnClickListener(new ow(9, this, p2Var));
        for (int i11 = 0; i11 < this.f35699a0.size(); i11++) {
            ((o80) this.f35699a0.get(i11)).f35416a.setOnClickListener(new bi.j5(this, ((o80) this.f35699a0.get(i11)).f35417b, 18));
        }
        org.telegram.ui.Components.m90 m90Var = new org.telegram.ui.Components.m90(context, null);
        this.T = m90Var;
        m90Var.setTag(R.id.fit_width_tag, 1);
        m90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        m90Var.setTextSize(1, 13.0f);
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        m90Var.setMovementMethod(LinkMovementMethod.getInstance());
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
        m90Var.setText(LocaleController.getString(R.string.KeepMediaPopupDescription));
        a(m90Var, w7.a6.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
    }

    public final void f() {
        if (this.f35704f0 != null) {
            ((org.telegram.ui.Components.j9) this.f35700b0.d).setTranslationX((3 - Math.min(3, this.f35704f0.size())) * AndroidUtilities.dp(12.0f));
        }
    }

    public final void g(boolean z10) {
        int i10;
        this.f35701c0 = -1;
        this.f35706h0.setVisibility(0);
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.U.setVisibility(i10);
        this.T.setVisibility(0);
        this.f35700b0.setVisibility(8);
    }

    public void setCallback(n80 n80Var) {
        this.f35703e0 = n80Var;
    }
}
