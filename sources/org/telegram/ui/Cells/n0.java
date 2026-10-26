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
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.un0;
import org.telegram.ui.Components.xc;
public final class n0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final un0 E;
    public m0 F;
    public pa G;
    public final s1 f24498a;
    public int f24499b;
    public long f24500c;
    public MessageObject d;
    public long e;
    public StaticLayout f24502g;
    public float h;
    public float f24503i;
    public int f24504j;
    public float f24509o;
    public float f24510p;
    public da0 f24513s;
    public final org.telegram.ui.Components.h6 f24515u;
    public q11 v;
    public final xc f24518y;
    public final TextPaint f24501f = new TextPaint(1);
    public final Paint f24505k = new Paint(1);
    public final Path f24506l = new Path();
    public final float f24507m = -1.0f;
    public int f24508n = AndroidUtilities.dp(66.0f);
    public final ArrayList f24511q = new ArrayList();
    public final Path f24512r = new Path();
    public final RectF f24516w = new RectF();
    public final RectF f24517x = new RectF();
    public final Paint f24519z = new Paint(1);
    public boolean f24514t = true;

    public n0(s1 s1Var) {
        this.f24498a = s1Var;
        this.E = new un0(s1Var.getContext(), null);
        this.f24518y = new xc(s1Var);
        this.f24515u = new org.telegram.ui.Components.h6(s1Var, 350L, ds.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        un0 un0Var = this.E;
        if (un0Var.b()) {
            float f7 = un0Var.f33458j;
            this.f24509o = f7;
            this.f24509o = Utilities.clamp(f7, this.f24510p - (this.f24516w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.f24498a.a3();
        }
    }

    public final void c(android.graphics.Canvas r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.channelJoinedExpanded && this.f24511q.size() > 0) {
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
        this.f24499b = messageObject.currentAccount;
        this.d = messageObject;
        this.f24500c = messageObject.getDialogId();
        MessagesController.getInstance(this.f24499b).getChat(Long.valueOf(-this.f24500c));
        this.e = -this.f24500c;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f24501f;
        textPaint.setTypeface(bold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i13 = org.telegram.ui.ActionBar.y6.f23453ic;
        s1 s1Var = this.f24498a;
        textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(i13, s1Var.Id));
        this.f24502g = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f24503i = 0.0f;
        for (int i14 = 0; i14 < this.f24502g.getLineCount(); i14++) {
            this.h = Math.min(this.h, this.f24502g.getLineLeft(i14));
            this.f24503i = Math.max(this.f24503i, this.f24502g.getLineRight(i14));
        }
        this.f24504j = this.f24502g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f24519z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.W5, s1Var.Id));
        s1Var.f25269s0 = AndroidUtilities.dp(14.66f) + this.f24504j;
        int i15 = 0;
        while (true) {
            arrayList = this.f24511q;
            if (i15 >= arrayList.size()) {
                break;
            }
            m0 m0Var = (m0) arrayList.get(i15);
            int i16 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = m0Var.f24408c;
                if (i16 < imageReceiverArr.length) {
                    imageReceiverArr[i16].onDetachedFromWindow();
                    i16++;
                }
            }
            i15++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.f24499b).getChannelRecommendations(this.f24500c);
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
        if (!arrayList2.isEmpty() && (UserConfig.getInstance(this.f24499b).isPremium() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f24514t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.f24499b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.f24499b).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new m0(this.f24499b, s1Var, (TLObject) arrayList2.get(i18)));
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
                arrayList.add(new m0(this.f24499b, s1Var, new TLObject[]{tLObject, tLObject2, tLObject4}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            if (this.f24500c > 0) {
                i10 = R.string.SimilarBots;
            } else {
                i10 = R.string.SimilarChannels;
            }
            q11 q11Var = new q11(LocaleController.getString(i10), 14.0f, AndroidUtilities.bold());
            q11Var.f31799o = true;
            this.v = q11Var;
        }
        if (d()) {
            s1Var.f25269s0 = AndroidUtilities.dp(144.0f) + s1Var.f25269s0;
            this.f24505k.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23618ra, s1Var.Id));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.f24508n);
        this.f24510p = size2;
        this.f24509o = Utilities.clamp(this.f24509o, size2, 0.0f);
    }
}
