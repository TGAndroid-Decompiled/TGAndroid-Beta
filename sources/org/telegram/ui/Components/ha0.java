package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;
public final class ha0 extends v7.x6 {
    public int f26987a;
    public final TL_iv.PageBlock f26988b;
    public TL_iv.textConcat f26989c = new TL_iv.textConcat();

    public ha0(TL_iv.PageBlock pageBlock) {
        this.f26988b = pageBlock;
    }

    public static TL_iv.RichText x(TL_iv.textConcat textconcat) {
        if (textconcat.texts.isEmpty()) {
            return new TL_iv.textEmpty();
        }
        if (textconcat.texts.size() == 1) {
            return textconcat.texts.get(0);
        }
        return textconcat;
    }

    @Override
    public final void a(df.b bVar) {
        int i10 = this.f26987a;
        if (i10 >= 64) {
            return;
        }
        this.f26987a = i10 + 1;
        try {
            v(bVar);
        } finally {
            this.f26987a--;
        }
    }

    @Override
    public final void b(df.c cVar) {
        int i10 = this.f26987a;
        if (i10 >= 64) {
            return;
        }
        this.f26987a = i10 + 1;
        try {
            v(cVar);
        } finally {
            this.f26987a--;
        }
    }

    @Override
    public final void c(df.d dVar) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = ka0.j(dVar.h);
        w(textfixed);
    }

    @Override
    public final void d(df.e eVar) {
        if (eVar instanceof we.a) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(eVar);
            w(textstrike);
        } else if (eVar instanceof bd.d) {
            w(ka0.c(((bd.d) eVar).f4263g));
        } else {
            v(eVar);
        }
    }

    @Override
    public final void e(df.g gVar) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(gVar);
        w(textitalic);
    }

    @Override
    public final void i(df.k kVar) {
        w(y(kVar));
    }

    @Override
    public final void k(df.n nVar) {
        if (nVar instanceof bd.a) {
            if (!this.f26989c.texts.isEmpty()) {
                w(ka0.j("\n"));
            }
            w(ka0.c(((bd.a) nVar).f4259g));
            w(ka0.j("\n"));
            return;
        }
        v(nVar);
    }

    @Override
    public final void l(df.o oVar) {
        int i10 = this.f26987a;
        if (i10 >= 64) {
            return;
        }
        this.f26987a = i10 + 1;
        try {
            v(oVar);
        } finally {
            this.f26987a--;
        }
    }

    @Override
    public final void m(df.q qVar) {
        int i10 = this.f26987a;
        if (i10 >= 64) {
            return;
        }
        this.f26987a = i10 + 1;
        try {
            v(qVar);
        } finally {
            this.f26987a--;
        }
    }

    @Override
    public final void n(df.r rVar) {
        if (!this.f26989c.texts.isEmpty()) {
            w(ka0.j("\n\n"));
        }
        v(rVar);
    }

    @Override
    public final void o(df.s sVar) {
        w(ka0.j(sVar.f8000g));
    }

    @Override
    public final void q(df.d dVar) {
        w(ka0.j(dVar.h));
    }

    @Override
    public final void r(df.g gVar) {
        w(ka0.j("\n"));
    }

    @Override
    public final void s(df.k kVar) {
        String str = kVar.h;
        if (str == null) {
            str = "";
        }
        String trim = str.trim();
        if (trim.startsWith("mailto:")) {
            TL_iv.RichText textemail = new TL_iv.textEmail();
            textemail.text = y(kVar);
            textemail.email = trim.substring(7);
            w(textemail);
        } else if (trim.startsWith("tel:")) {
            TL_iv.textPhone textphone = new TL_iv.textPhone();
            textphone.text = y(kVar);
            textphone.phone = trim.substring(4);
            w(textphone);
        } else {
            TL_iv.RichText texturl = new TL_iv.textUrl();
            texturl.text = y(kVar);
            texturl.url = trim;
            w(texturl);
        }
    }

    @Override
    public final void t(df.g gVar) {
        String str;
        if (this.f26988b instanceof TL_iv.pageBlockBlockquote) {
            str = "\n";
        } else {
            str = " ";
        }
        w(ka0.j(str));
    }

    @Override
    public final void u(df.g gVar) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(gVar);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.f26989c.texts.add(richText);
    }

    public final TL_iv.RichText y(df.p pVar) {
        TL_iv.textConcat textconcat = this.f26989c;
        this.f26989c = new TL_iv.textConcat();
        v(pVar);
        TL_iv.RichText x10 = x(this.f26989c);
        this.f26989c = textconcat;
        return x10;
    }
}
