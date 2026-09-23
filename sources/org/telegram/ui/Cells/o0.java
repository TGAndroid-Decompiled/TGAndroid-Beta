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
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.yc;
public final class o0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final om0 E;
    public n0 F;
    public pa G;
    public final t1 f20489a;
    public int f20490b;
    public long f20491c;
    public MessageObject d;
    public long e;
    public StaticLayout f20493g;
    public float h;
    public float f20494i;
    public int f20495j;
    public float f20500o;
    public float f20501p;
    public h90 f20504s;
    public final org.telegram.ui.Components.e6 f20506u;
    public f01 v;
    public final yc f20509y;
    public final TextPaint f20492f = new TextPaint(1);
    public final Paint f20496k = new Paint(1);
    public final Path f20497l = new Path();
    public final float f20498m = -1.0f;
    public int f20499n = AndroidUtilities.dp(66.0f);
    public final ArrayList f20502q = new ArrayList();
    public final Path f20503r = new Path();
    public final RectF f20507w = new RectF();
    public final RectF f20508x = new RectF();
    public final Paint f20510z = new Paint(1);
    public boolean f20505t = true;

    public o0(t1 t1Var) {
        this.f20489a = t1Var;
        this.E = new om0(t1Var.getContext(), null);
        this.f20509y = new yc(t1Var);
        this.f20506u = new org.telegram.ui.Components.e6(t1Var, 350L, rr.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        om0 om0Var = this.E;
        if (om0Var.b()) {
            float f7 = om0Var.f26811j;
            this.f20500o = f7;
            this.f20500o = Utilities.clamp(f7, this.f20501p - (this.f20507w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.f20489a.a3();
        }
    }

    public final void c(android.graphics.Canvas r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.channelJoinedExpanded && this.f20502q.size() > 0) {
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
        this.f20490b = messageObject.currentAccount;
        this.d = messageObject;
        this.f20491c = messageObject.getDialogId();
        MessagesController.getInstance(this.f20490b).getChat(Long.valueOf(-this.f20491c));
        this.e = -this.f20491c;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f20492f;
        textPaint.setTypeface(bold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i13 = org.telegram.ui.ActionBar.h6.f18884ic;
        t1 t1Var = this.f20489a;
        textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(i13, t1Var.Id));
        this.f20493g = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f20494i = 0.0f;
        for (int i14 = 0; i14 < this.f20493g.getLineCount(); i14++) {
            this.h = Math.min(this.h, this.f20493g.getLineLeft(i14));
            this.f20494i = Math.max(this.f20494i, this.f20493g.getLineRight(i14));
        }
        this.f20495j = this.f20493g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f20510z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.W5, t1Var.Id));
        t1Var.f21197s0 = AndroidUtilities.dp(14.66f) + this.f20495j;
        int i15 = 0;
        while (true) {
            arrayList = this.f20502q;
            if (i15 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i15);
            int i16 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = n0Var.f20421c;
                if (i16 < imageReceiverArr.length) {
                    imageReceiverArr[i16].onDetachedFromWindow();
                    i16++;
                }
            }
            i15++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.f20490b).getChannelRecommendations(this.f20491c);
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
        if (!arrayList2.isEmpty() && (UserConfig.getInstance(this.f20490b).isPremium() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f20505t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.f20490b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.f20490b).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new n0(this.f20490b, t1Var, (TLObject) arrayList2.get(i18)));
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
                arrayList.add(new n0(this.f20490b, t1Var, new TLObject[]{tLObject, tLObject2, tLObject4}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            if (this.f20491c > 0) {
                i10 = R.string.SimilarBots;
            } else {
                i10 = R.string.SimilarChannels;
            }
            f01 f01Var = new f01(LocaleController.getString(i10), 14.0f, AndroidUtilities.bold());
            f01Var.f23794o = true;
            this.v = f01Var;
        }
        if (d()) {
            t1Var.f21197s0 = AndroidUtilities.dp(144.0f) + t1Var.f21197s0;
            this.f20496k.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19048ra, t1Var.Id));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.f20499n);
        this.f20501p = size2;
        this.f20500o = Utilities.clamp(this.f20500o, size2, 0.0f);
    }
}
