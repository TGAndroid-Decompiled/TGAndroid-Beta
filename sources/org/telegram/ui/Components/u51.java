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
public class u51 extends org.telegram.ui.ActionBar.e3 {
    public final int f29254b;
    public final GradientDrawable f29255c;
    public final t51 d;
    public final i61 e;
    public int f29256f;

    public u51(Context context, org.telegram.ui.ActionBar.m2 m2Var, i61 i61Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(1, context, c6Var, true);
        this.f29254b = AndroidUtilities.dp(12.0f);
        this.f29255c = new GradientDrawable();
        t51 t51Var = new t51(this, context);
        this.d = t51Var;
        t51Var.addView(i61Var, w7.z5.d(-1.0f, -1));
        this.containerView = t51Var;
        this.e = i61Var;
        i61Var.setParentFragment(m2Var);
        i61Var.setOnScrollListener(new q51(this));
    }

    public static void n(u51 u51Var) {
        i61 i61Var = u51Var.e;
        if (i61Var.c()) {
            u51Var.f29256f = i61Var.getContentTopOffset();
            u51Var.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        i61 i61Var = this.e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i61Var.f25561a);
        notificationCenter.removeObserver(i61Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(i61Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        i61 i61Var = this.e;
        Objects.requireNonNull(i61Var);
        b7 b7Var = new b7(i61Var, 10);
        x51 x51Var = i61Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.i6(x51Var.f31336a, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.O5));
        ImageView imageView = x51Var.f31337b;
        int i10 = org.telegram.ui.ActionBar.g6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 8, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(x51Var.f31338c, 8, null, null, null, null, i10));
        di.g2 g2Var = x51Var.e;
        arrayList.add(new org.telegram.ui.ActionBar.i6(g2Var, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(g2Var, 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(g2Var, 16777216, null, null, null, null, org.telegram.ui.ActionBar.g6.Mh));
        h61 h61Var = i61Var.f25567s;
        y51 y51Var = i61Var.f25565n;
        h61Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, y51Var, b7Var);
        arrayList.add(new org.telegram.ui.ActionBar.i6(y51Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(y51Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20005z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(y51Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(y51Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(y51Var, 0, new Class[]{org.telegram.ui.Cells.q3.class}, org.telegram.ui.ActionBar.g6.f19722k0, null, null, org.telegram.ui.ActionBar.g6.f19602d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.Qh));
        org.telegram.ui.Cells.v3.a(arrayList, y51Var);
        hg.e2 e2Var = i61Var.v;
        y51 y51Var2 = i61Var.f25565n;
        e2Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, y51Var2, b7Var);
        int i11 = org.telegram.ui.ActionBar.g6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.i6(y51Var2, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(y51Var2, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"urlTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(y51Var2, 8, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, i11));
        ImageView imageView2 = e2Var.L;
        int i12 = org.telegram.ui.ActionBar.g6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView2, 8, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e2Var.M, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(i61Var.f25564f, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.V5));
        FrameLayout frameLayout = i61Var.f25568w;
        int i13 = org.telegram.ui.ActionBar.g6.f19672h5;
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
