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
public final class h80 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public final org.telegram.ui.Components.g90 Q;
    public final org.telegram.ui.ActionBar.g1 R;
    public final org.telegram.ui.ActionBar.g1 S;
    public final org.telegram.ui.ActionBar.g1 T;
    public final ArrayList U;
    public final org.telegram.ui.Components.m00 V;
    public int W;
    public final CacheByChatsController f37261a0;
    public f80 f37262b0;
    public ArrayList f37263c0;
    public final org.telegram.ui.ActionBar.p2 f37264d0;
    public final FrameLayout f37265e0;

    public h80(Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.U = arrayList;
        this.f37264d0 = p2Var;
        this.f37261a0 = p2Var.getMessagesController().getCacheByChatsController();
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
        int i10 = org.telegram.ui.ActionBar.k6.f21878p7;
        c14.c(org.telegram.ui.ActionBar.k6.w0(null, i10, false), org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        arrayList.add(new g80(c3, CacheByChatsController.KEEP_MEDIA_ONE_DAY));
        arrayList.add(new g80(c10, CacheByChatsController.KEEP_MEDIA_TWO_DAY));
        arrayList.add(new g80(c11, CacheByChatsController.KEEP_MEDIA_ONE_WEEK));
        arrayList.add(new g80(c12, CacheByChatsController.KEEP_MEDIA_ONE_MONTH));
        arrayList.add(new g80(c13, CacheByChatsController.KEEP_MEDIA_FOREVER));
        arrayList.add(new g80(c14, CacheByChatsController.KEEP_MEDIA_DELETE));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f37265e0 = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.H8, false));
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.k6.U0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21626b7, null)));
        frameLayout.addView(view, k7.c6.c(-1.0f, -1));
        frameLayout.setTag(R.id.fit_width_tag, 1);
        a(frameLayout, k7.c6.n(-1, 8));
        org.telegram.ui.Components.m00 m00Var = new org.telegram.ui.Components.m00(this, context);
        this.V = m00Var;
        a(m00Var, k7.c6.n(-1, 48));
        m00Var.setOnClickListener(new org.telegram.ui.Components.rx0(27, this, p2Var));
        for (int i11 = 0; i11 < this.U.size(); i11++) {
            ((g80) this.U.get(i11)).f37022a.setOnClickListener(new mh.x0(this, ((g80) this.U.get(i11)).f37023b, 15));
        }
        org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(context, null);
        this.Q = g90Var;
        g90Var.setTag(R.id.fit_width_tag, 1);
        g90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        g90Var.setTextSize(1, 13.0f);
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E8, false));
        g90Var.setMovementMethod(LinkMovementMethod.getInstance());
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.J6, false));
        g90Var.setText(LocaleController.getString(R.string.KeepMediaPopupDescription));
        a(g90Var, k7.c6.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
    }

    public final void f() {
        if (this.f37263c0 != null) {
            ((org.telegram.ui.Components.d9) this.V.d).setTranslationX((3 - Math.min(3, this.f37263c0.size())) * AndroidUtilities.dp(12.0f));
        }
    }

    public final void g(boolean z4) {
        int i10;
        this.W = -1;
        this.f37265e0.setVisibility(0);
        if (z4) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.R.setVisibility(i10);
        this.Q.setVisibility(0);
        this.V.setVisibility(8);
    }

    public void setCallback(f80 f80Var) {
        this.f37262b0 = f80Var;
    }
}
