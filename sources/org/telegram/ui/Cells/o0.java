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
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.wc;
public final class o0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final nm0 E;
    public n0 F;
    public oa G;
    public final t1 f20501a;
    public int f20502b;
    public long f20503c;
    public MessageObject d;
    public long e;
    public StaticLayout f20505g;
    public float h;
    public float f20506i;
    public int f20507j;
    public float f20512o;
    public float f20513p;
    public g90 f20516s;
    public final org.telegram.ui.Components.c6 f20518u;
    public g01 v;
    public final wc f20521y;
    public final TextPaint f20504f = new TextPaint(1);
    public final Paint f20508k = new Paint(1);
    public final Path f20509l = new Path();
    public final float f20510m = -1.0f;
    public int f20511n = AndroidUtilities.dp(66.0f);
    public final ArrayList f20514q = new ArrayList();
    public final Path f20515r = new Path();
    public final RectF f20519w = new RectF();
    public final RectF f20520x = new RectF();
    public final Paint f20522z = new Paint(1);
    public boolean f20517t = true;

    public o0(t1 t1Var) {
        this.f20501a = t1Var;
        this.E = new nm0(t1Var.getContext(), null);
        this.f20521y = new wc(t1Var);
        this.f20518u = new org.telegram.ui.Components.c6(t1Var, 350L, qr.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        nm0 nm0Var = this.E;
        if (nm0Var.b()) {
            float f7 = nm0Var.f26528j;
            this.f20512o = f7;
            this.f20512o = Utilities.clamp(f7, this.f20513p - (this.f20519w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.f20501a.a3();
        }
    }

    public final void c(android.graphics.Canvas r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.channelJoinedExpanded && this.f20514q.size() > 0) {
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
        this.f20502b = messageObject.currentAccount;
        this.d = messageObject;
        this.f20503c = messageObject.getDialogId();
        MessagesController.getInstance(this.f20502b).getChat(Long.valueOf(-this.f20503c));
        this.e = -this.f20503c;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f20504f;
        textPaint.setTypeface(bold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i13 = org.telegram.ui.ActionBar.i6.f18929ic;
        t1 t1Var = this.f20501a;
        textPaint.setColor(org.telegram.ui.ActionBar.i6.v0(i13, t1Var.Id));
        this.f20505g = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f20506i = 0.0f;
        for (int i14 = 0; i14 < this.f20505g.getLineCount(); i14++) {
            this.h = Math.min(this.h, this.f20505g.getLineLeft(i14));
            this.f20506i = Math.max(this.f20506i, this.f20505g.getLineRight(i14));
        }
        this.f20507j = this.f20505g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f20522z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.W5, t1Var.Id));
        t1Var.f21210s0 = AndroidUtilities.dp(14.66f) + this.f20507j;
        int i15 = 0;
        while (true) {
            arrayList = this.f20514q;
            if (i15 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i15);
            int i16 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = n0Var.f20442c;
                if (i16 < imageReceiverArr.length) {
                    imageReceiverArr[i16].onDetachedFromWindow();
                    i16++;
                }
            }
            i15++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.f20502b).getChannelRecommendations(this.f20503c);
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
        if (!arrayList2.isEmpty() && (UserConfig.getInstance(this.f20502b).isPremium() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f20517t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.f20502b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.f20502b).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new n0(this.f20502b, t1Var, (TLObject) arrayList2.get(i18)));
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
                arrayList.add(new n0(this.f20502b, t1Var, new TLObject[]{tLObject, tLObject2, tLObject4}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            if (this.f20503c > 0) {
                i10 = R.string.SimilarBots;
            } else {
                i10 = R.string.SimilarChannels;
            }
            g01 g01Var = new g01(LocaleController.getString(i10), 14.0f, AndroidUtilities.bold());
            g01Var.f24155o = true;
            this.v = g01Var;
        }
        if (d()) {
            t1Var.f21210s0 = AndroidUtilities.dp(144.0f) + t1Var.f21210s0;
            this.f20508k.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19093ra, t1Var.Id));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.f20511n);
        this.f20513p = size2;
        this.f20512o = Utilities.clamp(this.f20512o, size2, 0.0f);
    }
}
