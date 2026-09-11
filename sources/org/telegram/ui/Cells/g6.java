package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.pr;
import org.telegram.ui.r01;
public abstract class g6 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.f6 f21978a;
    public final TextView f21979b;
    public final cq f21980c;
    public final r2 d;
    public boolean f21981e;
    public final org.telegram.ui.Components.e6 f21982f;
    public final h90 h;
    public boolean f21983n;

    public g6(org.telegram.ui.ActionBar.n2 n2Var) {
        super(n2Var.getContext());
        pr prVar = pr.h;
        this.f21982f = new org.telegram.ui.Components.e6(320L, prVar);
        this.f21983n = false;
        Context context = n2Var.getContext();
        org.telegram.ui.ActionBar.f6 resourceProvider = n2Var.getResourceProvider();
        this.f21978a = resourceProvider;
        LinearLayout f7 = vl.f(context, 0);
        addView(f7, w7.x5.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.f21979b = textView;
        vl.j(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ProfileChannel));
        f7.addView(textView, w7.x5.q(-2, -2, 51));
        cq cqVar = new cq(context);
        this.f21980c = cqVar;
        cqVar.getDrawable().o(true, true, false);
        cqVar.b(0.3f, 165L, prVar);
        cqVar.setTypeface(AndroidUtilities.bold());
        cqVar.setTextSize(AndroidUtilities.dp(11.0f));
        cqVar.setPadding(AndroidUtilities.dp(4.33f), 0, AndroidUtilities.dp(4.33f), 0);
        cqVar.setGravity(3);
        f7.addView(cqVar, w7.x5.t(-1, 17, 51, 4, 1, 4, 0));
        r2 r2Var = new r2(null, context, true, UserConfig.selectedAccount, resourceProvider);
        this.d = r2Var;
        r2Var.setBackgroundColor(0);
        r2Var.setDialogCellDelegate(new d6((r01) this, n2Var, context));
        r2Var.H = 15;
        r2Var.I = 83;
        addView(r2Var, w7.x5.e(-1, -2, 87));
        d();
        setWillNotDraw(false);
        h90 h90Var = new h90();
        this.h = h90Var;
        int i10 = org.telegram.ui.ActionBar.j6.f20753i6;
        h90Var.e(org.telegram.ui.ActionBar.j6.l1(1.25f, org.telegram.ui.ActionBar.j6.v0(i10, resourceProvider)), org.telegram.ui.ActionBar.j6.l1(0.8f, org.telegram.ui.ActionBar.j6.v0(i10, resourceProvider)));
        h90Var.j(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        boolean z10;
        float f7;
        float f10;
        String formatShortNumber;
        boolean z11;
        float f11;
        boolean z12 = this.f21983n;
        if (chat != null && chat.participants_count <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        cq cqVar = this.f21980c;
        cqVar.a();
        float f12 = 0.0f;
        cqVar.setPivotX(0.0f);
        float f13 = 1.0f;
        if (z12) {
            ViewPropertyAnimator animate = cqVar.animate();
            if (z10) {
                f12 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f12);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.8f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (!z10) {
                f13 = 0.8f;
            }
            scaleX.scaleY(f13).setDuration(420L).setInterpolator(pr.h).start();
        } else {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            cqVar.setAlpha(f7);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            cqVar.setScaleX(f10);
            if (z10) {
                f12 = 1.0f;
            }
            cqVar.setScaleY(f12);
        }
        if (chat != null) {
            int[] iArr = new int[1];
            if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                int i10 = chat.participants_count;
                iArr[0] = i10;
                formatShortNumber = String.valueOf(i10);
            } else {
                formatShortNumber = LocaleController.formatShortNumber(chat.participants_count, iArr);
            }
            cqVar.c(LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber), true, true);
            if (arrayList != null && !arrayList.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f21981e = z11;
            r2 r2Var = this.d;
            if (z11) {
                r2Var.W(-chat.f19869id, null, 0, false, z12);
            } else {
                MessageObject messageObject = (MessageObject) i2.g.h(1, arrayList);
                long j3 = -chat.f19869id;
                int i11 = messageObject.messageOwner.date;
                if (r2Var.H0 != j3) {
                    r2Var.f22632t4 = -1;
                }
                r2Var.H0 = j3;
                r2Var.f22654x4 = System.currentTimeMillis();
                r2Var.f22560f1 = messageObject;
                r2Var.f22635u2 = false;
                r2Var.N0 = false;
                r2Var.R0 = i11;
                int i12 = messageObject.messageOwner.edit_date;
                r2Var.S0 = 0;
                r2Var.T0 = false;
                r2Var.l1 = messageObject.getId();
                r2Var.U0 = 0;
                r2Var.V0 = 0;
                r2Var.W0 = 0;
                r2Var.X0 = messageObject.isUnread();
                r2Var.f22565g1 = arrayList;
                MessageObject messageObject2 = r2Var.f22560f1;
                if (messageObject2 != null) {
                    r2Var.Y0 = messageObject2.messageOwner.send_state;
                }
                r2Var.b0(0, z12);
            }
        }
        if (!z12) {
            this.f21982f.f(this.f21981e, true);
        }
        invalidate();
        this.f21983n = true;
    }

    @Override
    public final void d() {
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, this.f21978a);
        cq cqVar = this.f21980c;
        cqVar.setTextColor(v02);
        cqVar.setBackground(org.telegram.ui.ActionBar.j6.c0(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.j6.l1(0.1f, v02)));
        this.f21979b.setTextColor(v02);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float e7 = this.f21982f.e(this.f21981e);
        if (e7 > 0.0f) {
            h90 h90Var = this.h;
            h90Var.setAlpha((int) (e7 * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            r2 r2Var = this.d;
            rectF.set(r2Var.getX() + AndroidUtilities.dp(r2Var.I + 6), r2Var.getY() + AndroidUtilities.dp(38.0f), (getWidth() * 0.5f) + r2Var.getX() + AndroidUtilities.dp(r2Var.I + 6), r2Var.getY() + AndroidUtilities.dp(46.33f));
            h90Var.d(rectF);
            h90Var.draw(canvas);
            rectF.set(r2Var.getX() + AndroidUtilities.dp(r2Var.I + 6), r2Var.getY() + AndroidUtilities.dp(56.0f), (getWidth() * 0.36f) + r2Var.getX() + AndroidUtilities.dp(r2Var.I + 6), r2Var.getY() + AndroidUtilities.dp(64.33f));
            h90Var.d(rectF);
            h90Var.draw(canvas);
            rectF.set(((r2Var.getX() + r2Var.getWidth()) - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(43.0f), r2Var.getY() + AndroidUtilities.dp(12.0f), (r2Var.getX() + r2Var.getWidth()) - AndroidUtilities.dp(16.0f), r2Var.getY() + AndroidUtilities.dp(20.33f));
            h90Var.d(rectF);
            h90Var.draw(canvas);
            invalidate();
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.h != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
