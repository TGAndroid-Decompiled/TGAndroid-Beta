package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.SharedConfig;
public final class du extends org.telegram.ui.Components.il0 {
    public final Context f37633c;
    public final DataSettingsActivity d;

    public du(DataSettingsActivity dataSettingsActivity, Context context) {
        this.d = dataSettingsActivity;
        this.f37633c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int b10 = n1Var.b();
        DataSettingsActivity dataSettingsActivity = this.d;
        if (b10 != dataSettingsActivity.f35524e && b10 != dataSettingsActivity.f35525f && b10 != dataSettingsActivity.h && b10 != dataSettingsActivity.f35528s) {
            i10 = dataSettingsActivity.useLessDataForCallsRow;
            if (b10 != i10 && b10 != dataSettingsActivity.v) {
                i11 = dataSettingsActivity.proxyRow;
                if (b10 != i11) {
                    i12 = dataSettingsActivity.clearDraftsRow;
                    if (b10 != i12 && b10 != dataSettingsActivity.A && b10 != dataSettingsActivity.f35531y && b10 != dataSettingsActivity.B && b10 != dataSettingsActivity.C && b10 != dataSettingsActivity.J && b10 != dataSettingsActivity.G && b10 != dataSettingsActivity.F && b10 != dataSettingsActivity.f35526n) {
                        i13 = dataSettingsActivity.saveToGalleryGroupsRow;
                        if (b10 != i13) {
                            i14 = dataSettingsActivity.saveToGalleryPeerRow;
                            if (b10 != i14) {
                                i15 = dataSettingsActivity.saveToGalleryChannelsRow;
                                if (b10 != i15) {
                                    i16 = dataSettingsActivity.resetDownloadRow;
                                    if (b10 != i16) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.Q;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        DataSettingsActivity dataSettingsActivity = this.d;
        if (i10 != dataSettingsActivity.f35527r && i10 != dataSettingsActivity.f35529w && i10 != dataSettingsActivity.K && i10 != dataSettingsActivity.M && i10 != dataSettingsActivity.H && i10 != dataSettingsActivity.N && i10 != dataSettingsActivity.P) {
            if (i10 != dataSettingsActivity.d && i10 != dataSettingsActivity.f35530x && i10 != dataSettingsActivity.I && i10 != 0 && i10 != dataSettingsActivity.L && i10 != dataSettingsActivity.E && i10 != dataSettingsActivity.O) {
                if (i10 != dataSettingsActivity.A && i10 != dataSettingsActivity.f35531y && i10 != dataSettingsActivity.B && i10 != dataSettingsActivity.C && i10 != dataSettingsActivity.F && i10 != dataSettingsActivity.G) {
                    if (i10 == dataSettingsActivity.D) {
                        return 4;
                    }
                    if (i10 != dataSettingsActivity.f35524e && i10 != dataSettingsActivity.h && i10 != dataSettingsActivity.f35525f) {
                        i11 = dataSettingsActivity.saveToGalleryGroupsRow;
                        if (i10 != i11) {
                            i12 = dataSettingsActivity.saveToGalleryPeerRow;
                            if (i10 != i12) {
                                i13 = dataSettingsActivity.saveToGalleryChannelsRow;
                                if (i10 != i13) {
                                    if (i10 != dataSettingsActivity.f35528s && i10 != dataSettingsActivity.v && i10 != dataSettingsActivity.f35526n) {
                                        return 1;
                                    }
                                    return 6;
                                }
                                return 5;
                            }
                            return 5;
                        }
                        return 5;
                    }
                    return 5;
                }
                return 3;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(f2.n1 r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.du.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View x6Var;
        Context context = this.f37633c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                x6Var = new org.telegram.ui.Cells.m8(context);
                            } else {
                                x6Var = new org.telegram.ui.Cells.h5(context);
                            }
                        } else {
                            x6Var = new org.telegram.ui.Cells.y8(context);
                        }
                    } else {
                        x6Var = new org.telegram.ui.Cells.q8(context);
                    }
                } else {
                    x6Var = new org.telegram.ui.Cells.k4(context, 22);
                }
            } else {
                x6Var = new org.telegram.ui.Cells.y9(context);
            }
        } else {
            x6Var = new org.telegram.ui.Cells.x6(context, (b) null);
        }
        return th.m(x6Var, x6Var, -1, -2);
    }

    @Override
    public final void y(f2.n1 n1Var) {
        if (n1Var.f6436f == 3) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) n1Var.f6432a;
            int b10 = n1Var.b();
            DataSettingsActivity dataSettingsActivity = this.d;
            if (b10 == dataSettingsActivity.A) {
                q8Var.setChecked(SharedConfig.saveStreamMedia);
            } else if (b10 == dataSettingsActivity.f35531y) {
                q8Var.setChecked(SharedConfig.streamMedia);
            } else if (b10 == dataSettingsActivity.B) {
                q8Var.setChecked(SharedConfig.streamAllVideo);
            } else if (b10 == dataSettingsActivity.C) {
                q8Var.setChecked(SharedConfig.streamMkv);
            } else if (b10 == dataSettingsActivity.F) {
                q8Var.setChecked(SharedConfig.isAutoplayGifs());
            } else if (b10 == dataSettingsActivity.G) {
                q8Var.setChecked(SharedConfig.isAutoplayVideo());
            }
        }
    }
}
