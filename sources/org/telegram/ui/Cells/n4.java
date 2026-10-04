package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Components.zq;
public final class n4 extends FrameLayout {
    public boolean E;
    public final org.telegram.ui.Components.e6 F;
    public long G;
    public int H;
    public rg.a1 I;
    public Drawable J;
    public final org.telegram.ui.Components.w9 f22517a;
    public final ai.p4 f22518b;
    public final org.telegram.ui.Components.h9 f22519c;
    public int d;
    public TLRPC.User f22520e;
    public long f22521f;
    public final int h;
    public float f22522n;
    public boolean f22523r;
    public final zq f22524s;
    public final qp v;
    public final boolean f22525w;
    public boolean f22526x;
    public final org.telegram.ui.Components.e6 f22527y;

    public n4(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        this.f22519c = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        new RectF();
        this.h = UserConfig.selectedAccount;
        tr trVar = tr.h;
        this.f22527y = new org.telegram.ui.Components.e6(this, 0L, 350L, trVar);
        this.F = new org.telegram.ui.Components.e6(this, 0L, 350L, trVar);
        this.H = org.telegram.ui.ActionBar.i6.f20817d6;
        this.f22525w = z10;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f22517a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(27.0f));
        addView(w9Var, w7.z5.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        ai.p4 p4Var = new ai.p4(context, 5);
        this.f22518b = p4Var;
        NotificationCenter.listenEmojiLoading(p4Var);
        p4Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, d6Var));
        p4Var.setTextSize(1, 12.0f);
        p4Var.setMaxLines(1);
        p4Var.setGravity(49);
        p4Var.setLines(1);
        p4Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(p4Var, w7.z5.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        zq zqVar = new zq(context, d6Var);
        this.f22524s = zqVar;
        addView(zqVar, w7.z5.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.i6.W8;
        int i11 = org.telegram.ui.ActionBar.i6.U8;
        yq yqVar = zqVar.f33594a;
        yqVar.v = i10;
        yqVar.f33229w = i11;
        zqVar.setGravity(5);
        if (z10) {
            qp qpVar = new qp(context, 21, d6Var);
            this.v = qpVar;
            qpVar.b(org.telegram.ui.ActionBar.i6.B5, org.telegram.ui.ActionBar.i6.f20889h5, org.telegram.ui.ActionBar.i6.C5);
            qpVar.setDrawUnchecked(false);
            qpVar.setDrawBackgroundAsArc(4);
            qpVar.setProgressDelegate(new la(this, 4));
            addView(qpVar, w7.z5.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            qpVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j3, String str) {
        if (this.f22521f != j3) {
            this.f22523r = false;
            invalidate();
        }
        this.f22521f = j3;
        boolean isUserDialog = DialogObject.isUserDialog(j3);
        org.telegram.ui.Components.w9 w9Var = this.f22517a;
        org.telegram.ui.Components.h9 h9Var = this.f22519c;
        int i10 = this.h;
        ai.p4 p4Var = this.f22518b;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            this.f22520e = user;
            if (str != null) {
                p4Var.setText(str);
            } else if (user != null) {
                p4Var.setText(UserObject.getFirstName(user));
            } else {
                p4Var.setText("");
            }
            h9Var.m(i10, this.f22520e);
            w9Var.e(this.f22520e, h9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            if (str != null) {
                p4Var.setText(str);
            } else if (chat != null) {
                p4Var.setText(chat.title);
            } else {
                p4Var.setText("");
            }
            h9Var.k(i10, chat);
            this.f22520e = null;
            w9Var.e(chat, h9Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i10) {
        int i11;
        int i12 = MessagesController.UPDATE_MASK_STATUS & i10;
        int i13 = this.h;
        if (i12 != 0 && this.f22520e != null) {
            this.f22520e = MessagesController.getInstance(i13).getUser(Long.valueOf(this.f22520e.f20184id));
            this.f22517a.invalidate();
            invalidate();
        }
        if (i10 == 0 || (MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE & i10) != 0 || (i10 & MessagesController.UPDATE_MASK_NEW_MESSAGE) != 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i13).dialogs_dict.f(this.f22521f);
            zq zqVar = this.f22524s;
            if (dialog != null && (i11 = dialog.unread_count) != 0) {
                if (this.d != i11) {
                    this.d = i11;
                    zqVar.f33594a.c(i11, this.f22523r);
                    return;
                }
                return;
            }
            this.d = 0;
            zqVar.f33594a.c(0, this.f22523r);
        }
    }

    public final void c(boolean z10) {
        TL_account.RequirementToContact requirementToContact;
        boolean z11;
        if (this.f22526x && this.f22520e != null) {
            requirementToContact = MessagesController.getInstance(this.h).isUserContactBlocked(this.f22520e.f20184id);
        } else {
            requirementToContact = null;
        }
        if (this.E == DialogObject.isPremiumBlocked(requirementToContact) && this.G == DialogObject.getMessagesStarsPrice(requirementToContact)) {
            return;
        }
        this.E = DialogObject.isPremiumBlocked(requirementToContact);
        this.G = DialogObject.getMessagesStarsPrice(requirementToContact);
        if (!z10) {
            this.f22527y.f(this.E, true);
            if (this.G > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.F.f(z11, true);
        }
        invalidate();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r20, android.view.View r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n4.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getDialogId() {
        return this.f22521f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f22525w) {
            org.telegram.ui.Components.w9 w9Var = this.f22517a;
            int measuredWidth = (w9Var.getMeasuredWidth() / 2) + w9Var.getLeft();
            int measuredHeight = (w9Var.getMeasuredHeight() / 2) + w9Var.getTop();
            org.telegram.ui.ActionBar.i6.f21014o0.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.B5, false));
            org.telegram.ui.ActionBar.i6.f21014o0.setAlpha((int) (this.v.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.i6.f21014o0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
        this.f22524s.f33594a.E = AndroidUtilities.dp(13.0f);
    }
}
