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
public final class i80 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public final org.telegram.ui.Components.f90 Q;
    public final org.telegram.ui.ActionBar.g1 R;
    public final org.telegram.ui.ActionBar.g1 S;
    public final org.telegram.ui.ActionBar.g1 T;
    public final ArrayList U;
    public final org.telegram.ui.Components.l00 V;
    public int W;
    public final CacheByChatsController f34837a0;
    public g80 f34838b0;
    public ArrayList f34839c0;
    public final org.telegram.ui.ActionBar.p2 f34840d0;
    public final FrameLayout f34841e0;

    public i80(Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.U = arrayList;
        this.f34840d0 = p2Var;
        this.f34837a0 = p2Var.getMessagesController().getCacheByChatsController();
        setFitItems(true);
        org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_autodelete_1d, LocaleController.formatPluralString("Days", 1, new Object[0]), false, null);
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_autodelete_2d, LocaleController.formatPluralString("Days", 2, new Object[0]), false, null);
        this.T = c10;
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_autodelete_1w, LocaleController.formatPluralString("Weeks", 1, new Object[0]), false, null);
        org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_autodelete_1m, LocaleController.formatPluralString("Months", 1, new Object[0]), false, null);
        this.S = c12;
        org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_cancel, LocaleController.getString(R.string.AutoDeleteMediaNever), false, null);
        org.telegram.ui.ActionBar.g1 c14 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
        this.R = c14;
        int i10 = org.telegram.ui.ActionBar.j6.f20097p7;
        c14.c(org.telegram.ui.ActionBar.j6.w0(null, i10, false), org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        arrayList.add(new h80(c3, CacheByChatsController.KEEP_MEDIA_ONE_DAY));
        arrayList.add(new h80(c10, CacheByChatsController.KEEP_MEDIA_TWO_DAY));
        arrayList.add(new h80(c11, CacheByChatsController.KEEP_MEDIA_ONE_WEEK));
        arrayList.add(new h80(c12, CacheByChatsController.KEEP_MEDIA_ONE_MONTH));
        arrayList.add(new h80(c13, CacheByChatsController.KEEP_MEDIA_FOREVER));
        arrayList.add(new h80(c14, CacheByChatsController.KEEP_MEDIA_DELETE));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34841e0 = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H8, false));
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.j6.U0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19846b7, null)));
        frameLayout.addView(view, k7.b6.c(-1.0f, -1));
        frameLayout.setTag(R.id.fit_width_tag, 1);
        a(frameLayout, k7.b6.n(-1, 8));
        org.telegram.ui.Components.l00 l00Var = new org.telegram.ui.Components.l00(this, context);
        this.V = l00Var;
        a(l00Var, k7.b6.n(-1, 48));
        l00Var.setOnClickListener(new org.telegram.ui.Components.rx0(27, this, p2Var));
        for (int i11 = 0; i11 < this.U.size(); i11++) {
            ((h80) this.U.get(i11)).f34602a.setOnClickListener(new lh.y0(this, ((h80) this.U.get(i11)).f34603b, 15));
        }
        org.telegram.ui.Components.f90 f90Var = new org.telegram.ui.Components.f90(context, null);
        this.Q = f90Var;
        f90Var.setTag(R.id.fit_width_tag, 1);
        f90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        f90Var.setTextSize(1, 13.0f);
        f90Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        f90Var.setMovementMethod(LinkMovementMethod.getInstance());
        f90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
        f90Var.setText(LocaleController.getString(R.string.KeepMediaPopupDescription));
        a(f90Var, k7.b6.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
    }

    public final void f() {
        if (this.f34839c0 != null) {
            ((org.telegram.ui.Components.d9) this.V.d).setTranslationX((3 - Math.min(3, this.f34839c0.size())) * AndroidUtilities.dp(12.0f));
        }
    }

    public final void g(boolean z4) {
        int i10;
        this.W = -1;
        this.f34841e0.setVisibility(0);
        if (z4) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.R.setVisibility(i10);
        this.Q.setVisibility(0);
        this.V.setVisibility(8);
    }

    public void setCallback(g80 g80Var) {
        this.f34838b0 = g80Var;
    }
}
