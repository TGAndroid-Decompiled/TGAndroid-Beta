package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.eb1;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.jb1;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.nb1;
import org.telegram.ui.Components.ub1;
import org.telegram.ui.Components.xc;
import org.telegram.ui.PhotoViewer;
public final class d2 extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public StaticLayout E;
    public final int F;
    public StaticLayout G;
    public final int H;
    public StaticLayout I;
    public TLRPC.BotInlineResult J;
    public TLRPC.User K;
    public TLRPC.Document L;
    public int M;
    public TLRPC.Photo N;
    public TLRPC.PhotoSize O;
    public int P;
    public boolean Q;
    public MessageObject R;
    public AnimatorSet S;
    public final Paint T;
    public final int U;
    public int V;
    public final RadialProgress2 W;
    public final ImageReceiver f23983a;
    public boolean f23984a0;
    public boolean f23985b;
    public final aq f23986b0;
    public final i90 f23987c;
    public c2 f23988c0;
    public final int d;
    public xc f23989d0;
    public Object e;
    public boolean f23990e0;
    public final org.telegram.ui.ActionBar.u6 f23991f;
    public String f23992f0;
    public boolean f23993g0;
    public eb1 h;
    public float f23994h0;
    public final b2 f23995i0;
    public boolean f23996n;
    public boolean f23997r;
    public boolean f23998s;
    public boolean v;
    public boolean f23999w;
    public boolean f24000x;
    public int f24001y;

    static {
        new AccelerateInterpolator(0.5f);
    }

    public d2(Context context) {
        this(context, null, false);
    }

    private int getIconForCurrentState() {
        int i10 = this.P;
        RadialProgress2 radialProgress2 = this.W;
        if (i10 != 3 && i10 != 5) {
            radialProgress2.g(org.telegram.ui.ActionBar.y6.f23511le, org.telegram.ui.ActionBar.y6.f23529me, org.telegram.ui.ActionBar.y6.f23549ne, org.telegram.ui.ActionBar.y6.f23569oe);
            if (this.V != 1) {
                return 4;
            }
            return 10;
        }
        radialProgress2.g(org.telegram.ui.ActionBar.y6.ie, org.telegram.ui.ActionBar.y6.f23473je, org.telegram.ui.ActionBar.y6.f23680uc, org.telegram.ui.ActionBar.y6.f23698vc);
        int i11 = this.V;
        if (i11 == 1) {
            return 1;
        }
        if (i11 == 2) {
            return 2;
        }
        if (i11 == 4) {
            return 3;
        }
        return 0;
    }

    public final void a() {
        int i10 = this.P;
        if (i10 == 3 || i10 == 5) {
            int i11 = this.V;
            RadialProgress2 radialProgress2 = this.W;
            if (i11 == 0) {
                if (MediaController.getInstance().playMessage(this.R)) {
                    this.V = 1;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            } else if (i11 == 1) {
                if (MediaController.getInstance().lambda$startAudioAgain$7(this.R)) {
                    this.V = 0;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            } else {
                int i12 = this.d;
                if (i11 == 2) {
                    radialProgress2.p(0.0f, false);
                    if (this.L != null) {
                        FileLoader.getInstance(i12).loadFile(this.L, this.J, 1, 0);
                    } else if (this.J.content instanceof TLRPC.TL_webDocument) {
                        FileLoader.getInstance(i12).loadFile(WebFile.createWithWebDocument(this.J.content), 3, 1);
                    }
                    this.V = 4;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                } else if (i11 == 4) {
                    if (this.L != null) {
                        FileLoader.getInstance(i12).cancelLoadFile(this.L);
                    } else if (this.J.content instanceof TLRPC.TL_webDocument) {
                        FileLoader.getInstance(i12).cancelLoadFile(WebFile.createWithWebDocument(this.J.content));
                    }
                    this.V = 2;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            }
        }
    }

    public final void b() {
        String str;
        String str2;
        this.R = null;
        this.P = 0;
        TLRPC.Document document = this.L;
        if (document != null) {
            if (MessageObject.isGifDocument(document)) {
                this.P = 2;
            } else if (!MessageObject.isStickerDocument(this.L) && !MessageObject.isAnimatedStickerDocument(this.L, true)) {
                if (MessageObject.isMusicDocument(this.L)) {
                    this.P = 5;
                } else if (MessageObject.isVoiceDocument(this.L)) {
                    this.P = 3;
                }
            } else {
                this.P = 6;
            }
        } else {
            TLRPC.BotInlineResult botInlineResult = this.J;
            if (botInlineResult != null) {
                if (botInlineResult.photo != null) {
                    this.P = 7;
                } else if (botInlineResult.type.equals("audio")) {
                    this.P = 5;
                } else if (this.J.type.equals("voice")) {
                    this.P = 3;
                }
            }
        }
        int i10 = this.P;
        if (i10 != 3 && i10 != 5) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.out = true;
        tL_message.f22049id = -Utilities.random.nextInt();
        tL_message.peer_id = new TLRPC.TL_peerUser();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser;
        TLRPC.Peer peer = tL_message.peer_id;
        int i11 = this.d;
        long clientUserId = UserConfig.getInstance(i11).getClientUserId();
        tL_peerUser.user_id = clientUserId;
        peer.user_id = clientUserId;
        tL_message.date = (int) (System.currentTimeMillis() / 1000);
        String str3 = "";
        tL_message.message = "";
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.flags |= 3;
        tL_messageMediaDocument.document = new TLRPC.TL_document();
        TLRPC.MessageMedia messageMedia = tL_message.media;
        messageMedia.document.file_reference = new byte[0];
        tL_message.flags |= 768;
        TLRPC.Document document2 = this.L;
        if (document2 != null) {
            messageMedia.document = document2;
            tL_message.attachPath = "";
        } else {
            String str4 = this.J.content.url;
            String str5 = "ogg";
            if (this.P != 5) {
                str = "ogg";
            } else {
                str = "mp3";
            }
            String httpUrlExtension = ImageLoader.getHttpUrlExtension(str4, str);
            TLRPC.Document document3 = tL_message.media.document;
            document3.f22034id = 0L;
            document3.access_hash = 0L;
            document3.date = tL_message.date;
            document3.mime_type = b10.j("audio/", httpUrlExtension);
            TLRPC.Document document4 = tL_message.media.document;
            document4.size = 0L;
            document4.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio.duration = MessageObject.getInlineResultDuration(this.J);
            TLRPC.BotInlineResult botInlineResult2 = this.J;
            String str6 = botInlineResult2.title;
            if (str6 == null) {
                str6 = "";
            }
            tL_documentAttributeAudio.title = str6;
            String str7 = botInlineResult2.description;
            if (str7 != null) {
                str3 = str7;
            }
            tL_documentAttributeAudio.performer = str3;
            tL_documentAttributeAudio.flags |= 3;
            if (this.P == 3) {
                tL_documentAttributeAudio.voice = true;
            }
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Utilities.MD5(this.J.content.url));
            sb2.append(".");
            String str8 = this.J.content.url;
            if (this.P != 5) {
                str2 = "ogg";
            } else {
                str2 = "mp3";
            }
            sb2.append(ImageLoader.getHttpUrlExtension(str8, str2));
            tL_documentAttributeFilename.file_name = sb2.toString();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            File directory = FileLoader.getDirectory(4);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Utilities.MD5(this.J.content.url));
            sb3.append(".");
            String str9 = this.J.content.url;
            if (this.P == 5) {
                str5 = "mp3";
            }
            sb3.append(ImageLoader.getHttpUrlExtension(str9, str5));
            tL_message.attachPath = new File(directory, sb3.toString()).getAbsolutePath();
        }
        this.R = new MessageObject(i11, tL_message, false, true);
    }

    public final void c(boolean z10, boolean z11) {
        aq aqVar = this.f23986b0;
        if (aqVar == null) {
            return;
        }
        if (aqVar.getVisibility() != 0) {
            aqVar.setVisibility(0);
        }
        aqVar.a(z10, z11);
        AnimatorSet animatorSet = this.S;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.S = null;
        }
        float f7 = 1.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.S = animatorSet2;
            if (z10) {
                f7 = 0.81f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.f23995i0, f7));
            this.S.setDuration(200L);
            this.S.addListener(new bh.f0(23, this, z10));
            this.S.start();
            return;
        }
        if (z10) {
            f7 = 0.85f;
        }
        this.f23994h0 = f7;
        invalidate();
    }

    public final void d(int i10, TLRPC.Document document, Object obj) {
        this.f23996n = false;
        this.f23998s = false;
        this.M = i10;
        this.J = null;
        this.e = obj;
        this.L = document;
        this.N = null;
        this.Q = true;
        this.f24000x = true;
        b();
        this.P = 2;
        requestLayout();
        this.f23992f0 = null;
        this.f23993g0 = false;
        this.f23990e0 = false;
        f(false, false);
    }

    public final void e(TLRPC.BotInlineResult botInlineResult, TLRPC.User user, boolean z10, boolean z11, boolean z12, boolean z13) {
        eb1 eb1Var;
        this.f23996n = z11;
        this.f23998s = z12;
        this.K = user;
        this.J = botInlineResult;
        this.e = botInlineResult;
        if (botInlineResult != null) {
            this.L = botInlineResult.document;
            this.N = botInlineResult.photo;
        } else {
            this.L = null;
            this.N = null;
        }
        this.Q = z10;
        this.f24000x = z13;
        eb1 eb1Var2 = this.h;
        if (eb1Var2 != null && eb1Var2.f27817r) {
            eb1Var2.f27817r = false;
            eb1Var2.h.p(false);
            eb1Var2.h.q();
            jb1.q(eb1Var2.f27814c);
        }
        if (botInlineResult != null && (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageWidget)) {
            eb1Var = new eb1(this, this.d, botInlineResult, this.f23991f);
        } else {
            eb1Var = null;
        }
        this.h = eb1Var;
        b();
        if (z13) {
            this.P = 2;
        }
        requestLayout();
        this.f23992f0 = null;
        this.f23993g0 = false;
        this.f23990e0 = false;
        f(false, false);
    }

    public final void f(boolean z10, boolean z11) {
        boolean isLoadingHttpFile;
        String str = this.f23992f0;
        if (str == null && !this.f23990e0) {
            this.f23990e0 = true;
            Utilities.searchQueue.postRunnable(new a2(this, z10));
            this.W.setIcon(4, z10, false);
        } else if (TextUtils.isEmpty(str)) {
            this.V = -1;
            this.W.setIcon(4, z10, false);
        } else {
            if (this.L != null) {
                isLoadingHttpFile = FileLoader.getInstance(this.d).isLoadingFile(this.f23992f0);
            } else {
                isLoadingHttpFile = ImageLoader.getInstance().isLoadingHttpFile(this.f23992f0);
            }
            if (!isLoadingHttpFile && this.f23993g0) {
                DownloadController.getInstance(this.d).removeLoadingFileObserver(this);
                int i10 = this.P;
                if (i10 != 5 && i10 != 3) {
                    this.V = -1;
                } else {
                    boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.R);
                    if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                        this.V = 1;
                    } else {
                        this.V = 0;
                    }
                    this.W.p(1.0f, z11);
                }
            } else {
                DownloadController.getInstance(this.d).addLoadingFileObserver(this.f23992f0, this);
                int i11 = this.P;
                float f7 = 0.0f;
                if (i11 != 5 && i11 != 3) {
                    this.V = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(this.f23992f0);
                    if (fileProgress != null) {
                        f7 = fileProgress.floatValue();
                    }
                    this.W.p(f7, false);
                } else if (!isLoadingHttpFile) {
                    this.V = 2;
                } else {
                    this.V = 4;
                    Float fileProgress2 = ImageLoader.getInstance().getFileProgress(this.f23992f0);
                    if (fileProgress2 != null) {
                        this.W.p(fileProgress2.floatValue(), z11);
                    } else {
                        this.W.p(0.0f, z11);
                    }
                }
            }
            this.W.setIcon(getIconForCurrentState(), z10, z11);
            invalidate();
        }
    }

    public TLRPC.BotInlineResult getBotInlineResult() {
        return this.J;
    }

    public int getDate() {
        return this.M;
    }

    public TLRPC.Document getDocument() {
        return this.L;
    }

    public TLRPC.User getInlineBot() {
        return this.K;
    }

    public MessageObject getMessageObject() {
        return this.R;
    }

    @Override
    public int getObserverTag() {
        return this.U;
    }

    public Object getParentObject() {
        return this.e;
    }

    public ImageReceiver getPhotoImage() {
        return this.f23983a;
    }

    public TLRPC.BotInlineResult getResult() {
        return this.J;
    }

    @Override
    public final void onAttachedToWindow() {
        float f7;
        super.onAttachedToWindow();
        if (this.f23983a.onAttachedToWindow()) {
            f(false, false);
        }
        this.W.e();
        if (this.h != null && getMeasuredWidth() > 0) {
            eb1 eb1Var = this.h;
            int measuredWidth = getMeasuredWidth();
            if (this.Q) {
                f7 = 4.0f;
            } else {
                f7 = 16.0f;
            }
            eb1Var.f(measuredWidth - AndroidUtilities.dp(f7));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23983a.onDetachedFromWindow();
        this.W.f();
        DownloadController.getInstance(this.d).removeLoadingFileObserver(this);
        eb1 eb1Var = this.h;
        if (eb1Var != null && eb1Var.f27817r) {
            eb1Var.f27817r = false;
            eb1Var.h.p(false);
            eb1Var.h.q();
            jb1.q(eb1Var.f27814c);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        TLRPC.BotInlineResult botInlineResult;
        int i11;
        float f7;
        float f10;
        int i12;
        eb1 eb1Var = this.h;
        float f11 = 8.0f;
        float f12 = 2.0f;
        if (eb1Var != null) {
            if (this.Q) {
                f11 = 2.0f;
            }
            float dp = AndroidUtilities.dp(f11);
            if (!this.Q) {
                f12 = 6.0f;
            }
            float dp2 = AndroidUtilities.dp(f12);
            Paint paint = eb1Var.e;
            Path path = eb1Var.f27815f;
            nb1 nb1Var = eb1Var.f27814c;
            if (nb1Var != null && (i12 = eb1Var.f27816n) > 0) {
                int min = Math.min(jb1.d(eb1Var.f27813b, nb1Var, i12), AndroidUtilities.dp(320.0f));
                float dp3 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                canvas.save();
                canvas.translate(dp, dp2);
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, eb1Var.f27816n, min);
                path.addRoundRect(rectF, dp3, dp3, Path.Direction.CW);
                canvas.clipPath(path);
                paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Aa, eb1Var.d) | (-16777216));
                canvas.drawRect(rectF, paint);
                ub1 ub1Var = eb1Var.h;
                if (ub1Var != null && ub1Var.b(canvas, eb1Var.f27816n)) {
                    eb1Var.f27812a.postInvalidateOnAnimation();
                }
                canvas.restore();
            }
            if (this.f23996n && !this.Q) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23479k0);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.f23983a;
        aq aqVar = this.f23986b0;
        if (aqVar != null && (aqVar.f26634a.f26091q || !imageReceiver.hasBitmapImage() || imageReceiver.getCurrentAlpha() != 1.0f || PhotoViewer.Q1((MessageObject) this.e))) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.T);
        }
        if (this.G != null) {
            canvas.save();
            if (LocaleController.isRTL) {
                f10 = 8.0f;
            } else {
                f10 = AndroidUtilities.leftBaseline;
            }
            canvas.translate(AndroidUtilities.dp(f10), this.F);
            this.G.draw(canvas);
            canvas.restore();
        }
        StaticLayout staticLayout = this.I;
        org.telegram.ui.ActionBar.u6 u6Var = this.f23991f;
        if (staticLayout != null) {
            org.telegram.ui.ActionBar.y6.f23410g3.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23768z6, u6Var));
            canvas.save();
            if (LocaleController.isRTL) {
                f7 = 8.0f;
            } else {
                f7 = AndroidUtilities.leftBaseline;
            }
            canvas.translate(AndroidUtilities.dp(f7), this.H);
            this.I.draw(canvas);
            canvas.restore();
        }
        if (this.E != null) {
            org.telegram.ui.ActionBar.y6.f23410g3.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.J6, u6Var));
            canvas.save();
            if (!LocaleController.isRTL) {
                f11 = AndroidUtilities.leftBaseline;
            }
            canvas.translate(AndroidUtilities.dp(f11), this.f24001y);
            this.E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = this.Q;
        RadialProgress2 radialProgress2 = this.W;
        if (!z10) {
            boolean z11 = this.f23985b;
            i90 i90Var = this.f23987c;
            if (z11 && !PhotoViewer.R1(this.J)) {
                i90Var.setAlpha((int) ((1.0f - imageReceiver.getCurrentAlpha()) * 255.0f));
            } else {
                i90Var.setAlpha(255);
            }
            int i13 = this.P;
            if (i13 != 3 && i13 != 5) {
                TLRPC.BotInlineResult botInlineResult2 = this.J;
                if (botInlineResult2 != null && botInlineResult2.type.equals("file")) {
                    int intrinsicWidth = org.telegram.ui.ActionBar.y6.f23519m4.getIntrinsicWidth();
                    int intrinsicHeight = org.telegram.ui.ActionBar.y6.f23519m4.getIntrinsicHeight();
                    int imageX = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth) / 2));
                    int imageY = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight) / 2));
                    canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), i90.f29254k);
                    org.telegram.ui.ActionBar.y6.f23519m4.setBounds(imageX, imageY, intrinsicWidth + imageX, intrinsicHeight + imageY);
                    org.telegram.ui.ActionBar.y6.f23519m4.draw(canvas);
                } else {
                    TLRPC.BotInlineResult botInlineResult3 = this.J;
                    if (botInlineResult3 != null && (botInlineResult3.type.equals("audio") || this.J.type.equals("voice"))) {
                        int intrinsicWidth2 = org.telegram.ui.ActionBar.y6.f23539n4.getIntrinsicWidth();
                        int intrinsicHeight2 = org.telegram.ui.ActionBar.y6.f23539n4.getIntrinsicHeight();
                        int imageX2 = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth2) / 2));
                        int imageY2 = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight2) / 2));
                        canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), i90.f29254k);
                        org.telegram.ui.ActionBar.y6.f23539n4.setBounds(imageX2, imageY2, intrinsicWidth2 + imageX2, intrinsicHeight2 + imageY2);
                        org.telegram.ui.ActionBar.y6.f23539n4.draw(canvas);
                    } else {
                        TLRPC.BotInlineResult botInlineResult4 = this.J;
                        if (botInlineResult4 != null && (botInlineResult4.type.equals("venue") || this.J.type.equals("geo"))) {
                            int intrinsicWidth3 = org.telegram.ui.ActionBar.y6.f23559o4.getIntrinsicWidth();
                            int intrinsicHeight3 = org.telegram.ui.ActionBar.y6.f23559o4.getIntrinsicHeight();
                            int imageX3 = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth3) / 2));
                            int imageY3 = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight3) / 2));
                            canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), i90.f29254k);
                            org.telegram.ui.ActionBar.y6.f23559o4.setBounds(imageX3, imageY3, intrinsicWidth3 + imageX3, intrinsicHeight3 + imageY3);
                            org.telegram.ui.ActionBar.y6.f23559o4.draw(canvas);
                        } else {
                            i90Var.draw(canvas);
                        }
                    }
                }
            } else {
                if (this.f23997r) {
                    i11 = org.telegram.ui.ActionBar.y6.f23472jd;
                } else {
                    i11 = org.telegram.ui.ActionBar.y6.f23455id;
                }
                radialProgress2.d = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
                radialProgress2.draw(canvas);
            }
        } else {
            TLRPC.BotInlineResult botInlineResult5 = this.J;
            if (botInlineResult5 != null) {
                TLRPC.BotInlineMessage botInlineMessage = botInlineResult5.send_message;
                if ((botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue)) {
                    int intrinsicWidth4 = org.telegram.ui.ActionBar.y6.f23559o4.getIntrinsicWidth();
                    int intrinsicHeight4 = org.telegram.ui.ActionBar.y6.f23559o4.getIntrinsicHeight();
                    int B = (int) c3.h0.B(imageReceiver.getImageWidth(), intrinsicWidth4, 2.0f, imageReceiver.getImageX());
                    int B2 = (int) c3.h0.B(imageReceiver.getImageHeight(), intrinsicHeight4, 2.0f, imageReceiver.getImageY());
                    canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageWidth() + imageReceiver.getImageX(), imageReceiver.getImageHeight() + imageReceiver.getImageY(), i90.f29254k);
                    org.telegram.ui.ActionBar.y6.f23559o4.setBounds(B, B2, intrinsicWidth4 + B, intrinsicHeight4 + B2);
                    org.telegram.ui.ActionBar.y6.f23559o4.draw(canvas);
                }
            }
        }
        if (this.f23985b) {
            if (this.J != null) {
                imageReceiver.setVisible(!PhotoViewer.R1(botInlineResult), false);
            }
            canvas.save();
            float f13 = this.f23994h0;
            xc xcVar = this.f23989d0;
            if (xcVar != null) {
                f13 *= xcVar.a(0.1f);
            }
            canvas.scale(f13, f13, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            imageReceiver.draw(canvas);
            canvas.restore();
        }
        if (this.Q && ((i10 = this.P) == 7 || i10 == 2)) {
            radialProgress2.draw(canvas);
        }
        if (this.f23996n && !this.Q) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23479k0);
            } else {
                canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23479k0);
            }
        }
        if (this.f23998s) {
            org.telegram.ui.ActionBar.y6.f23579p4.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(3.0f));
            org.telegram.ui.ActionBar.y6.f23579p4.draw(canvas);
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        f(true, z10);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        boolean z11;
        String string;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        switch (this.P) {
            case 1:
                sb2.append(LocaleController.getString(R.string.AttachDocument));
                break;
            case 2:
                sb2.append(LocaleController.getString(R.string.AttachGif));
                break;
            case 3:
                sb2.append(LocaleController.getString(R.string.AttachAudio));
                break;
            case 4:
                sb2.append(LocaleController.getString(R.string.AttachVideo));
                break;
            case 5:
                sb2.append(LocaleController.getString(R.string.AttachMusic));
                break;
            case 6:
                sb2.append(LocaleController.getString(R.string.AttachSticker));
                break;
            case 7:
                sb2.append(LocaleController.getString(R.string.AttachPhoto));
                break;
        }
        StaticLayout staticLayout = this.G;
        if (staticLayout != null && !TextUtils.isEmpty(staticLayout.getText())) {
            z10 = true;
        } else {
            z10 = false;
        }
        StaticLayout staticLayout2 = this.I;
        if (staticLayout2 != null && !TextUtils.isEmpty(staticLayout2.getText())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.P == 5 && z10 && z11) {
            sb2.append(", ");
            sb2.append(LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, this.I.getText(), this.G.getText()));
        } else {
            if (z10) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.G.getText());
            }
            if (z11) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.I.getText());
            }
        }
        accessibilityNodeInfo.setText(sb2);
        aq aqVar = this.f23986b0;
        if (aqVar != null && aqVar.f26634a.f26091q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int i10 = this.P;
        if (i10 != 3 && i10 != 5) {
            return;
        }
        int iconForCurrentState = getIconForCurrentState();
        if (iconForCurrentState != 1) {
            if (iconForCurrentState != 2) {
                if (iconForCurrentState != 3) {
                    string = LocaleController.getString("AccActionPlay", R.string.AccActionPlay);
                } else {
                    string = LocaleController.getString("AccActionCancelDownload", R.string.AccActionCancelDownload);
                }
            } else {
                string = LocaleController.getString("AccActionDownload", R.string.AccActionDownload);
            }
        } else {
            string = LocaleController.getString("AccActionPause", R.string.AccActionPause);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, string));
    }

    @Override
    public final void onMeasure(int r38, int r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.d2.onMeasure(int, int):void");
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.W.p(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        int i10 = this.P;
        if (i10 != 3 && i10 != 5) {
            if (this.V != 1) {
                f(false, true);
            }
        } else if (this.V != 4) {
            f(false, true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f23993g0 = true;
        this.W.p(1.0f, true);
        f(false, true);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.WebDocument webDocument;
        if (!this.Q && this.f23988c0 != null && this.J != null) {
            int x9 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            AndroidUtilities.dp(48.0f);
            int i10 = this.P;
            i90 i90Var = this.f23987c;
            boolean z10 = true;
            if (i10 != 3 && i10 != 5) {
                TLRPC.BotInlineResult botInlineResult = this.J;
                if (botInlineResult != null && (webDocument = botInlineResult.content) != null && !TextUtils.isEmpty(webDocument.url)) {
                    if (motionEvent.getAction() == 0) {
                        if (i90Var.getBounds().contains(x9, y3)) {
                            this.f23997r = true;
                        }
                    } else if (this.f23997r) {
                        if (motionEvent.getAction() == 1) {
                            this.f23997r = false;
                            playSoundEffect(0);
                            ((ig.v0) this.f23988c0).f14272a.V.f27119b.k(getResult());
                        } else if (motionEvent.getAction() == 3) {
                            this.f23997r = false;
                        } else if (motionEvent.getAction() == 2 && !i90Var.getBounds().contains(x9, y3)) {
                            this.f23997r = false;
                        }
                    }
                }
                z10 = false;
            } else {
                boolean contains = i90Var.getBounds().contains(x9, y3);
                int action = motionEvent.getAction();
                RadialProgress2 radialProgress2 = this.W;
                if (action == 0) {
                    if (contains) {
                        this.f23997r = true;
                        radialProgress2.o(true, false);
                        invalidate();
                    }
                } else if (this.f23997r) {
                    if (motionEvent.getAction() == 1) {
                        this.f23997r = false;
                        playSoundEffect(0);
                        a();
                        invalidate();
                    } else if (motionEvent.getAction() == 3) {
                        this.f23997r = false;
                        invalidate();
                    } else if (motionEvent.getAction() == 2 && !contains) {
                        this.f23997r = false;
                        invalidate();
                    }
                    radialProgress2.o(this.f23997r, false);
                }
                z10 = false;
            }
            if (!z10) {
                return super.onTouchEvent(motionEvent);
            }
            return z10;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        int i11;
        if (i10 == 16 && ((i11 = this.P) == 3 || i11 == 5)) {
            a();
            return true;
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    public void setCanPreviewGif(boolean z10) {
        this.v = z10;
    }

    public void setDelegate(c2 c2Var) {
        this.f23988c0 = c2Var;
    }

    public void setIsKeyboard(boolean z10) {
        this.f23999w = z10;
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        super.setPressed(z10);
        xc xcVar = this.f23989d0;
        if (xcVar != null) {
            if (!z10 && !this.f23984a0) {
                z11 = false;
            } else {
                z11 = true;
            }
            xcVar.c(z11);
        }
    }

    public void setScaled(boolean z10) {
        boolean z11;
        this.f23984a0 = z10;
        xc xcVar = this.f23989d0;
        if (xcVar != null) {
            if (!isPressed() && !this.f23984a0) {
                z11 = false;
            } else {
                z11 = true;
            }
            xcVar.c(z11);
        }
    }

    public d2(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.d = i10;
        this.F = AndroidUtilities.dp(7.0f);
        this.H = AndroidUtilities.dp(27.0f);
        this.f23994h0 = 1.0f;
        this.f23995i0 = new b2(0, this);
        this.f23991f = u6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f23983a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setLayerNum(1);
        imageReceiver.setUseSharedAnimationQueue(true);
        this.f23987c = new i90(0, u6Var);
        this.W = new RadialProgress2(this, null);
        this.U = DownloadController.getInstance(i10).generateObserverTag();
        setFocusable(true);
        if (z10) {
            Paint paint = new Paint();
            this.T = paint;
            int i11 = org.telegram.ui.ActionBar.y6.Lh;
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
            aq aqVar = new aq(context, 21, u6Var);
            this.f23986b0 = aqVar;
            aqVar.setVisibility(4);
            aqVar.b(-1, i11, org.telegram.ui.ActionBar.y6.f23486k7);
            aqVar.setDrawUnchecked(false);
            aqVar.setDrawBackgroundAsArc(1);
            addView(aqVar, kb1.h(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
        }
        setWillNotDraw(false);
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
