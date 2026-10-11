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
public class y51 extends org.telegram.ui.ActionBar.e3 {
    public final int f33148b;
    public final GradientDrawable f33149c;
    public final x51 d;
    public final m61 f33150e;
    public int f33151f;

    public y51(Context context, org.telegram.ui.ActionBar.m2 m2Var, m61 m61Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, true);
        this.f33148b = AndroidUtilities.dp(12.0f);
        this.f33149c = new GradientDrawable();
        x51 x51Var = new x51(this, context);
        this.d = x51Var;
        x51Var.addView(m61Var, w7.x5.d(-1.0f, -1));
        this.containerView = x51Var;
        this.f33150e = m61Var;
        m61Var.setParentFragment(m2Var);
        m61Var.setOnScrollListener(new u51(this));
    }

    public static void o(y51 y51Var) {
        m61 m61Var = y51Var.f33150e;
        if (m61Var.c()) {
            y51Var.f33151f = m61Var.getContentTopOffset();
            y51Var.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        m61 m61Var = this.f33150e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(m61Var.f28756a);
        notificationCenter.removeObserver(m61Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(m61Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        m61 m61Var = this.f33150e;
        Objects.requireNonNull(m61Var);
        a7 a7Var = new a7(m61Var, 10);
        b61 b61Var = m61Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.j6(b61Var.f25852a, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.O5));
        ImageView imageView = b61Var.f25853b;
        int i10 = org.telegram.ui.ActionBar.h6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 8, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(b61Var.f25854c, 8, null, null, null, null, i10));
        ci.g2 g2Var = b61Var.f25855e;
        arrayList.add(new org.telegram.ui.ActionBar.j6(g2Var, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(g2Var, 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(g2Var, 16777216, null, null, null, null, org.telegram.ui.ActionBar.h6.Mh));
        l61 l61Var = m61Var.f28763s;
        c61 c61Var = m61Var.f28761n;
        l61Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, c61Var, a7Var);
        arrayList.add(new org.telegram.ui.ActionBar.j6(c61Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(c61Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21225z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(c61Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(c61Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(c61Var, 0, new Class[]{org.telegram.ui.Cells.q3.class}, org.telegram.ui.ActionBar.h6.f20944k0, null, null, org.telegram.ui.ActionBar.h6.f20823d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.Qh));
        org.telegram.ui.Cells.v3.a(arrayList, c61Var);
        gg.f2 f2Var = m61Var.v;
        c61 c61Var2 = m61Var.f28761n;
        f2Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, c61Var2, a7Var);
        int i11 = org.telegram.ui.ActionBar.h6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.j6(c61Var2, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(c61Var2, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"urlTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(c61Var2, 8, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, i11));
        ImageView imageView2 = f2Var.L;
        int i12 = org.telegram.ui.ActionBar.h6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView2, 8, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(f2Var.M, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(m61Var.f28760f, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.V5));
        FrameLayout frameLayout = m61Var.f28764w;
        int i13 = org.telegram.ui.ActionBar.h6.f20893h5;
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
