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
public class t51 extends org.telegram.ui.ActionBar.e3 {
    public final int f29280b;
    public final GradientDrawable f29281c;
    public final s51 d;
    public final h61 e;
    public int f29282f;

    public t51(Context context, org.telegram.ui.ActionBar.m2 m2Var, h61 h61Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(1, context, c6Var, true);
        this.f29280b = AndroidUtilities.dp(12.0f);
        this.f29281c = new GradientDrawable();
        s51 s51Var = new s51(this, context);
        this.d = s51Var;
        s51Var.addView(h61Var, w7.a6.d(-1.0f, -1));
        this.containerView = s51Var;
        this.e = h61Var;
        h61Var.setParentFragment(m2Var);
        h61Var.setOnScrollListener(new p51(this));
    }

    public static void n(t51 t51Var) {
        h61 h61Var = t51Var.e;
        if (h61Var.c()) {
            t51Var.f29282f = h61Var.getContentTopOffset();
            t51Var.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        h61 h61Var = this.e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(h61Var.f25518a);
        notificationCenter.removeObserver(h61Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(h61Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        h61 h61Var = this.e;
        Objects.requireNonNull(h61Var);
        b7 b7Var = new b7(h61Var, 10);
        w51 w51Var = h61Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.i6(w51Var.f31906a, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.O5));
        ImageView imageView = w51Var.f31907b;
        int i10 = org.telegram.ui.ActionBar.g6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 8, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(w51Var.f31908c, 8, null, null, null, null, i10));
        di.g2 g2Var = w51Var.e;
        arrayList.add(new org.telegram.ui.ActionBar.i6(g2Var, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(g2Var, 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(g2Var, 16777216, null, null, null, null, org.telegram.ui.ActionBar.g6.Mh));
        g61 g61Var = h61Var.f25524s;
        x51 x51Var = h61Var.f25522n;
        g61Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, x51Var, b7Var);
        arrayList.add(new org.telegram.ui.ActionBar.i6(x51Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(x51Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20305z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(x51Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(x51Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(x51Var, 0, new Class[]{org.telegram.ui.Cells.q3.class}, org.telegram.ui.ActionBar.g6.f20022k0, null, null, org.telegram.ui.ActionBar.g6.f19902d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.Qh));
        org.telegram.ui.Cells.v3.a(arrayList, x51Var);
        hg.e2 e2Var = h61Var.v;
        x51 x51Var2 = h61Var.f25522n;
        e2Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, x51Var2, b7Var);
        int i11 = org.telegram.ui.ActionBar.g6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.i6(x51Var2, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(x51Var2, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"urlTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(x51Var2, 8, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, i11));
        ImageView imageView2 = e2Var.L;
        int i12 = org.telegram.ui.ActionBar.g6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView2, 8, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e2Var.M, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(h61Var.f25521f, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.V5));
        FrameLayout frameLayout = h61Var.f25525w;
        int i13 = org.telegram.ui.ActionBar.g6.f19972h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(frameLayout, 1, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, new Drawable[]{this.shadowDrawable}, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ii));
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
