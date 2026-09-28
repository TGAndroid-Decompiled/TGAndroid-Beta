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
public class f51 extends org.telegram.ui.ActionBar.e3 {
    public final int f24133b;
    public final GradientDrawable f24134c;
    public final e51 d;
    public final t51 e;
    public int f24135f;

    public f51(Context context, org.telegram.ui.ActionBar.m2 m2Var, t51 t51Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, true);
        this.f24133b = AndroidUtilities.dp(12.0f);
        this.f24134c = new GradientDrawable();
        e51 e51Var = new e51(this, context);
        this.d = e51Var;
        e51Var.addView(t51Var, w7.y5.c(-1.0f, -1));
        this.containerView = e51Var;
        this.e = t51Var;
        t51Var.setParentFragment(m2Var);
        t51Var.setOnScrollListener(new c51(this));
    }

    public static void m(f51 f51Var) {
        t51 t51Var = f51Var.e;
        if (t51Var.c()) {
            f51Var.f24135f = t51Var.getContentTopOffset();
            f51Var.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        t51 t51Var = this.e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(t51Var.f28467a);
        notificationCenter.removeObserver(t51Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(t51Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        t51 t51Var = this.e;
        Objects.requireNonNull(t51Var);
        y6 y6Var = new y6(t51Var, 10);
        i51 i51Var = t51Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.j6(i51Var.f26040a, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.O5));
        ImageView imageView = i51Var.f26041b;
        int i10 = org.telegram.ui.ActionBar.h6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 8, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(i51Var.f26042c, 8, null, null, null, null, i10));
        ci.h2 h2Var = i51Var.e;
        arrayList.add(new org.telegram.ui.ActionBar.j6(h2Var, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(h2Var, 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(h2Var, 16777216, null, null, null, null, org.telegram.ui.ActionBar.h6.Mh));
        s51 s51Var = t51Var.f28473s;
        j51 j51Var = t51Var.f28471n;
        s51Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, j51Var, y6Var);
        arrayList.add(new org.telegram.ui.ActionBar.j6(j51Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(j51Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19461z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(j51Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(j51Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(j51Var, 0, new Class[]{org.telegram.ui.Cells.q3.class}, org.telegram.ui.ActionBar.h6.f19180k0, null, null, org.telegram.ui.ActionBar.h6.f19060d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.Qh));
        org.telegram.ui.Cells.v3.a(arrayList, j51Var);
        gg.g2 g2Var = t51Var.v;
        j51 j51Var2 = t51Var.f28471n;
        g2Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, j51Var2, y6Var);
        int i11 = org.telegram.ui.ActionBar.h6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.j6(j51Var2, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(j51Var2, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"urlTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(j51Var2, 8, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, i11));
        ImageView imageView2 = g2Var.L;
        int i12 = org.telegram.ui.ActionBar.h6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView2, 8, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(g2Var.M, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(t51Var.f28470f, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.V5));
        FrameLayout frameLayout = t51Var.f28474w;
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
