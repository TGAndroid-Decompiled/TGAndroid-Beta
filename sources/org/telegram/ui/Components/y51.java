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
public class y51 extends org.telegram.ui.ActionBar.f3 {
    public final int f33110b;
    public final GradientDrawable f33111c;
    public final x51 d;
    public final m61 f33112e;
    public int f33113f;

    public y51(Context context, org.telegram.ui.ActionBar.n2 n2Var, m61 m61Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, true);
        this.f33110b = AndroidUtilities.dp(12.0f);
        this.f33111c = new GradientDrawable();
        x51 x51Var = new x51(this, context);
        this.d = x51Var;
        x51Var.addView(m61Var, w7.x5.d(-1.0f, -1));
        this.containerView = x51Var;
        this.f33112e = m61Var;
        m61Var.setParentFragment(n2Var);
        m61Var.setOnScrollListener(new u51(this));
    }

    public static void o(y51 y51Var) {
        m61 m61Var = y51Var.f33112e;
        if (m61Var.c()) {
            y51Var.f33113f = m61Var.getContentTopOffset();
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
        m61 m61Var = this.f33112e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(m61Var.f28680a);
        notificationCenter.removeObserver(m61Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(m61Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        m61 m61Var = this.f33112e;
        Objects.requireNonNull(m61Var);
        a7 a7Var = new a7(m61Var, 10);
        b61 b61Var = m61Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.k6(b61Var.f25774a, 32, null, null, null, null, org.telegram.ui.ActionBar.i6.O5));
        ImageView imageView = b61Var.f25775b;
        int i10 = org.telegram.ui.ActionBar.i6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView, 8, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(b61Var.f25776c, 8, null, null, null, null, i10));
        ci.g2 g2Var = b61Var.f25777e;
        arrayList.add(new org.telegram.ui.ActionBar.k6(g2Var, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(g2Var, 8388608, null, null, null, null, org.telegram.ui.ActionBar.i6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(g2Var, 16777216, null, null, null, null, org.telegram.ui.ActionBar.i6.Mh));
        l61 l61Var = m61Var.f28687s;
        c61 c61Var = m61Var.f28685n;
        l61Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, c61Var, a7Var);
        arrayList.add(new org.telegram.ui.ActionBar.k6(c61Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(c61Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21203z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(c61Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(c61Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(c61Var, 0, new Class[]{org.telegram.ui.Cells.q3.class}, org.telegram.ui.ActionBar.i6.f20923k0, null, null, org.telegram.ui.ActionBar.i6.f20802d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.Qh));
        org.telegram.ui.Cells.v3.a(arrayList, c61Var);
        gg.f2 f2Var = m61Var.v;
        c61 c61Var2 = m61Var.f28685n;
        f2Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, c61Var2, a7Var);
        int i11 = org.telegram.ui.ActionBar.i6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.k6(c61Var2, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(c61Var2, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"urlTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(c61Var2, 8, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, i11));
        ImageView imageView2 = f2Var.L;
        int i12 = org.telegram.ui.ActionBar.i6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView2, 8, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(f2Var.M, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(m61Var.f28684f, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.V5));
        FrameLayout frameLayout = m61Var.f28688w;
        int i13 = org.telegram.ui.ActionBar.i6.f20872h5;
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
