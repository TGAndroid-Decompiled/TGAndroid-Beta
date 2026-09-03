package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
public final class dm extends bl0 {
    public final Context f24309c;
    public final boolean d;
    public boolean e;
    public boolean f24310f;
    public final ArrayList h = new ArrayList(8);
    public int f24311n;
    public int f24312r;
    public boolean f24313s;
    public final ChatAttachAlertPhotoLayout v;

    public dm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z4) {
        this.v = chatAttachAlertPhotoLayout;
        this.f24309c = context;
        this.d = z4;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override
    public final boolean E(rl0 rl0Var) {
        MediaController.AlbumEntry albumEntry;
        boolean isEmpty = ChatAttachAlertPhotoLayout.f22868o1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if ((!isEmpty || ((albumEntry = chatAttachAlertPhotoLayout.Q0) != null && !albumEntry.photos.isEmpty())) && chatAttachAlertPhotoLayout.f24282b.O && h() > 30) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        ArrayList<MediaController.PhotoEntry> arrayList;
        MediaController.PhotoEntry M = M(i10);
        if (M == null) {
            int i11 = this.f24312r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
            if (i10 <= i11) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f22868o1;
                if (!arrayList2.isEmpty()) {
                    M = (MediaController.PhotoEntry) arrayList2.get(0);
                } else {
                    MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.Q0;
                    if (albumEntry != null && (arrayList = albumEntry.photos) != null) {
                        M = arrayList.get(0);
                    }
                }
            } else if (!chatAttachAlertPhotoLayout.Q0.photos.isEmpty()) {
                M = (MediaController.PhotoEntry) kf.k0.i(1, chatAttachAlertPhotoLayout.Q0.photos);
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
    public final void G(rl0 rl0Var, float f10, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int measuredHeight = rl0Var.getChildAt(0).getMeasuredHeight();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        float ceil = (((int) (Math.ceil(h() / chatAttachAlertPhotoLayout.J0) * measuredHeight)) - (rl0Var.getMeasuredHeight() - currentActionBarHeight)) * f10;
        float f11 = measuredHeight;
        iArr[0] = ((int) (ceil / f11)) * chatAttachAlertPhotoLayout.J0;
        int paddingTop = rl0Var.getPaddingTop() + ((int) (ceil % f11)) + ((int) ((1.0f - f10) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] == 0 && paddingTop < chatAttachAlertPhotoLayout.getListTopPadding()) {
            iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
        }
    }

    @Override
    public final float H(rl0 rl0Var) {
        int i10 = this.v.J0;
        int ceil = (int) Math.ceil(this.f24311n / i10);
        if (rl0Var.getChildCount() != 0) {
            int measuredHeight = rl0Var.getChildAt(0).getMeasuredHeight();
            View childAt = rl0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                return Utilities.clamp((((R / i10) * measuredHeight) - childAt.getTop()) / ((ceil * measuredHeight) - (rl0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override
    public final void J(rl0 rl0Var) {
        this.f24313s = false;
        int childCount = rl0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            rl0Var.getChildAt(i10).invalidate();
        }
    }

    @Override
    public final void K() {
        this.f24313s = true;
    }

    public final dl0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        org.telegram.ui.Cells.s5 s5Var = new org.telegram.ui.Cells.s5(this.f24309c, chatAttachAlertPhotoLayout.f24281a);
        if (this == chatAttachAlertPhotoLayout.D) {
            s5Var.setOutlineProvider(new bm(this));
            s5Var.setClipToOutline(true);
        }
        s5Var.setFastScrollDelegate(new t(this, 22));
        s5Var.setDelegate(new o1(13, this, s5Var));
        return new f2.l1(s5Var);
    }

    public final MediaController.PhotoEntry M(int i10) {
        boolean z4 = this.f24310f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (z4 && i10 > chatAttachAlertPhotoLayout.J0) {
            i10--;
        }
        if (this.d && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
            i10--;
        }
        boolean z10 = ChatAttachAlertPhotoLayout.f22867n1;
        return chatAttachAlertPhotoLayout.b0(i10);
    }

    @Override
    public final int h() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        dm dmVar = chatAttachAlertPhotoLayout.D;
        if (!chatAttachAlertPhotoLayout.f22904s0) {
            return 1;
        }
        int i10 = 0;
        this.e = false;
        this.f24310f = false;
        boolean z4 = chatAttachAlertPhotoLayout.M0;
        if (z4 && this == dmVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
            this.e = true;
            i10 = 1;
        }
        if (chatAttachAlertPhotoLayout.f22879d1) {
            i10++;
        }
        if (z4 && this == dmVar) {
            i10++;
        }
        this.f24312r = i10;
        if (!z4) {
            i10 += ChatAttachAlertPhotoLayout.f22868o1.size();
            MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.Q0;
            if (albumEntry != null) {
                i10 += albumEntry.photos.size();
            }
        }
        if (this.e && i10 > chatAttachAlertPhotoLayout.J0 && !chatAttachAlertPhotoLayout.L0) {
            this.f24310f = true;
            i10++;
        }
        if (this == dmVar) {
            i10++;
        }
        this.f24311n = i10;
        return i10;
    }

    @Override
    public final int j(int i10) {
        int i11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        dm dmVar = chatAttachAlertPhotoLayout.D;
        if (chatAttachAlertPhotoLayout.f22904s0) {
            boolean z4 = chatAttachAlertPhotoLayout.M0;
            if (z4 && this == dmVar) {
                if (i10 == 0) {
                    return 7;
                }
                return 2;
            }
            boolean z10 = this.d;
            if (z10 && i10 == 0 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
                if (!chatAttachAlertPhotoLayout.L0) {
                    return 1;
                }
                return 8;
            }
            boolean z11 = this.f24310f;
            if (z11 && i10 == chatAttachAlertPhotoLayout.J0) {
                return 5;
            }
            if (z11 && i10 > chatAttachAlertPhotoLayout.J0) {
                i11 = i10 - 1;
            } else {
                i11 = i10;
            }
            if (z10) {
                i11--;
            }
            if (chatAttachAlertPhotoLayout.f22879d1 && i11 == 0) {
                return 4;
            }
            if (this == dmVar && i10 == this.f24311n - 1) {
                return 2;
            }
            if (z4) {
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
        if (this == chatAttachAlertPhotoLayout.D) {
            mz mzVar = chatAttachAlertPhotoLayout.E;
            if ((h() == 1 && !chatAttachAlertPhotoLayout.M0 && chatAttachAlertPhotoLayout.Q0 == null) || !chatAttachAlertPhotoLayout.f22904s0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            mzVar.setVisibility(i10);
        }
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        li liVar = chatAttachAlertPhotoLayout.f24282b;
        int i11 = l1Var.f5777f;
        View view = l1Var.f5774a;
        boolean z14 = this.d;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 == 7) {
                        ((i20) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.f22879d1);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.m5 m5Var = (org.telegram.ui.Cells.m5) view;
                m5Var.setItemSize(chatAttachAlertPhotoLayout.H0);
                m5Var.setType((z14 && chatAttachAlertPhotoLayout.L0 && i10 == 0) ? 1 : 1);
                return;
            }
            ((org.telegram.ui.Cells.l5) view).setItemSize(chatAttachAlertPhotoLayout.H0);
            return;
        }
        if (this.f24310f && i10 > chatAttachAlertPhotoLayout.J0) {
            i10--;
        }
        if (z14 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
            i10--;
        }
        if (chatAttachAlertPhotoLayout.f22879d1) {
            i10--;
        }
        org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
        if (this == chatAttachAlertPhotoLayout.D) {
            s5Var.setItemSize(chatAttachAlertPhotoLayout.H0);
        } else {
            if (chatAttachAlertPhotoLayout.f22903s.f5720o == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            s5Var.setIsVertical(z4);
        }
        if (liVar.N0 == 0 && !liVar.Q0 && !liVar.E) {
            s5Var.getCheckBox().setVisibility(0);
        } else {
            s5Var.getCheckBox().setVisibility(8);
        }
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 == null) {
            return;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f22869p1;
        if (hashMap.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z14 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i10 == h() - 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (liVar != null && liVar.f26695f0) {
            z13 = true;
        } else {
            z13 = false;
        }
        s5Var.d(b02, z10, z11, z12, z13);
        if ((liVar.f26685c0 instanceof org.telegram.ui.zn) && liVar.Q1) {
            s5Var.b(ChatAttachAlertPhotoLayout.f22870q1.indexOf(Integer.valueOf(b02.imageId)), hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        } else {
            s5Var.b(-1, hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        }
        if (!chatAttachAlertPhotoLayout.f22905t0 && b02.isVideo) {
            s5Var.setAlpha(0.3f);
        } else if (!chatAttachAlertPhotoLayout.f22906u0 && !b02.isVideo) {
            s5Var.setAlpha(0.3f);
        } else {
            s5Var.setAlpha(1.0f);
        }
        s5Var.getImageView().setTag(Integer.valueOf(i10));
        s5Var.setTag(Integer.valueOf(i10));
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        li liVar = chatAttachAlertPhotoLayout.f24282b;
        org.telegram.ui.ActionBar.f6 f6Var = chatAttachAlertPhotoLayout.f24281a;
        if (i10 != 0) {
            Context context = this.f24309c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 7) {
                                if (i10 != 8) {
                                    ?? frameLayout = new FrameLayout(context);
                                    ImageView imageView = new ImageView(context);
                                    frameLayout.f21359a = imageView;
                                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                                    imageView.setScaleType(scaleType);
                                    int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19830aa, f6Var);
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
                                    frameLayout.addView(imageView, k7.b6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    ImageView imageView2 = new ImageView(context);
                                    frameLayout.f21360b = imageView2;
                                    imageView2.setScaleType(scaleType);
                                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19849ba, f6Var), mode));
                                    frameLayout.addView(imageView2, k7.b6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    TextView textView = new TextView(context);
                                    frameLayout.f21361c = textView;
                                    org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.f19867ca, f6Var, textView, 1, 12.0f);
                                    textView.setGravity(17);
                                    frameLayout.addView(textView, k7.b6.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
                                    frameLayout.d = AndroidUtilities.dp(80.0f);
                                    return new f2.l1(frameLayout);
                                }
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                frameLayout2.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(56.0f)));
                                ph.d dVar = new ph.d(context, f6Var, true);
                                dVar.setUseWrapContent(true);
                                dVar.e();
                                dVar.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                                spannableStringBuilder.setSpan(new lq(R.drawable.camera, 0), 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessCamera));
                                dVar.g(spannableStringBuilder, false, true);
                                frameLayout2.addView(dVar, k7.b6.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
                                return new f2.l1(frameLayout2);
                            }
                            i20 i20Var = new i20(context, liVar.G1);
                            i20Var.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(400.0f)));
                            i20Var.setGravity(17);
                            i20Var.isClickable();
                            i20Var.f25562b.setOnClickListener(new g0(new fl(chatAttachAlertPhotoLayout, 5), 18));
                            i20Var.f25561a.setOnClickListener(new g0(new fl(chatAttachAlertPhotoLayout, 6), 19));
                            i20Var.f25563c.setOnClickListener(new w2(20, i20Var, new v2(this, 2)));
                            return new f2.l1(i20Var);
                        }
                        return new f2.l1(new View(context));
                    }
                    liVar.getClass();
                    return new f2.l1(new cm(this, context));
                }
                return new f2.l1(new eg.h0(this, context, 8));
            }
            ?? view = new View(context);
            view.setFocusable(true);
            view.f21323a = AndroidUtilities.dp(0.0f);
            return new f2.l1(view);
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            dl0 dl0Var = (dl0) arrayList.get(0);
            arrayList.remove(0);
            return dl0Var;
        }
        return L();
    }

    @Override
    public final void y(f2.l1 l1Var) {
        if (l1Var.f5774a instanceof org.telegram.ui.Cells.l5) {
            this.v.N.f();
        }
    }
}
