package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
public abstract class q7 extends FrameLayout implements org.telegram.ui.Components.ld0 {
    public final ArrayList f41086a;
    public final org.telegram.ui.Components.o91 f41087b;
    public final View f41088c;
    public final org.telegram.ui.ActionBar.m2 d;
    public final ArrayList f41089e;
    public zh.b f41090f;
    public final org.telegram.ui.Components.p91 h;
    public final p7[] f41091n;
    public f7 f41092r;
    public int f41093s;
    public g7 v;

    public q7(Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context);
        this.f41086a = new ArrayList();
        this.f41089e = new ArrayList();
        p7[] p7VarArr = new p7[5];
        this.f41091n = p7VarArr;
        this.d = m2Var;
        p7VarArr[0] = new p7(LocaleController.getString(R.string.FilterChats), 0, new h7(this));
        p7VarArr[1] = new p7(LocaleController.getString(R.string.MediaTab), 1, new m7(this));
        p7VarArr[2] = new p7(LocaleController.getString(R.string.SharedFilesTab2), 2, new j7(this));
        p7VarArr[3] = new p7(LocaleController.getString(R.string.Music), 3, new o7(this));
        int i10 = 0;
        while (true) {
            p7[] p7VarArr2 = this.f41091n;
            if (i10 < p7VarArr2.length) {
                p7 p7Var = p7VarArr2[i10];
                if (p7Var != null) {
                    this.f41089e.add(i10, p7Var);
                }
                i10++;
            } else {
                org.telegram.ui.Components.p91 p91Var = new org.telegram.ui.Components.p91(getContext(), null);
                this.h = p91Var;
                p91Var.setAllowDisallowInterceptTouch(false);
                addView(p91Var, w7.x5.a(-1.0f, 0.0f, 48.0f, 0.0f, 0.0f, -1, 0));
                org.telegram.ui.Components.o91 n10 = p91Var.n(3, true);
                this.f41087b = n10;
                addView(n10, w7.x5.d(48.0f, -1));
                View view = new View(getContext());
                this.f41088c = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20823d7, false));
                addView(view, w7.x5.a(1.0f, 0.0f, 48.0f, 0.0f, 0.0f, -1, 0));
                view.getLayoutParams().height = 1;
                p91Var.setAdapter(new c7(this, context, m2Var));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20822d6, false));
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                addView(linearLayout, w7.x5.d(48.0f, -1));
                AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(true);
                imageView.setImageDrawable(f2Var);
                int i11 = org.telegram.ui.ActionBar.h6.f21209y8;
                f2Var.a(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                int i12 = org.telegram.ui.ActionBar.h6.f21227z8;
                imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i12, false), 1, -1));
                imageView.setContentDescription(LocaleController.getString(R.string.Close));
                linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.f41086a.add(imageView);
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final q7 f44295b;

                    {
                        this.f44295b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                this.f44295b.v.g1();
                                return;
                            default:
                                this.f44295b.v.clear();
                                return;
                        }
                    }
                });
                org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, true, true, true);
                r6Var.setTextSize(AndroidUtilities.dp(18.0f));
                r6Var.setTypeface(AndroidUtilities.bold());
                r6Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                linearLayout.addView(r6Var, w7.x5.m(1.0f, 0, -1, 18, 0, 0));
                this.f41086a.add(r6Var);
                org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, org.telegram.ui.ActionBar.h6.x0(null, i12, false), org.telegram.ui.ActionBar.h6.x0(null, i11, false), false, null);
                u0Var.setIcon(R.drawable.msg_clear);
                u0Var.setContentDescription(LocaleController.getString(R.string.Delete));
                u0Var.setDuplicateParentStateEnabled(false);
                linearLayout.addView(u0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.f41086a.add(u0Var);
                u0Var.setOnClickListener(new View.OnClickListener(this) {
                    public final q7 f44295b;

                    {
                        this.f44295b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                this.f44295b.v.g1();
                                return;
                            default:
                                this.f44295b.v.clear();
                                return;
                        }
                    }
                });
                return;
            }
        }
    }

    public static void a(q7 q7Var, k7 k7Var, m7 m7Var, org.telegram.ui.Components.rm0 rm0Var) {
        ArrayList arrayList = m7Var.f36962e;
        PhotoViewer.t1().K2(null, q7Var.d, null);
        if (q7Var.f41092r == null) {
            q7Var.f41092r = new f7(q7Var);
        }
        q7Var.f41092r.f37593a = rm0Var;
        if (arrayList.indexOf(k7Var) >= 0) {
            PhotoViewer.t1().g2(m7Var.f39858r, arrayList.indexOf(k7Var), -1, false, q7Var.f41092r, null);
        }
    }

    public static void b(q7 q7Var, zh.a aVar, i7 i7Var) {
        org.telegram.ui.ActionBar.m2 m2Var = q7Var.d;
        org.telegram.ui.Components.rm0 rm0Var = (org.telegram.ui.Components.rm0) q7Var.h.getCurrentView();
        if (i7Var.f38634e == 2) {
            if (rm0Var.getAdapter() instanceof j7) {
                j7 j7Var = (j7) rm0Var.getAdapter();
                PhotoViewer.t1().K2(null, m2Var, null);
                if (q7Var.f41092r == null) {
                    q7Var.f41092r = new f7(q7Var);
                }
                q7Var.f41092r.f37593a = rm0Var;
                File file = aVar.f54815a;
                String lowerCase = file.getName().toLowerCase();
                if (!file.getName().endsWith("mp4") && !file.getName().endsWith(".jpg") && !lowerCase.endsWith(".jpeg") && !lowerCase.endsWith(".png") && !lowerCase.endsWith(".gif")) {
                    AndroidUtilities.openForView(file, file.getName(), null, m2Var.getParentActivity(), null, false);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String path = file.getPath();
                    boolean z10 = true;
                    if (aVar.d != 1) {
                        z10 = false;
                    }
                    arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z10, 0, 0, 0L));
                    PhotoViewer.t1().g2(arrayList, 0, -1, false, q7Var.f41092r, null);
                }
            } else {
                return;
            }
        }
        if (i7Var.f38634e == 3) {
            if (MediaController.getInstance().isPlayingMessage(aVar.f54819f)) {
                if (!MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().lambda$startAudioAgain$7(aVar.f54819f);
                    return;
                } else {
                    MediaController.getInstance().playMessage(aVar.f54819f);
                    return;
                }
            }
            MediaController.getInstance().playMessage(aVar.f54819f);
        }
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q7.c():void");
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.p91 p91Var = this.h;
            if (i10 < p91Var.getViewPages().length) {
                AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.rm0) p91Var.getViewPages()[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public org.telegram.ui.Components.rm0 getListView() {
        org.telegram.ui.Components.p91 p91Var = this.h;
        if (p91Var.getCurrentView() == null) {
            return null;
        }
        return (org.telegram.ui.Components.rm0) p91Var.getCurrentView();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public void setBottomPadding(int i10) {
        this.f41093s = i10;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.p91 p91Var = this.h;
            if (i11 < p91Var.getViewPages().length) {
                org.telegram.ui.Components.rm0 rm0Var = (org.telegram.ui.Components.rm0) p91Var.getViewPages()[i11];
                if (rm0Var != null) {
                    rm0Var.setPadding(0, 0, 0, i10);
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public void setCacheModel(zh.b bVar) {
        this.f41090f = bVar;
        c();
    }

    public void setDelegate(g7 g7Var) {
        this.v = g7Var;
    }
}
