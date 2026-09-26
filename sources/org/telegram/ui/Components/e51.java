package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public class e51 extends org.telegram.ui.ActionBar.e3 {
    public final int f23845b;
    public final GradientDrawable f23846c;
    public final d51 d;
    public final s51 e;
    public int f23847f;

    public e51(Context context, org.telegram.ui.ActionBar.m2 m2Var, s51 s51Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, true);
        this.f23845b = AndroidUtilities.dp(12.0f);
        this.f23846c = new GradientDrawable();
        d51 d51Var = new d51(this, context);
        this.d = d51Var;
        d51Var.addView(s51Var, w7.y5.c(-1.0f, -1));
        this.containerView = d51Var;
        this.e = s51Var;
        s51Var.setParentFragment(m2Var);
        s51Var.setOnScrollListener(new b51(this));
    }

    public static void m(e51 e51Var) {
        s51 s51Var = e51Var.e;
        if (s51Var.c()) {
            e51Var.f23847f = s51Var.getContentTopOffset();
            e51Var.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        s51 s51Var = this.e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(s51Var.f28160a);
        notificationCenter.removeObserver(s51Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(s51Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        s51 s51Var = this.e;
        Objects.requireNonNull(s51Var);
        y6 y6Var = new y6(s51Var, 10);
        h51 h51Var = s51Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.j6(h51Var.f25761a, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.O5));
        ImageView imageView = h51Var.f25762b;
        int i10 = org.telegram.ui.ActionBar.h6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 8, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(h51Var.f25763c, 8, null, null, null, null, i10));
        ci.h2 h2Var = h51Var.e;
        arrayList.add(new org.telegram.ui.ActionBar.j6(h2Var, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(h2Var, 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(h2Var, 16777216, null, null, null, null, org.telegram.ui.ActionBar.h6.Mh));
        r51 r51Var = s51Var.f28166s;
        i51 i51Var = s51Var.f28164n;
        r51Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, i51Var, y6Var);
        arrayList.add(new org.telegram.ui.ActionBar.j6(i51Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(i51Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19461z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(i51Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(i51Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(i51Var, 0, new Class[]{org.telegram.ui.Cells.q3.class}, org.telegram.ui.ActionBar.h6.f19180k0, null, null, org.telegram.ui.ActionBar.h6.f19060d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.Qh));
        org.telegram.ui.Cells.v3.a(arrayList, i51Var);
        gg.g2 g2Var = s51Var.v;
        i51 i51Var2 = s51Var.f28164n;
        g2Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, i51Var2, y6Var);
        int i11 = org.telegram.ui.ActionBar.h6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.j6(i51Var2, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(i51Var2, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"urlTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(i51Var2, 8, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, i11));
        ImageView imageView2 = g2Var.L;
        int i12 = org.telegram.ui.ActionBar.h6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView2, 8, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(g2Var.M, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(s51Var.f28163f, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.V5));
        FrameLayout frameLayout = s51Var.f28167w;
        int i13 = org.telegram.ui.ActionBar.h6.f19129h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(frameLayout, 1, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, null, null, new Drawable[]{this.shadowDrawable}, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Ii));
        return arrayList;
    }

    @Override
    public final void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 2);
    }
}
