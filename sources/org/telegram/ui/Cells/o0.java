package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.VelocityTracker;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zm0;
public final class o0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final zm0 E;
    public n0 F;
    public na G;
    public final u1 f20734a;
    public int f20735b;
    public long f20736c;
    public MessageObject d;
    public long e;
    public StaticLayout f20738g;
    public float h;
    public float f20739i;
    public int f20740j;
    public float f20745o;
    public float f20746p;
    public r90 f20749s;
    public final org.telegram.ui.Components.e6 f20751u;
    public t01 v;
    public final yc f20754y;
    public final TextPaint f20737f = new TextPaint(1);
    public final Paint f20741k = new Paint(1);
    public final Path f20742l = new Path();
    public final float f20743m = -1.0f;
    public int f20744n = AndroidUtilities.dp(66.0f);
    public final ArrayList f20747q = new ArrayList();
    public final Path f20748r = new Path();
    public final RectF f20752w = new RectF();
    public final RectF f20753x = new RectF();
    public final Paint f20755z = new Paint(1);
    public boolean f20750t = true;

    public o0(u1 u1Var) {
        this.f20734a = u1Var;
        this.E = new zm0(u1Var.getContext(), null);
        this.f20754y = new yc(u1Var);
        this.f20751u = new org.telegram.ui.Components.e6(u1Var, 350L, rr.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        zm0 zm0Var = this.E;
        if (zm0Var.b()) {
            float f7 = zm0Var.f30937j;
            this.f20745o = f7;
            this.f20745o = Utilities.clamp(f7, this.f20746p - (this.f20752w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.f20734a.a3();
        }
    }

    public final void c(android.graphics.Canvas r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.channelJoinedExpanded && this.f20747q.size() > 0) {
            return true;
        }
        return false;
    }

    public final void e(MessageObject messageObject) {
        StaticLayout staticLayout;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        int i10;
        TLObject tLObject;
        TLObject tLObject2;
        int i11;
        int i12;
        this.f20735b = messageObject.currentAccount;
        this.d = messageObject;
        this.f20736c = messageObject.getDialogId();
        MessagesController.getInstance(this.f20735b).getChat(Long.valueOf(-this.f20736c));
        this.e = -this.f20736c;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f20737f;
        textPaint.setTypeface(bold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i13 = org.telegram.ui.ActionBar.h6.f19155ic;
        u1 u1Var = this.f20734a;
        textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(i13, u1Var.Id));
        this.f20738g = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f20739i = 0.0f;
        for (int i14 = 0; i14 < this.f20738g.getLineCount(); i14++) {
            this.h = Math.min(this.h, this.f20738g.getLineLeft(i14));
            this.f20739i = Math.max(this.f20739i, this.f20738g.getLineRight(i14));
        }
        this.f20740j = this.f20738g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f20755z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.W5, u1Var.Id));
        u1Var.f21513s0 = AndroidUtilities.dp(14.66f) + this.f20740j;
        int i15 = 0;
        while (true) {
            arrayList = this.f20747q;
            if (i15 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i15);
            int i16 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = n0Var.f20666c;
                if (i16 < imageReceiverArr.length) {
                    imageReceiverArr[i16].onDetachedFromWindow();
                    i16++;
                }
            }
            i15++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.f20735b).getChannelRecommendations(this.f20736c);
        if (channelRecommendations != null && channelRecommendations.chats != null) {
            arrayList2 = new ArrayList(channelRecommendations.chats);
        } else {
            arrayList2 = new ArrayList();
        }
        int i17 = 0;
        while (i17 < arrayList2.size()) {
            TLObject tLObject3 = (TLObject) arrayList2.get(i17);
            if ((tLObject3 instanceof TLRPC.Chat) && !ChatObject.isNotInChat((TLRPC.Chat) tLObject3)) {
                arrayList2.remove(i17);
                i17--;
            }
            i17++;
        }
        if (!arrayList2.isEmpty() && (UserConfig.getInstance(this.f20735b).isPremium() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f20750t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.f20735b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.f20735b).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new n0(this.f20735b, u1Var, (TLObject) arrayList2.get(i18)));
            }
            if (min < arrayList2.size()) {
                TLObject tLObject4 = null;
                if (min >= 0 && min < arrayList2.size()) {
                    tLObject = (TLObject) arrayList2.get(min);
                } else {
                    tLObject = null;
                }
                if (min >= 0 && (i12 = min + 1) < arrayList2.size()) {
                    tLObject2 = (TLObject) arrayList2.get(i12);
                } else {
                    tLObject2 = null;
                }
                if (min >= 0 && (i11 = min + 2) < arrayList2.size()) {
                    tLObject4 = (TLObject) arrayList2.get(i11);
                }
                arrayList.add(new n0(this.f20735b, u1Var, new TLObject[]{tLObject, tLObject2, tLObject4}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            if (this.f20736c > 0) {
                i10 = R.string.SimilarBots;
            } else {
                i10 = R.string.SimilarChannels;
            }
            t01 t01Var = new t01(LocaleController.getString(i10), 14.0f, AndroidUtilities.bold());
            t01Var.f28373o = true;
            this.v = t01Var;
        }
        if (d()) {
            u1Var.f21513s0 = AndroidUtilities.dp(144.0f) + u1Var.f21513s0;
            this.f20741k.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19321ra, u1Var.Id));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.f20744n);
        this.f20746p = size2;
        this.f20745o = Utilities.clamp(this.f20745o, size2, 0.0f);
    }
}
