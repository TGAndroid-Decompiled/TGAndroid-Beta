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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.qs;
import org.telegram.ui.Components.v70;
import org.telegram.ui.f10;
public final class i7 extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public MessageObject A;
    public boolean B;
    public boolean C;
    public final int D;
    public final SpannableStringBuilder E;
    public CharSequence F;
    public final mi0 G;
    public final org.telegram.ui.ActionBar.b6 H;
    public e00 I;
    public long J;
    public boolean K;
    public float L;
    public boolean M;
    public float N;
    public final ImageView f24513a;
    public final ih.d4 f24514b;
    public final TextView f24515c;
    public final TextView d;
    public final org.telegram.ui.Components.s5 f24516e;
    public final pi0 f24517f;
    public final v70 h;
    public final dp f24518n;
    public final TextView f24519r;
    public final TextView f24520s;
    public boolean v;
    public boolean f24521w;
    public final int f24522x;
    public final int f24523y;

    public i7(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int i10;
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        int i12;
        float f14;
        float f15;
        int i13;
        float f16;
        int i14;
        float f17;
        float f18;
        int i15;
        float f19;
        float f20;
        int i16;
        int i17;
        float f21;
        float f22;
        int i18;
        float f23;
        float f24;
        int i19;
        int i20;
        float f25;
        float f26;
        int i21;
        float f27;
        float f28;
        int i22;
        float f29;
        float f30;
        int i23;
        float f31;
        float f32;
        int i24;
        float f33;
        float f34;
        int i25;
        float f35;
        float f36;
        int i26;
        float f37;
        float f38;
        int i27;
        float f39;
        float f40;
        int i28;
        float f41;
        float f42;
        int i29;
        float f43;
        float f44;
        this.v = true;
        int i30 = UserConfig.selectedAccount;
        this.f24522x = i30;
        this.N = 1.0f;
        this.H = b6Var;
        this.D = i9;
        this.f24523y = DownloadController.getInstance(i30).generateObserverTag();
        ImageView imageView = new ImageView(context);
        this.f24513a = imageView;
        if (i9 == 1) {
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i29 = 5;
            } else {
                i29 = 3;
            }
            int i31 = i29 | 48;
            if (z10) {
                f43 = 0.0f;
            } else {
                f43 = 15.0f;
            }
            if (z10) {
                f44 = 15.0f;
            } else {
                f44 = 0.0f;
            }
            addView(imageView, g7.e6.d(42, 42.0f, i31, f43, 12.0f, f44, 0.0f));
        } else {
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            int i32 = i10 | 48;
            if (z11) {
                f10 = 0.0f;
            } else {
                f10 = 12.0f;
            }
            if (z11) {
                f11 = 12.0f;
            } else {
                f11 = 0.0f;
            }
            addView(imageView, g7.e6.d(40, 40.0f, i32, f10, 8.0f, f11, 0.0f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        j2.o(org.telegram.ui.ActionBar.f6.Bi, b6Var, textView, 1, 14.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setImportantForAccessibility(2);
        if (i9 == 1) {
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i28 = 5;
            } else {
                i28 = 3;
            }
            int i33 = i28 | 48;
            if (z12) {
                f41 = 0.0f;
            } else {
                f41 = 20.0f;
            }
            if (z12) {
                f42 = 20.0f;
            } else {
                f42 = 0.0f;
            }
            addView(textView, g7.e6.d(32, -2.0f, i33, f41, 28.0f, f42, 0.0f));
        } else {
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            int i34 = i11 | 48;
            if (z13) {
                f12 = 0.0f;
            } else {
                f12 = 16.0f;
            }
            if (z13) {
                f13 = 16.0f;
            } else {
                f13 = 0.0f;
            }
            addView(textView, g7.e6.d(32, -2.0f, i34, f12, 22.0f, f13, 0.0f));
        }
        ih.d4 d4Var = new ih.d4(this, context, 1);
        this.f24514b = d4Var;
        d4Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        if (i9 == 1) {
            boolean z14 = LocaleController.isRTL;
            if (z14) {
                i27 = 5;
            } else {
                i27 = 3;
            }
            int i35 = i27 | 48;
            if (z14) {
                f39 = 0.0f;
            } else {
                f39 = 16.0f;
            }
            if (z14) {
                f40 = 16.0f;
            } else {
                f40 = 0.0f;
            }
            addView(d4Var, g7.e6.d(42, 42.0f, i35, f39, 12.0f, f40, 0.0f));
        } else {
            boolean z15 = LocaleController.isRTL;
            if (z15) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i36 = i12 | 48;
            if (z15) {
                f14 = 0.0f;
            } else {
                f14 = 12.0f;
            }
            if (z15) {
                f15 = 12.0f;
            } else {
                f15 = 0.0f;
            }
            addView(d4Var, g7.e6.d(40, 40.0f, i36, f14, 8.0f, f15, 0.0f));
        }
        TextView textView2 = new TextView(context);
        this.f24515c = textView2;
        int i37 = org.telegram.ui.ActionBar.f6.G6;
        j2.o(i37, b6Var, textView2, 1, 16.0f);
        textView2.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView2.setGravity(i13 | 16);
        if (i9 == 1) {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            boolean z16 = LocaleController.isRTL;
            if (z16) {
                i26 = 5;
            } else {
                i26 = 3;
            }
            int i38 = i26 | 48;
            if (z16) {
                f37 = 8.0f;
            } else {
                f37 = 72.0f;
            }
            if (z16) {
                f38 = 72.0f;
            } else {
                f38 = 8.0f;
            }
            addView(textView2, g7.e6.d(-1, -2.0f, i38, f37, 9.0f, f38, 0.0f));
            f16 = 14.0f;
        } else if (i9 == 2) {
            LinearLayout f45 = ll.f(context, 0);
            boolean z17 = LocaleController.isRTL;
            if (z17) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i39 = i15 | 48;
            if (z17) {
                f19 = 16.0f;
            } else {
                f19 = 72.0f;
            }
            if (z17) {
                f20 = 72.0f;
            } else {
                f20 = 16.0f;
            }
            addView(f45, g7.e6.d(-1, -2.0f, i39, f19, 5.0f, f20, 0.0f));
            TextView textView3 = new TextView(context);
            this.f24519r = textView3;
            ll.n(org.telegram.ui.ActionBar.f6.A6, b6Var, textView3, 1, 14.0f);
            f16 = 14.0f;
            if (!LocaleController.isRTL) {
                f45.addView(textView2, g7.e6.l(1.0f, -2, -2));
                f45.addView(textView3, g7.e6.m(0.0f, -2, -2, 4, 0, 0));
            } else {
                f45.addView(textView3, g7.e6.l(0.0f, -2, -2));
                f45.addView(textView2, g7.e6.m(1.0f, -2, -2, 0, 4, 0));
            }
            textView2.setMaxLines(2);
            TextView textView4 = new TextView(context);
            this.f24520s = textView4;
            textView4.setTextColor(org.telegram.ui.ActionBar.f6.v0(i37, b6Var));
            textView4.setLines(1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setEllipsize(truncateAt);
            if (LocaleController.isRTL) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            textView4.setGravity(i16 | 16);
            textView4.setTextSize(1, 13.0f);
            boolean z18 = LocaleController.isRTL;
            if (z18) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            int i40 = i17 | 48;
            if (z18) {
                f21 = 8.0f;
            } else {
                f21 = 72.0f;
            }
            if (z18) {
                f22 = 72.0f;
            } else {
                f22 = 8.0f;
            }
            addView(textView4, g7.e6.d(-1, -2.0f, i40, f21, 30.0f, f22, 0.0f));
            textView4.setVisibility(8);
        } else {
            f16 = 14.0f;
            textView2.setMaxLines(1);
            boolean z19 = LocaleController.isRTL;
            if (z19) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            int i41 = i14 | 48;
            if (z19) {
                f17 = 8.0f;
            } else {
                f17 = 72.0f;
            }
            if (z19) {
                f18 = 72.0f;
            } else {
                f18 = 8.0f;
            }
            addView(textView2, g7.e6.d(-1, -2.0f, i41, f17, 5.0f, f18, 0.0f));
        }
        mi0 mi0Var = new mi0(R.raw.download_arrow, "download_arrow", AndroidUtilities.dp(f16), AndroidUtilities.dp(f16), true, null);
        this.G = mi0Var;
        ?? imageView2 = new ImageView(context);
        this.f24517f = imageView2;
        imageView2.setAnimation(mi0Var);
        imageView2.setVisibility(4);
        int i42 = org.telegram.ui.ActionBar.f6.Ih;
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i42, b6Var), PorterDuff.Mode.SRC_IN));
        if (i9 == 1) {
            boolean z20 = LocaleController.isRTL;
            if (z20) {
                i25 = 5;
            } else {
                i25 = 3;
            }
            int i43 = i25 | 48;
            if (z20) {
                f35 = 8.0f;
            } else {
                f35 = 70.0f;
            }
            if (z20) {
                f36 = 72.0f;
            } else {
                f36 = 8.0f;
            }
            addView((View) imageView2, g7.e6.d(14, 14.0f, i43, f35, 37.0f, f36, 0.0f));
        } else {
            boolean z21 = LocaleController.isRTL;
            if (z21) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            int i44 = i18 | 48;
            if (z21) {
                f23 = 8.0f;
            } else {
                f23 = 70.0f;
            }
            if (z21) {
                f24 = 72.0f;
            } else {
                f24 = 8.0f;
            }
            addView((View) imageView2, g7.e6.d(14, 14.0f, i44, f23, 33.0f, f24, 0.0f));
        }
        org.telegram.ui.Components.s5 s5Var = new org.telegram.ui.Components.s5(context);
        this.f24516e = s5Var;
        s5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A6, b6Var));
        s5Var.setLines(1);
        s5Var.setMaxLines(1);
        s5Var.setSingleLine(true);
        s5Var.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i19 = 5;
        } else {
            i19 = 3;
        }
        s5Var.setGravity(i19 | 16);
        NotificationCenter.listenEmojiLoading(s5Var);
        if (i9 == 1) {
            s5Var.setTextSize(1, 13.0f);
            boolean z22 = LocaleController.isRTL;
            if (z22) {
                i24 = 5;
            } else {
                i24 = 3;
            }
            int i45 = i24 | 48;
            if (z22) {
                f33 = 8.0f;
            } else {
                f33 = 72.0f;
            }
            if (z22) {
                f34 = 72.0f;
            } else {
                f34 = 8.0f;
            }
            addView(s5Var, g7.e6.d(-1, -2.0f, i45, f33, 34.0f, f34, 0.0f));
        } else {
            s5Var.setTextSize(1, 13.0f);
            boolean z23 = LocaleController.isRTL;
            if (z23) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            int i46 = i20 | 48;
            if (z23) {
                f25 = 8.0f;
            } else {
                f25 = 72.0f;
            }
            if (z23) {
                f26 = 72.0f;
            } else {
                f26 = 8.0f;
            }
            addView(s5Var, g7.e6.d(-1, -2.0f, i46, f25, 30.0f, f26, 0.0f));
        }
        v70 v70Var = new v70(context);
        this.h = v70Var;
        v70Var.setProgressColor(org.telegram.ui.ActionBar.f6.v0(i42, b6Var));
        boolean z24 = LocaleController.isRTL;
        if (z24) {
            i21 = 5;
        } else {
            i21 = 3;
        }
        int i47 = i21 | 48;
        if (z24) {
            f27 = 0.0f;
        } else {
            f27 = 72.0f;
        }
        if (z24) {
            f28 = 72.0f;
        } else {
            f28 = 0.0f;
        }
        addView(v70Var, g7.e6.d(-1, 2.0f, i47, f27, 54.0f, f28, 0.0f));
        dp dpVar = new dp(context, 21, b6Var);
        this.f24518n = dpVar;
        dpVar.setVisibility(4);
        dpVar.b(-1, org.telegram.ui.ActionBar.f6.f23001d6, org.telegram.ui.ActionBar.f6.f23128k7);
        dpVar.setDrawUnchecked(false);
        dpVar.setDrawBackgroundAsArc(2);
        if (i9 == 1) {
            boolean z25 = LocaleController.isRTL;
            if (z25) {
                i23 = 5;
            } else {
                i23 = 3;
            }
            int i48 = i23 | 48;
            if (z25) {
                f31 = 0.0f;
            } else {
                f31 = 38.0f;
            }
            if (z25) {
                f32 = 38.0f;
            } else {
                f32 = 0.0f;
            }
            addView(dpVar, g7.e6.d(24, 24.0f, i48, f31, 36.0f, f32, 0.0f));
        } else {
            boolean z26 = LocaleController.isRTL;
            if (z26) {
                i22 = 5;
            } else {
                i22 = 3;
            }
            int i49 = i22 | 48;
            if (z26) {
                f29 = 0.0f;
            } else {
                f29 = 33.0f;
            }
            if (z26) {
                f30 = 33.0f;
            } else {
                f30 = 0.0f;
            }
            addView(dpVar, g7.e6.d(24, 24.0f, i49, f29, 28.0f, f30, 0.0f));
        }
        if (i9 == 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.E = spannableStringBuilder;
            spannableStringBuilder.setSpan(new qs(), 0, 1, 0);
        }
    }

    public final void a(Canvas canvas) {
        if (this.f24521w) {
            canvas.drawLine(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.f6.T0("paintDivider", this.H));
        }
    }

    public final void b(boolean z10, boolean z11) {
        dp dpVar = this.f24518n;
        if (dpVar.getVisibility() != 0) {
            dpVar.setVisibility(0);
        }
        dpVar.a(z10, z11);
    }

    public final void c(MessageObject messageObject, boolean z10) {
        boolean z11;
        String str;
        String str2;
        String str3;
        String lowerCase;
        org.telegram.ui.ActionBar.b6 b6Var;
        int i9;
        boolean z12;
        boolean z13;
        String str4;
        String str5;
        String str6;
        MessageObject messageObject2 = this.A;
        if (messageObject2 != null && messageObject != null && messageObject2.getId() != messageObject.getId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f24521w = z10;
        this.A = messageObject;
        this.C = false;
        this.B = false;
        if (!z11) {
            this.J = 0L;
        }
        TLRPC.Document document = messageObject.getDocument();
        TextView textView = this.f24520s;
        TextView textView2 = this.f24515c;
        ImageView imageView = this.f24513a;
        TextView textView3 = this.d;
        ih.d4 d4Var = this.f24514b;
        if (document != null) {
            if (messageObject.isMusic()) {
                str = null;
                for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
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
            org.telegram.ui.ActionBar.b6 b6Var2 = this.H;
            CharSequence highlightText = AndroidUtilities.highlightText(str3, arrayList, b6Var2);
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
                b6Var = b6Var2;
                d4Var.setVisibility(4);
                d4Var.setImageBitmap(null);
                textView3.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
            } else {
                ImageReceiver imageReceiver = d4Var.getImageReceiver();
                if (closestPhotoSizeWithSize == null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                imageReceiver.setNeedsQualityThumb(z12);
                ImageReceiver imageReceiver2 = d4Var.getImageReceiver();
                if (closestPhotoSizeWithSize == null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                imageReceiver2.setShouldGenerateQualityThumb(z13);
                d4Var.setVisibility(0);
                if (messageObject.strippedThumb != null) {
                    b6Var = b6Var2;
                    d4Var.m(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "40_40", null, null, messageObject.strippedThumb, null, 1, messageObject);
                } else {
                    b6Var = b6Var2;
                    d4Var.k(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "40_40", ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "40_40_b", 0L, null, messageObject, 1);
                }
            }
            e();
            if (messageObject.hasHighlightedWords() && !TextUtils.isEmpty(this.A.messageOwner.message)) {
                CharSequence highlightText2 = AndroidUtilities.highlightText(this.A.messageOwner.message.replace("\n", " ").replaceAll(" +", " ").trim(), this.A.highlightedWords, b6Var);
                this.F = highlightText2;
                if (textView != null) {
                    if (highlightText2 == null) {
                        i9 = 8;
                    } else {
                        i9 = 0;
                    }
                    textView.setVisibility(i9);
                }
            } else if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            textView2.setText("");
            textView3.setText("");
            this.f24516e.setText("");
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            textView3.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            d4Var.setVisibility(4);
            d4Var.setImageBitmap(null);
            this.F = null;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        setWillNotDraw(!this.f24521w);
        this.h.a(0.0f, false);
        f(z11);
    }

    public final void d(boolean z10, String str, int i9, String str2, String str3, String str4) {
        int i10;
        int i11;
        this.f24515c.setText(str);
        this.f24516e.setText(str2);
        TextView textView = this.d;
        if (str3 != null) {
            textView.setVisibility(0);
            textView.setText(str3.toLowerCase());
        } else {
            textView.setVisibility(4);
        }
        this.f24521w = z10;
        ImageView imageView = this.f24513a;
        if (i9 == 0) {
            imageView.setImageResource(AndroidUtilities.getThumbForNameOrMime(str, str3, false));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        int i12 = this.D;
        ih.d4 d4Var = this.f24514b;
        if (str4 == null && i9 == 0) {
            textView.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            if (i12 != 3) {
                d4Var.setImageBitmap(null);
                d4Var.setVisibility(4);
            }
        } else {
            if (str4 != null) {
                if (i12 != 3) {
                    d4Var.f(str4, "42_42", null);
                }
            } else {
                fq L = org.telegram.ui.ActionBar.f6.L(AndroidUtilities.dp(42.0f), i9);
                if (i9 == R.drawable.files_storage) {
                    i10 = org.telegram.ui.ActionBar.f6.f23183na;
                    i11 = org.telegram.ui.ActionBar.f6.f23095ia;
                } else if (i9 == R.drawable.files_gallery) {
                    i10 = org.telegram.ui.ActionBar.f6.f23148la;
                    i11 = org.telegram.ui.ActionBar.f6.f23095ia;
                } else if (i9 == R.drawable.files_music) {
                    i10 = org.telegram.ui.ActionBar.f6.ka;
                    i11 = org.telegram.ui.ActionBar.f6.f23095ia;
                } else if (i9 == R.drawable.files_internal) {
                    i10 = org.telegram.ui.ActionBar.f6.f23113ja;
                    i11 = org.telegram.ui.ActionBar.f6.f23095ia;
                } else {
                    i10 = org.telegram.ui.ActionBar.f6.Ai;
                    i11 = org.telegram.ui.ActionBar.f6.zi;
                }
                org.telegram.ui.ActionBar.b6 b6Var = this.H;
                org.telegram.ui.ActionBar.f6.v1(L, org.telegram.ui.ActionBar.f6.v0(i10, b6Var), false);
                org.telegram.ui.ActionBar.f6.v1(L, org.telegram.ui.ActionBar.f6.v0(i11, b6Var), true);
                d4Var.setImageDrawable(L);
            }
            d4Var.setVisibility(0);
        }
        setWillNotDraw(!this.f24521w);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.N != 1.0f && this.I != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.N) * 255.0f), 31);
            this.I.setViewType(3);
            this.I.d();
            this.I.h();
            this.I.draw(canvas);
            canvas.restore();
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.N * 255.0f), 31);
            super.dispatchDraw(canvas);
            a(canvas);
            canvas.restore();
        } else {
            super.dispatchDraw(canvas);
            a(canvas);
        }
        boolean z10 = this.K;
        if (!z10 && this.L == 0.0f) {
            return;
        }
        if (z10) {
            float f10 = this.L;
            if (f10 != 1.0f) {
                this.L = f10 + 0.10666667f;
                invalidate();
                this.L = Utilities.clamp(this.L, 1.0f, 0.0f);
                int measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.f6.Z0.getIntrinsicWidth();
                int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.f6.Z0.getIntrinsicHeight()) >> 1;
                canvas.save();
                float f11 = this.L;
                canvas.scale(f11, f11, (org.telegram.ui.ActionBar.f6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.f6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                Drawable drawable = org.telegram.ui.ActionBar.f6.Z0;
                drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.f6.Z0.getIntrinsicHeight() + measuredHeight);
                org.telegram.ui.ActionBar.f6.Z0.draw(canvas);
                canvas.restore();
            }
        }
        if (!z10) {
            float f12 = this.L;
            if (f12 != 0.0f) {
                this.L = f12 - 0.10666667f;
                invalidate();
            }
        }
        this.L = Utilities.clamp(this.L, 1.0f, 0.0f);
        int measuredWidth2 = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.f6.Z0.getIntrinsicWidth();
        int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.f6.Z0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f112 = this.L;
        canvas.scale(f112, f112, (org.telegram.ui.ActionBar.f6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.f6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
        Drawable drawable2 = org.telegram.ui.ActionBar.f6.Z0;
        drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.f6.Z0.getIntrinsicHeight() + measuredHeight2);
        org.telegram.ui.ActionBar.f6.Z0.draw(canvas);
        canvas.restore();
    }

    public final void e() {
        String z10;
        MessageObject messageObject = this.A;
        if (messageObject != null && messageObject.getDocument() != null) {
            MessageObject messageObject2 = this.A;
            long j10 = messageObject2.messageOwner.date * 1000;
            long j11 = this.J;
            if (j11 == 0) {
                z10 = AndroidUtilities.formatFileSize(messageObject2.getDocument().size);
            } else {
                Locale locale = Locale.ENGLISH;
                z10 = aa.d.z(AndroidUtilities.formatFileSize(j11), " / ", AndroidUtilities.formatFileSize(this.A.getDocument().size));
            }
            int i9 = this.D;
            org.telegram.ui.Components.s5 s5Var = this.f24516e;
            if (i9 == 2) {
                s5Var.setText(new SpannableStringBuilder().append((CharSequence) z10).append(' ').append((CharSequence) this.E).append(' ').append(f10.d(this.A, true, 2, s5Var.getPaint())));
                this.f24519r.setText(LocaleController.stringForMessageListDate(this.A.messageOwner.date));
                return;
            }
            String formatString = LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(new Date(j10)), LocaleController.getInstance().getFormatterDay().format(new Date(j10)));
            s5Var.setText(z10 + ", " + formatString);
        }
    }

    public final void f(boolean z10) {
        float f10;
        float f11;
        int i9;
        float f12;
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) gr.f28844f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        MessageObject messageObject = this.A;
        float f13 = 72.0f;
        int i10 = this.f24522x;
        pi0 pi0Var = this.f24517f;
        v70 v70Var = this.h;
        float f14 = 8.0f;
        org.telegram.ui.Components.s5 s5Var = this.f24516e;
        if (messageObject != null && messageObject.messageOwner.media != null) {
            this.C = false;
            if (!messageObject.attachPathExists && !messageObject.mediaExists && this.v) {
                String attachFileName = FileLoader.getAttachFileName(messageObject.getDocument());
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.A, this);
                this.B = FileLoader.getInstance(i10).isLoadingFile(attachFileName);
                pi0Var.setVisibility(0);
                int i11 = 15;
                if (this.B) {
                    i9 = 15;
                } else {
                    i9 = 0;
                }
                mi0 mi0Var = this.G;
                mi0Var.N(i9);
                mi0Var.h = true;
                if (z10) {
                    pi0Var.d();
                } else {
                    if (!this.B) {
                        i11 = 0;
                    }
                    mi0Var.K(i11);
                    pi0Var.invalidate();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) s5Var.getLayoutParams();
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
                    s5Var.requestLayout();
                }
                if (this.B) {
                    v70Var.setVisibility(0);
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                    if (fileProgress == null) {
                        fileProgress = Float.valueOf(0.0f);
                    }
                    v70Var.a(fileProgress.floatValue(), false);
                    return;
                }
                v70Var.setVisibility(4);
                return;
            }
            pi0Var.setVisibility(4);
            v70Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) s5Var.getLayoutParams();
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
                s5Var.requestLayout();
            }
            this.B = false;
            this.C = true;
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            return;
        }
        this.B = false;
        this.C = true;
        v70Var.setVisibility(4);
        v70Var.a(0.0f, false);
        pi0Var.setVisibility(4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) s5Var.getLayoutParams();
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
            s5Var.requestLayout();
        }
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
    }

    public org.telegram.ui.Components.o9 getImageView() {
        return this.f24514b;
    }

    public MessageObject getMessage() {
        return this.A;
    }

    @Override
    public int getObserverTag() {
        return this.f24523y;
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
        DownloadController.getInstance(this.f24522x).removeLoadingFileObserver(this);
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        f(true);
        this.J = 0L;
        e();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        dp dpVar = this.f24518n;
        if (dpVar.f27781a.f26313q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(dpVar.f27781a.f26313q);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        if (this.D != 1) {
            TextView textView = this.f24515c;
            int lineCount = textView.getLineCount();
            TextView textView2 = this.f24520s;
            if (lineCount > 1 || (textView2 != null && textView2.getVisibility() == 0)) {
                int measuredHeight = textView.getMeasuredHeight() - AndroidUtilities.dp(22.0f);
                if (textView2 != null && textView2.getVisibility() == 0) {
                    textView2.layout(textView2.getLeft(), textView2.getTop() + measuredHeight, textView2.getRight(), textView2.getBottom() + measuredHeight);
                    measuredHeight = org.telegram.messenger.l0.C(3.0f, textView2.getMeasuredHeight(), measuredHeight);
                }
                org.telegram.ui.Components.s5 s5Var = this.f24516e;
                s5Var.layout(s5Var.getLeft(), s5Var.getTop() + measuredHeight, s5Var.getRight(), s5Var.getBottom() + measuredHeight);
                pi0 pi0Var = this.f24517f;
                pi0Var.layout(pi0Var.getLeft(), pi0Var.getTop() + measuredHeight, pi0Var.getRight(), pi0Var.getBottom() + measuredHeight);
                v70 v70Var = this.h;
                v70Var.layout(v70Var.getLeft(), (getMeasuredHeight() - v70Var.getMeasuredHeight()) - (this.f24521w ? 1 : 0), v70Var.getRight(), getMeasuredHeight() - (this.f24521w ? 1 : 0));
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        TextView textView;
        int i11 = this.D;
        if (i11 == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f24521w ? 1 : 0), 1073741824));
        } else if (i11 == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
            int measuredHeight = this.f24515c.getMeasuredHeight() + AndroidUtilities.dp(34.0f) + (this.f24521w ? 1 : 0);
            if (this.F != null && (textView = this.f24520s) != null && this.A.hasHighlightedWords()) {
                this.M = true;
                textView.setText(AndroidUtilities.ellipsizeCenterEnd(this.F, this.A.highlightedWords.get(0), textView.getMeasuredWidth(), textView.getPaint(), 130));
                this.M = false;
                measuredHeight = org.telegram.messenger.l0.C(3.0f, textView.getMeasuredHeight(), measuredHeight);
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        v70 v70Var = this.h;
        if (v70Var.getVisibility() != 0) {
            f(true);
        }
        this.J = j10;
        e();
        v70Var.a(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.h.a(1.0f, true);
        f(true);
        this.J = 0L;
        e();
    }

    @Override
    public final void requestLayout() {
        if (this.M) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawDownloadIcon(boolean z10) {
        this.v = z10;
    }

    public void setEnterAnimationAlpha(float f10) {
        if (this.N != f10) {
            this.N = f10;
            invalidate();
        }
    }

    public void setGlobalGradientView(e00 e00Var) {
        this.I = e00Var;
    }

    public void setPhoto(String str) {
        boolean endsWith = str.endsWith("mp4");
        ih.d4 d4Var = this.f24514b;
        if (endsWith) {
            d4Var.f("vthumb://0:".concat(str), null, null);
            d4Var.setVisibility(0);
        } else if (!str.endsWith(".jpg") && !str.endsWith(".jpeg") && !str.endsWith(".png") && !str.endsWith(".gif")) {
            d4Var.setVisibility(8);
        } else {
            d4Var.f("thumb://0:".concat(str), null, null);
            d4Var.setVisibility(0);
        }
    }

    public void setPhotoEntry(MediaController.PhotoEntry photoEntry) {
        String str;
        String str2 = photoEntry.thumbPath;
        ih.d4 d4Var = this.f24514b;
        if (str2 != null) {
            d4Var.f(str2, null, org.telegram.ui.ActionBar.f6.R4);
            str = photoEntry.thumbPath;
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                d4Var.q(0, true);
                d4Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.f6.R4);
            } else {
                d4Var.p(photoEntry.orientation, photoEntry.invert, true);
                d4Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.f6.R4);
            }
            str = photoEntry.path;
        } else {
            d4Var.setImageDrawable(org.telegram.ui.ActionBar.f6.R4);
            str = "";
        }
        File file = new File(str);
        this.f24515c.setText(file.getName());
        FileLoader.getFileExtension(file);
        this.d.setVisibility(8);
        StringBuilder sb2 = new StringBuilder();
        if (photoEntry.width != 0 && photoEntry.height != 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            Locale locale = Locale.US;
            int i9 = photoEntry.width;
            int i10 = photoEntry.height;
            sb2.append(i9 + "x" + i10);
        }
        if (photoEntry.isVideo) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(AndroidUtilities.formatShortDuration(photoEntry.duration));
        }
        if (photoEntry.size != 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(AndroidUtilities.formatFileSize(photoEntry.size));
        }
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        sb2.append(LocaleController.getInstance().getFormatterStats().format(photoEntry.dateTaken));
        this.f24516e.setText(sb2);
        this.f24513a.setVisibility(8);
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
