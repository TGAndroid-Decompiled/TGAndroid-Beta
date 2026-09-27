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
public final class n80 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public final org.telegram.ui.Components.p90 T;
    public final org.telegram.ui.ActionBar.g1 U;
    public final org.telegram.ui.ActionBar.g1 V;
    public final org.telegram.ui.ActionBar.g1 W;
    public final ArrayList f35840a0;
    public final org.telegram.ui.Components.n00 f35841b0;
    public int f35842c0;
    public final CacheByChatsController f35843d0;
    public l80 f35844e0;
    public ArrayList f35845f0;
    public final org.telegram.ui.ActionBar.o2 f35846g0;
    public final FrameLayout f35847h0;

    public n80(Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f35840a0 = arrayList;
        this.f35846g0 = o2Var;
        this.f35843d0 = o2Var.getMessagesController().getCacheByChatsController();
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
        int i10 = org.telegram.ui.ActionBar.i6.f19278p7;
        c15.c(org.telegram.ui.ActionBar.i6.w0(null, i10, false), org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        arrayList.add(new m80(c10, CacheByChatsController.KEEP_MEDIA_ONE_DAY));
        arrayList.add(new m80(c11, CacheByChatsController.KEEP_MEDIA_TWO_DAY));
        arrayList.add(new m80(c12, CacheByChatsController.KEEP_MEDIA_ONE_WEEK));
        arrayList.add(new m80(c13, CacheByChatsController.KEEP_MEDIA_ONE_MONTH));
        arrayList.add(new m80(c14, CacheByChatsController.KEEP_MEDIA_FOREVER));
        arrayList.add(new m80(c15, CacheByChatsController.KEEP_MEDIA_DELETE));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35847h0 = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.H8, false));
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.i6.U0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19021b7, null)));
        frameLayout.addView(view, w7.y5.c(-1.0f, -1));
        frameLayout.setTag(R.id.fit_width_tag, 1);
        a(frameLayout, w7.y5.n(-1, 8));
        org.telegram.ui.Components.n00 n00Var = new org.telegram.ui.Components.n00(this, context);
        this.f35841b0 = n00Var;
        a(n00Var, w7.y5.n(-1, 48));
        n00Var.setOnClickListener(new rv(12, this, o2Var));
        for (int i11 = 0; i11 < this.f35840a0.size(); i11++) {
            ((m80) this.f35840a0.get(i11)).f35548a.setOnClickListener(new ci.n4(this, ((m80) this.f35840a0.get(i11)).f35549b, 18));
        }
        org.telegram.ui.Components.p90 p90Var = new org.telegram.ui.Components.p90(context, null);
        this.T = p90Var;
        p90Var.setTag(R.id.fit_width_tag, 1);
        p90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        p90Var.setTextSize(1, 13.0f);
        p90Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.E8, false));
        p90Var.setMovementMethod(LinkMovementMethod.getInstance());
        p90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.J6, false));
        p90Var.setText(LocaleController.getString(R.string.KeepMediaPopupDescription));
        a(p90Var, w7.y5.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
    }

    public final void f() {
        if (this.f35845f0 != null) {
            ((org.telegram.ui.Components.k9) this.f35841b0.d).setTranslationX((3 - Math.min(3, this.f35845f0.size())) * AndroidUtilities.dp(12.0f));
        }
    }

    public final void g(boolean z10) {
        int i10;
        this.f35842c0 = -1;
        this.f35847h0.setVisibility(0);
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.U.setVisibility(i10);
        this.T.setVisibility(0);
        this.f35841b0.setVisibility(8);
    }

    public void setCallback(l80 l80Var) {
        this.f35844e0 = l80Var;
    }
}
