package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.Switch;

public class DataAutoDownloadActivity extends org.telegram.ui.ActionBar.n2 {
    public final DownloadController.Preset A;
    public final DownloadController.Preset B;
    public final DownloadController.Preset C;
    public final DownloadController.Preset D;
    public boolean E;
    public final String F;
    public final String G;

    public au f35446a;
    private int autoDownloadRow;

    public org.telegram.ui.Components.zk0 f35447b;

    public final ArrayList f35448c;
    public int d;

    public int f35449e;

    public final int f35450f;
    private int filesRow;
    public boolean h;

    public int f35451n;
    private int photosRow;

    public int f35452r;

    public int f35453s;
    private int storiesRow;
    private int usageProgressRow;
    public int v;
    private int videosRow;

    public int f35454w;

    public int f35455x;

    public final DownloadController.Preset f35456y;

    public DataAutoDownloadActivity(int i10) {
        super(null);
        this.f35448c = new ArrayList();
        this.d = 1;
        this.f35450f = i10;
        DownloadController.Preset preset = DownloadController.getInstance(this.currentAccount).lowPreset;
        this.f35456y = preset;
        DownloadController.Preset preset2 = DownloadController.getInstance(this.currentAccount).mediumPreset;
        this.A = preset2;
        DownloadController.Preset preset3 = DownloadController.getInstance(this.currentAccount).highPreset;
        this.B = preset3;
        if (i10 == 0) {
            this.f35449e = DownloadController.getInstance(this.currentAccount).currentMobilePreset;
            this.C = DownloadController.getInstance(this.currentAccount).mobilePreset;
            this.D = preset2;
            this.F = "mobilePreset";
            this.G = "currentMobilePreset";
            return;
        }
        if (i10 == 1) {
            this.f35449e = DownloadController.getInstance(this.currentAccount).currentWifiPreset;
            this.C = DownloadController.getInstance(this.currentAccount).wifiPreset;
            this.D = preset3;
            this.F = "wifiPreset";
            this.G = "currentWifiPreset";
            return;
        }
        this.f35449e = DownloadController.getInstance(this.currentAccount).currentRoamingPreset;
        this.C = DownloadController.getInstance(this.currentAccount).roamingPreset;
        this.D = preset;
        this.F = "roamingPreset";
        this.G = "currentRoamingPreset";
    }

