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
import org.telegram.messenger.kk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.nq;
import org.telegram.ui.uz0;
public abstract class g6 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 f22299a;
    public final TextView f22300b;
    public final nq f22301c;
    public final r2 d;
    public boolean e;
    public final org.telegram.ui.Components.f6 f22302f;
    public final ba0 h;
    public boolean f22303n;

    public g6(org.telegram.ui.ActionBar.n2 n2Var) {
        super(n2Var.getContext());
        bs bsVar = bs.h;
        this.f22302f = new org.telegram.ui.Components.f6(320L, bsVar);
        this.f22303n = false;
        Context context = n2Var.getContext();
        org.telegram.ui.ActionBar.d6 resourceProvider = n2Var.getResourceProvider();
        this.f22299a = resourceProvider;
        LinearLayout e = kk.e(context, 0);
        addView(e, w7.z5.a(-2.0f, 16.66f, 11.6f, 16.66f, 0.0f, -1, 55));
        TextView textView = new TextView(context);
        this.f22300b = textView;
        kk.k(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ProfileChannel));
        e.addView(textView, w7.z5.q(-2, -2, 51));
        nq nqVar = new nq(context);
        this.f22301c = nqVar;
        nqVar.getDrawable().r(true, true);
        nqVar.b(0.3f, 165L, bsVar);
        nqVar.setTypeface(AndroidUtilities.bold());
        nqVar.setTextSize(AndroidUtilities.dp(11.0f));
        nqVar.setPadding(AndroidUtilities.dp(4.33f), 0, AndroidUtilities.dp(4.33f), 0);
        nqVar.setGravity(3);
        e.addView(nqVar, w7.z5.t(-1, 17, 51, 4, 1, 4, 0));
        r2 r2Var = new r2(null, context, true, UserConfig.selectedAccount, resourceProvider);
        this.d = r2Var;
        r2Var.setBackgroundColor(0);
        r2Var.setDialogCellDelegate(new d6((uz0) this, n2Var, context));
        r2Var.H = 15;
        r2Var.I = 83;
        addView(r2Var, w7.z5.e(-1, -2, 87));
        d();
        setWillNotDraw(false);
        ba0 ba0Var = new ba0();
        this.h = ba0Var;
        int i10 = org.telegram.ui.ActionBar.h6.f21082i6;
        ba0Var.f(org.telegram.ui.ActionBar.h6.m1(1.25f, org.telegram.ui.ActionBar.h6.w0(i10, resourceProvider)), org.telegram.ui.ActionBar.h6.m1(0.8f, org.telegram.ui.ActionBar.h6.w0(i10, resourceProvider)));
        ba0Var.k(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        boolean z10;
        float f7;
        float f10;
        String formatShortNumber;
        boolean z11;
        float f11;
        boolean z12 = this.f22303n;
        if (chat != null && chat.participants_count <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        nq nqVar = this.f22301c;
        nqVar.a();
        float f12 = 0.0f;
        nqVar.setPivotX(0.0f);
        float f13 = 1.0f;
        if (z12) {
            ViewPropertyAnimator animate = nqVar.animate();
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
            scaleX.scaleY(f13).setDuration(420L).setInterpolator(bs.h).start();
        } else {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            nqVar.setAlpha(f7);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            nqVar.setScaleX(f10);
            if (z10) {
                f12 = 1.0f;
            }
            nqVar.setScaleY(f12);
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
            nqVar.c(LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber), true, true);
            if (arrayList != null && !arrayList.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.e = z11;
            r2 r2Var = this.d;
            if (z11) {
                r2Var.W(-chat.f20279id, null, 0, false, z12);
            } else {
                MessageObject messageObject = (MessageObject) i2.d.h(1, arrayList);
                long j10 = -chat.f20279id;
                int i11 = messageObject.messageOwner.date;
                if (r2Var.H0 != j10) {
                    r2Var.f22929x4 = -1;
                }
                r2Var.H0 = j10;
                r2Var.B4 = System.currentTimeMillis();
                r2Var.f22834f1 = messageObject;
                r2Var.f22910u2 = false;
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
                r2Var.f22839g1 = arrayList;
                MessageObject messageObject2 = r2Var.f22834f1;
                if (messageObject2 != null) {
                    r2Var.Y0 = messageObject2.messageOwner.send_state;
                }
                r2Var.b0(0, z12);
            }
        }
        if (!z12) {
            this.f22302f.f(this.e, true);
        }
        invalidate();
        this.f22303n = true;
    }

    @Override
    public final void d() {
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.L6, this.f22299a);
        nq nqVar = this.f22301c;
        nqVar.setTextColor(w02);
        nqVar.setBackground(org.telegram.ui.ActionBar.h6.d0(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.h6.m1(0.1f, w02)));
        this.f22300b.setTextColor(w02);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float e = this.f22302f.e(this.e);
        if (e > 0.0f) {
            ba0 ba0Var = this.h;
            ba0Var.setAlpha((int) (e * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            r2 r2Var = this.d;
            rectF.set(r2Var.getX() + AndroidUtilities.dp(r2Var.I + 6), r2Var.getY() + AndroidUtilities.dp(38.0f), (getWidth() * 0.5f) + r2Var.getX() + AndroidUtilities.dp(r2Var.I + 6), r2Var.getY() + AndroidUtilities.dp(46.33f));
            ba0Var.e(rectF);
            ba0Var.draw(canvas);
            rectF.set(r2Var.getX() + AndroidUtilities.dp(r2Var.I + 6), r2Var.getY() + AndroidUtilities.dp(56.0f), (getWidth() * 0.36f) + r2Var.getX() + AndroidUtilities.dp(r2Var.I + 6), r2Var.getY() + AndroidUtilities.dp(64.33f));
            ba0Var.e(rectF);
            ba0Var.draw(canvas);
            rectF.set(((r2Var.getX() + r2Var.getWidth()) - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(43.0f), r2Var.getY() + AndroidUtilities.dp(12.0f), (r2Var.getX() + r2Var.getWidth()) - AndroidUtilities.dp(16.0f), r2Var.getY() + AndroidUtilities.dp(20.33f));
            ba0Var.e(rectF);
            ba0Var.draw(canvas);
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
