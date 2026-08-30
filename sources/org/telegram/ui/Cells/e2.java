package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.rc;
import org.telegram.ui.PhotoViewer;
public final class e2 extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public final int B;
    public StaticLayout C;
    public final int D;
    public StaticLayout E;
    public TLRPC.BotInlineResult F;
    public TLRPC.User G;
    public TLRPC.Document H;
    public int I;
    public TLRPC.Photo J;
    public TLRPC.PhotoSize K;
    public int L;
    public boolean M;
    public MessageObject N;
    public AnimatorSet O;
    public final Paint P;
    public final int Q;
    public int R;
    public final RadialProgress2 S;
    public boolean T;
    public final lp U;
    public d2 V;
    public rc W;
    public final ImageReceiver f20983a;
    public boolean f20984a0;
    public boolean f20985b;
    public String f20986b0;
    public final n80 f20987c;
    public boolean f20988c0;
    public final int d;
    public float f20989d0;
    public Object e;
    public final c2 f20990e0;
    public final org.telegram.ui.ActionBar.f6 f20991f;
    public boolean h;
    public boolean f20992n;
    public boolean f20993r;
    public boolean f20994s;
    public boolean v;
    public boolean f20995w;
    public int f20996x;
    public StaticLayout f20997y;

    static {
        new AccelerateInterpolator(0.5f);
    }

    public e2(Context context) {
        this(context, null, false);
    }

    private int getIconForCurrentState() {
        int i10 = this.L;
        RadialProgress2 radialProgress2 = this.S;
        if (i10 != 3 && i10 != 5) {
            radialProgress2.g(org.telegram.ui.ActionBar.j6.f20057le, org.telegram.ui.ActionBar.j6.f20074me, org.telegram.ui.ActionBar.j6.f20092ne, org.telegram.ui.ActionBar.j6.f20110oe);
            if (this.R != 1) {
                return 4;
            }
            return 10;
        }
        radialProgress2.g(org.telegram.ui.ActionBar.j6.f20003ie, org.telegram.ui.ActionBar.j6.f20020je, org.telegram.ui.ActionBar.j6.f20213uc, org.telegram.ui.ActionBar.j6.f20231vc);
        int i11 = this.R;
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
        int i10 = this.L;
        if (i10 == 3 || i10 == 5) {
            int i11 = this.R;
            RadialProgress2 radialProgress2 = this.S;
            if (i11 == 0) {
                if (MediaController.getInstance().playMessage(this.N)) {
                    this.R = 1;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            } else if (i11 == 1) {
                if (MediaController.getInstance().lambda$startAudioAgain$7(this.N)) {
                    this.R = 0;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            } else {
                int i12 = this.d;
                if (i11 == 2) {
                    radialProgress2.o(0.0f, false);
                    if (this.H != null) {
                        FileLoader.getInstance(i12).loadFile(this.H, this.F, 1, 0);
                    } else if (this.F.content instanceof TLRPC.TL_webDocument) {
                        FileLoader.getInstance(i12).loadFile(WebFile.createWithWebDocument(this.F.content), 3, 1);
                    }
                    this.R = 4;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                } else if (i11 == 4) {
                    if (this.H != null) {
                        FileLoader.getInstance(i12).cancelLoadFile(this.H);
                    } else if (this.F.content instanceof TLRPC.TL_webDocument) {
                        FileLoader.getInstance(i12).cancelLoadFile(WebFile.createWithWebDocument(this.F.content));
                    }
                    this.R = 2;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            }
        }
    }

    public final void b() {
        String str;
        String str2;
        this.N = null;
        this.L = 0;
        TLRPC.Document document = this.H;
        if (document != null) {
            if (MessageObject.isGifDocument(document)) {
                this.L = 2;
            } else if (!MessageObject.isStickerDocument(this.H) && !MessageObject.isAnimatedStickerDocument(this.H, true)) {
                if (MessageObject.isMusicDocument(this.H)) {
                    this.L = 5;
                } else if (MessageObject.isVoiceDocument(this.H)) {
                    this.L = 3;
                }
            } else {
                this.L = 6;
            }
        } else {
            TLRPC.BotInlineResult botInlineResult = this.F;
            if (botInlineResult != null) {
                if (botInlineResult.photo != null) {
                    this.L = 7;
                } else if (botInlineResult.type.equals("audio")) {
                    this.L = 5;
                } else if (this.F.type.equals("voice")) {
                    this.L = 3;
                }
            }
        }
        int i10 = this.L;
        if (i10 != 3 && i10 != 5) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.out = true;
        tL_message.f19205id = -Utilities.random.nextInt();
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
        TLRPC.Document document2 = this.H;
        if (document2 != null) {
            messageMedia.document = document2;
            tL_message.attachPath = "";
        } else {
            String str4 = this.F.content.url;
            String str5 = "ogg";
            if (this.L != 5) {
                str = "ogg";
            } else {
                str = "mp3";
            }
            String httpUrlExtension = ImageLoader.getHttpUrlExtension(str4, str);
            TLRPC.Document document3 = tL_message.media.document;
            document3.f19190id = 0L;
            document3.access_hash = 0L;
            document3.date = tL_message.date;
            document3.mime_type = vh.v2.e("audio/", httpUrlExtension);
            TLRPC.Document document4 = tL_message.media.document;
            document4.size = 0L;
            document4.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio.duration = MessageObject.getInlineResultDuration(this.F);
            TLRPC.BotInlineResult botInlineResult2 = this.F;
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
            if (this.L == 3) {
                tL_documentAttributeAudio.voice = true;
            }
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            StringBuilder sb = new StringBuilder();
            sb.append(Utilities.MD5(this.F.content.url));
            sb.append(".");
            String str8 = this.F.content.url;
            if (this.L != 5) {
                str2 = "ogg";
            } else {
                str2 = "mp3";
            }
            sb.append(ImageLoader.getHttpUrlExtension(str8, str2));
            tL_documentAttributeFilename.file_name = sb.toString();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            File directory = FileLoader.getDirectory(4);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Utilities.MD5(this.F.content.url));
            sb2.append(".");
            String str9 = this.F.content.url;
            if (this.L == 5) {
                str5 = "mp3";
            }
            sb2.append(ImageLoader.getHttpUrlExtension(str9, str5));
            tL_message.attachPath = new File(directory, sb2.toString()).getAbsolutePath();
        }
        this.N = new MessageObject(i11, tL_message, false, true);
    }

    public final void c(boolean z4, boolean z10) {
        lp lpVar = this.U;
        if (lpVar == null) {
            return;
        }
        if (lpVar.getVisibility() != 0) {
            lpVar.setVisibility(0);
        }
        lpVar.a(z4, z10);
        AnimatorSet animatorSet = this.O;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.O = null;
        }
        float f10 = 1.0f;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.O = animatorSet2;
            if (z4) {
                f10 = 0.81f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.f20990e0, f10));
            this.O.setDuration(200L);
            this.O.addListener(new dg.w2(14, this, z4));
            this.O.start();
            return;
        }
        if (z4) {
            f10 = 0.85f;
        }
        this.f20989d0 = f10;
        invalidate();
    }

    public final void d(int i10, TLRPC.Document document, Object obj) {
        this.h = false;
        this.f20993r = false;
        this.I = i10;
        this.F = null;
        this.e = obj;
        this.H = document;
        this.J = null;
        this.M = true;
        this.f20995w = true;
        b();
        this.L = 2;
        requestLayout();
        this.f20986b0 = null;
        this.f20988c0 = false;
        this.f20984a0 = false;
        f(false, false);
    }

    public final void e(TLRPC.BotInlineResult botInlineResult, TLRPC.User user, boolean z4, boolean z10, boolean z11, boolean z12) {
        this.h = z10;
        this.f20993r = z11;
        this.G = user;
        this.F = botInlineResult;
        this.e = botInlineResult;
        if (botInlineResult != null) {
            this.H = botInlineResult.document;
            this.J = botInlineResult.photo;
        } else {
            this.H = null;
            this.J = null;
        }
        this.M = z4;
        this.f20995w = z12;
        b();
        if (z12) {
            this.L = 2;
        }
        requestLayout();
        this.f20986b0 = null;
        this.f20988c0 = false;
        this.f20984a0 = false;
        f(false, false);
    }

    public final void f(boolean z4, boolean z10) {
        boolean isLoadingHttpFile;
        String str = this.f20986b0;
        if (str == null && !this.f20984a0) {
            this.f20984a0 = true;
            Utilities.searchQueue.postRunnable(new b2(this, z4));
            this.S.setIcon(4, z4, false);
        } else if (TextUtils.isEmpty(str)) {
            this.R = -1;
            this.S.setIcon(4, z4, false);
        } else {
            if (this.H != null) {
                isLoadingHttpFile = FileLoader.getInstance(this.d).isLoadingFile(this.f20986b0);
            } else {
                isLoadingHttpFile = ImageLoader.getInstance().isLoadingHttpFile(this.f20986b0);
            }
            if (!isLoadingHttpFile && this.f20988c0) {
                DownloadController.getInstance(this.d).removeLoadingFileObserver(this);
                int i10 = this.L;
                if (i10 != 5 && i10 != 3) {
                    this.R = -1;
                } else {
                    boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.N);
                    if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                        this.R = 1;
                    } else {
                        this.R = 0;
                    }
                    this.S.o(1.0f, z10);
                }
            } else {
                DownloadController.getInstance(this.d).addLoadingFileObserver(this.f20986b0, this);
                int i11 = this.L;
                float f10 = 0.0f;
                if (i11 != 5 && i11 != 3) {
                    this.R = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(this.f20986b0);
                    if (fileProgress != null) {
                        f10 = fileProgress.floatValue();
                    }
                    this.S.o(f10, false);
                } else if (!isLoadingHttpFile) {
                    this.R = 2;
                } else {
                    this.R = 4;
                    Float fileProgress2 = ImageLoader.getInstance().getFileProgress(this.f20986b0);
                    if (fileProgress2 != null) {
                        this.S.o(fileProgress2.floatValue(), z10);
                    } else {
                        this.S.o(0.0f, z10);
                    }
                }
            }
            this.S.setIcon(getIconForCurrentState(), z4, z10);
            invalidate();
        }
    }

    public TLRPC.BotInlineResult getBotInlineResult() {
        return this.F;
    }

    public int getDate() {
        return this.I;
    }

    public TLRPC.Document getDocument() {
        return this.H;
    }

    public TLRPC.User getInlineBot() {
        return this.G;
    }

    public MessageObject getMessageObject() {
        return this.N;
    }

    @Override
    public int getObserverTag() {
        return this.Q;
    }

    public Object getParentObject() {
        return this.e;
    }

    public ImageReceiver getPhotoImage() {
        return this.f20983a;
    }

    public TLRPC.BotInlineResult getResult() {
        return this.F;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f20983a.onAttachedToWindow()) {
            f(false, false);
        }
        this.S.e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20983a.onDetachedFromWindow();
        this.S.f();
        DownloadController.getInstance(this.d).removeLoadingFileObserver(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        TLRPC.BotInlineResult botInlineResult;
        int i11;
        float f10;
        float f11;
        ImageReceiver imageReceiver = this.f20983a;
        lp lpVar = this.U;
        if (lpVar != null && (lpVar.f26837a.f22965q || !imageReceiver.hasBitmapImage() || imageReceiver.getCurrentAlpha() != 1.0f || PhotoViewer.M1((MessageObject) this.e))) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.P);
        }
        float f12 = 8.0f;
        if (this.C != null) {
            canvas.save();
            if (LocaleController.isRTL) {
                f11 = 8.0f;
            } else {
                f11 = AndroidUtilities.leftBaseline;
            }
            canvas.translate(AndroidUtilities.dp(f11), this.B);
            this.C.draw(canvas);
            canvas.restore();
        }
        StaticLayout staticLayout = this.E;
        org.telegram.ui.ActionBar.f6 f6Var = this.f20991f;
        if (staticLayout != null) {
            org.telegram.ui.ActionBar.j6.f19957g3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20298z6, f6Var));
            canvas.save();
            if (LocaleController.isRTL) {
                f10 = 8.0f;
            } else {
                f10 = AndroidUtilities.leftBaseline;
            }
            canvas.translate(AndroidUtilities.dp(f10), this.D);
            this.E.draw(canvas);
            canvas.restore();
        }
        if (this.f20997y != null) {
            org.telegram.ui.ActionBar.j6.f19957g3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, f6Var));
            canvas.save();
            if (!LocaleController.isRTL) {
                f12 = AndroidUtilities.leftBaseline;
            }
            canvas.translate(AndroidUtilities.dp(f12), this.f20996x);
            this.f20997y.draw(canvas);
            canvas.restore();
        }
        boolean z4 = this.M;
        RadialProgress2 radialProgress2 = this.S;
        if (!z4) {
            boolean z10 = this.f20985b;
            n80 n80Var = this.f20987c;
            if (z10 && !PhotoViewer.N1(this.F)) {
                n80Var.setAlpha((int) ((1.0f - imageReceiver.getCurrentAlpha()) * 255.0f));
            } else {
                n80Var.setAlpha(255);
            }
            int i12 = this.L;
            if (i12 != 3 && i12 != 5) {
                TLRPC.BotInlineResult botInlineResult2 = this.F;
                if (botInlineResult2 != null && botInlineResult2.type.equals("file")) {
                    int intrinsicWidth = org.telegram.ui.ActionBar.j6.f20065m4.getIntrinsicWidth();
                    int intrinsicHeight = org.telegram.ui.ActionBar.j6.f20065m4.getIntrinsicHeight();
                    int imageX = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth) / 2));
                    int imageY = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight) / 2));
                    canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), n80.f27215j);
                    org.telegram.ui.ActionBar.j6.f20065m4.setBounds(imageX, imageY, intrinsicWidth + imageX, intrinsicHeight + imageY);
                    org.telegram.ui.ActionBar.j6.f20065m4.draw(canvas);
                } else {
                    TLRPC.BotInlineResult botInlineResult3 = this.F;
                    if (botInlineResult3 != null && (botInlineResult3.type.equals("audio") || this.F.type.equals("voice"))) {
                        int intrinsicWidth2 = org.telegram.ui.ActionBar.j6.f20083n4.getIntrinsicWidth();
                        int intrinsicHeight2 = org.telegram.ui.ActionBar.j6.f20083n4.getIntrinsicHeight();
                        int imageX2 = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth2) / 2));
                        int imageY2 = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight2) / 2));
                        canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), n80.f27215j);
                        org.telegram.ui.ActionBar.j6.f20083n4.setBounds(imageX2, imageY2, intrinsicWidth2 + imageX2, intrinsicHeight2 + imageY2);
                        org.telegram.ui.ActionBar.j6.f20083n4.draw(canvas);
                    } else {
                        TLRPC.BotInlineResult botInlineResult4 = this.F;
                        if (botInlineResult4 != null && (botInlineResult4.type.equals("venue") || this.F.type.equals("geo"))) {
                            int intrinsicWidth3 = org.telegram.ui.ActionBar.j6.f20101o4.getIntrinsicWidth();
                            int intrinsicHeight3 = org.telegram.ui.ActionBar.j6.f20101o4.getIntrinsicHeight();
                            int imageX3 = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth3) / 2));
                            int imageY3 = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight3) / 2));
                            canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), n80.f27215j);
                            org.telegram.ui.ActionBar.j6.f20101o4.setBounds(imageX3, imageY3, intrinsicWidth3 + imageX3, intrinsicHeight3 + imageY3);
                            org.telegram.ui.ActionBar.j6.f20101o4.draw(canvas);
                        } else {
                            n80Var.draw(canvas);
                        }
                    }
                }
            } else {
                if (this.f20992n) {
                    i11 = org.telegram.ui.ActionBar.j6.f20019jd;
                } else {
                    i11 = org.telegram.ui.ActionBar.j6.f20002id;
                }
                radialProgress2.d = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
                radialProgress2.draw(canvas);
            }
        } else {
            TLRPC.BotInlineResult botInlineResult5 = this.F;
            if (botInlineResult5 != null) {
                TLRPC.BotInlineMessage botInlineMessage = botInlineResult5.send_message;
                if ((botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue)) {
                    int intrinsicWidth4 = org.telegram.ui.ActionBar.j6.f20101o4.getIntrinsicWidth();
                    int intrinsicHeight4 = org.telegram.ui.ActionBar.j6.f20101o4.getIntrinsicHeight();
                    int x10 = (int) e2.c.x(imageReceiver.getImageWidth(), intrinsicWidth4, 2.0f, imageReceiver.getImageX());
                    int x11 = (int) e2.c.x(imageReceiver.getImageHeight(), intrinsicHeight4, 2.0f, imageReceiver.getImageY());
                    canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + imageReceiver.getImageWidth(), imageReceiver.getImageY() + imageReceiver.getImageHeight(), n80.f27215j);
                    org.telegram.ui.ActionBar.j6.f20101o4.setBounds(x10, x11, intrinsicWidth4 + x10, intrinsicHeight4 + x11);
                    org.telegram.ui.ActionBar.j6.f20101o4.draw(canvas);
                }
            }
        }
        if (this.f20985b) {
            if (this.F != null) {
                imageReceiver.setVisible(!PhotoViewer.N1(botInlineResult), false);
            }
            canvas.save();
            float f13 = this.f20989d0;
            rc rcVar = this.W;
            if (rcVar != null) {
                f13 *= rcVar.a(0.1f);
            }
            canvas.scale(f13, f13, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            imageReceiver.draw(canvas);
            canvas.restore();
        }
        if (this.M && ((i10 = this.L) == 7 || i10 == 2)) {
            radialProgress2.draw(canvas);
        }
        if (this.h && !this.M) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20025k0);
            } else {
                canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20025k0);
            }
        }
        if (this.f20993r) {
            org.telegram.ui.ActionBar.j6.f20119p4.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(3.0f));
            org.telegram.ui.ActionBar.j6.f20119p4.draw(canvas);
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z4) {
        f(true, z4);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z4;
        boolean z10;
        String string;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        switch (this.L) {
            case 1:
                sb.append(LocaleController.getString(R.string.AttachDocument));
                break;
            case 2:
                sb.append(LocaleController.getString(R.string.AttachGif));
                break;
            case 3:
                sb.append(LocaleController.getString(R.string.AttachAudio));
                break;
            case 4:
                sb.append(LocaleController.getString(R.string.AttachVideo));
                break;
            case 5:
                sb.append(LocaleController.getString(R.string.AttachMusic));
                break;
            case 6:
                sb.append(LocaleController.getString(R.string.AttachSticker));
                break;
            case 7:
                sb.append(LocaleController.getString(R.string.AttachPhoto));
                break;
        }
        StaticLayout staticLayout = this.C;
        if (staticLayout != null && !TextUtils.isEmpty(staticLayout.getText())) {
            z4 = true;
        } else {
            z4 = false;
        }
        StaticLayout staticLayout2 = this.E;
        if (staticLayout2 != null && !TextUtils.isEmpty(staticLayout2.getText())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.L == 5 && z4 && z10) {
            sb.append(", ");
            sb.append(LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, this.E.getText(), this.C.getText()));
        } else {
            if (z4) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(this.C.getText());
            }
            if (z10) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(this.E.getText());
            }
        }
        accessibilityNodeInfo.setText(sb);
        lp lpVar = this.U;
        if (lpVar != null && lpVar.f26837a.f22965q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int i10 = this.L;
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
    public final void onMeasure(int r42, int r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.e2.onMeasure(int, int):void");
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.S.o(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        int i10 = this.L;
        if (i10 != 3 && i10 != 5) {
            if (this.R != 1) {
                f(false, true);
            }
        } else if (this.R != 4) {
            f(false, true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f20988c0 = true;
        this.S.o(1.0f, true);
        f(false, true);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.WebDocument webDocument;
        if (!this.M && this.V != null && this.F != null) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            AndroidUtilities.dp(48.0f);
            int i10 = this.L;
            n80 n80Var = this.f20987c;
            boolean z4 = true;
            if (i10 != 3 && i10 != 5) {
                TLRPC.BotInlineResult botInlineResult = this.F;
                if (botInlineResult != null && (webDocument = botInlineResult.content) != null && !TextUtils.isEmpty(webDocument.url)) {
                    if (motionEvent.getAction() == 0) {
                        if (n80Var.getBounds().contains(x10, y10)) {
                            this.f20992n = true;
                        }
                    } else if (this.f20992n) {
                        if (motionEvent.getAction() == 1) {
                            this.f20992n = false;
                            playSoundEffect(0);
                            ((tf.j0) this.V).f44759a.S.f26247b.k(getResult());
                        } else if (motionEvent.getAction() == 3) {
                            this.f20992n = false;
                        } else if (motionEvent.getAction() == 2 && !n80Var.getBounds().contains(x10, y10)) {
                            this.f20992n = false;
                        }
                    }
                }
                z4 = false;
            } else {
                boolean contains = n80Var.getBounds().contains(x10, y10);
                int action = motionEvent.getAction();
                RadialProgress2 radialProgress2 = this.S;
                if (action == 0) {
                    if (contains) {
                        this.f20992n = true;
                        radialProgress2.n(true, false);
                        invalidate();
                    }
                } else if (this.f20992n) {
                    if (motionEvent.getAction() == 1) {
                        this.f20992n = false;
                        playSoundEffect(0);
                        a();
                        invalidate();
                    } else if (motionEvent.getAction() == 3) {
                        this.f20992n = false;
                        invalidate();
                    } else if (motionEvent.getAction() == 2 && !contains) {
                        this.f20992n = false;
                        invalidate();
                    }
                    radialProgress2.n(this.f20992n, false);
                }
                z4 = false;
            }
            if (!z4) {
                return super.onTouchEvent(motionEvent);
            }
            return z4;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        int i11;
        if (i10 == 16 && ((i11 = this.L) == 3 || i11 == 5)) {
            a();
            return true;
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    public void setCanPreviewGif(boolean z4) {
        this.f20994s = z4;
    }

    public void setDelegate(d2 d2Var) {
        this.V = d2Var;
    }

    public void setIsKeyboard(boolean z4) {
        this.v = z4;
    }

    @Override
    public void setPressed(boolean z4) {
        boolean z10;
        super.setPressed(z4);
        rc rcVar = this.W;
        if (rcVar != null) {
            if (!z4 && !this.T) {
                z10 = false;
            } else {
                z10 = true;
            }
            rcVar.c(z10);
        }
    }

    public void setScaled(boolean z4) {
        boolean z10;
        this.T = z4;
        rc rcVar = this.W;
        if (rcVar != null) {
            if (!isPressed() && !this.T) {
                z10 = false;
            } else {
                z10 = true;
            }
            rcVar.c(z10);
        }
    }

    public e2(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.d = i10;
        this.B = AndroidUtilities.dp(7.0f);
        this.D = AndroidUtilities.dp(27.0f);
        this.f20989d0 = 1.0f;
        this.f20990e0 = new c2(0, this);
        this.f20991f = f6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f20983a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setLayerNum(1);
        imageReceiver.setUseSharedAnimationQueue(true);
        this.f20987c = new n80(0, f6Var);
        this.S = new RadialProgress2(this, null);
        this.Q = DownloadController.getInstance(i10).generateObserverTag();
        setFocusable(true);
        if (z4) {
            Paint paint = new Paint();
            this.P = paint;
            int i11 = org.telegram.ui.ActionBar.j6.Lh;
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            lp lpVar = new lp(context, 21, f6Var);
            this.U = lpVar;
            lpVar.setVisibility(4);
            lpVar.b(-1, i11, org.telegram.ui.ActionBar.j6.f20032k7);
            lpVar.setDrawUnchecked(false);
            lpVar.setDrawBackgroundAsArc(1);
            addView(lpVar, k7.b6.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
        }
        setWillNotDraw(false);
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
