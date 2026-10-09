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
public class x51 extends org.telegram.ui.ActionBar.f3 {
    public final int f32753b;
    public final GradientDrawable f32754c;
    public final w51 d;
    public final l61 f32755e;
    public int f32756f;

    public x51(Context context, org.telegram.ui.ActionBar.n2 n2Var, l61 l61Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, true);
        this.f32753b = AndroidUtilities.dp(12.0f);
        this.f32754c = new GradientDrawable();
        w51 w51Var = new w51(this, context);
        this.d = w51Var;
        w51Var.addView(l61Var, w7.x5.d(-1.0f, -1));
        this.containerView = w51Var;
        this.f32755e = l61Var;
        l61Var.setParentFragment(n2Var);
        l61Var.setOnScrollListener(new t51(this));
    }

    public static void o(x51 x51Var) {
        l61 l61Var = x51Var.f32755e;
        if (l61Var.c()) {
            x51Var.f32756f = l61Var.getContentTopOffset();
            x51Var.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        l61 l61Var = this.f32755e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(l61Var.f28303a);
        notificationCenter.removeObserver(l61Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(l61Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        l61 l61Var = this.f32755e;
        Objects.requireNonNull(l61Var);
        a7 a7Var = new a7(l61Var, 10);
        a61 a61Var = l61Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.k6(a61Var.f25448a, 32, null, null, null, null, org.telegram.ui.ActionBar.i6.O5));
        ImageView imageView = a61Var.f25449b;
        int i10 = org.telegram.ui.ActionBar.i6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView, 8, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(a61Var.f25450c, 8, null, null, null, null, i10));
        ci.g2 g2Var = a61Var.f25451e;
        arrayList.add(new org.telegram.ui.ActionBar.k6(g2Var, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(g2Var, 8388608, null, null, null, null, org.telegram.ui.ActionBar.i6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(g2Var, 16777216, null, null, null, null, org.telegram.ui.ActionBar.i6.Mh));
        k61 k61Var = l61Var.f28310s;
        b61 b61Var = l61Var.f28308n;
        k61Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, b61Var, a7Var);
        arrayList.add(new org.telegram.ui.ActionBar.k6(b61Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(b61Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21199z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(b61Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(b61Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(b61Var, 0, new Class[]{org.telegram.ui.Cells.q3.class}, org.telegram.ui.ActionBar.i6.f20919k0, null, null, org.telegram.ui.ActionBar.i6.f20798d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.Qh));
        org.telegram.ui.Cells.v3.a(arrayList, b61Var);
        gg.f2 f2Var = l61Var.v;
        b61 b61Var2 = l61Var.f28308n;
        f2Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, b61Var2, a7Var);
        int i11 = org.telegram.ui.ActionBar.i6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.k6(b61Var2, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(b61Var2, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"urlTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(b61Var2, 8, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, i11));
        ImageView imageView2 = f2Var.L;
        int i12 = org.telegram.ui.ActionBar.i6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView2, 8, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(f2Var.M, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(l61Var.f28307f, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.V5));
        FrameLayout frameLayout = l61Var.f28311w;
        int i13 = org.telegram.ui.ActionBar.i6.f20868h5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(frameLayout, 1, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, null, null, new Drawable[]{this.shadowDrawable}, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Ii));
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
