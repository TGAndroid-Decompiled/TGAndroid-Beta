package org.telegram.ui;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class d80 extends ActionBarPopupWindow$ActionBarPopupWindowLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.Components.aa0 T;
    public final org.telegram.ui.ActionBar.g1 U;
    public final org.telegram.ui.ActionBar.g1 V;
    public final org.telegram.ui.ActionBar.g1 W;
    public final ArrayList f38536a0;
    public final c80 f38537b0;
    public int f38538c0;
    public final CacheByChatsController f38539d0;
    public a80 f38540e0;
    public ArrayList f38541f0;
    public final org.telegram.ui.ActionBar.r2 f38542g0;
    public final FrameLayout f38543h0;

    public d80(Context context, org.telegram.ui.ActionBar.r2 r2Var) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f38536a0 = arrayList;
        this.f38542g0 = r2Var;
        this.f38539d0 = r2Var.getMessagesController().getCacheByChatsController();
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
        int i10 = org.telegram.ui.ActionBar.y6.f23582p7;
        c15.d(org.telegram.ui.ActionBar.y6.x0(null, i10, false), org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        arrayList.add(new b80(c10, CacheByChatsController.KEEP_MEDIA_ONE_DAY));
        arrayList.add(new b80(c11, CacheByChatsController.KEEP_MEDIA_TWO_DAY));
        arrayList.add(new b80(c12, CacheByChatsController.KEEP_MEDIA_ONE_WEEK));
        arrayList.add(new b80(c13, CacheByChatsController.KEEP_MEDIA_ONE_MONTH));
        arrayList.add(new b80(c14, CacheByChatsController.KEEP_MEDIA_FOREVER));
        arrayList.add(new b80(c15, CacheByChatsController.KEEP_MEDIA_DELETE));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38543h0 = frameLayout;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.H8, frameLayout, null);
        View view = new View(context);
        org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider, org.telegram.ui.ActionBar.y6.f23319b7, context, view, null);
        frameLayout.addView(view, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        frameLayout.setTag(R.id.fit_width_tag, 1);
        a(frameLayout, org.telegram.ui.Components.kb1.r(-1, 8));
        c80 c80Var = new c80(this, context);
        this.f38537b0 = c80Var;
        a(c80Var, org.telegram.ui.Components.kb1.r(-1, 48));
        c80Var.setOnClickListener(new org.telegram.ui.Components.l51(23, this, r2Var));
        for (int i11 = 0; i11 < this.f38536a0.size(); i11++) {
            ((b80) this.f38536a0.get(i11)).f37921a.setOnClickListener(new ai.w(this, ((b80) this.f38536a0.get(i11)).f37922b, 24));
        }
        org.telegram.ui.Components.aa0 aa0Var = new org.telegram.ui.Components.aa0(context, null);
        this.T = aa0Var;
        aa0Var.setTag(R.id.fit_width_tag, 1);
        aa0Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        aa0Var.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.f7.V(aa0Var, org.telegram.ui.ActionBar.y6.E8, null);
        aa0Var.setMovementMethod(LinkMovementMethod.getInstance());
        org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.J6, null);
        aa0Var.setText(LocaleController.getString(R.string.KeepMediaPopupDescription));
        a(aa0Var, org.telegram.ui.Components.kb1.t(-1, -2, 0.0f, 0, 0, 8, 0, 0));
    }

    public final void g() {
        if (this.f38541f0 != null) {
            this.f38537b0.f38213b.setTranslationX((3 - Math.min(3, this.f38541f0.size())) * AndroidUtilities.dp(12.0f));
        }
    }

    public final void h(boolean z10) {
        int i10;
        this.f38538c0 = -1;
        this.f38543h0.setVisibility(0);
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.U.setVisibility(i10);
        this.T.setVisibility(0);
        this.f38537b0.setVisibility(8);
    }

    public void setCallback(a80 a80Var) {
        this.f38540e0 = a80Var;
    }

    @Override
    public final void updateColors() {
        try {
            org.telegram.ui.ActionBar.g1 g1Var = this.U;
            if (g1Var != null) {
                int i10 = org.telegram.ui.ActionBar.y6.f23582p7;
                g1Var.d(org.telegram.ui.ActionBar.y6.x0(null, i10, false), org.telegram.ui.ActionBar.y6.x0(null, i10, false));
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
