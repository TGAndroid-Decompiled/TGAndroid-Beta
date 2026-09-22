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
public class q41 extends org.telegram.ui.ActionBar.f3 {
    public final int f27244b;
    public final GradientDrawable f27245c;
    public final p41 d;
    public final e51 e;
    public int f27246f;

    public q41(Context context, org.telegram.ui.ActionBar.n2 n2Var, e51 e51Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, true);
        this.f27244b = AndroidUtilities.dp(12.0f);
        this.f27245c = new GradientDrawable();
        p41 p41Var = new p41(this, context);
        this.d = p41Var;
        p41Var.addView(e51Var, w7.x5.c(-1.0f, -1));
        this.containerView = p41Var;
        this.e = e51Var;
        e51Var.setParentFragment(n2Var);
        e51Var.setOnScrollListener(new n41(this));
    }

    public static void m(q41 q41Var) {
        e51 e51Var = q41Var.e;
        if (e51Var.c()) {
            q41Var.f27246f = e51Var.getContentTopOffset();
            q41Var.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        e51 e51Var = this.e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(e51Var.f23539a);
        notificationCenter.removeObserver(e51Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(e51Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e51 e51Var = this.e;
        Objects.requireNonNull(e51Var);
        w6 w6Var = new w6(e51Var, 10);
        t41 t41Var = e51Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.k6(t41Var.f29748a, 32, null, null, null, null, org.telegram.ui.ActionBar.i6.O5));
        ImageView imageView = t41Var.f29749b;
        int i10 = org.telegram.ui.ActionBar.i6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView, 8, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(t41Var.f29750c, 8, null, null, null, null, i10));
        ci.h2 h2Var = t41Var.e;
        arrayList.add(new org.telegram.ui.ActionBar.k6(h2Var, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(h2Var, 8388608, null, null, null, null, org.telegram.ui.ActionBar.i6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(h2Var, 16777216, null, null, null, null, org.telegram.ui.ActionBar.i6.Mh));
        d51 d51Var = e51Var.f23545s;
        u41 u41Var = e51Var.f23543n;
        d51Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, u41Var, w6Var);
        arrayList.add(new org.telegram.ui.ActionBar.k6(u41Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(u41Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19234z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(u41Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(u41Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(u41Var, 0, new Class[]{org.telegram.ui.Cells.p3.class}, org.telegram.ui.ActionBar.i6.f18955k0, null, null, org.telegram.ui.ActionBar.i6.f18835d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, w6Var, org.telegram.ui.ActionBar.i6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, w6Var, org.telegram.ui.ActionBar.i6.Qh));
        org.telegram.ui.Cells.v3.a(arrayList, u41Var);
        gg.g2 g2Var = e51Var.v;
        u41 u41Var2 = e51Var.f23543n;
        g2Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, u41Var2, w6Var);
        int i11 = org.telegram.ui.ActionBar.i6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.k6(u41Var2, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(u41Var2, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"urlTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(u41Var2, 8, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, w6Var, org.telegram.ui.ActionBar.i6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, w6Var, i11));
        ImageView imageView2 = g2Var.L;
        int i12 = org.telegram.ui.ActionBar.i6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView2, 8, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(g2Var.M, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(e51Var.f23542f, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.V5));
        FrameLayout frameLayout = e51Var.f23546w;
        int i13 = org.telegram.ui.ActionBar.i6.f18904h5;
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
