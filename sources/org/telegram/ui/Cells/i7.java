package org.telegram.ui.Cells;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.zs;
import org.telegram.ui.t10;
public final class i7 extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public MessageObject B;
    public boolean C;
    public boolean D;
    public final int E;
    public final SpannableStringBuilder F;
    public CharSequence G;
    public final gj0 H;
    public final org.telegram.ui.ActionBar.f6 I;
    public t00 J;
    public long K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public final ImageView f21215a;
    public final nh.y3 f21216b;
    public final TextView f21217c;
    public final TextView d;
    public final org.telegram.ui.Components.t5 e;
    public final jj0 f21218f;
    public final o80 h;
    public final lp f21219n;
    public final TextView f21220r;
    public final TextView f21221s;
    public boolean v;
    public boolean f21222w;
    public final int f21223x;
    public final int f21224y;

    public i7(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i11;
        float f10;
        float f11;
        int i12;
        float f12;
        float f13;
        int i13;
        float f14;
        float f15;
        int i14;
        float f16;
        int i15;
        float f17;
        float f18;
        int i16;
        float f19;
        float f20;
        int i17;
        int i18;
        float f21;
        float f22;
        int i19;
        float f23;
        float f24;
        int i20;
        int i21;
        float f25;
        float f26;
        int i22;
        float f27;
        float f28;
        int i23;
        float f29;
        float f30;
        int i24;
        float f31;
        float f32;
        int i25;
        float f33;
        float f34;
        int i26;
        float f35;
        float f36;
        int i27;
        float f37;
        float f38;
        int i28;
        float f39;
        float f40;
        int i29;
        float f41;
        float f42;
        int i30;
        float f43;
        float f44;
        this.v = true;
        int i31 = UserConfig.selectedAccount;
        this.f21223x = i31;
        this.O = 1.0f;
        this.I = f6Var;
        this.E = i10;
        this.f21224y = DownloadController.getInstance(i31).generateObserverTag();
        ImageView imageView = new ImageView(context);
        this.f21215a = imageView;
        if (i10 == 1) {
            boolean z4 = LocaleController.isRTL;
            if (z4) {
                i30 = 5;
            } else {
                i30 = 3;
            }
            int i32 = i30 | 48;
            if (z4) {
                f43 = 0.0f;
            } else {
                f43 = 15.0f;
            }
            if (z4) {
                f44 = 15.0f;
            } else {
                f44 = 0.0f;
            }
            addView(imageView, k7.b6.d(42, 42.0f, i32, f43, 12.0f, f44, 0.0f));
        } else {
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            int i33 = i11 | 48;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 12.0f;
            }
            if (z10) {
                f11 = 12.0f;
            } else {
                f11 = 0.0f;
            }
            addView(imageView, k7.b6.d(40, 40.0f, i33, f10, 8.0f, f11, 0.0f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.j6.Bi, f6Var, textView, 1, 14.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setImportantForAccessibility(2);
        if (i10 == 1) {
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i29 = 5;
            } else {
                i29 = 3;
            }
            int i34 = i29 | 48;
            if (z11) {
                f41 = 0.0f;
            } else {
                f41 = 20.0f;
            }
            if (z11) {
                f42 = 20.0f;
            } else {
                f42 = 0.0f;
            }
            addView(textView, k7.b6.d(32, -2.0f, i34, f41, 28.0f, f42, 0.0f));
        } else {
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i35 = i12 | 48;
            if (z12) {
                f12 = 0.0f;
            } else {
                f12 = 16.0f;
            }
            if (z12) {
                f13 = 16.0f;
            } else {
                f13 = 0.0f;
            }
            addView(textView, k7.b6.d(32, -2.0f, i35, f12, 22.0f, f13, 0.0f));
        }
        nh.y3 y3Var = new nh.y3(this, context, 1);
        this.f21216b = y3Var;
        y3Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        if (i10 == 1) {
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i28 = 5;
            } else {
                i28 = 3;
            }
            int i36 = i28 | 48;
            if (z13) {
                f39 = 0.0f;
            } else {
                f39 = 16.0f;
            }
            if (z13) {
                f40 = 16.0f;
            } else {
                f40 = 0.0f;
            }
            addView(y3Var, k7.b6.d(42, 42.0f, i36, f39, 12.0f, f40, 0.0f));
        } else {
            boolean z14 = LocaleController.isRTL;
            if (z14) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            int i37 = i13 | 48;
            if (z14) {
                f14 = 0.0f;
            } else {
                f14 = 12.0f;
            }
            if (z14) {
                f15 = 12.0f;
            } else {
                f15 = 0.0f;
            }
            addView(y3Var, k7.b6.d(40, 40.0f, i37, f14, 8.0f, f15, 0.0f));
        }
        TextView textView2 = new TextView(context);
        this.f21217c = textView2;
        int i38 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.b.w(i38, f6Var, textView2, 1, 16.0f);
        textView2.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        textView2.setGravity(i14 | 16);
        if (i10 == 1) {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            boolean z15 = LocaleController.isRTL;
            if (z15) {
                i27 = 5;
            } else {
                i27 = 3;
            }
            int i39 = i27 | 48;
            if (z15) {
                f37 = 8.0f;
            } else {
                f37 = 72.0f;
            }
            if (z15) {
                f38 = 72.0f;
            } else {
                f38 = 8.0f;
            }
            addView(textView2, k7.b6.d(-1, -2.0f, i39, f37, 9.0f, f38, 0.0f));
            f16 = 14.0f;
        } else if (i10 == 2) {
            LinearLayout f45 = org.telegram.messenger.y3.f(context, 0);
            boolean z16 = LocaleController.isRTL;
            if (z16) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i40 = i16 | 48;
            if (z16) {
                f19 = 16.0f;
            } else {
                f19 = 72.0f;
            }
            if (z16) {
                f20 = 72.0f;
            } else {
                f20 = 16.0f;
            }
            addView(f45, k7.b6.d(-1, -2.0f, i40, f19, 5.0f, f20, 0.0f));
            TextView textView3 = new TextView(context);
            this.f21220r = textView3;
            org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.A6, f6Var, textView3, 1, 14.0f);
            f16 = 14.0f;
            if (!LocaleController.isRTL) {
                f45.addView(textView2, k7.b6.l(1.0f, -2, -2));
                f45.addView(textView3, k7.b6.m(0.0f, -2, -2, 4, 0, 0));
            } else {
                f45.addView(textView3, k7.b6.l(0.0f, -2, -2));
                f45.addView(textView2, k7.b6.m(1.0f, -2, -2, 0, 4, 0));
            }
            textView2.setMaxLines(2);
            TextView textView4 = new TextView(context);
            this.f21221s = textView4;
            textView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(i38, f6Var));
            textView4.setLines(1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setEllipsize(truncateAt);
            if (LocaleController.isRTL) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            textView4.setGravity(i17 | 16);
            textView4.setTextSize(1, 13.0f);
            boolean z17 = LocaleController.isRTL;
            if (z17) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            int i41 = i18 | 48;
            if (z17) {
                f21 = 8.0f;
            } else {
                f21 = 72.0f;
            }
            if (z17) {
                f22 = 72.0f;
            } else {
                f22 = 8.0f;
            }
            addView(textView4, k7.b6.d(-1, -2.0f, i41, f21, 30.0f, f22, 0.0f));
            textView4.setVisibility(8);
        } else {
            f16 = 14.0f;
            textView2.setMaxLines(1);
            boolean z18 = LocaleController.isRTL;
            if (z18) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i42 = i15 | 48;
            if (z18) {
                f17 = 8.0f;
            } else {
                f17 = 72.0f;
            }
            if (z18) {
                f18 = 72.0f;
            } else {
                f18 = 8.0f;
            }
            addView(textView2, k7.b6.d(-1, -2.0f, i42, f17, 5.0f, f18, 0.0f));
        }
        gj0 gj0Var = new gj0(R.raw.download_arrow, "download_arrow", AndroidUtilities.dp(f16), AndroidUtilities.dp(f16), true, null);
        this.H = gj0Var;
        ?? imageView2 = new ImageView(context);
        this.f21218f = imageView2;
        imageView2.setAnimation(gj0Var);
        imageView2.setVisibility(4);
        int i43 = org.telegram.ui.ActionBar.j6.Ih;
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i43, f6Var), PorterDuff.Mode.SRC_IN));
        if (i10 == 1) {
            boolean z19 = LocaleController.isRTL;
            if (z19) {
                i26 = 5;
            } else {
                i26 = 3;
            }
            int i44 = i26 | 48;
            if (z19) {
                f35 = 8.0f;
            } else {
                f35 = 70.0f;
            }
            if (z19) {
                f36 = 72.0f;
            } else {
                f36 = 8.0f;
            }
            addView((View) imageView2, k7.b6.d(14, 14.0f, i44, f35, 37.0f, f36, 0.0f));
        } else {
            boolean z20 = LocaleController.isRTL;
            if (z20) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            int i45 = i19 | 48;
            if (z20) {
                f23 = 8.0f;
            } else {
                f23 = 70.0f;
            }
            if (z20) {
                f24 = 72.0f;
            } else {
                f24 = 8.0f;
            }
            addView((View) imageView2, k7.b6.d(14, 14.0f, i45, f23, 33.0f, f24, 0.0f));
        }
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(context);
        this.e = t5Var;
        t5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, f6Var));
        t5Var.setLines(1);
        t5Var.setMaxLines(1);
        t5Var.setSingleLine(true);
        t5Var.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i20 = 5;
        } else {
            i20 = 3;
        }
        t5Var.setGravity(i20 | 16);
        NotificationCenter.listenEmojiLoading(t5Var);
        if (i10 == 1) {
            t5Var.setTextSize(1, 13.0f);
            boolean z21 = LocaleController.isRTL;
            if (z21) {
                i25 = 5;
            } else {
                i25 = 3;
            }
            int i46 = i25 | 48;
            if (z21) {
                f33 = 8.0f;
            } else {
                f33 = 72.0f;
            }
            if (z21) {
                f34 = 72.0f;
            } else {
                f34 = 8.0f;
            }
            addView(t5Var, k7.b6.d(-1, -2.0f, i46, f33, 34.0f, f34, 0.0f));
        } else {
            t5Var.setTextSize(1, 13.0f);
            boolean z22 = LocaleController.isRTL;
            if (z22) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            int i47 = i21 | 48;
            if (z22) {
                f25 = 8.0f;
            } else {
                f25 = 72.0f;
            }
            if (z22) {
                f26 = 72.0f;
            } else {
                f26 = 8.0f;
            }
            addView(t5Var, k7.b6.d(-1, -2.0f, i47, f25, 30.0f, f26, 0.0f));
        }
        o80 o80Var = new o80(context);
        this.h = o80Var;
        o80Var.setProgressColor(org.telegram.ui.ActionBar.j6.v0(i43, f6Var));
        boolean z23 = LocaleController.isRTL;
        if (z23) {
            i22 = 5;
        } else {
            i22 = 3;
        }
        int i48 = i22 | 48;
        if (z23) {
            f27 = 0.0f;
        } else {
            f27 = 72.0f;
        }
        if (z23) {
            f28 = 72.0f;
        } else {
            f28 = 0.0f;
        }
        addView(o80Var, k7.b6.d(-1, 2.0f, i48, f27, 54.0f, f28, 0.0f));
        lp lpVar = new lp(context, 21, f6Var);
        this.f21219n = lpVar;
        lpVar.setVisibility(4);
        lpVar.b(-1, org.telegram.ui.ActionBar.j6.f19906d6, org.telegram.ui.ActionBar.j6.f20032k7);
        lpVar.setDrawUnchecked(false);
        lpVar.setDrawBackgroundAsArc(2);
        if (i10 == 1) {
            boolean z24 = LocaleController.isRTL;
            if (z24) {
                i24 = 5;
            } else {
                i24 = 3;
            }
            int i49 = i24 | 48;
            if (z24) {
                f31 = 0.0f;
            } else {
                f31 = 38.0f;
            }
            if (z24) {
                f32 = 38.0f;
            } else {
                f32 = 0.0f;
            }
            addView(lpVar, k7.b6.d(24, 24.0f, i49, f31, 36.0f, f32, 0.0f));
        } else {
            boolean z25 = LocaleController.isRTL;
            if (z25) {
                i23 = 5;
            } else {
                i23 = 3;
            }
            int i50 = i23 | 48;
            if (z25) {
                f29 = 0.0f;
            } else {
                f29 = 33.0f;
            }
            if (z25) {
                f30 = 33.0f;
            } else {
                f30 = 0.0f;
            }
            addView(lpVar, k7.b6.d(24, 24.0f, i50, f29, 28.0f, f30, 0.0f));
        }
        if (i10 == 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.F = spannableStringBuilder;
            spannableStringBuilder.setSpan(new zs(), 0, 1, 0);
        }
    }

    public final void a(Canvas canvas) {
        if (this.f21222w) {
            canvas.drawLine(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.j6.T0("paintDivider", this.I));
        }
    }

    public final void b(boolean z4, boolean z10) {
        lp lpVar = this.f21219n;
        if (lpVar.getVisibility() != 0) {
            lpVar.setVisibility(0);
        }
        lpVar.a(z4, z10);
    }

    public final void c(MessageObject messageObject, boolean z4) {
        boolean z10;
        String str;
        String str2;
        String str3;
        String lowerCase;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        boolean z11;
        boolean z12;
        String str4;
        String str5;
        String str6;
        MessageObject messageObject2 = this.B;
        if (messageObject2 != null && messageObject != null && messageObject2.getId() != messageObject.getId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f21222w = z4;
        this.B = messageObject;
        this.D = false;
        this.C = false;
        if (!z10) {
            this.K = 0L;
        }
        TLRPC.Document document = messageObject.getDocument();
        TextView textView = this.f21221s;
        TextView textView2 = this.f21217c;
        ImageView imageView = this.f21215a;
        TextView textView3 = this.d;
        nh.y3 y3Var = this.f21216b;
        if (document != null) {
            if (messageObject.isMusic()) {
                str = null;
                for (int i11 = 0; i11 < document.attributes.size(); i11++) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && (((str5 = documentAttribute.performer) != null && str5.length() != 0) || ((str6 = documentAttribute.title) != null && str6.length() != 0))) {
                        str = messageObject.getMusicAuthor() + " - " + messageObject.getMusicTitle();
                    }
                }
            } else {
                str = null;
            }
            if (!messageObject.isVideo() && !(messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaPhoto) && !MessageObject.isGifDocument(document)) {
                str2 = FileLoader.getDocumentFileName(document);
            } else {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2) && (str4 = document.mime_type) != null) {
                if (str4.startsWith("video")) {
                    if (MessageObject.isGifDocument(document)) {
                        str2 = LocaleController.getString(R.string.AttachGif);
                    } else {
                        str2 = LocaleController.getString(R.string.AttachVideo);
                    }
                } else if (document.mime_type.startsWith("image")) {
                    if (MessageObject.isGifDocument(document)) {
                        str2 = LocaleController.getString(R.string.AttachGif);
                    } else {
                        str2 = LocaleController.getString(R.string.AttachPhoto);
                    }
                } else if (document.mime_type.startsWith("audio")) {
                    str2 = LocaleController.getString(R.string.AttachAudio);
                } else {
                    str2 = LocaleController.getString(R.string.AttachDocument);
                }
            }
            if (str == null) {
                str3 = str2;
            } else {
                str3 = str;
            }
            ArrayList<String> arrayList = messageObject.highlightedWords;
            org.telegram.ui.ActionBar.f6 f6Var2 = this.I;
            CharSequence highlightText = AndroidUtilities.highlightText(str3, arrayList, f6Var2);
            if (highlightText != null) {
                textView2.setText(highlightText);
            } else {
                textView2.setText(str3);
            }
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            imageView.setImageResource(AndroidUtilities.getThumbForNameOrMime(str2, document.mime_type, false));
            int lastIndexOf = str2.lastIndexOf(46);
            if (lastIndexOf == -1) {
                lowerCase = "";
            } else {
                lowerCase = str2.substring(lastIndexOf + 1).toLowerCase();
            }
            textView3.setText(lowerCase);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40);
            if (closestPhotoSizeWithSize2 == closestPhotoSizeWithSize) {
                closestPhotoSizeWithSize = null;
            }
            if ((closestPhotoSizeWithSize2 instanceof TLRPC.TL_photoSizeEmpty) || closestPhotoSizeWithSize2 == null) {
                f6Var = f6Var2;
                y3Var.setVisibility(4);
                y3Var.setImageBitmap(null);
                textView3.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
            } else {
                ImageReceiver imageReceiver = y3Var.getImageReceiver();
                if (closestPhotoSizeWithSize == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                imageReceiver.setNeedsQualityThumb(z11);
                ImageReceiver imageReceiver2 = y3Var.getImageReceiver();
                if (closestPhotoSizeWithSize == null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                imageReceiver2.setShouldGenerateQualityThumb(z12);
                y3Var.setVisibility(0);
                if (messageObject.strippedThumb != null) {
                    f6Var = f6Var2;
                    y3Var.m(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "40_40", null, null, messageObject.strippedThumb, null, 1, messageObject);
                } else {
                    f6Var = f6Var2;
                    y3Var.k(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "40_40", ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "40_40_b", 0L, null, messageObject, 1);
                }
            }
            e();
            if (messageObject.hasHighlightedWords() && !TextUtils.isEmpty(this.B.messageOwner.message)) {
                CharSequence highlightText2 = AndroidUtilities.highlightText(this.B.messageOwner.message.replace("\n", " ").replaceAll(" +", " ").trim(), this.B.highlightedWords, f6Var);
                this.G = highlightText2;
                if (textView != null) {
                    if (highlightText2 == null) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    textView.setVisibility(i10);
                }
            } else if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            textView2.setText("");
            textView3.setText("");
            this.e.setText("");
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            textView3.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            y3Var.setVisibility(4);
            y3Var.setImageBitmap(null);
            this.G = null;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        setWillNotDraw(!this.f21222w);
        this.h.a(0.0f, false);
        f(z10);
    }

    public final void d(boolean z4, String str, int i10, String str2, String str3, String str4) {
        int i11;
        int i12;
        this.f21217c.setText(str);
        this.e.setText(str2);
        TextView textView = this.d;
        if (str3 != null) {
            textView.setVisibility(0);
            textView.setText(str3.toLowerCase());
        } else {
            textView.setVisibility(4);
        }
        this.f21222w = z4;
        ImageView imageView = this.f21215a;
        if (i10 == 0) {
            imageView.setImageResource(AndroidUtilities.getThumbForNameOrMime(str, str3, false));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        int i13 = this.E;
        nh.y3 y3Var = this.f21216b;
        if (str4 == null && i10 == 0) {
            textView.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            if (i13 != 3) {
                y3Var.setImageBitmap(null);
                y3Var.setVisibility(4);
            }
        } else {
            if (str4 != null) {
                if (i13 != 3) {
                    y3Var.f(str4, "42_42", null);
                }
            } else {
                nq L = org.telegram.ui.ActionBar.j6.L(AndroidUtilities.dp(42.0f), i10);
                if (i10 == R.drawable.files_storage) {
                    i11 = org.telegram.ui.ActionBar.j6.f20089na;
                    i12 = org.telegram.ui.ActionBar.j6.f20000ia;
                } else if (i10 == R.drawable.files_gallery) {
                    i11 = org.telegram.ui.ActionBar.j6.f20053la;
                    i12 = org.telegram.ui.ActionBar.j6.f20000ia;
                } else if (i10 == R.drawable.files_music) {
                    i11 = org.telegram.ui.ActionBar.j6.f20035ka;
                    i12 = org.telegram.ui.ActionBar.j6.f20000ia;
                } else if (i10 == R.drawable.files_internal) {
                    i11 = org.telegram.ui.ActionBar.j6.f20017ja;
                    i12 = org.telegram.ui.ActionBar.j6.f20000ia;
                } else {
                    i11 = org.telegram.ui.ActionBar.j6.Ai;
                    i12 = org.telegram.ui.ActionBar.j6.zi;
                }
                org.telegram.ui.ActionBar.f6 f6Var = this.I;
                org.telegram.ui.ActionBar.j6.v1(L, org.telegram.ui.ActionBar.j6.v0(i11, f6Var), false);
                org.telegram.ui.ActionBar.j6.v1(L, org.telegram.ui.ActionBar.j6.v0(i12, f6Var), true);
                y3Var.setImageDrawable(L);
            }
            y3Var.setVisibility(0);
        }
        setWillNotDraw(!this.f21222w);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.O != 1.0f && this.J != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.O) * 255.0f), 31);
            this.J.setViewType(3);
            this.J.e();
            this.J.h();
            this.J.draw(canvas);
            canvas.restore();
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.O * 255.0f), 31);
            super.dispatchDraw(canvas);
            a(canvas);
            canvas.restore();
        } else {
            super.dispatchDraw(canvas);
            a(canvas);
        }
        boolean z4 = this.L;
        if (!z4 && this.M == 0.0f) {
            return;
        }
        if (z4) {
            float f10 = this.M;
            if (f10 != 1.0f) {
                this.M = f10 + 0.10666667f;
                invalidate();
                this.M = Utilities.clamp(this.M, 1.0f, 0.0f);
                int measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.j6.Z0.getIntrinsicWidth();
                int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight()) >> 1;
                canvas.save();
                float f11 = this.M;
                canvas.scale(f11, f11, (org.telegram.ui.ActionBar.j6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                Drawable drawable = org.telegram.ui.ActionBar.j6.Z0;
                drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight() + measuredHeight);
                org.telegram.ui.ActionBar.j6.Z0.draw(canvas);
                canvas.restore();
            }
        }
        if (!z4) {
            float f12 = this.M;
            if (f12 != 0.0f) {
                this.M = f12 - 0.10666667f;
                invalidate();
            }
        }
        this.M = Utilities.clamp(this.M, 1.0f, 0.0f);
        int measuredWidth2 = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.j6.Z0.getIntrinsicWidth();
        int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f112 = this.M;
        canvas.scale(f112, f112, (org.telegram.ui.ActionBar.j6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
        Drawable drawable2 = org.telegram.ui.ActionBar.j6.Z0;
        drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight() + measuredHeight2);
        org.telegram.ui.ActionBar.j6.Z0.draw(canvas);
        canvas.restore();
    }

    public final void e() {
        String z4;
        MessageObject messageObject = this.B;
        if (messageObject != null && messageObject.getDocument() != null) {
            MessageObject messageObject2 = this.B;
            long j10 = messageObject2.messageOwner.date * 1000;
            long j11 = this.K;
            if (j11 == 0) {
                z4 = AndroidUtilities.formatFileSize(messageObject2.getDocument().size);
            } else {
                Locale locale = Locale.ENGLISH;
                z4 = android.support.v4.media.a.z(AndroidUtilities.formatFileSize(j11), " / ", AndroidUtilities.formatFileSize(this.B.getDocument().size));
            }
            int i10 = this.E;
            org.telegram.ui.Components.t5 t5Var = this.e;
            if (i10 == 2) {
                t5Var.setText(new SpannableStringBuilder().append((CharSequence) z4).append(' ').append((CharSequence) this.F).append(' ').append(t10.d(this.B, true, 2, t5Var.getPaint())));
                this.f21220r.setText(LocaleController.stringForMessageListDate(this.B.messageOwner.date));
                return;
            }
            String formatString = LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(new Date(j10)), LocaleController.getInstance().getFormatterDay().format(new Date(j10)));
            t5Var.setText(z4 + ", " + formatString);
        }
    }

    public final void f(boolean z4) {
        float f10;
        float f11;
        int i10;
        float f12;
        if (z4) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) nr.f27346f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        MessageObject messageObject = this.B;
        float f13 = 72.0f;
        int i11 = this.f21223x;
        jj0 jj0Var = this.f21218f;
        o80 o80Var = this.h;
        float f14 = 8.0f;
        org.telegram.ui.Components.t5 t5Var = this.e;
        if (messageObject != null && messageObject.messageOwner.media != null) {
            this.D = false;
            if (!messageObject.attachPathExists && !messageObject.mediaExists && this.v) {
                String attachFileName = FileLoader.getAttachFileName(messageObject.getDocument());
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName, this.B, this);
                this.C = FileLoader.getInstance(i11).isLoadingFile(attachFileName);
                jj0Var.setVisibility(0);
                int i12 = 15;
                if (this.C) {
                    i10 = 15;
                } else {
                    i10 = 0;
                }
                gj0 gj0Var = this.H;
                gj0Var.N(i10);
                gj0Var.h = true;
                if (z4) {
                    jj0Var.d();
                } else {
                    if (!this.C) {
                        i12 = 0;
                    }
                    gj0Var.K(i12);
                    jj0Var.invalidate();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) t5Var.getLayoutParams();
                if (layoutParams != null) {
                    if (LocaleController.isRTL) {
                        f12 = 8.0f;
                    } else {
                        f12 = 86.0f;
                    }
                    layoutParams.leftMargin = AndroidUtilities.dp(f12);
                    if (LocaleController.isRTL) {
                        f14 = 86.0f;
                    }
                    layoutParams.rightMargin = AndroidUtilities.dp(f14);
                    t5Var.requestLayout();
                }
                if (this.C) {
                    o80Var.setVisibility(0);
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                    if (fileProgress == null) {
                        fileProgress = Float.valueOf(0.0f);
                    }
                    o80Var.a(fileProgress.floatValue(), false);
                    return;
                }
                o80Var.setVisibility(4);
                return;
            }
            jj0Var.setVisibility(4);
            o80Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) t5Var.getLayoutParams();
            if (layoutParams2 != null) {
                if (LocaleController.isRTL) {
                    f11 = 8.0f;
                } else {
                    f11 = 72.0f;
                }
                layoutParams2.leftMargin = AndroidUtilities.dp(f11);
                if (!LocaleController.isRTL) {
                    f13 = 8.0f;
                }
                layoutParams2.rightMargin = AndroidUtilities.dp(f13);
                t5Var.requestLayout();
            }
            this.C = false;
            this.D = true;
            DownloadController.getInstance(i11).removeLoadingFileObserver(this);
            return;
        }
        this.C = false;
        this.D = true;
        o80Var.setVisibility(4);
        o80Var.a(0.0f, false);
        jj0Var.setVisibility(4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) t5Var.getLayoutParams();
        if (layoutParams3 != null) {
            if (LocaleController.isRTL) {
                f10 = 8.0f;
            } else {
                f10 = 72.0f;
            }
            layoutParams3.leftMargin = AndroidUtilities.dp(f10);
            if (!LocaleController.isRTL) {
                f13 = 8.0f;
            }
            layoutParams3.rightMargin = AndroidUtilities.dp(f13);
            t5Var.requestLayout();
        }
        DownloadController.getInstance(i11).removeLoadingFileObserver(this);
    }

    public org.telegram.ui.Components.p9 getImageView() {
        return this.f21216b;
    }

    public MessageObject getMessage() {
        return this.B;
    }

    @Override
    public int getObserverTag() {
        return this.f21224y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h.getVisibility() == 0) {
            f(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DownloadController.getInstance(this.f21223x).removeLoadingFileObserver(this);
    }

    @Override
    public final void onFailedDownload(String str, boolean z4) {
        f(true);
        this.K = 0L;
        e();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        lp lpVar = this.f21219n;
        if (lpVar.f26837a.f22965q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(lpVar.f26837a.f22965q);
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.E != 1) {
            TextView textView = this.f21217c;
            int lineCount = textView.getLineCount();
            TextView textView2 = this.f21221s;
            if (lineCount > 1 || (textView2 != null && textView2.getVisibility() == 0)) {
                int measuredHeight = textView.getMeasuredHeight() - AndroidUtilities.dp(22.0f);
                if (textView2 != null && textView2.getVisibility() == 0) {
                    textView2.layout(textView2.getLeft(), textView2.getTop() + measuredHeight, textView2.getRight(), textView2.getBottom() + measuredHeight);
                    measuredHeight = org.telegram.messenger.y3.C(3.0f, textView2.getMeasuredHeight(), measuredHeight);
                }
                org.telegram.ui.Components.t5 t5Var = this.e;
                t5Var.layout(t5Var.getLeft(), t5Var.getTop() + measuredHeight, t5Var.getRight(), t5Var.getBottom() + measuredHeight);
                jj0 jj0Var = this.f21218f;
                jj0Var.layout(jj0Var.getLeft(), jj0Var.getTop() + measuredHeight, jj0Var.getRight(), jj0Var.getBottom() + measuredHeight);
                o80 o80Var = this.h;
                o80Var.layout(o80Var.getLeft(), (getMeasuredHeight() - o80Var.getMeasuredHeight()) - (this.f21222w ? 1 : 0), o80Var.getRight(), getMeasuredHeight() - (this.f21222w ? 1 : 0));
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextView textView;
        int i12 = this.E;
        if (i12 == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f21222w ? 1 : 0), 1073741824));
        } else if (i12 == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
            int measuredHeight = this.f21217c.getMeasuredHeight() + AndroidUtilities.dp(34.0f) + (this.f21222w ? 1 : 0);
            if (this.G != null && (textView = this.f21221s) != null && this.B.hasHighlightedWords()) {
                this.N = true;
                textView.setText(AndroidUtilities.ellipsizeCenterEnd(this.G, this.B.highlightedWords.get(0), textView.getMeasuredWidth(), textView.getPaint(), 130));
                this.N = false;
                measuredHeight = org.telegram.messenger.y3.C(3.0f, textView.getMeasuredHeight(), measuredHeight);
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        o80 o80Var = this.h;
        if (o80Var.getVisibility() != 0) {
            f(true);
        }
        this.K = j10;
        e();
        o80Var.a(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.h.a(1.0f, true);
        f(true);
        this.K = 0L;
        e();
    }

    @Override
    public final void requestLayout() {
        if (this.N) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawDownloadIcon(boolean z4) {
        this.v = z4;
    }

    public void setEnterAnimationAlpha(float f10) {
        if (this.O != f10) {
            this.O = f10;
            invalidate();
        }
    }

    public void setGlobalGradientView(t00 t00Var) {
        this.J = t00Var;
    }

    public void setPhoto(String str) {
        boolean endsWith = str.endsWith("mp4");
        nh.y3 y3Var = this.f21216b;
        if (endsWith) {
            y3Var.f("vthumb://0:".concat(str), null, null);
            y3Var.setVisibility(0);
        } else if (!str.endsWith(".jpg") && !str.endsWith(".jpeg") && !str.endsWith(".png") && !str.endsWith(".gif")) {
            y3Var.setVisibility(8);
        } else {
            y3Var.f("thumb://0:".concat(str), null, null);
            y3Var.setVisibility(0);
        }
    }

    public void setPhotoEntry(MediaController.PhotoEntry photoEntry) {
        String str;
        String str2 = photoEntry.thumbPath;
        nh.y3 y3Var = this.f21216b;
        if (str2 != null) {
            y3Var.f(str2, null, org.telegram.ui.ActionBar.j6.R4);
            str = photoEntry.thumbPath;
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                y3Var.q(0, true);
                y3Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.j6.R4);
            } else {
                y3Var.p(photoEntry.orientation, photoEntry.invert, true);
                y3Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.j6.R4);
            }
            str = photoEntry.path;
        } else {
            y3Var.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
            str = "";
        }
        File file = new File(str);
        this.f21217c.setText(file.getName());
        FileLoader.getFileExtension(file);
        this.d.setVisibility(8);
        StringBuilder sb = new StringBuilder();
        if (photoEntry.width != 0 && photoEntry.height != 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            Locale locale = Locale.US;
            int i10 = photoEntry.width;
            int i11 = photoEntry.height;
            sb.append(i10 + "x" + i11);
        }
        if (photoEntry.isVideo) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(AndroidUtilities.formatShortDuration(photoEntry.duration));
        }
        if (photoEntry.size != 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(AndroidUtilities.formatFileSize(photoEntry.size));
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append(LocaleController.getInstance().getFormatterStats().format(photoEntry.dateTaken));
        this.e.setText(sb);
        this.f21215a.setVisibility(8);
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
