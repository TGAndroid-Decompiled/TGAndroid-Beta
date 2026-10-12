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
public class c61 extends org.telegram.ui.ActionBar.e3 {
    public final int f24840b;
    public final GradientDrawable f24841c;
    public final b61 d;
    public final q61 f24842e;
    public int f24843f;

    public c61(Context context, org.telegram.ui.ActionBar.m2 m2Var, q61 q61Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(1, context, c6Var, true);
        this.f24840b = AndroidUtilities.dp(12.0f);
        this.f24841c = new GradientDrawable();
        b61 b61Var = new b61(this, context);
        this.d = b61Var;
        b61Var.addView(q61Var, w7.w5.d(-1.0f, -1));
        this.containerView = b61Var;
        this.f24842e = q61Var;
        q61Var.setParentFragment(m2Var);
        q61Var.setOnScrollListener(new y51(this));
    }

    public static void o(c61 c61Var) {
        q61 q61Var = c61Var.f24842e;
        if (q61Var.c()) {
            c61Var.f24843f = q61Var.getContentTopOffset();
            c61Var.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        q61 q61Var = this.f24842e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(q61Var.f29737a);
        notificationCenter.removeObserver(q61Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(q61Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        q61 q61Var = this.f24842e;
        Objects.requireNonNull(q61Var);
        a7 a7Var = new a7(q61Var, 10);
        f61 f61Var = q61Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.j6(f61Var.f27247a, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.O5));
        ImageView imageView = f61Var.f27248b;
        int i10 = org.telegram.ui.ActionBar.h6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 8, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(f61Var.f27249c, 8, null, null, null, null, i10));
        ci.g2 g2Var = f61Var.f27250e;
        arrayList.add(new org.telegram.ui.ActionBar.j6(g2Var, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(g2Var, 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(g2Var, 16777216, null, null, null, null, org.telegram.ui.ActionBar.h6.Mh));
        p61 p61Var = q61Var.f29744s;
        g61 g61Var = q61Var.f29742n;
        p61Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, g61Var, a7Var);
        arrayList.add(new org.telegram.ui.ActionBar.j6(g61Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(g61Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20963z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(g61Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(g61Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(g61Var, 0, new Class[]{org.telegram.ui.Cells.q3.class}, org.telegram.ui.ActionBar.h6.f20681k0, null, null, org.telegram.ui.ActionBar.h6.f20560d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.Qh));
        org.telegram.ui.Cells.v3.a(arrayList, g61Var);
        gg.f2 f2Var = q61Var.v;
        g61 g61Var2 = q61Var.f29742n;
        f2Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, g61Var2, a7Var);
        int i11 = org.telegram.ui.ActionBar.h6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.j6(g61Var2, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(g61Var2, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"urlTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(g61Var2, 8, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, i11));
        ImageView imageView2 = f2Var.L;
        int i12 = org.telegram.ui.ActionBar.h6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView2, 8, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(f2Var.M, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(q61Var.f29741f, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.V5));
        FrameLayout frameLayout = q61Var.f29745w;
        int i13 = org.telegram.ui.ActionBar.h6.f20630h5;
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
