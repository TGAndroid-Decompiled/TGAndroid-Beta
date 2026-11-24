package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class d0 extends q59 {
    public final Context c;
    public boolean d = true;
    public final ThemeActivity e;

    public d0(ThemeActivity themeActivity, Context context) {
        this.e = themeActivity;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        if (i == 0 || i == 1 || i == 4 || i == 7 || i == 10 || i == 11 || i == 12 || i == 14 || i == 18 || i == 20 || i == 21) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.e.L0;
    }

    @Override
    public final int d(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ThemeActivity themeActivity = this.e;
        if (i != themeActivity.b0 && i != themeActivity.L && i != themeActivity.c0 && i != themeActivity.Z && i != themeActivity.Q && i != themeActivity.R && i != themeActivity.N && i != themeActivity.M) {
            if (i != themeActivity.g0 && i != themeActivity.a0 && i != themeActivity.w0 && i != themeActivity.C0 && i != themeActivity.I0) {
                if (i != themeActivity.s0 && i != themeActivity.W && i != themeActivity.d0 && i != themeActivity.P && i != themeActivity.i0 && i != themeActivity.o0 && i != themeActivity.l0 && i != themeActivity.K && i != themeActivity.K0 && i != themeActivity.A0 && i != themeActivity.D0 && i != themeActivity.E0 && i != themeActivity.F0) {
                    if (i != themeActivity.S && i != themeActivity.T && i != themeActivity.U && i != themeActivity.V) {
                        if (i != themeActivity.X && i != themeActivity.e0 && i != themeActivity.h0 && i != themeActivity.y && i != themeActivity.j0 && i != themeActivity.x && i != themeActivity.m0 && i != themeActivity.k0 && i != themeActivity.u0 && i != themeActivity.x0 && i != themeActivity.J0 && i != themeActivity.G0 && i != themeActivity.H0) {
                            if (i == themeActivity.f0) {
                                return 6;
                            }
                            if (i != themeActivity.Y && i != themeActivity.H && i != themeActivity.F) {
                                i2 = themeActivity.raiseToListenRow;
                                if (i != i2) {
                                    i3 = themeActivity.pauseOnRecordRow;
                                    if (i != i3 && i != themeActivity.E && i != themeActivity.t0) {
                                        i4 = themeActivity.pauseOnMediaRow;
                                        if (i != i4 && i != themeActivity.G) {
                                            i5 = themeActivity.sensitiveContentRow;
                                            if (i != i5) {
                                                i6 = themeActivity.textSizeRow;
                                                if (i == i6) {
                                                    return 8;
                                                }
                                                if (i != themeActivity.n0) {
                                                    i7 = themeActivity.nightThemeRow;
                                                    if (i != i7) {
                                                        i8 = themeActivity.browserRow;
                                                        if (i != i8) {
                                                            if (i == themeActivity.p0) {
                                                                return 11;
                                                            }
                                                            if (i != themeActivity.r0) {
                                                                i9 = themeActivity.bubbleRadiusRow;
                                                                if (i != i9) {
                                                                    i10 = themeActivity.backgroundRow;
                                                                    if (i != i10 && i != themeActivity.z0) {
                                                                        i11 = themeActivity.createNewThemeRow;
                                                                        if (i != i11) {
                                                                            i12 = themeActivity.liteModeRow;
                                                                            if (i != i12) {
                                                                                i13 = themeActivity.stickersRow;
                                                                                if (i != i13 && i != themeActivity.B0) {
                                                                                    if (i == themeActivity.v0) {
                                                                                        return 15;
                                                                                    }
                                                                                    if (i == themeActivity.y0) {
                                                                                        return 16;
                                                                                    }
                                                                                    if (i == themeActivity.q0) {
                                                                                        return 17;
                                                                                    }
                                                                                    if (i != themeActivity.I && i != themeActivity.J) {
                                                                                        i14 = themeActivity.appIconSelectorRow;
                                                                                        if (i != i14) {
                                                                                            i15 = themeActivity.changeUserColor;
                                                                                            if (i == i15) {
                                                                                                return 21;
                                                                                            }
                                                                                            return 1;
                                                                                        }
                                                                                        return 20;
                                                                                    }
                                                                                    return 19;
                                                                                }
                                                                                return 14;
                                                                            }
                                                                            return 14;
                                                                        }
                                                                        return 14;
                                                                    }
                                                                    return 14;
                                                                }
                                                                return 13;
                                                            }
                                                            return 12;
                                                        }
                                                        return 10;
                                                    }
                                                    return 10;
                                                }
                                                return 9;
                                            }
                                            return 7;
                                        }
                                        return 7;
                                    }
                                    return 7;
                                }
                                return 7;
                            }
                            return 7;
                        }
                        return 5;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        int i2;
        int i3;
        String M0;
        String M02;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String M03;
        String M04;
        int i15 = u69Var.f;
        View view = u69Var.a;
        ThemeActivity themeActivity = this.e;
        boolean z2 = false;
        boolean z3 = true;
        if (i15 != 1) {
            if (i15 != 2) {
                if (i15 != 4) {
                    if (i15 != 5) {
                        if (i15 != 6) {
                            if (i15 != 7) {
                                if (i15 != 14) {
                                    if (i15 != 17) {
                                        if (i15 != 19) {
                                            if (i15 != 21) {
                                                switch (i15) {
                                                    case 10:
                                                        yn7 yn7Var = (yn7) view;
                                                        i13 = themeActivity.nightThemeRow;
                                                        if (i != i13) {
                                                            i14 = themeActivity.browserRow;
                                                            if (i == i14) {
                                                                yn7Var.b(jb6.M0(2131748966, null), jb6.M0(2131748965, null), 2131232035, themeActivity.getMessagesController().O2(), 0, false, true, false);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        if (cmb.o != 0) {
                                                            z2 = true;
                                                        }
                                                        if (z2) {
                                                            M03 = cmb.A0();
                                                        } else {
                                                            M03 = jb6.M0(2131753748, "AutoNightThemeOff");
                                                        }
                                                        if (z2) {
                                                            int i16 = cmb.o;
                                                            if (i16 == 1) {
                                                                M04 = jb6.M0(2131753752, "AutoNightScheduled");
                                                            } else if (i16 == 3) {
                                                                M04 = jb6.M0(2131753751, "AutoNightSystemDefault");
                                                            } else {
                                                                M04 = jb6.M0(2131753761, "AutoNightAdaptive");
                                                            }
                                                            M03 = kt6.o(M04, " ", M03);
                                                        }
                                                        yn7Var.b(jb6.M0(2131753749, "AutoNightTheme"), M03, 2131231848, z2, 0, false, true, false);
                                                        return;
                                                    case 11:
                                                        if (this.d) {
                                                            themeActivity.c.A1(themeActivity.b.getMeasuredWidth());
                                                            this.d = false;
                                                            return;
                                                        }
                                                        return;
                                                    case 12:
                                                        r59 r59Var = (r59) view;
                                                        e0 e0Var = (e0) r59Var.getAdapter();
                                                        e0Var.f();
                                                        int indexOf = e0Var.e.indexOf(e0Var.d.i(false));
                                                        if (indexOf == -1) {
                                                            indexOf = e0Var.b() - 1;
                                                        }
                                                        if (indexOf != -1) {
                                                            ((u46) r59Var.getLayoutManager()).g1(indexOf, (themeActivity.b.getMeasuredWidth() / 2) - gm.L(42.0f));
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        return;
                                                }
                                            }
                                            ((g28) view).set(themeActivity.getUserConfig().f());
                                            return;
                                        }
                                        v09 v09Var = (v09) view;
                                        if (i == themeActivity.I) {
                                            v09Var.b("save media only from peer chats", "", true, false);
                                            return;
                                        } else {
                                            v09Var.b("save media from all chats", "", true, false);
                                            return;
                                        }
                                    }
                                    ((ud3) view).a();
                                    return;
                                }
                                xib xibVar = (xib) view;
                                xibVar.w = (byte) 48;
                                i8 = themeActivity.backgroundRow;
                                if (i == i8) {
                                    xibVar.setSubtitle(null);
                                    int i17 = cmb.p6;
                                    xibVar.g(i17, i17);
                                    String M05 = jb6.M0(2131752503, null);
                                    i12 = themeActivity.changeUserColor;
                                    if (i12 >= 0) {
                                        z2 = true;
                                    }
                                    xibVar.o(2131232072, M05, z2);
                                    return;
                                } else if (i != themeActivity.z0) {
                                    i9 = themeActivity.createNewThemeRow;
                                    if (i != i9) {
                                        i10 = themeActivity.liteModeRow;
                                        if (i != i10) {
                                            i11 = themeActivity.stickersRow;
                                            if (i == i11) {
                                                xibVar.g(cmb.I5, cmb.F6);
                                                xibVar.o(2131232044, jb6.M0(2131744546, null), true);
                                                xibVar.setSubtitle(jb6.M0(2131744545, null));
                                                xibVar.s = 64;
                                                xibVar.w = (byte) 60;
                                                xibVar.x = 20;
                                                return;
                                            } else if (i == themeActivity.B0) {
                                                xibVar.g(cmb.I5, cmb.F6);
                                                xibVar.o(2131232043, jb6.M0(2131744965, null), false);
                                                xibVar.setSubtitle(jb6.M0(2131744966, null));
                                                xibVar.s = 64;
                                                xibVar.w = (byte) 60;
                                                xibVar.x = 20;
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        xibVar.g(cmb.I5, cmb.F6);
                                        xibVar.o(2131232020, jb6.M0(2131748623, null), true);
                                        xibVar.setSubtitle(jb6.M0(2131748622, null));
                                        xibVar.w = (byte) 60;
                                        xibVar.s = 64;
                                        xibVar.x = 20;
                                        return;
                                    }
                                    xibVar.setSubtitle(null);
                                    int i18 = cmb.p6;
                                    xibVar.g(i18, i18);
                                    xibVar.o(2131232103, jb6.M0(2131751649, null), false);
                                    return;
                                } else {
                                    xibVar.setSubtitle(null);
                                    int i19 = cmb.p6;
                                    xibVar.g(i19, i19);
                                    xibVar.o(2131232406, jb6.M0(2131751218, null), true);
                                    return;
                                }
                            }
                            bjb bjbVar = (bjb) view;
                            if (i == themeActivity.Y) {
                                bjbVar.f(jb6.M0(2131753756, "AutoNightLocation"), cmb.p, true);
                                return;
                            } else if (i == themeActivity.O) {
                                bjbVar.f(jb6.M0(2131751094, "EnableAnimations"), oc7.d1().getBoolean("view_animations", true), true);
                                return;
                            } else if (i == themeActivity.H) {
                                bjbVar.f(jb6.M0(2131745366, "SendByEnter"), oc7.d1().getBoolean("send_by_enter", false), true);
                                return;
                            } else if (i != themeActivity.F) {
                                i4 = themeActivity.raiseToListenRow;
                                if (i == i4) {
                                    bjbVar.g(jb6.M0(2131746160, "RaiseToListen"), jb6.M0(2131746159, "RaiseToListenInfo"), gda.p0, true, true);
                                    return;
                                } else if (i != themeActivity.G) {
                                    i5 = themeActivity.pauseOnRecordRow;
                                    if (i != i5) {
                                        i6 = themeActivity.pauseOnMediaRow;
                                        if (i == i6) {
                                            bjbVar.f(jb6.M0(2131747165, null), gda.C0, true);
                                            return;
                                        } else if (i != themeActivity.E) {
                                            i7 = themeActivity.sensitiveContentRow;
                                            if (i == i7) {
                                                bjbVar.g(jb6.M0(2131745064, null), jb6.M0(2131745063, null), themeActivity.getMessagesController().a5(), true, true);
                                                return;
                                            } else if (i == themeActivity.t0) {
                                                bjbVar.f(jb6.M0(2131753640, "BlurInChat"), gda.f(), true);
                                                return;
                                            } else {
                                                return;
                                            }
                                        } else {
                                            bjbVar.g(jb6.M0(2131751375, "DirectShare"), jb6.M0(2131751374, "DirectShareInfo"), gda.u0, false, true);
                                            return;
                                        }
                                    }
                                    bjbVar.g(jb6.M0(2131747164, null), jb6.M0(2131747163, "PauseMusicOnRecordInfo"), gda.B0, true, true);
                                    return;
                                } else {
                                    bjbVar.g(jb6.M0(2131747983, "NextMediaTap"), jb6.M0(2131747982, "NextMediaTapInfo"), gda.q0, true, true);
                                    return;
                                }
                            } else {
                                bjbVar.g(jb6.M0(2131746158, "RaiseToSpeak"), jb6.M0(2131746157, "RaiseToSpeakInfo"), gda.o0, true, true);
                                return;
                            }
                        }
                        ((b01) view).setProgress(cmb.q);
                        return;
                    }
                    jf5 jf5Var = (jf5) view;
                    if (i == themeActivity.X) {
                        jf5Var.setText(jb6.M0(2131753753, "AutoNightSchedule"));
                        return;
                    } else if (i == themeActivity.e0) {
                        jf5Var.setText(jb6.M0(2131753760, "AutoNightBrightness"));
                        return;
                    } else if (i == themeActivity.h0) {
                        jf5Var.setText(jb6.M0(2131753754, "AutoNightPreferred"));
                        return;
                    } else if (i == themeActivity.y) {
                        jf5Var.setText(jb6.M0(2131745717, "SETTINGS"));
                        return;
                    } else if (i == themeActivity.j0) {
                        if (themeActivity.f == 3) {
                            jf5Var.setText(jb6.M0(2131752792, "BuildMyOwnTheme"));
                            return;
                        } else {
                            jf5Var.setText(jb6.M0(2131751948, "ColorTheme"));
                            return;
                        }
                    } else if (i == themeActivity.x) {
                        jf5Var.setText(jb6.M0(2131743876, "TextSizeHeader"));
                        return;
                    } else if (i == themeActivity.m0) {
                        jf5Var.setText(jb6.M0(2131752162, "ChatList"));
                        return;
                    } else if (i == themeActivity.k0) {
                        jf5Var.setText(jb6.M0(2131752793, "BubbleRadius"));
                        return;
                    } else if (i == themeActivity.u0) {
                        jf5Var.setText(jb6.M0(2131752159, "ChatListSwipeGesture"));
                        return;
                    } else if (i == themeActivity.x0) {
                        jf5Var.setText(jb6.M0(2131745385, "SelectTheme"));
                        return;
                    } else if (i == themeActivity.J0) {
                        jf5Var.setText(jb6.M0(2131754205, null));
                        return;
                    } else if (i == themeActivity.H0) {
                        jf5Var.setText(jb6.M0(2131747498, "OtherSettings"));
                        return;
                    } else if (i == themeActivity.G0) {
                        jf5Var.setText(jb6.M0(2131748417, "MediaAndSoundSettings"));
                        return;
                    } else {
                        return;
                    }
                }
                cpb cpbVar = (cpb) view;
                if (i == themeActivity.S) {
                    String M06 = jb6.M0(2131753758, "AutoNightDisabled");
                    if (cmb.o == 0) {
                        z2 = true;
                    }
                    cpbVar.a(M06, z2, true);
                    return;
                } else if (i == themeActivity.T) {
                    String M07 = jb6.M0(2131753752, "AutoNightScheduled");
                    if (cmb.o == 1) {
                        z2 = true;
                    }
                    cpbVar.a(M07, z2, true);
                    return;
                } else if (i == themeActivity.U) {
                    String M08 = jb6.M0(2131753761, "AutoNightAdaptive");
                    if (cmb.o == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (themeActivity.V != -1) {
                        z2 = true;
                    }
                    cpbVar.a(M08, z, z2);
                    return;
                } else if (i == themeActivity.V) {
                    String M09 = jb6.M0(2131753751, "AutoNightSystemDefault");
                    if (cmb.o != 3) {
                        z3 = false;
                    }
                    cpbVar.a(M09, z3, false);
                    return;
                } else {
                    return;
                }
            }
            njb njbVar = (njb) view;
            njbVar.setFixedSize(0);
            if (i == themeActivity.g0) {
                njbVar.setText(jb6.a0("AutoNightBrightnessInfo", null, 2131753759, Integer.valueOf((int) (cmb.q * 100.0f))));
                return;
            } else if (i == themeActivity.a0) {
                njbVar.setText(ThemeActivity.x0());
                return;
            } else if (i == themeActivity.w0) {
                njbVar.setText(jb6.M0(2131752158, "ChatListSwipeGestureInfo"));
                return;
            } else if (i == themeActivity.I0) {
                njbVar.setText(jb6.M0(2131748622, "LiteModeInfo"));
                return;
            } else {
                njbVar.setFixedSize(12);
                njbVar.setText("");
                return;
            }
        }
        vkb vkbVar = (vkb) view;
        i2 = themeActivity.nightThemeRow;
        if (i == i2) {
            if (cmb.o != 0 && cmb.J != null) {
                vkbVar.c(jb6.M0(2131753749, null), cmb.A0(), false, false);
            } else {
                vkbVar.c(jb6.M0(2131753749, null), jb6.M0(2131753748, null), false, false);
            }
        } else if (i == themeActivity.b0) {
            int i20 = cmb.r;
            int i21 = i20 / 60;
            vkbVar.c(jb6.M0(2131753757, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i21), Integer.valueOf(i20 - (i21 * 60))), false, true);
        } else if (i == themeActivity.c0) {
            int i22 = cmb.s;
            int i23 = i22 / 60;
            vkbVar.c(jb6.M0(2131753747, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i23), Integer.valueOf(i22 - (i23 * 60))), false, false);
        } else if (i == themeActivity.Z) {
            vkbVar.c(jb6.M0(2131753746, "AutoNightUpdateLocation"), cmb.w, false, false);
        } else if (i == themeActivity.R) {
            int i24 = oc7.d1().getInt("sortContactsBy", 0);
            if (i24 == 0) {
                M02 = jb6.M0(2131751537, "Default");
            } else if (i24 == 1) {
                M02 = jb6.M0(2131745021, "FirstName");
            } else {
                M02 = jb6.M0(2131745020, "LastName");
            }
            vkbVar.c(jb6.M0(2131745025, "SortBy"), M02, false, true);
        } else if (i == themeActivity.Q) {
            vkbVar.b(jb6.M0(2131749021, "ImportContacts"), true);
        } else if (i == themeActivity.L) {
            int i25 = gda.o1;
            if (i25 == 0) {
                M0 = jb6.M0(2131751303, "DistanceUnitsAutomatic");
            } else if (i25 == 1) {
                M0 = jb6.M0(2131751302, "DistanceUnitsKilometers");
            } else {
                M0 = jb6.M0(2131751301, "DistanceUnitsMiles");
            }
            String M010 = jb6.M0(2131751304, "DistanceUnits");
            boolean z4 = themeActivity.Q0;
            if (themeActivity.F0 < 0) {
                z3 = false;
            }
            vkbVar.c(M010, M0, z4, z3);
            themeActivity.Q0 = false;
        } else if (i == themeActivity.M) {
            vkbVar.c(jb6.M0(2131745533, null), ku9.a().a, themeActivity.R0, false);
        } else if (i == themeActivity.N) {
            String M011 = jb6.M0(2131748196, null);
            if (gda.r0) {
                i3 = 2131748194;
            } else {
                i3 = 2131748195;
            }
            vkbVar.c(M011, jb6.M0(i3, null), themeActivity.P0, false);
            themeActivity.P0 = false;
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        ?? frameLayout;
        int i2;
        int i3;
        float f;
        smb smbVar;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        int i6;
        tk5 tk5Var;
        int i7;
        int i8;
        int i9 = 3;
        float f2 = 21.0f;
        ThemeActivity themeActivity = this.e;
        Context context = this.c;
        switch (i) {
            case 1:
                smbVar = new vkb(context);
                break;
            case 2:
                smbVar = new njb(context);
                break;
            case 3:
                smbVar = new bba(context, (hg9) null);
                break;
            case 4:
                frameLayout = new FrameLayout(context);
                frameLayout.setWillNotDraw(false);
                TextView textView = new TextView(context);
                frameLayout.a = textView;
                anb.X(textView, cmb.F6, null);
                wi8.w(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                if (jb6.a0) {
                    i2 = 5;
                } else {
                    i2 = 3;
                }
                textView.setGravity(i2 | 16);
                boolean z3 = jb6.a0;
                if (z3) {
                    i3 = 5;
                } else {
                    i3 = 3;
                }
                int i10 = i3 | 48;
                if (z3) {
                    f = 71.0f;
                } else {
                    f = 21.0f;
                }
                if (!z3) {
                    f2 = 23.0f;
                }
                frameLayout.addView(textView, qoe.d(-1, -1.0f, i10, f, 0.0f, f2, 0.0f));
                ImageView imageView = new ImageView(context);
                frameLayout.b = imageView;
                anb.s(imageView, cmb.Ci, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(2131232772);
                if (!jb6.a0) {
                    i9 = 5;
                }
                frameLayout.addView(imageView, qoe.d(19, 14.0f, i9 | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                smbVar = frameLayout;
                break;
            case 5:
                smbVar = new jf5(context);
                break;
            case 6:
                smbVar = new pmb(this, context);
                break;
            case 7:
                smbVar = new bjb(context);
                break;
            case 8:
                smbVar = new tmb(themeActivity, context);
                break;
            case 9:
                frameLayout = new qmb(context, (byte) 0);
                frameLayout.b = new kb2[2];
                frameLayout.setOrientation(0);
                frameLayout.setPadding(gm.L(21.0f), gm.L(10.0f), gm.L(21.0f), 0);
                int i11 = 0;
                while (true) {
                    kb2[] kb2VarArr = (kb2[]) frameLayout.b;
                    if (i11 < kb2VarArr.length) {
                        if (i11 == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        kb2 kb2Var = new kb2(context, (byte) 0);
                        kb2Var.b = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        kb2Var.e = textPaint;
                        kb2Var.setWillNotDraw(false);
                        kb2Var.c = z;
                        if (z) {
                            i4 = 2131752160;
                        } else {
                            i4 = 2131752161;
                        }
                        kb2Var.setContentDescription(jb6.M0(i4, null));
                        textPaint.setTextSize(gm.L(13.0f));
                        jb2 jb2Var = new jb2(kb2Var, context);
                        kb2Var.d = jb2Var;
                        jb2Var.setSize(gm.L(20.0f));
                        kb2Var.addView(jb2Var, qoe.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        boolean z4 = gda.l1;
                        if (!z ? !z4 : z4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        jb2Var.a(z2, false);
                        kb2VarArr[i11] = kb2Var;
                        kb2 kb2Var2 = ((kb2[]) frameLayout.b)[i11];
                        if (i11 == 1) {
                            i5 = 10;
                        } else {
                            i5 = 0;
                        }
                        frameLayout.addView(kb2Var2, qoe.m(0.5f, -1, -1, i5, 0, 0));
                        ((kb2[]) frameLayout.b)[i11].setOnClickListener(new v6((byte) 3, frameLayout, z));
                        i11++;
                    } else {
                        smbVar = frameLayout;
                        break;
                    }
                }
            case 10:
                smbVar = new yn7(this.c, 21, 60, true, null);
                break;
            case 11:
                this.d = true;
                rmb rmbVar = new rmb(this, this.c, themeActivity, themeActivity.f, themeActivity.e, themeActivity.d);
                themeActivity.c = rmbVar;
                rmbVar.setDrawDivider(themeActivity.w);
                themeActivity.c.setFocusable(false);
                View view = themeActivity.c;
                view.setLayoutParams(new g69(-1, gm.L(148.0f)));
                smbVar = view;
                break;
            case 12:
                final smb smbVar2 = new smb(context, null, (byte) 0);
                smbVar2.setFocusable(false);
                smbVar2.setItemAnimator(null);
                smbVar2.setLayoutAnimation(null);
                smbVar2.setPadding(gm.L(11.0f), 0, gm.L(11.0f), 0);
                smbVar2.setClipToPadding(false);
                u46 u46Var = new u46();
                u46Var.i1(0);
                smbVar2.setLayoutManager(u46Var);
                final e0 e0Var = new e0(themeActivity, context);
                smbVar2.setAdapter(e0Var);
                smbVar2.setOnItemClickListener(new f59() {
                    @Override
                    public final void g(int i12, View view2) {
                        bmb B0;
                        boolean z5;
                        boolean z6;
                        boolean z7;
                        boolean z8;
                        ThemeActivity themeActivity2 = d0.this.e;
                        byte b = themeActivity2.f;
                        if (b == 1) {
                            B0 = cmb.J;
                        } else {
                            B0 = cmb.B0();
                        }
                        bmb bmbVar = B0;
                        e0 e0Var2 = e0Var;
                        if (i12 == e0Var2.b() - 1) {
                            if (b == 1) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            themeActivity2.presentFragment(new rob(bmbVar, false, 1, false, z8));
                        } else {
                            amb ambVar = (amb) e0Var2.e.get(i12);
                            int i13 = bmbVar.Z;
                            int i14 = ambVar.a;
                            if (i13 != i14) {
                                if (b == 1) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                cmb.I1(bmbVar, z7, i14, view2);
                                tz3.q(bmbVar, ambVar.a);
                                cmb.K1(themeActivity2);
                            } else {
                                if (i14 >= 100) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (b == 1) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                themeActivity2.presentFragment(new rob(bmbVar, false, 1, z5, z6));
                            }
                        }
                        int left = view2.getLeft();
                        int right = view2.getRight();
                        int L = gm.L(52.0f);
                        int i15 = left - L;
                        smb smbVar3 = smbVar2;
                        if (i15 < 0) {
                            smbVar3.x0(i15, 0, null);
                        } else {
                            int i16 = right + L;
                            if (i16 > smbVar3.getMeasuredWidth()) {
                                smbVar3.x0(i16 - smbVar3.getMeasuredWidth(), 0, null);
                            }
                        }
                        int childCount = smbVar3.getChildCount();
                        for (int i17 = 0; i17 < childCount; i17++) {
                            View childAt = smbVar3.getChildAt(i17);
                            if (childAt instanceof ThemeActivity.InnerAccentView) {
                                ((ThemeActivity.InnerAccentView) childAt).a(true);
                            }
                        }
                    }
                });
                smbVar2.setOnItemLongClickListener(new xr8(this, e0Var, (byte) 26));
                smbVar2.setLayoutParams(new g69(-1, gm.L(62.0f)));
                smbVar = smbVar2;
                break;
            case 13:
                smbVar = new nmb(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                smbVar = new xib(context);
                break;
            case 15:
                i6 = ((org.telegram.ui.ActionBar.d) themeActivity).currentAccount;
                smbVar = new reb(context, i6);
                break;
            case 16:
                tk5Var = ((org.telegram.ui.ActionBar.d) themeActivity).parentLayout;
                View r28Var = new r28(context, tk5Var, 0);
                r28Var.setImportantForAccessibility(4);
                smbVar = r28Var;
                break;
            case 17:
                View ud3Var = new ud3(context, themeActivity, themeActivity.f);
                ud3Var.setFocusable(false);
                ud3Var.setLayoutParams(new g69(-1, -2));
                smbVar = ud3Var;
                break;
            case 19:
                smbVar = new v09(context, false);
                break;
            case 20:
                i7 = ((org.telegram.ui.ActionBar.d) themeActivity).currentAccount;
                ?? r59Var = new r59(context, null);
                r59Var.f3 = new ArrayList();
                r59Var.h3 = i7;
                r59Var.setPadding(0, gm.L(12.0f), 0, gm.L(12.0f));
                r59Var.setFocusable(false);
                r59Var.setItemAnimator(null);
                r59Var.setLayoutAnimation(null);
                u46 u46Var2 = new u46(0, false);
                r59Var.g3 = u46Var2;
                r59Var.setLayoutManager(u46Var2);
                r59Var.setAdapter(new js(r59Var, (byte) 0));
                r59Var.i(new ks(r59Var, (byte) 0));
                r59Var.setOnItemClickListener(new is((Object) r59Var, themeActivity, context, (byte) 0));
                r59Var.z1();
                smbVar = r59Var;
                break;
            case 21:
                i8 = ((org.telegram.ui.ActionBar.d) themeActivity).currentAccount;
                smbVar = new g28(i8, 0L, themeActivity.getResourceProvider(), this.c);
                break;
        }
        return new u69(smbVar);
    }

    @Override
    public final void y(u69 u69Var) {
        boolean z;
        if (u69Var.f == 4) {
            cpb cpbVar = (cpb) u69Var.a;
            if (u69Var.b() == cmb.o) {
                z = true;
            } else {
                z = false;
            }
            cpbVar.setTypeChecked(z);
        }
    }
}
