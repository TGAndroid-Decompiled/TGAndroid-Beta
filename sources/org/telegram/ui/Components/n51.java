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
public class n51 extends org.telegram.ui.ActionBar.f3 {
    public final int f28668b;
    public final GradientDrawable f28669c;
    public final m51 d;
    public final b61 e;
    public int f28670f;

    public n51(Context context, org.telegram.ui.ActionBar.n2 n2Var, b61 b61Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, true);
        this.f28668b = AndroidUtilities.dp(12.0f);
        this.f28669c = new GradientDrawable();
        m51 m51Var = new m51(this, context);
        this.d = m51Var;
        m51Var.addView(b61Var, w7.z5.d(-1.0f, -1));
        this.containerView = m51Var;
        this.e = b61Var;
        b61Var.setParentFragment(n2Var);
        b61Var.setOnScrollListener(new j51(this));
    }

    public static void n(n51 n51Var) {
        b61 b61Var = n51Var.e;
        if (b61Var.c()) {
            n51Var.f28670f = b61Var.getContentTopOffset();
            n51Var.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        b61 b61Var = this.e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(b61Var.f24819a);
        notificationCenter.removeObserver(b61Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(b61Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        b61 b61Var = this.e;
        Objects.requireNonNull(b61Var);
        z6 z6Var = new z6(b61Var, 10);
        q51 q51Var = b61Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.j6(q51Var.f31060a, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.O5));
        ImageView imageView = q51Var.f31061b;
        int i10 = org.telegram.ui.ActionBar.h6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 8, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(q51Var.f31062c, 8, null, null, null, null, i10));
        ei.e2 e2Var = q51Var.e;
        arrayList.add(new org.telegram.ui.ActionBar.j6(e2Var, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(e2Var, 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(e2Var, 16777216, null, null, null, null, org.telegram.ui.ActionBar.h6.Mh));
        a61 a61Var = b61Var.f24825s;
        r51 r51Var = b61Var.f24823n;
        a61Var.getClass();
        org.telegram.ui.Cells.r3.a(arrayList, r51Var, z6Var);
        arrayList.add(new org.telegram.ui.ActionBar.j6(r51Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(r51Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21398z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(r51Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(r51Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(r51Var, 0, new Class[]{org.telegram.ui.Cells.p3.class}, org.telegram.ui.ActionBar.h6.f21114k0, null, null, org.telegram.ui.ActionBar.h6.f20994d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.Qh));
        org.telegram.ui.Cells.u3.a(arrayList, r51Var);
        hg.e2 e2Var2 = b61Var.v;
        r51 r51Var2 = b61Var.f24823n;
        e2Var2.getClass();
        org.telegram.ui.Cells.r3.a(arrayList, r51Var2, z6Var);
        int i11 = org.telegram.ui.ActionBar.h6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.j6(r51Var2, 4, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(r51Var2, 4, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"urlTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(r51Var2, 8, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, i11));
        ImageView imageView2 = e2Var2.L;
        int i12 = org.telegram.ui.ActionBar.h6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView2, 8, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(e2Var2.M, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(b61Var.f24822f, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.V5));
        FrameLayout frameLayout = b61Var.f24826w;
        int i13 = org.telegram.ui.ActionBar.h6.f21064h5;
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
