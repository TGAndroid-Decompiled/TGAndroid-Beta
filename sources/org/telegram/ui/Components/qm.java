package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class qm extends tl0 {
    public final Context f29953c;
    public final boolean d;
    public boolean e;
    public boolean f29954f;
    public final ArrayList h = new ArrayList(8);
    public int f29955n;
    public int f29956r;
    public boolean f29957s;
    public final ChatAttachAlertPhotoLayout v;

    public qm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10) {
        this.v = chatAttachAlertPhotoLayout;
        this.f29953c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final boolean E(lm0 lm0Var) {
        MediaController.AlbumEntry albumEntry;
        boolean isEmpty = ChatAttachAlertPhotoLayout.f24224r1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if ((!isEmpty || ((albumEntry = chatAttachAlertPhotoLayout.T0) != null && !albumEntry.photos.isEmpty())) && chatAttachAlertPhotoLayout.f27704b.R && h() > 30) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        ArrayList<MediaController.PhotoEntry> arrayList;
        MediaController.PhotoEntry M = M(i10);
        if (M == null) {
            int i11 = this.f29956r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
            if (i10 <= i11) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f24224r1;
                if (!arrayList2.isEmpty()) {
                    M = (MediaController.PhotoEntry) arrayList2.get(0);
                } else {
                    MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.T0;
                    if (albumEntry != null && (arrayList = albumEntry.photos) != null) {
                        M = arrayList.get(0);
                    }
                }
            } else if (!chatAttachAlertPhotoLayout.T0.photos.isEmpty()) {
                M = (MediaController.PhotoEntry) i2.o1.i(1, chatAttachAlertPhotoLayout.T0.photos);
            }
        }
        if (M != null) {
            long j10 = M.dateTaken;
            if (Build.VERSION.SDK_INT <= 28) {
                j10 /= 1000;
            }
            return LocaleController.formatYearMont(j10, true);
        }
        return "";
    }

    @Override
    public final void G(lm0 lm0Var, float f7, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int measuredHeight = lm0Var.getChildAt(0).getMeasuredHeight();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        float ceil = (((int) (Math.ceil(h() / chatAttachAlertPhotoLayout.M0) * measuredHeight)) - (lm0Var.getMeasuredHeight() - currentActionBarHeight)) * f7;
        float f10 = measuredHeight;
        iArr[0] = ((int) (ceil / f10)) * chatAttachAlertPhotoLayout.M0;
        int paddingTop = lm0Var.getPaddingTop() + ((int) (ceil % f10)) + ((int) ((1.0f - f7) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] == 0 && paddingTop < chatAttachAlertPhotoLayout.getListTopPadding()) {
            iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
        }
    }

    @Override
    public final float H(lm0 lm0Var) {
        int i10 = this.v.M0;
        int ceil = (int) Math.ceil(this.f29955n / i10);
        if (lm0Var.getChildCount() != 0) {
            int measuredHeight = lm0Var.getChildAt(0).getMeasuredHeight();
            View childAt = lm0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                return Utilities.clamp((((R / i10) * measuredHeight) - childAt.getTop()) / ((ceil * measuredHeight) - (lm0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override
    public final void J(lm0 lm0Var) {
        this.f29957s = false;
        int childCount = lm0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            lm0Var.getChildAt(i10).invalidate();
        }
    }

    @Override
    public final void K() {
        this.f29957s = true;
    }

    public final vl0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        org.telegram.ui.Cells.s5 s5Var = new org.telegram.ui.Cells.s5(this.f29953c, chatAttachAlertPhotoLayout.f27703a);
        if (this == chatAttachAlertPhotoLayout.G) {
            s5Var.setOutlineProvider(new om(this));
            s5Var.setClipToOutline(true);
        }
        s5Var.setFastScrollDelegate(new s(this, 22));
        s5Var.setDelegate(new o2(11, this, s5Var));
        return new s4.b1(s5Var);
    }

    public final MediaController.PhotoEntry M(int i10) {
        boolean z10 = this.f29954f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (z10 && i10 > chatAttachAlertPhotoLayout.M0) {
            i10--;
        }
        if (this.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            i10--;
        }
        boolean z11 = ChatAttachAlertPhotoLayout.f24223q1;
        return chatAttachAlertPhotoLayout.b0(i10);
    }

    @Override
    public final int h() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        qm qmVar = chatAttachAlertPhotoLayout.G;
        if (!chatAttachAlertPhotoLayout.f24266v0) {
            return 1;
        }
        int i10 = 0;
        this.e = false;
        this.f29954f = false;
        boolean z10 = chatAttachAlertPhotoLayout.P0;
        if (z10 && this == qmVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            this.e = true;
            i10 = 1;
        }
        if (chatAttachAlertPhotoLayout.f24241g1) {
            i10++;
        }
        if (z10 && this == qmVar) {
            i10++;
        }
        this.f29956r = i10;
        if (!z10) {
            i10 += ChatAttachAlertPhotoLayout.f24224r1.size();
            MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.T0;
            if (albumEntry != null) {
                i10 += albumEntry.photos.size();
            }
        }
        if (this.e && i10 > chatAttachAlertPhotoLayout.M0 && !chatAttachAlertPhotoLayout.O0) {
            this.f29954f = true;
            i10++;
        }
        if (this == qmVar) {
            i10++;
        }
        this.f29955n = i10;
        return i10;
    }

    @Override
    public final int j(int i10) {
        int i11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        qm qmVar = chatAttachAlertPhotoLayout.G;
        if (chatAttachAlertPhotoLayout.f24266v0) {
            boolean z10 = chatAttachAlertPhotoLayout.P0;
            if (z10 && this == qmVar) {
                if (i10 == 0) {
                    return 7;
                }
                return 2;
            }
            boolean z11 = this.d;
            if (z11 && i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                if (!chatAttachAlertPhotoLayout.O0) {
                    return 1;
                }
                return 8;
            }
            boolean z12 = this.f29954f;
            if (z12 && i10 == chatAttachAlertPhotoLayout.M0) {
                return 5;
            }
            if (z12 && i10 > chatAttachAlertPhotoLayout.M0) {
                i11 = i10 - 1;
            } else {
                i11 = i10;
            }
            if (z11) {
                i11--;
            }
            if (chatAttachAlertPhotoLayout.f24241g1 && i11 == 0) {
                return 4;
            }
            if (this == qmVar && i10 == this.f29955n - 1) {
                return 2;
            }
            if (z10) {
                return 3;
            }
            return 0;
        }
        return 2;
    }

    @Override
    public final void l() {
        int i10;
        super.l();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (this == chatAttachAlertPhotoLayout.G) {
            tz tzVar = chatAttachAlertPhotoLayout.H;
            if ((h() == 1 && !chatAttachAlertPhotoLayout.P0 && chatAttachAlertPhotoLayout.T0 == null) || !chatAttachAlertPhotoLayout.f24266v0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            tzVar.setVisibility(i10);
        }
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        ri riVar = chatAttachAlertPhotoLayout.f27704b;
        int i11 = b1Var.f46345f;
        View view = b1Var.f46342a;
        boolean z15 = this.d;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 == 7) {
                        ((n20) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.f24241g1);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.m5 m5Var = (org.telegram.ui.Cells.m5) view;
                m5Var.setItemSize(chatAttachAlertPhotoLayout.K0);
                if (!z15 || !chatAttachAlertPhotoLayout.O0 || i10 != 0) {
                    i12 = 1;
                }
                m5Var.setType(i12);
                return;
            }
            ((org.telegram.ui.Cells.l5) view).setItemSize(chatAttachAlertPhotoLayout.K0);
            return;
        }
        if (this.f29954f && i10 > chatAttachAlertPhotoLayout.M0) {
            i10--;
        }
        if (z15 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            i10--;
        }
        if (chatAttachAlertPhotoLayout.f24241g1) {
            i10--;
        }
        org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
        if (this == chatAttachAlertPhotoLayout.G) {
            s5Var.setItemSize(chatAttachAlertPhotoLayout.K0);
        } else {
            if (chatAttachAlertPhotoLayout.f24262s.f46330o == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            s5Var.setIsVertical(z10);
        }
        if (riVar.T0 == 0 && !riVar.W0 && !riVar.H) {
            s5Var.getCheckBox().setVisibility(0);
        } else {
            s5Var.getCheckBox().setVisibility(8);
        }
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 == null) {
            return;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f24225s1;
        if (hashMap.size() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z15 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (i10 == h() - 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (riVar != null && riVar.f30155i0) {
            z14 = true;
        } else {
            z14 = false;
        }
        s5Var.d(b02, z11, z12, z13, z14);
        if ((riVar.f30146f0 instanceof org.telegram.ui.sn) && riVar.W1) {
            s5Var.b(ChatAttachAlertPhotoLayout.f24226t1.indexOf(Integer.valueOf(b02.imageId)), hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        } else {
            s5Var.b(-1, hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        }
        if (!chatAttachAlertPhotoLayout.f24268w0 && b02.isVideo) {
            s5Var.setAlpha(0.3f);
        } else if (!chatAttachAlertPhotoLayout.f24270x0 && !b02.isVideo) {
            s5Var.setAlpha(0.3f);
        } else {
            s5Var.setAlpha(1.0f);
        }
        s5Var.getImageView().setTag(Integer.valueOf(i10));
        s5Var.setTag(Integer.valueOf(i10));
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        ri riVar = chatAttachAlertPhotoLayout.f27704b;
        org.telegram.ui.ActionBar.g6 g6Var = chatAttachAlertPhotoLayout.f27703a;
        if (i10 != 0) {
            Context context = this.f29953c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 7) {
                                if (i10 != 8) {
                                    ?? frameLayout = new FrameLayout(context);
                                    ImageView imageView = new ImageView(context);
                                    frameLayout.f22729a = imageView;
                                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                                    imageView.setScaleType(scaleType);
                                    int i11 = org.telegram.ui.ActionBar.k6.f21129aa;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    org.telegram.ui.ActionBar.r6.t(imageView, i11, g6Var, mode);
                                    frameLayout.addView(imageView, w7.z5.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    ImageView imageView2 = new ImageView(context);
                                    frameLayout.f22730b = imageView2;
                                    imageView2.setScaleType(scaleType);
                                    org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.f21149ba, g6Var, mode);
                                    frameLayout.addView(imageView2, w7.z5.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    TextView textView = new TextView(context);
                                    frameLayout.f22731c = textView;
                                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21169ca, g6Var);
                                    textView.setTextSize(1, 12.0f);
                                    textView.setGravity(17);
                                    frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
                                    frameLayout.d = AndroidUtilities.dp(80.0f);
                                    return new s4.b1(frameLayout);
                                }
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                frameLayout2.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
                                ei.d dVar = new ei.d(context, g6Var, true);
                                dVar.setUseWrapContent(true);
                                dVar.f();
                                dVar.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                                spannableStringBuilder.setSpan(new vq(R.drawable.camera, 0), 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessCamera));
                                dVar.i(spannableStringBuilder, false, true);
                                frameLayout2.addView(dVar, w7.z5.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
                                return new s4.b1(frameLayout2);
                            }
                            n20 n20Var = new n20(context, riVar.M1);
                            n20Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(400.0f)));
                            n20Var.setGravity(17);
                            n20Var.isClickable();
                            n20Var.f28766b.setOnClickListener(new f0(new ul(chatAttachAlertPhotoLayout, 5), 17));
                            n20Var.f28765a.setOnClickListener(new f0(new ul(chatAttachAlertPhotoLayout, 6), 18));
                            n20Var.f28767c.setOnClickListener(new aa(16, n20Var, new x2(this, 2)));
                            return new s4.b1(n20Var);
                        }
                        return new s4.b1(new View(context));
                    }
                    riVar.getClass();
                    return new s4.b1(new pm(this, context));
                }
                return new s4.b1(new ai.jc(this, context, 13));
            }
            ?? view = new View(context);
            view.setFocusable(true);
            view.f22679a = AndroidUtilities.dp(0.0f);
            return new s4.b1(view);
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            vl0 vl0Var = (vl0) arrayList.get(0);
            arrayList.remove(0);
            return vl0Var;
        }
        return L();
    }

    @Override
    public final void y(s4.b1 b1Var) {
        if (b1Var.f46342a instanceof org.telegram.ui.Cells.l5) {
            this.v.Q.g();
        }
    }
}
