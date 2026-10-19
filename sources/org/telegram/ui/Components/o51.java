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
    public final int f28905b;
    public final GradientDrawable f28906c;
    public final n51 d;
    public final c61 e;
    public int f28907f;

    public o51(Context context, org.telegram.ui.ActionBar.n2 n2Var, c61 c61Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, true);
        this.f28905b = AndroidUtilities.dp(12.0f);
        this.f28906c = new GradientDrawable();
        n51 n51Var = new n51(this, context);
        this.d = n51Var;
        n51Var.addView(c61Var, w7.z5.c(-1.0f, -1));
        this.containerView = n51Var;
        this.e = c61Var;
        c61Var.setParentFragment(n2Var);
        c61Var.setOnScrollListener(new k51(this));
    }

    public static void n(o51 o51Var) {
        c61 c61Var = o51Var.e;
        if (c61Var.c()) {
            o51Var.f28907f = c61Var.getContentTopOffset();
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
        c61 c61Var = this.e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(c61Var.f25088a);
        notificationCenter.removeObserver(c61Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(c61Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        c61 c61Var = this.e;
        Objects.requireNonNull(c61Var);
        z6 z6Var = new z6(c61Var, 10);
        r51 r51Var = c61Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.j6(r51Var.f31026a, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.O5));
        ImageView imageView = r51Var.f31027b;
        int i10 = org.telegram.ui.ActionBar.h6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 8, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(r51Var.f31028c, 8, null, null, null, null, i10));
        ei.e2 e2Var = r51Var.e;
        arrayList.add(new org.telegram.ui.ActionBar.j6(e2Var, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(e2Var, 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(e2Var, 16777216, null, null, null, null, org.telegram.ui.ActionBar.h6.Mh));
        b61 b61Var = c61Var.f25094s;
        s51 s51Var = c61Var.f25092n;
        b61Var.getClass();
        org.telegram.ui.Cells.r3.a(arrayList, s51Var, z6Var);
        arrayList.add(new org.telegram.ui.ActionBar.j6(s51Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(s51Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21392z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(s51Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(s51Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(s51Var, 0, new Class[]{org.telegram.ui.Cells.p3.class}, org.telegram.ui.ActionBar.h6.f21108k0, null, null, org.telegram.ui.ActionBar.h6.f20988d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.Qh));
        org.telegram.ui.Cells.u3.a(arrayList, s51Var);
        hg.e2 e2Var2 = c61Var.v;
        s51 s51Var2 = c61Var.f25092n;
        e2Var2.getClass();
        org.telegram.ui.Cells.r3.a(arrayList, s51Var2, z6Var);
        int i11 = org.telegram.ui.ActionBar.h6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.j6(s51Var2, 4, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(s51Var2, 4, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"urlTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(s51Var2, 8, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, i11));
        ImageView imageView2 = e2Var2.L;
        int i12 = org.telegram.ui.ActionBar.h6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView2, 8, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(e2Var2.M, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(c61Var.f25091f, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.V5));
        FrameLayout frameLayout = c61Var.f25095w;
        int i13 = org.telegram.ui.ActionBar.h6.f21058h5;
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
