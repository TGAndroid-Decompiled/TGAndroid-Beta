package org.telegram.ui.Cells;

import ai.wd;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.zr;
public final class m4 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public boolean E;
    public final org.telegram.ui.Components.d6 F;
    public long G;
    public int H;
    public sg.a1 I;
    public Drawable J;
    public final org.telegram.ui.Components.u9 f22719a;
    public final wd f22720b;
    public final org.telegram.ui.Components.f9 f22721c;
    public int d;
    public TLRPC.User e;
    public long f22722f;
    public final int h;
    public float f22723n;
    public boolean f22724r;
    public final dr f22725s;
    public final vp v;
    public final boolean f22726w;
    public boolean f22727x;
    public final org.telegram.ui.Components.d6 f22728y;

    public m4(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context);
        this.f22721c = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
        new RectF();
        this.h = UserConfig.selectedAccount;
        zr zrVar = zr.h;
        this.f22728y = new org.telegram.ui.Components.d6(this, 0L, 350L, zrVar);
        this.F = new org.telegram.ui.Components.d6(this, 0L, 350L, zrVar);
        this.H = org.telegram.ui.ActionBar.k6.f21184d6;
        this.f22726w = z10;
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.f22719a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(27.0f));
        addView(u9Var, w7.z5.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        wd wdVar = new wd(context, 6);
        this.f22720b = wdVar;
        NotificationCenter.listenEmojiLoading(wdVar);
        org.telegram.ui.ActionBar.r6.W(wdVar, org.telegram.ui.ActionBar.k6.G6, g6Var);
        wdVar.setTextSize(1, 12.0f);
        wdVar.setMaxLines(1);
        wdVar.setGravity(49);
        wdVar.setLines(1);
        wdVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(wdVar, w7.z5.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        dr drVar = new dr(context, g6Var);
        this.f22725s = drVar;
        addView(drVar, w7.z5.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.k6.W8;
        int i11 = org.telegram.ui.ActionBar.k6.U8;
        cr crVar = drVar.f25811a;
        crVar.v = i10;
        crVar.f25455w = i11;
        drVar.setGravity(5);
        if (z10) {
            vp vpVar = new vp(context, 21, g6Var);
            this.v = vpVar;
            vpVar.b(org.telegram.ui.ActionBar.k6.B5, org.telegram.ui.ActionBar.k6.f21255h5, org.telegram.ui.ActionBar.k6.C5);
            vpVar.setDrawUnchecked(false);
            vpVar.setDrawBackgroundAsArc(4);
            vpVar.setProgressDelegate(new ja(this, 4));
            addView(vpVar, w7.z5.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            vpVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j10, boolean z10, CharSequence charSequence) {
        if (this.f22722f != j10) {
            this.f22724r = false;
            invalidate();
        }
        this.f22722f = j10;
        boolean isUserDialog = DialogObject.isUserDialog(j10);
        org.telegram.ui.Components.u9 u9Var = this.f22719a;
        org.telegram.ui.Components.f9 f9Var = this.f22721c;
        int i10 = this.h;
        wd wdVar = this.f22720b;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            this.e = user;
            if (charSequence != null) {
                wdVar.setText(charSequence);
            } else if (user != null) {
                wdVar.setText(UserObject.getFirstName(user));
            } else {
                wdVar.setText("");
            }
            f9Var.m(i10, this.e);
            u9Var.e(this.e, f9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (charSequence != null) {
                wdVar.setText(charSequence);
            } else if (chat != null) {
                wdVar.setText(chat.title);
            } else {
                wdVar.setText("");
            }
            f9Var.k(i10, chat);
            this.e = null;
            u9Var.e(chat, f9Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i10) {
        int i11;
        int i12 = MessagesController.UPDATE_MASK_STATUS & i10;
        int i13 = this.h;
        if (i12 != 0 && this.e != null) {
            this.e = MessagesController.getInstance(i13).getUser(Long.valueOf(this.e.f20491id));
            this.f22719a.invalidate();
            invalidate();
        }
        if (i10 == 0 || (MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE & i10) != 0 || (i10 & MessagesController.UPDATE_MASK_NEW_MESSAGE) != 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i13).dialogs_dict.f(this.f22722f);
            dr drVar = this.f22725s;
            if (dialog != null && (i11 = dialog.unread_count) != 0) {
                if (this.d != i11) {
                    this.d = i11;
                    drVar.f25811a.c(i11, this.f22724r);
                    return;
                }
                return;
            }
            this.d = 0;
            drVar.f25811a.c(0, this.f22724r);
        }
    }

    public final void c(boolean z10) {
        TL_account.RequirementToContact requirementToContact;
        boolean z11;
        if (this.f22727x && this.e != null) {
            requirementToContact = MessagesController.getInstance(this.h).isUserContactBlocked(this.e.f20491id);
        } else {
            requirementToContact = null;
        }
        if (this.E == DialogObject.isPremiumBlocked(requirementToContact) && this.G == DialogObject.getMessagesStarsPrice(requirementToContact)) {
            return;
        }
        this.E = DialogObject.isPremiumBlocked(requirementToContact);
        this.G = DialogObject.getMessagesStarsPrice(requirementToContact);
        if (!z10) {
            this.f22728y.f(this.E, true);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.m4.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getDialogId() {
        return this.f22722f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f22726w) {
            org.telegram.ui.Components.u9 u9Var = this.f22719a;
            int measuredWidth = (u9Var.getMeasuredWidth() / 2) + u9Var.getLeft();
            int measuredHeight = (u9Var.getMeasuredHeight() / 2) + u9Var.getTop();
            org.telegram.ui.ActionBar.k6.f21381o0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B5, false));
            org.telegram.ui.ActionBar.k6.f21381o0.setAlpha((int) (this.v.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.k6.f21381o0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
        this.f22725s.f25811a.E = AndroidUtilities.dp(13.0f);
    }

    @Override
    public final void updateColors() {
        try {
            dr drVar = this.f22725s;
            if (drVar != null) {
                drVar.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
