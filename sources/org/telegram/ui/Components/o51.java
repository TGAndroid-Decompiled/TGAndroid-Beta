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
public class o51 extends org.telegram.ui.ActionBar.f3 {
    public final int f29240b;
    public final GradientDrawable f29241c;
    public final n51 d;
    public final c61 f29242e;
    public int f29243f;

    public o51(Context context, org.telegram.ui.ActionBar.n2 n2Var, c61 c61Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, true);
        this.f29240b = AndroidUtilities.dp(12.0f);
        this.f29241c = new GradientDrawable();
        n51 n51Var = new n51(this, context);
        this.d = n51Var;
        n51Var.addView(c61Var, w7.z5.c(-1.0f, -1));
        this.containerView = n51Var;
        this.f29242e = c61Var;
        c61Var.setParentFragment(n2Var);
        c61Var.setOnScrollListener(new l51(this));
    }

    public static void m(o51 o51Var) {
        c61 c61Var = o51Var.f29242e;
        if (c61Var.c()) {
            o51Var.f29243f = c61Var.getContentTopOffset();
            o51Var.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        c61 c61Var = this.f29242e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(c61Var.f25232a);
        notificationCenter.removeObserver(c61Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(c61Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        c61 c61Var = this.f29242e;
        Objects.requireNonNull(c61Var);
        y6 y6Var = new y6(c61Var, 10);
        r51 r51Var = c61Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.k6(r51Var.f29674a, 32, null, null, null, null, org.telegram.ui.ActionBar.i6.O5));
        ImageView imageView = r51Var.f29675b;
        int i10 = org.telegram.ui.ActionBar.i6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView, 8, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(r51Var.f29676c, 8, null, null, null, null, i10));
        ci.h2 h2Var = r51Var.f29677e;
        arrayList.add(new org.telegram.ui.ActionBar.k6(h2Var, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(h2Var, 8388608, null, null, null, null, org.telegram.ui.ActionBar.i6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(h2Var, 16777216, null, null, null, null, org.telegram.ui.ActionBar.i6.Mh));
        b61 b61Var = c61Var.f25239s;
        s51 s51Var = c61Var.f25237n;
        b61Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, s51Var, y6Var);
        arrayList.add(new org.telegram.ui.ActionBar.k6(s51Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(s51Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21228z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(s51Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(s51Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(s51Var, 0, new Class[]{org.telegram.ui.Cells.q3.class}, org.telegram.ui.ActionBar.i6.f20945k0, null, null, org.telegram.ui.ActionBar.i6.f20823d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.Qh));
        org.telegram.ui.Cells.v3.a(arrayList, s51Var);
        gg.g2 g2Var = c61Var.v;
        g2Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, s51Var, y6Var);
        int i11 = org.telegram.ui.ActionBar.i6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.k6(s51Var, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(s51Var, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"urlTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(s51Var, 8, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, i11));
        ImageView imageView2 = g2Var.L;
        int i12 = org.telegram.ui.ActionBar.i6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView2, 8, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(g2Var.M, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(c61Var.f25236f, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.V5));
        FrameLayout frameLayout = c61Var.f25240w;
        int i13 = org.telegram.ui.ActionBar.i6.f20894h5;
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
