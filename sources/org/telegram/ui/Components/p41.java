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
public class p41 extends org.telegram.ui.ActionBar.f3 {
    public final int f26930b;
    public final GradientDrawable f26931c;
    public final o41 d;
    public final d51 e;
    public int f26932f;

    public p41(Context context, org.telegram.ui.ActionBar.n2 n2Var, d51 d51Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, true);
        this.f26930b = AndroidUtilities.dp(12.0f);
        this.f26931c = new GradientDrawable();
        o41 o41Var = new o41(this, context);
        this.d = o41Var;
        o41Var.addView(d51Var, w7.x5.c(-1.0f, -1));
        this.containerView = o41Var;
        this.e = d51Var;
        d51Var.setParentFragment(n2Var);
        d51Var.setOnScrollListener(new m41(this));
    }

    public static void m(p41 p41Var) {
        d51 d51Var = p41Var.e;
        if (d51Var.c()) {
            p41Var.f26932f = d51Var.getContentTopOffset();
            p41Var.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        d51 d51Var = this.e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(d51Var.f23240a);
        notificationCenter.removeObserver(d51Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(d51Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        d51 d51Var = this.e;
        Objects.requireNonNull(d51Var);
        y6 y6Var = new y6(d51Var, 10);
        s41 s41Var = d51Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.j6(s41Var.f30020a, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.O5));
        ImageView imageView = s41Var.f30021b;
        int i10 = org.telegram.ui.ActionBar.h6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 8, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(s41Var.f30022c, 8, null, null, null, null, i10));
        ci.h2 h2Var = s41Var.e;
        arrayList.add(new org.telegram.ui.ActionBar.j6(h2Var, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(h2Var, 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(h2Var, 16777216, null, null, null, null, org.telegram.ui.ActionBar.h6.Mh));
        c51 c51Var = d51Var.f23246s;
        t41 t41Var = d51Var.f23244n;
        c51Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, t41Var, y6Var);
        arrayList.add(new org.telegram.ui.ActionBar.j6(t41Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(t41Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19189z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(t41Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(t41Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(t41Var, 0, new Class[]{org.telegram.ui.Cells.p3.class}, org.telegram.ui.ActionBar.h6.f18910k0, null, null, org.telegram.ui.ActionBar.h6.f18790d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.Qh));
        org.telegram.ui.Cells.v3.a(arrayList, t41Var);
        gg.g2 g2Var = d51Var.v;
        t41 t41Var2 = d51Var.f23244n;
        g2Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, t41Var2, y6Var);
        int i11 = org.telegram.ui.ActionBar.h6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.j6(t41Var2, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(t41Var2, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"urlTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(t41Var2, 8, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, i11));
        ImageView imageView2 = g2Var.L;
        int i12 = org.telegram.ui.ActionBar.h6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView2, 8, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(g2Var.M, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(d51Var.f23243f, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.V5));
        FrameLayout frameLayout = d51Var.f23247w;
        int i13 = org.telegram.ui.ActionBar.h6.f18859h5;
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
