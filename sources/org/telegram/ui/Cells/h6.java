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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u90;
import org.telegram.ui.j01;
public abstract class h6 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 f22212a;
    public final TextView f22213b;
    public final gq f22214c;
    public final s2 d;
    public boolean f22215e;
    public final org.telegram.ui.Components.e6 f22216f;
    public final u90 h;
    public boolean f22217n;

    public h6(org.telegram.ui.ActionBar.n2 n2Var) {
        super(n2Var.getContext());
        tr trVar = tr.h;
        this.f22216f = new org.telegram.ui.Components.e6(320L, trVar);
        this.f22217n = false;
        Context context = n2Var.getContext();
        org.telegram.ui.ActionBar.d6 resourceProvider = n2Var.getResourceProvider();
        this.f22212a = resourceProvider;
        LinearLayout e7 = bi.e(context, 0);
        addView(e7, w7.z5.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.f22213b = textView;
        bi.j(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ProfileChannel));
        e7.addView(textView, w7.z5.q(-2, -2, 51));
        gq gqVar = new gq(context);
        this.f22214c = gqVar;
        gqVar.getDrawable().o(true, true, false);
        gqVar.b(0.3f, 165L, trVar);
        gqVar.setTypeface(AndroidUtilities.bold());
        gqVar.setTextSize(AndroidUtilities.dp(11.0f));
        gqVar.setPadding(AndroidUtilities.dp(4.33f), 0, AndroidUtilities.dp(4.33f), 0);
        gqVar.setGravity(3);
        e7.addView(gqVar, w7.z5.t(-1, 17, 51, 4, 1, 4, 0));
        s2 s2Var = new s2(null, context, true, UserConfig.selectedAccount, resourceProvider);
        this.d = s2Var;
        s2Var.setBackgroundColor(0);
        s2Var.setDialogCellDelegate(new e6((j01) this, n2Var, context));
        s2Var.H = 15;
        s2Var.I = 83;
        addView(s2Var, w7.z5.e(-1, -2, 87));
        e();
        setWillNotDraw(false);
        u90 u90Var = new u90();
        this.h = u90Var;
        int i10 = org.telegram.ui.ActionBar.i6.f20913i6;
        u90Var.e(org.telegram.ui.ActionBar.i6.l1(1.25f, org.telegram.ui.ActionBar.i6.v0(i10, resourceProvider)), org.telegram.ui.ActionBar.i6.l1(0.8f, org.telegram.ui.ActionBar.i6.v0(i10, resourceProvider)));
        u90Var.j(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        boolean z10;
        float f7;
        float f10;
        String formatShortNumber;
        boolean z11;
        float f11;
        boolean z12 = this.f22217n;
        if (chat != null && chat.participants_count <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        gq gqVar = this.f22214c;
        gqVar.a();
        float f12 = 0.0f;
        gqVar.setPivotX(0.0f);
        float f13 = 1.0f;
        if (z12) {
            ViewPropertyAnimator animate = gqVar.animate();
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
            scaleX.scaleY(f13).setDuration(420L).setInterpolator(tr.h).start();
        } else {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            gqVar.setAlpha(f7);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            gqVar.setScaleX(f10);
            if (z10) {
                f12 = 1.0f;
            }
            gqVar.setScaleY(f12);
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
            gqVar.c(LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber), true, true);
            if (arrayList != null && !arrayList.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f22215e = z11;
            s2 s2Var = this.d;
            if (z11) {
                s2Var.U(-chat.f20042id, null, 0, false, z12);
            } else {
                MessageObject messageObject = (MessageObject) hg.c.g(1, arrayList);
                long j3 = -chat.f20042id;
                int i11 = messageObject.messageOwner.date;
                if (s2Var.H0 != j3) {
                    s2Var.f22872t4 = -1;
                }
                s2Var.H0 = j3;
                s2Var.f22894x4 = System.currentTimeMillis();
                s2Var.f22800f1 = messageObject;
                s2Var.f22875u2 = false;
                s2Var.N0 = false;
                s2Var.R0 = i11;
                int i12 = messageObject.messageOwner.edit_date;
                s2Var.S0 = 0;
                s2Var.T0 = false;
                s2Var.l1 = messageObject.getId();
                s2Var.U0 = 0;
                s2Var.V0 = 0;
                s2Var.W0 = 0;
                s2Var.X0 = messageObject.isUnread();
                s2Var.f22805g1 = arrayList;
                MessageObject messageObject2 = s2Var.f22800f1;
                if (messageObject2 != null) {
                    s2Var.Y0 = messageObject2.messageOwner.send_state;
                }
                s2Var.b0(0, z12);
            }
        }
        if (!z12) {
            this.f22216f.f(this.f22215e, true);
        }
        invalidate();
        this.f22217n = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float e7 = this.f22216f.e(this.f22215e);
        if (e7 > 0.0f) {
            u90 u90Var = this.h;
            u90Var.setAlpha((int) (e7 * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            s2 s2Var = this.d;
            rectF.set(s2Var.getX() + AndroidUtilities.dp(s2Var.I + 6), s2Var.getY() + AndroidUtilities.dp(38.0f), (getWidth() * 0.5f) + s2Var.getX() + AndroidUtilities.dp(s2Var.I + 6), s2Var.getY() + AndroidUtilities.dp(46.33f));
            u90Var.d(rectF);
            u90Var.draw(canvas);
            rectF.set(s2Var.getX() + AndroidUtilities.dp(s2Var.I + 6), s2Var.getY() + AndroidUtilities.dp(56.0f), (getWidth() * 0.36f) + s2Var.getX() + AndroidUtilities.dp(s2Var.I + 6), s2Var.getY() + AndroidUtilities.dp(64.33f));
            u90Var.d(rectF);
            u90Var.draw(canvas);
            rectF.set(((s2Var.getX() + s2Var.getWidth()) - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(43.0f), s2Var.getY() + AndroidUtilities.dp(12.0f), (s2Var.getX() + s2Var.getWidth()) - AndroidUtilities.dp(16.0f), s2Var.getY() + AndroidUtilities.dp(20.33f));
            u90Var.d(rectF);
            u90Var.draw(canvas);
            invalidate();
        }
    }

    @Override
    public final void e() {
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.L6, this.f22212a);
        gq gqVar = this.f22214c;
        gqVar.setTextColor(v02);
        gqVar.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.i6.l1(0.1f, v02)));
        this.f22213b.setTextColor(v02);
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
