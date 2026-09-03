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
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.wq;
public final class n4 extends FrameLayout {
    public boolean B;
    public final org.telegram.ui.Components.z5 C;
    public long D;
    public int E;
    public fg.p1 F;
    public Drawable G;
    public final org.telegram.ui.Components.p9 f23208a;
    public final hg.q f23209b;
    public final org.telegram.ui.Components.z8 f23210c;
    public int d;
    public TLRPC.User f23211e;
    public long f23212f;
    public final int h;
    public float f23213n;
    public boolean f23214r;
    public final wq f23215s;
    public final np v;
    public final boolean f23216w;
    public boolean f23217x;
    public final org.telegram.ui.Components.z5 f23218y;

    public n4(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context);
        this.f23210c = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        new RectF();
        this.h = UserConfig.selectedAccount;
        pr prVar = pr.h;
        this.f23218y = new org.telegram.ui.Components.z5(this, 0L, 350L, prVar);
        this.C = new org.telegram.ui.Components.z5(this, 0L, 350L, prVar);
        this.E = org.telegram.ui.ActionBar.k6.f21661d6;
        this.f23216w = z4;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f23208a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(27.0f));
        addView(p9Var, k7.c6.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        hg.q qVar = new hg.q(context, 4);
        this.f23209b = qVar;
        NotificationCenter.listenEmojiLoading(qVar);
        qVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        qVar.setTextSize(1, 12.0f);
        qVar.setMaxLines(1);
        qVar.setGravity(49);
        qVar.setLines(1);
        qVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(qVar, k7.c6.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        wq wqVar = new wq(context, g6Var);
        this.f23215s = wqVar;
        addView(wqVar, k7.c6.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.k6.W8;
        int i11 = org.telegram.ui.ActionBar.k6.U8;
        vq vqVar = wqVar.f32815a;
        vqVar.v = i10;
        vqVar.f32526w = i11;
        wqVar.setGravity(5);
        if (z4) {
            np npVar = new np(context, 21, g6Var);
            this.v = npVar;
            npVar.b(org.telegram.ui.ActionBar.k6.B5, org.telegram.ui.ActionBar.k6.f21733h5, org.telegram.ui.ActionBar.k6.C5);
            npVar.setDrawUnchecked(false);
            npVar.setDrawBackgroundAsArc(4);
            npVar.setProgressDelegate(new ha(this, 4));
            addView(npVar, k7.c6.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            npVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j10, String str) {
        if (this.f23212f != j10) {
            this.f23214r = false;
            invalidate();
        }
        this.f23212f = j10;
        boolean isUserDialog = DialogObject.isUserDialog(j10);
        org.telegram.ui.Components.p9 p9Var = this.f23208a;
        org.telegram.ui.Components.z8 z8Var = this.f23210c;
        int i10 = this.h;
        hg.q qVar = this.f23209b;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            this.f23211e = user;
            if (str != null) {
                qVar.setText(str);
            } else if (user != null) {
                qVar.setText(UserObject.getFirstName(user));
            } else {
                qVar.setText("");
            }
            z8Var.m(i10, this.f23211e);
            p9Var.e(this.f23211e, z8Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (str != null) {
                qVar.setText(str);
            } else if (chat != null) {
                qVar.setText(chat.title);
            } else {
                qVar.setText("");
            }
            z8Var.k(i10, chat);
            this.f23211e = null;
            p9Var.e(chat, z8Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i10) {
        int i11;
        int i12 = MessagesController.UPDATE_MASK_STATUS & i10;
        int i13 = this.h;
        if (i12 != 0 && this.f23211e != null) {
            this.f23211e = MessagesController.getInstance(i13).getUser(Long.valueOf(this.f23211e.f20992id));
            this.f23208a.invalidate();
            invalidate();
        }
        if (i10 == 0 || (MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE & i10) != 0 || (i10 & MessagesController.UPDATE_MASK_NEW_MESSAGE) != 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i13).dialogs_dict.f(this.f23212f);
            wq wqVar = this.f23215s;
            if (dialog != null && (i11 = dialog.unread_count) != 0) {
                if (this.d != i11) {
                    this.d = i11;
                    wqVar.f32815a.c(i11, this.f23214r);
                    return;
                }
                return;
            }
            this.d = 0;
            wqVar.f32815a.c(0, this.f23214r);
        }
    }

    public final void c(boolean z4) {
        TL_account.RequirementToContact requirementToContact;
        boolean z10;
        if (this.f23217x && this.f23211e != null) {
            requirementToContact = MessagesController.getInstance(this.h).isUserContactBlocked(this.f23211e.f20992id);
        } else {
            requirementToContact = null;
        }
        if (this.B == DialogObject.isPremiumBlocked(requirementToContact) && this.D == DialogObject.getMessagesStarsPrice(requirementToContact)) {
            return;
        }
        this.B = DialogObject.isPremiumBlocked(requirementToContact);
        this.D = DialogObject.getMessagesStarsPrice(requirementToContact);
        if (!z4) {
            this.f23218y.f(this.B, true);
            if (this.D > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.C.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r20, android.view.View r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n4.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getDialogId() {
        return this.f23212f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f23216w) {
            org.telegram.ui.Components.p9 p9Var = this.f23208a;
            int measuredWidth = (p9Var.getMeasuredWidth() / 2) + p9Var.getLeft();
            int measuredHeight = (p9Var.getMeasuredHeight() / 2) + p9Var.getTop();
            org.telegram.ui.ActionBar.k6.f21853o0.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.B5, false));
            org.telegram.ui.ActionBar.k6.f21853o0.setAlpha((int) (this.v.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.k6.f21853o0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
        this.f23215s.f32815a.E = AndroidUtilities.dp(13.0f);
    }
}
