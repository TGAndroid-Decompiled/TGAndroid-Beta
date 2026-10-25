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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.pq;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a01;
public abstract class l6 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f24384a;
    public final TextView f24385b;
    public final pq f24386c;
    public final p2 d;
    public boolean e;
    public final org.telegram.ui.Components.h6 f24387f;
    public final da0 h;
    public boolean f24388n;

    public l6(org.telegram.ui.ActionBar.r2 r2Var) {
        super(r2Var.getContext());
        ds dsVar = ds.h;
        this.f24387f = new org.telegram.ui.Components.h6(320L, dsVar);
        this.f24388n = false;
        Context context = r2Var.getContext();
        org.telegram.ui.ActionBar.u6 resourceProvider = r2Var.getResourceProvider();
        this.f24384a = resourceProvider;
        LinearLayout d = vh.d(context, 0);
        addView(d, gb1.h(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.f24385b = textView;
        vh.j(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ProfileChannel));
        d.addView(textView, gb1.u(-2, -2, 51));
        pq pqVar = new pq(context);
        this.f24386c = pqVar;
        pqVar.getDrawable().r(true, true);
        pqVar.b(0.3f, 165L, dsVar);
        pqVar.setTypeface(AndroidUtilities.bold());
        pqVar.setTextSize(AndroidUtilities.dp(11.0f));
        pqVar.setPadding(AndroidUtilities.dp(4.33f), 0, AndroidUtilities.dp(4.33f), 0);
        pqVar.setGravity(3);
        d.addView(pqVar, gb1.x(-1, 17, 51, 4, 1, 4, 0));
        p2 p2Var = new p2(null, context, true, UserConfig.selectedAccount, resourceProvider);
        this.d = p2Var;
        p2Var.setBackgroundColor(0);
        p2Var.setDialogCellDelegate(new i6((a01) this, r2Var, context));
        p2Var.H = 15;
        p2Var.I = 83;
        addView(p2Var, gb1.i(-1, -2, 87));
        updateColors();
        setWillNotDraw(false);
        da0 da0Var = new da0();
        this.h = da0Var;
        int i10 = org.telegram.ui.ActionBar.y6.f23446i6;
        da0Var.f(org.telegram.ui.ActionBar.y6.o1(1.25f, org.telegram.ui.ActionBar.y6.w0(i10, resourceProvider)), org.telegram.ui.ActionBar.y6.o1(0.8f, org.telegram.ui.ActionBar.y6.w0(i10, resourceProvider)));
        da0Var.k(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        boolean z10;
        float f7;
        float f10;
        String formatShortNumber;
        boolean z11;
        float f11;
        boolean z12 = this.f24388n;
        if (chat != null && chat.participants_count <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        pq pqVar = this.f24386c;
        pqVar.a();
        float f12 = 0.0f;
        pqVar.setPivotX(0.0f);
        float f13 = 1.0f;
        if (z12) {
            ViewPropertyAnimator animate = pqVar.animate();
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
            scaleX.scaleY(f13).setDuration(420L).setInterpolator(ds.h).start();
        } else {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            pqVar.setAlpha(f7);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            pqVar.setScaleX(f10);
            if (z10) {
                f12 = 1.0f;
            }
            pqVar.setScaleY(f12);
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
            pqVar.c(LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber), true, true);
            if (arrayList != null && !arrayList.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.e = z11;
            p2 p2Var = this.d;
            if (z11) {
                p2Var.V(-chat.f22027id, null, 0, false, z12);
            } else {
                MessageObject messageObject = (MessageObject) ic.a.g(1, arrayList);
                long j10 = -chat.f22027id;
                int i11 = messageObject.messageOwner.date;
                if (p2Var.H0 != j10) {
                    p2Var.f24748x4 = -1;
                }
                p2Var.H0 = j10;
                p2Var.B4 = System.currentTimeMillis();
                p2Var.f24653f1 = messageObject;
                p2Var.f24729u2 = false;
                p2Var.N0 = false;
                p2Var.R0 = i11;
                int i12 = messageObject.messageOwner.edit_date;
                p2Var.S0 = 0;
                p2Var.T0 = false;
                p2Var.l1 = messageObject.getId();
                p2Var.U0 = 0;
                p2Var.V0 = 0;
                p2Var.W0 = 0;
                p2Var.X0 = messageObject.isUnread();
                p2Var.f24658g1 = arrayList;
                MessageObject messageObject2 = p2Var.f24653f1;
                if (messageObject2 != null) {
                    p2Var.Y0 = messageObject2.messageOwner.send_state;
                }
                p2Var.a0(0, z12);
            }
        }
        if (!z12) {
            this.f24387f.f(this.e, true);
        }
        invalidate();
        this.f24388n = true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float e = this.f24387f.e(this.e);
        if (e > 0.0f) {
            da0 da0Var = this.h;
            da0Var.setAlpha((int) (e * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            p2 p2Var = this.d;
            rectF.set(p2Var.getX() + AndroidUtilities.dp(p2Var.I + 6), p2Var.getY() + AndroidUtilities.dp(38.0f), (getWidth() * 0.5f) + p2Var.getX() + AndroidUtilities.dp(p2Var.I + 6), p2Var.getY() + AndroidUtilities.dp(46.33f));
            da0Var.e(rectF);
            da0Var.draw(canvas);
            rectF.set(p2Var.getX() + AndroidUtilities.dp(p2Var.I + 6), p2Var.getY() + AndroidUtilities.dp(56.0f), (getWidth() * 0.36f) + p2Var.getX() + AndroidUtilities.dp(p2Var.I + 6), p2Var.getY() + AndroidUtilities.dp(64.33f));
            da0Var.e(rectF);
            da0Var.draw(canvas);
            rectF.set(((p2Var.getX() + p2Var.getWidth()) - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(43.0f), p2Var.getY() + AndroidUtilities.dp(12.0f), (p2Var.getX() + p2Var.getWidth()) - AndroidUtilities.dp(16.0f), p2Var.getY() + AndroidUtilities.dp(20.33f));
            da0Var.e(rectF);
            da0Var.draw(canvas);
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.L6, this.f24384a);
        int i10 = ProfileActivity.R6;
        pq pqVar = this.f24386c;
        pqVar.setTextColor(w02);
        pqVar.setBackground(org.telegram.ui.ActionBar.y6.d0(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.y6.o1(0.1f, w02)));
        this.f24385b.setTextColor(w02);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.h != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