    public static void U(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.m8 m8Var, org.telegram.ui.Cells.m8[] m8VarArr, int i10, org.telegram.ui.Cells.a5[] a5VarArr, org.telegram.ui.Cells.p8[] p8VarArr, AnimatorSet[] animatorSetArr, View view) {
        if (view.isEnabled()) {
            boolean z10 = true;
            m8Var.setChecked(!m8Var.f24685b.h);
            int i11 = 0;
            while (true) {
                if (i11 >= m8VarArr.length) {
                    z10 = false;
                    break;
                } else if (m8VarArr[i11].f24685b.h) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i10 != dataAutoDownloadActivity.videosRow || a5VarArr[0].isEnabled() == z10) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            a5VarArr[0].a(arrayList, z10);
            if (a5VarArr[0].getSize() > 2097152) {
                p8VarArr[0].e(arrayList, z10);
            }
            AnimatorSet animatorSet = animatorSetArr[0];
            if (animatorSet != null) {
                animatorSet.cancel();
                animatorSetArr[0] = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[0] = animatorSet2;
            animatorSet2.playTogether(arrayList);
            animatorSetArr[0].addListener(new org.telegram.ui.Components.f11(animatorSetArr, 21));
            animatorSetArr[0].setDuration(150L);
            animatorSetArr[0].start();
        }
    }

    public static void V(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.m8[] m8VarArr, int i10, org.telegram.ui.Cells.a5[] a5VarArr, int i11, org.telegram.ui.Cells.p8[] p8VarArr, int i12, String str, String str2, org.telegram.ui.ActionBar.z2 z2Var, View view) {
        DownloadController.Preset preset = dataAutoDownloadActivity.C;
        int i13 = dataAutoDownloadActivity.f35449e;
        if (i13 != 3) {
            if (i13 == 0) {
                preset.set(dataAutoDownloadActivity.f35456y);
            } else if (i13 == 1) {
                preset.set(dataAutoDownloadActivity.A);
            } else if (i13 == 2) {
                preset.set(dataAutoDownloadActivity.B);
            }
        }
        for (int i14 = 0; i14 < 4; i14++) {
            if (m8VarArr[i14].f24685b.h) {
                int[] iArr = preset.mask;
                iArr[i14] = iArr[i14] | i10;
            } else {
                int[] iArr2 = preset.mask;
                iArr2[i14] = iArr2[i14] & (~i10);
            }
        }
        org.telegram.ui.Cells.a5 a5Var = a5VarArr[0];
        if (a5Var != null) {
            a5Var.getSize();
            preset.sizes[i11] = (int) a5VarArr[0].getSize();
        }
        org.telegram.ui.Cells.p8 p8Var = p8VarArr[0];
        if (p8Var != null) {
            Switch r10 = p8Var.f25003e;
            if (i12 == dataAutoDownloadActivity.videosRow) {
                preset.preloadVideo = r10.h;
            } else {
                preset.preloadMusic = r10.h;
            }
        }
        SharedPreferences.Editor editorEdit = MessagesController.getMainSettings(dataAutoDownloadActivity.currentAccount).edit();
        editorEdit.putString(str, preset.toString());
        dataAutoDownloadActivity.f35449e = 3;
        editorEdit.putInt(str2, 3);
        int i15 = dataAutoDownloadActivity.f35450f;
        if (i15 == 0) {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.f35449e;
        } else if (i15 == 1) {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.f35449e;
        } else {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.f35449e;
        }
        editorEdit.commit();
        z2Var.f23994a.dismissRunnable.run();
        f2.o1 o1VarG = dataAutoDownloadActivity.f35447b.G(view);
        if (o1VarG != null) {
            dataAutoDownloadActivity.h = true;
            dataAutoDownloadActivity.f35446a.v(o1VarG, i12);
            dataAutoDownloadActivity.h = false;
        }
        DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
        dataAutoDownloadActivity.E = true;
        dataAutoDownloadActivity.l0();
    }

    public static void W(final DataAutoDownloadActivity dataAutoDownloadActivity, final View view, int i10, float f10) {
        int i11;
        DownloadController.Preset currentRoamingPreset;
        String str;
        String str2;
        boolean z10;
        final org.telegram.ui.Cells.p8[] p8VarArr;
        ?? r12;
        ArrayList arrayList;
        org.telegram.ui.Cells.p8[] p8VarArr2;
        int i12 = i10;
        DownloadController.Preset preset = dataAutoDownloadActivity.B;
        DownloadController.Preset preset2 = dataAutoDownloadActivity.A;
        DownloadController.Preset preset3 = dataAutoDownloadActivity.f35456y;
        int i13 = dataAutoDownloadActivity.f35450f;
        DownloadController.Preset preset4 = dataAutoDownloadActivity.C;
        boolean z11 = false;
        if (i12 == dataAutoDownloadActivity.autoDownloadRow) {
            int i14 = dataAutoDownloadActivity.f35449e;
            if (i14 != 3) {
                if (i14 == 0) {
                    preset4.set(preset3);
                } else if (i14 == 1) {
                    preset4.set(preset2);
                } else if (i14 == 2) {
                    preset4.set(preset);
                }
            }
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            boolean z12 = p8Var.f25003e.h;
            if (z12 || !preset4.enabled) {
                preset4.enabled = !preset4.enabled;
            } else {
                System.arraycopy(dataAutoDownloadActivity.D.mask, 0, preset4.mask, 0, 4);
            }
            view.setTag(Integer.valueOf(preset4.enabled ? org.telegram.ui.ActionBar.g6.f23090f6 : org.telegram.ui.ActionBar.g6.f23072e6));
            boolean z13 = !z12;
            p8Var.b(org.telegram.ui.ActionBar.g6.w0(null, preset4.enabled ? org.telegram.ui.ActionBar.g6.f23090f6 : org.telegram.ui.ActionBar.g6.f23072e6, false), z13);
            dataAutoDownloadActivity.n0();
            if (preset4.enabled) {
                dataAutoDownloadActivity.f35446a.s(dataAutoDownloadActivity.f35451n + 1, 9);
            } else {
                dataAutoDownloadActivity.f35446a.t(dataAutoDownloadActivity.f35451n + 1, 9);
            }
            dataAutoDownloadActivity.f35446a.m(dataAutoDownloadActivity.f35451n);
            SharedPreferences.Editor editorEdit = MessagesController.getMainSettings(dataAutoDownloadActivity.currentAccount).edit();
            editorEdit.putString(dataAutoDownloadActivity.F, preset4.toString());
            String str3 = dataAutoDownloadActivity.G;
            dataAutoDownloadActivity.f35449e = 3;
            editorEdit.putInt(str3, 3);
            if (i13 == 0) {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.f35449e;
            } else if (i13 == 1) {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.f35449e;
            } else {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.f35449e;
            }
            editorEdit.commit();
            p8Var.setChecked(z13);
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
            dataAutoDownloadActivity.E = true;
            return;
        }
        if ((i12 == dataAutoDownloadActivity.photosRow || i12 == dataAutoDownloadActivity.videosRow || i12 == dataAutoDownloadActivity.filesRow || i12 == dataAutoDownloadActivity.storiesRow) && view.isEnabled()) {
            if (i12 == dataAutoDownloadActivity.photosRow) {
                i11 = 1;
            } else if (i12 == dataAutoDownloadActivity.videosRow) {
                i11 = 4;
            } else {
                i11 = i12 == dataAutoDownloadActivity.storiesRow ? -1 : 8;
            }
            final int iTypeToIndex = DownloadController.typeToIndex(i11);
            if (i13 == 0) {
                currentRoamingPreset = DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).getCurrentMobilePreset();
                str = "mobilePreset";
                str2 = "currentMobilePreset";
            } else if (i13 == 1) {
                currentRoamingPreset = DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).getCurrentWiFiPreset();
                str = "wifiPreset";
                str2 = "currentWifiPreset";
            } else {
                currentRoamingPreset = DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).getCurrentRoamingPreset();
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            org.telegram.ui.Cells.g5 g5Var = (org.telegram.ui.Cells.g5) view;
            boolean z14 = g5Var.f24392e.h;
            if (i12 == dataAutoDownloadActivity.storiesRow || ((LocaleController.isRTL && f10 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f10 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f)))) {
                DownloadController.Preset preset5 = currentRoamingPreset;
                int i15 = i11;
                String str4 = str;
                String str5 = str2;
                int i16 = dataAutoDownloadActivity.f35449e;
                if (i16 != 3) {
                    if (i16 == 0) {
                        preset4.set(preset3);
                    } else if (i16 == 1) {
                        preset4.set(preset2);
                    } else if (i16 == 2) {
                        preset4.set(preset);
                    }
                }
                if (i12 != dataAutoDownloadActivity.storiesRow) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= preset4.mask.length) {
                            z10 = false;
                            break;
                        } else {
                            if ((preset5.mask[i17] & i15) != 0) {
                                z10 = true;
                                break;
                            }
                            i17++;
                        }
                    }
                    int i18 = 0;
                    while (true) {
                        int[] iArr = preset4.mask;
                        if (i18 >= iArr.length) {
                            break;
                        }
                        if (z14) {
                            iArr[i18] = iArr[i18] & (~i15);
                        } else if (!z10) {
                            iArr[i18] = iArr[i18] | i15;
                        }
                        i18++;
                    }
                } else {
                    preset4.preloadStories = !z14;
                }
                SharedPreferences.Editor editorEdit2 = MessagesController.getMainSettings(dataAutoDownloadActivity.currentAccount).edit();
                editorEdit2.putString(str4, preset4.toString());
                dataAutoDownloadActivity.f35449e = 3;
                editorEdit2.putInt(str5, 3);
                if (i13 == 0) {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.f35449e;
                } else if (i13 == 1) {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.f35449e;
                } else {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.f35449e;
                }
                editorEdit2.commit();
                g5Var.setChecked(!z14);
                org.telegram.ui.Components.zk0 zk0Var = dataAutoDownloadActivity.f35447b;
                View viewF = zk0Var.F(view);
                f2.o1 o1VarT = viewF == null ? null : zk0Var.T(viewF);
                if (o1VarT != null) {
                    dataAutoDownloadActivity.f35446a.v(o1VarT, i12);
                }
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
                dataAutoDownloadActivity.E = true;
                dataAutoDownloadActivity.l0();
                return;
            }
            if (dataAutoDownloadActivity.getParentActivity() == null) {
                return;
            }
            final org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(dataAutoDownloadActivity.getParentActivity(), null);
            org.telegram.ui.ActionBar.e3 e3Var = z2Var.f23994a;
            e3Var.applyTopPadding = false;
            z2Var.a();
            LinearLayout linearLayout = new LinearLayout(dataAutoDownloadActivity.getParentActivity());
            linearLayout.setOrientation(1);
            z2Var.b(linearLayout);
            org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(dataAutoDownloadActivity.getParentActivity(), org.telegram.ui.ActionBar.g6.f23233n5, 21, 15, false, null);
            if (i12 == dataAutoDownloadActivity.photosRow) {
                j4Var.setText(LocaleController.getString(R.string.AutoDownloadPhotosTitle));
            } else if (i12 == dataAutoDownloadActivity.videosRow) {
                j4Var.setText(LocaleController.getString(R.string.AutoDownloadVideosTitle));
            } else {
                j4Var.setText(LocaleController.getString(R.string.AutoDownloadFilesTitle));
            }
            linearLayout.addView(j4Var, h7.z5.c(-2.0f, -1));
            org.telegram.ui.Cells.a5[] a5VarArr = new org.telegram.ui.Cells.a5[1];
            org.telegram.ui.Cells.p8[] p8VarArr3 = new org.telegram.ui.Cells.p8[1];
            AnimatorSet[] animatorSetArr = new AnimatorSet[1];
            int i19 = 4;
            org.telegram.ui.Cells.m8[] m8VarArr = new org.telegram.ui.Cells.m8[4];
            int i20 = 0;
            while (i20 < i19) {
                Activity parentActivity = dataAutoDownloadActivity.getParentActivity();
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(parentActivity);
                boolean z15 = LocaleController.isRTL;
                TextView textView = new TextView(parentActivity);
                m8Var.f24684a = textView;
                AnimatorSet[] animatorSetArr2 = animatorSetArr;
                org.telegram.ui.Cells.a5[] a5VarArr2 = a5VarArr;
                org.telegram.messenger.rl.p(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, z11), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                m8Var.addView(textView, h7.z5.d(-1, -1.0f, (z15 ? 5 : 3) | 48, z15 ? 66.0f : 21.0f, 0.0f, z15 ? 21.0f : 66.0f, 0.0f));
                CheckBoxSquare checkBoxSquare = new CheckBoxSquare(parentActivity, null, true);
                m8Var.f24685b = checkBoxSquare;
                checkBoxSquare.setDuplicateParentStateEnabled(false);
                checkBoxSquare.setFocusable(false);
                checkBoxSquare.setFocusableInTouchMode(false);
                checkBoxSquare.setClickable(false);
                m8Var.addView(checkBoxSquare, h7.z5.d(18, 18.0f, (z15 ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
                m8VarArr[i20] = m8Var;
                if (i20 == 0) {
                    m8Var.a(LocaleController.getString(R.string.AutodownloadContacts), (currentRoamingPreset.mask[0] & i11) != 0, true);
                } else if (i20 == 1) {
                    m8Var.a(LocaleController.getString(R.string.AutodownloadPrivateChats), (currentRoamingPreset.mask[1] & i11) != 0, true);
                } else if (i20 == 2) {
                    m8Var.a(LocaleController.getString(R.string.AutodownloadGroupChats), (currentRoamingPreset.mask[2] & i11) != 0, true);
                } else {
                    m8Var.a(LocaleController.getString(R.string.AutodownloadChannels), (currentRoamingPreset.mask[3] & i11) != 0, i12 != dataAutoDownloadActivity.photosRow);
                }
                m8VarArr[i20].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                org.telegram.ui.Cells.m8 m8Var2 = m8VarArr[i20];
                int i21 = i12;
                org.telegram.ui.Cells.m8[] m8VarArr2 = m8VarArr;
                hh.w8 w8Var = new hh.w8(dataAutoDownloadActivity, m8Var, m8VarArr2, i21, a5VarArr2, p8VarArr3, animatorSetArr2);
                i12 = i21;
                m8Var2.setOnClickListener(w8Var);
                linearLayout.addView(m8VarArr2[i20], h7.z5.c(50.0f, -1));
                i20++;
                m8VarArr = m8VarArr2;
                currentRoamingPreset = currentRoamingPreset;
                animatorSetArr = animatorSetArr2;
                a5VarArr = a5VarArr2;
                i19 = 4;
                z11 = false;
            }
            AnimatorSet[] animatorSetArr3 = animatorSetArr;
            final org.telegram.ui.Cells.a5[] a5VarArr3 = a5VarArr;
            DownloadController.Preset preset6 = currentRoamingPreset;
            final org.telegram.ui.Cells.m8[] m8VarArr3 = m8VarArr;
            if (i12 != dataAutoDownloadActivity.photosRow) {
                org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(dataAutoDownloadActivity.getParentActivity());
                yt ytVar = new yt(dataAutoDownloadActivity, dataAutoDownloadActivity.getParentActivity(), i12, x8Var, p8VarArr3, animatorSetArr3);
                a5VarArr3[0] = ytVar;
                ytVar.setSize(preset6.sizes[iTypeToIndex]);
                linearLayout.addView(a5VarArr3[0], h7.z5.n(-1, 50));
                View p8Var2 = new org.telegram.ui.Cells.p8(21, dataAutoDownloadActivity.getParentActivity(), null, true);
                p8VarArr2[0] = p8Var2;
                linearLayout.addView(p8Var2, h7.z5.n(-1, 48));
                p8VarArr2[0].setOnClickListener(new a(p8VarArr2, 16));
                x8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
                linearLayout.addView(x8Var, h7.z5.n(-1, -2));
                if (i12 == dataAutoDownloadActivity.videosRow) {
                    p8VarArr2 = p8VarArr3;
                    a5VarArr3[0].setText(LocaleController.getString(R.string.AutoDownloadMaxVideoSize));
                    p8VarArr2[0].f(LocaleController.getString(R.string.AutoDownloadPreloadVideo), preset6.preloadVideo, false);
                    x8Var.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(preset6.sizes[iTypeToIndex])));
                    p8VarArr = p8VarArr2;
                } else {
                    p8VarArr2 = p8VarArr3;
                    a5VarArr3[0].setText(LocaleController.getString(R.string.AutoDownloadMaxFileSize));
                    p8VarArr2[0].f(LocaleController.getString(R.string.AutoDownloadPreloadMusic), preset6.preloadMusic, false);
                    x8Var.setText(LocaleController.getString(R.string.AutoDownloadPreloadMusicInfo));
                    p8VarArr = p8VarArr2;
                }
            } else {
                a5VarArr3[0] = null;
                p8VarArr3[0] = null;
                View view2 = new View(dataAutoDownloadActivity.getParentActivity());
                view2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23054d7, false));
                linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 1));
                p8VarArr = p8VarArr3;
            }
            if (i12 == dataAutoDownloadActivity.videosRow) {
                int i22 = 0;
                while (true) {
                    if (i22 >= 4) {
                        r12 = 0;
                        arrayList = null;
                        a5VarArr3[0].a(null, false);
                        p8VarArr[0].e(null, false);
                        break;
                    }
                    if (m8VarArr3[i22].f24685b.h) {
                        arrayList = null;
                        r12 = 0;
                        break;
                    }
                    i22++;
                }
                if (preset6.sizes[iTypeToIndex] <= 2097152) {
                    p8VarArr[r12].e(arrayList, r12);
                }
            }
            FrameLayout frameLayout = new FrameLayout(dataAutoDownloadActivity.getParentActivity());
            frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            linearLayout.addView(frameLayout, h7.z5.n(-1, 52));
            TextView textView2 = new TextView(dataAutoDownloadActivity.getParentActivity());
            textView2.setTextSize(1, 14.0f);
            int i23 = org.telegram.ui.ActionBar.g6.f23233n5;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i23, false));
            textView2.setGravity(17);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
            textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(textView2, h7.z5.e(-2, 36, 51));
            textView2.setOnClickListener(new a(z2Var, 17));
            TextView textView3 = new TextView(dataAutoDownloadActivity.getParentActivity());
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i23, false));
            textView3.setGravity(17);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.Save).toUpperCase());
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(textView3, h7.z5.e(-2, 36, 53));
            final String str6 = str;
            final String str7 = str2;
            final int i24 = i12;
            final int i25 = i11;
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    DataAutoDownloadActivity.V(this.f44607a, m8VarArr3, i25, a5VarArr3, iTypeToIndex, p8VarArr, i24, str6, str7, z2Var, view);
                }
            });
            dataAutoDownloadActivity.showDialog(e3Var);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.f35450f;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnMobileData));
        } else if (i10 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnWiFiData));
        } else if (i10 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnRoamingData));
        }
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new zp(this, 13));
        this.f35446a = new au(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.f35447b = zk0Var;
        zk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f35447b);
        this.f35447b.setVerticalScrollBarEnabled(false);
        ((f2.l) this.f35447b.getItemAnimator()).C = false;
        this.f35447b.setLayoutManager(new f2.k0(1, false));
        frameLayout2.addView(this.f35447b, h7.z5.e(-1, -1, 51));
        this.f35447b.setAdapter(this.f35446a);
        this.f35447b.setOnItemClickListener(new c1(this, 29));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35447b, 16, new Class[]{org.telegram.ui.Cells.j4.class, org.telegram.ui.Cells.g5.class, org.telegram.ui.Components.dv0.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35447b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35447b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35447b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35447b, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35447b, 262160, new Class[]{org.telegram.ui.Cells.p8.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23090f6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35447b, 262160, new Class[]{org.telegram.ui.Cells.p8.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23072e6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35447b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23108g6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35447b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.O6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35447b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.P6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35447b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Q6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35447b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.R6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35447b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.S6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35447b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.T6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35447b, 0, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35447b, 0, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23441z6));
        int i10 = org.telegram.ui.ActionBar.g6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35447b, 0, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"checkBox"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35447b, 0, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"checkBox"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35447b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35447b, 0, new Class[]{org.telegram.ui.Components.dv0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35447b, 0, new Class[]{org.telegram.ui.Components.dv0.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35447b, 0, new Class[]{org.telegram.ui.Components.dv0.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23423y6));
        return arrayList;
    }

    public final void l0() {
        ArrayList arrayList = this.f35448c;
        arrayList.clear();
        DownloadController.Preset preset = this.f35456y;
        arrayList.add(preset);
        DownloadController.Preset preset2 = this.A;
        arrayList.add(preset2);
        DownloadController.Preset preset3 = this.B;
        arrayList.add(preset3);
        DownloadController.Preset preset4 = this.C;
        if (!preset4.equals(preset) && !preset4.equals(preset2) && !preset4.equals(preset3)) {
            arrayList.add(preset4);
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.lp0(3));
        int i10 = this.f35449e;
        if (i10 == 0 || (i10 == 3 && preset4.equals(preset))) {
            this.d = arrayList.indexOf(preset);
        } else {
            int i11 = this.f35449e;
            if (i11 == 1 || (i11 == 3 && preset4.equals(preset2))) {
                this.d = arrayList.indexOf(preset2);
            } else {
                int i12 = this.f35449e;
                if (i12 == 2 || (i12 == 3 && preset4.equals(preset3))) {
                    this.d = arrayList.indexOf(preset3);
                } else {
                    this.d = arrayList.indexOf(preset4);
                }
            }
        }
        org.telegram.ui.Components.zk0 zk0Var = this.f35447b;
        if (zk0Var != null) {
            f2.o1 o1VarK = zk0Var.K(this.usageProgressRow);
            if (o1VarK != null) {
                View view = o1VarK.f5789a;
                if (view instanceof org.telegram.ui.Components.dv0) {
                    m0((org.telegram.ui.Components.dv0) view);
                    return;
                }
            }
            this.f35446a.m(this.usageProgressRow);
        }
    }

    public final void m0(org.telegram.ui.Components.dv0 dv0Var) {
        ArrayList arrayList = this.f35448c;
        String[] strArr = new String[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            DownloadController.Preset preset = (DownloadController.Preset) arrayList.get(i10);
            if (preset == this.f35456y) {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadLow);
            } else if (preset == this.A) {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadMedium);
            } else if (preset == this.B) {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadHigh);
            } else {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadCustom);
            }
        }
        dv0Var.b(this.d, null, strArr);
    }

    public final void n0() {
        this.autoDownloadRow = 0;
        int i10 = 1 + 1;
        this.f35455x = i10;
        this.f35451n = 1;
        if (!this.C.enabled) {
            this.f35452r = -1;
            this.usageProgressRow = -1;
            this.f35453s = -1;
            this.v = -1;
            this.photosRow = -1;
            this.videosRow = -1;
            this.filesRow = -1;
            this.storiesRow = -1;
            this.f35454w = -1;
            return;
        }
        this.f35452r = i10;
        this.usageProgressRow = i10 + 1;
        this.f35453s = i10 + 2;
        this.v = i10 + 3;
        this.photosRow = i10 + 4;
        this.videosRow = i10 + 5;
        this.filesRow = i10 + 6;
        this.storiesRow = i10 + 7;
        this.f35455x = i10 + 9;
        this.f35454w = i10 + 8;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        l0();
        n0();
        return true;
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.E) {
            DownloadController.getInstance(this.currentAccount).savePresetToServer(this.f35450f);
            this.E = false;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        au auVar = this.f35446a;
        if (auVar != null) {
            auVar.l();
        }
    }
}
