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
public final class o80 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public final org.telegram.ui.Components.fa0 T;
    public final org.telegram.ui.ActionBar.e1 U;
    public final org.telegram.ui.ActionBar.e1 V;
    public final org.telegram.ui.ActionBar.e1 W;
    public final ArrayList f40438a0;
    public final org.telegram.ui.Components.c10 f40439b0;
    public int f40440c0;
    public final CacheByChatsController f40441d0;
    public m80 f40442e0;
    public ArrayList f40443f0;
    public final org.telegram.ui.ActionBar.m2 f40444g0;
    public final FrameLayout f40445h0;

    public o80(Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f40438a0 = arrayList;
        this.f40444g0 = m2Var;
        this.f40441d0 = m2Var.getMessagesController().getCacheByChatsController();
        setFitItems(true);
        org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, this, R.drawable.msg_autodelete_1d, LocaleController.formatPluralString("Days", 1, new Object[0]), false, null);
        org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, this, R.drawable.msg_autodelete_2d, LocaleController.formatPluralString("Days", 2, new Object[0]), false, null);
        this.W = c11;
        org.telegram.ui.ActionBar.e1 c12 = org.telegram.ui.ActionBar.u0.c(false, false, this, R.drawable.msg_autodelete_1w, LocaleController.formatPluralString("Weeks", 1, new Object[0]), false, null);
        org.telegram.ui.ActionBar.e1 c13 = org.telegram.ui.ActionBar.u0.c(false, false, this, R.drawable.msg_autodelete_1m, LocaleController.formatPluralString("Months", 1, new Object[0]), false, null);
        this.V = c13;
        org.telegram.ui.ActionBar.e1 c14 = org.telegram.ui.ActionBar.u0.c(false, false, this, R.drawable.msg_cancel, LocaleController.getString(R.string.AutoDeleteMediaNever), false, null);
        org.telegram.ui.ActionBar.e1 c15 = org.telegram.ui.ActionBar.u0.c(false, false, this, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
        this.U = c15;
        int i10 = org.telegram.ui.ActionBar.h6.f21007p7;
        c15.c(org.telegram.ui.ActionBar.h6.x0(null, i10, false), org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        arrayList.add(new n80(c10, CacheByChatsController.KEEP_MEDIA_ONE_DAY));
        arrayList.add(new n80(c11, CacheByChatsController.KEEP_MEDIA_TWO_DAY));
        arrayList.add(new n80(c12, CacheByChatsController.KEEP_MEDIA_ONE_WEEK));
        arrayList.add(new n80(c13, CacheByChatsController.KEEP_MEDIA_ONE_MONTH));
        arrayList.add(new n80(c14, CacheByChatsController.KEEP_MEDIA_FOREVER));
        arrayList.add(new n80(c15, CacheByChatsController.KEEP_MEDIA_DELETE));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40445h0 = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.H8, false));
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20750b7, null)));
        frameLayout.addView(view, w7.x5.d(-1.0f, -1));
        frameLayout.setTag(R.id.fit_width_tag, 1);
        a(frameLayout, w7.x5.n(-1, 8));
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(this, context);
        this.f40439b0 = c10Var;
        a(c10Var, w7.x5.n(-1, 48));
        c10Var.setOnClickListener(new qv(12, this, m2Var));
        for (int i11 = 0; i11 < this.f40438a0.size(); i11++) {
            ((n80) this.f40438a0.get(i11)).f40147a.setOnClickListener(new ci.m4(this, ((n80) this.f40438a0.get(i11)).f40148b, 18));
        }
        org.telegram.ui.Components.fa0 fa0Var = new org.telegram.ui.Components.fa0(context, null);
        this.T = fa0Var;
        fa0Var.setTag(R.id.fit_width_tag, 1);
        fa0Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        fa0Var.setTextSize(1, 13.0f);
        fa0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E8, false));
        fa0Var.setMovementMethod(LinkMovementMethod.getInstance());
        fa0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J6, false));
        fa0Var.setText(LocaleController.getString(R.string.KeepMediaPopupDescription));
        a(fa0Var, w7.x5.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
    }

    public final void f() {
        if (this.f40443f0 != null) {
            ((org.telegram.ui.Components.m9) this.f40439b0.d).setTranslationX((3 - Math.min(3, this.f40443f0.size())) * AndroidUtilities.dp(12.0f));
        }
    }

    public final void g(boolean z10) {
        int i10;
        this.f40440c0 = -1;
        this.f40445h0.setVisibility(0);
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.U.setVisibility(i10);
        this.T.setVisibility(0);
        this.f40439b0.setVisibility(8);
    }

    public void setCallback(m80 m80Var) {
        this.f40442e0 = m80Var;
    }
}
